package ontologytest1;

import java.io.File;
import java.util.LinkedList;
import java.util.Set;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.io.OWLXMLOntologyFormat;
import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLNamedObject;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyFormat;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.model.PrefixManager;
import org.semanticweb.owlapi.reasoner.NodeSet;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasonerFactory;
import org.semanticweb.owlapi.util.DefaultPrefixManager;

public class FuzzyOntology {
	
	private IRI ontologyIRI;
	private PrefixManager pm; 
	private OWLReasoner reasoner;
	private OWLReasonerFactory reasonerFactory ;
	private OWLDataFactory df = OWLManager.getOWLDataFactory();
	private OWLOntology ontology;
	// lists
	private LinkedList<String> classes;
	private LinkedList<String> datatypes;
	private LinkedList<String> objectproperties;
	private LinkedList<String> dataproperties;
	
	private LinkedList<String> individuals;
	
    // list of fuzzy components 
	private LinkedList<String> fuzzydatatypes;	
	
   
    private File file;
    // contruct
	public FuzzyOntology(String link){
		file = new File(link);	
		classes = new LinkedList<String>();
		datatypes = new LinkedList<String>();
		objectproperties = new LinkedList<String>();
		dataproperties = new LinkedList<String>();
		individuals = new LinkedList<String>();
		fuzzydatatypes = new LinkedList<String>();
		
		try {OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
	    
	    ontology = manager.loadOntologyFromOntologyDocument(file);
	    ontologyIRI = ontology.getOntologyID().getOntologyIRI();
	    pm = new DefaultPrefixManager(ontologyIRI.toString());
	    reasonerFactory =new StructuralReasonerFactory();
	    reasoner = reasonerFactory.createNonBufferingReasoner(ontology);
	    OWLDataFactory df = OWLManager.getOWLDataFactory();
	     
	   
	}catch (OWLOntologyCreationException ex) {}
	}
	
 
	// getclasses
	
public LinkedList<String> getClasses(){
		
		
		for (OWLClass i : ontology.getClassesInSignature(true)) {
			classes.add(i.getIRI().getFragment());}
				  
		  return classes;
		
	}
	///// get ind
	
	public LinkedList<String> getIndividuals(){
		
		
		for (OWLNamedIndividual i : ontology.getIndividualsInSignature(true)) {
			   individuals.add(i.getIRI().getFragment());}
				  
		  return individuals;
		
	}
	/// get object properties
public LinkedList<String> getObjectProperties(){
		
		
		for (OWLObjectProperty i : ontology.getObjectPropertiesInSignature(true)) {
			objectproperties.add(i.getIRI().getFragment());}
				  
		  return objectproperties;
		
	}
/// get data properties
public LinkedList<String> getDataProperties(){
	 
	 
	for (OWLDataProperty i : ontology.getDataPropertiesInSignature(true)) {
		dataproperties.add(i.getIRI().getFragment());
		 if(i.getRanges(ontology).toString().contains("DataUnionOf")) 
		System.out.println(i.getIRI().getFragment().toString());
       
	}
			  
	  return dataproperties;
	
}
// /// get object data properties
public LinkedList<String> getDataTypes(){
	
	
	for (OWLDatatype i : ontology.getDatatypesInSignature(true)) {
		datatypes.add(i.getIRI().getFragment());}
			  
	  return datatypes;
	
}
 
///// get object data properties
public LinkedList<String> getFuzzyDataTypes(){
	
	
	for (OWLDatatype d : ontology.getDatatypesInSignature(true)) {
		 for (OWLAnnotation annotation1 : d.getAnnotations(ontology)) {
		       
		 if ((annotation1.getProperty().getIRI().getFragment().contains("fuzzyLabel"))){
			// fuzzydatatypes.add(d.getIRI().getFragment());
			 OWLLiteral literal = (OWLLiteral) annotation1.getValue();
	         String literalString = literal.getLiteral();
	         fuzzydatatypes.add(literalString);  
		 }}
		
		 
	
	}
			  
	  return fuzzydatatypes;
	
}
	//add
public void addDataProprty(String ind,String dp, String v) throws OWLOntologyStorageException{
	
	OWLOntologyManager manager;
	  OWLXMLOntologyFormat owlxmlFormat;
		  OWLOntologyFormat format;
	 manager = OWLManager.createOWLOntologyManager();
	 owlxmlFormat = new OWLXMLOntologyFormat();
format = manager.getOntologyFormat(ontology);
//System.out.println("1");
pm = new DefaultPrefixManager(ontologyIRI.toString().concat("#"));

OWLNamedIndividual indivi = df.getOWLNamedIndividual(":"+ind, pm);
 

OWLDataProperty dpro = df.getOWLDataProperty(":"+dp, pm);
OWLDataPropertyAssertionAxiom axiomDp = df.getOWLDataPropertyAssertionAxiom(dpro, indivi, v);
AddAxiom addAxiomDp = new AddAxiom(ontology, axiomDp);
manager.applyChange(addAxiomDp);
 
manager.saveOntology(ontology, owlxmlFormat, IRI.create(file.toURI()));
}


// 
public void addIndividual(String ind, String cls) throws OWLOntologyStorageException{
	
	 OWLOntologyManager manager;
	  OWLXMLOntologyFormat owlxmlFormat;
		  OWLOntologyFormat format;
	 manager = OWLManager.createOWLOntologyManager();
	 owlxmlFormat = new OWLXMLOntologyFormat();
    format = manager.getOntologyFormat(ontology);
   // System.out.println("1");
    pm = new DefaultPrefixManager(ontologyIRI.toString().concat("#"));
    OWLClass simpleTypeClass = df.getOWLClass(":"+cls, pm);
  
    
    System.out.println(simpleTypeClass.getIRI().getFragment());
    
    OWLNamedIndividual indi = df.getOWLNamedIndividual(":"+ind, pm);
    //System.out.println(indi.getIRI().getFragment());
    
    OWLAxiom axiomI = df.getOWLClassAssertionAxiom(simpleTypeClass, indi); 
    AddAxiom addAxiomI = new AddAxiom(ontology, axiomI);
    manager.applyChange(addAxiomI);
    
     
    
    manager.saveOntology(ontology, owlxmlFormat, IRI.create(file.toURI()));
}
	// make link among two individuals
public void linkIndividuals(String ind1, String ind2, String rela) throws OWLOntologyStorageException{

OWLOntologyManager manager;
OWLXMLOntologyFormat owlxmlFormat;
	  OWLOntologyFormat format;
manager = OWLManager.createOWLOntologyManager();
owlxmlFormat = new OWLXMLOntologyFormat();
format = manager.getOntologyFormat(ontology);
//System.out.println("1");
pm = new DefaultPrefixManager(ontologyIRI.toString().concat("#"));
///////////////////////////////////////////////////////////////////////////
OWLNamedIndividual i1 = df.getOWLNamedIndividual(":"+ind1, pm);
OWLNamedIndividual i2 = df.getOWLNamedIndividual(":"+ind2, pm);
OWLObjectProperty rel = df.getOWLObjectProperty(":"+rela, pm);
///////////////////////////////////////////////////////////////////////////
OWLObjectPropertyAssertionAxiom axiomOp = df.getOWLObjectPropertyAssertionAxiom(rel, i1, i2);
AddAxiom addAxiomOp = new AddAxiom(ontology, axiomOp);
manager.applyChange(addAxiomOp);
///////////////////////////////////////////////////////////////////////////
manager.saveOntology(ontology, owlxmlFormat, IRI.create(file.toURI()));
}
	
	public static void main(String args[]) throws OWLOntologyStorageException{
		FuzzyOntology fo= new FuzzyOntology("C:\\Users\\Octet Plus\\Desktop\\etudes de cas\\Renal_Cancer.owl");
	 
	 
	/*	fo.addIndividual("ishak","Node");
		LinkedList<String> fdt= fo. getIndividuals();*/
		
		LinkedList<String> fdt=fo.getFuzzyDataTypes();
		/*LinkedList<String> fdt=fo.getDataProperties();*/
		
		
		 for (int i=0;i<fdt.size();i++) System.out.println(fdt.get(i)); 
		
		
	}
	
	 

}
