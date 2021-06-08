package ontologytest1;



import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;

//import org.apache.log4j.Logger;

import java.util.logging.Logger;

//import com.hp.hpl.jena.*;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.util.FileManager;

public class openOWL {
static String s;


//open an  HERO Ontology OWL file
static OntModel OpenConnectOWL(){
	OntModel mode = null;
	mode = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM_RULE_INF);
	java.io.InputStream in = FileManager.get().open("C:\\Users\\Winsido\\Desktop\\m\\m.owl");
	if(in == null){
		throw new IllegalArgumentException("please re-import your OWL-file");
	}
	return(OntModel)mode.read(in,"");
	
	
}
//jena query resultset return
static com.hp.hpl.jena.query.ResultSet ExecSparQl(String Query){
	com.hp.hpl.jena.query.Query query = com.hp.hpl.jena.query.QueryFactory.create(Query);
		QueryExecution qe = QueryExecutionFactory.create(query, OpenConnectOWL());
		com.hp.hpl.jena.query.ResultSet results = qe.execSelect();
		return results;
					}
		
	//string return(convert jena.query.result to string)
static String ExecSparQlString(String Query){
	try{
		com.hp.hpl.jena.query.Query query = QueryFactory.create(Query);
		QueryExecution qe = QueryExecutionFactory.create(query, OpenConnectOWL());
		com.hp.hpl.jena.query.ResultSet results = qe.execSelect();
		
		//TEST
		if (results.hasNext()){
			//if is good
			ByteArrayOutputStream go = new ByteArrayOutputStream();
			ResultSetFormatter.out((OutputStream)go,results, query);
			//string s = go.toString();
			s = new String(go.toByteArray(),"UTF-8");}
		else{
			s = "null";}
	}catch (UnsupportedEncodingException ex){
		Logger.getLogger(openOWL.class.getName()).log(Level.SEVERE,null,ex);
	}
		return s;}
	}