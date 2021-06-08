package ontologytest1;

import java.util.LinkedList;

import smile.Network;
import FuzzyKnowledge.ObservedState;
import FuzzyKnowledge.ObservedValue;

public class FuzzyInference {
	
	/*FuzzyBayesianNetwork fbn;
	LinkedList<ObservedValue> fuzzyevidence;
	LinkedList<String> crispevidece;
	
	public FuzzyInference(	FuzzyBayesianNetwork fbn){
		this.fbn=fbn;	
		
	}*/
	
	public static void main (String args[]){
		new smile.License(
    			"SMILE LICENSE 866df38d dd16a573 291ee961 " +
    			"THIS IS AN ACADEMIC LICENSE AND CAN BE USED " +
    			"SOLELY FOR ACADEMIC RESEARCH AND TEACHING, " +
    			"AS DEFINED IN THE BAYESFUSION ACADEMIC " +
    			"SOFTWARE LICENSING AGREEMENT. " +
    			"Serial #: 5uqjb31ncabc9zf7ou7r2ty7t " +
    			"Issued for: ishak riali (ishakriali@gmail.com) " +
    			"Academic institution: university of saad dahleb Blida  " +
    			"Valid until: 2018-10-09 " +
    			"Issued by BayesFusion activation server",
    			new byte[] {
    			-97,47,70,-110,-78,101,119,99,121,87,-29,-5,118,-15,-16,-20,
    			127,-54,25,71,31,-70,70,57,-51,-61,-59,93,120,50,-107,-20,
    			-53,-105,-103,-48,-8,-56,34,98,53,23,7,-111,25,111,-115,3,
    			-64,51,121,-110,107,24,9,27,53,-28,-70,-106,44,98,103,-109
    			}
    		);
    	
     System.loadLibrary("Jsmile");
	Network net = new Network();
	// load the network created by Tutorial1
	net.readFile("ImpliedEvidence.xdsl");
	System.out.println("Posteriors with no evidence set:");
	net.updateBeliefs();
	
	ObservedState ob=new ObservedState("Sex", "Male");
	LinkedList<ObservedState> crispevidence = new LinkedList<ObservedState>();
	 crispevidence.add(ob);
 
	crispInference(net,crispevidence);
	printPosteriors(net,0);
	}
	
	private static void printPosteriors(Network net, int nodeHandle) {
		String nodeId = net.getNodeId(nodeHandle);
	 
		double[] posteriors = net.getNodeValue(nodeHandle);
		
		for (int i = 0; i < posteriors.length; i ++) {
		System.out.printf("P(%s=%s)=%f\n", nodeId,	net.getOutcomeId(nodeHandle, i),
		posteriors[i]);
		}
	 
	
		}
		 	 
		/// predict disease
 
	
	private static void crispInference(Network net, LinkedList<ObservedState> crispevidence) {
		double[] ver={0.3,0.7};
			String handle;
			String state;
			for(ObservedState obstate :crispevidence){
				handle=obstate.getNode(); 
				 state=obstate.getState();
				
					if (state != null) {
						//net.setEvidence(handle, state);
						net.setVirtualEvidence(handle,ver);
						
						} else {
						net.clearEvidence(handle);
						}	 
					net.updateBeliefs();
			}
				
		}
	/*public static void fuzzyInference(Network net, LinkedList<ObservedValue> fuzzyevidence){
		
		for(ObservedValue obstate :fuzzyevidence){
			handle=obstate.getNode(); 
			 state=obstate.getState();
			
				if (state != null) {
					//net.setEvidence(handle, state);
					net.setVirtualEvidence(handle,ver);
					
					} else {
					net.clearEvidence(handle);
					}	 
				net.updateBeliefs();
		}
		
	}
	*/
	
	
	
}
