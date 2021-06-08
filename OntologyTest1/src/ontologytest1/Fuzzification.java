package ontologytest1;

 
 
import com.fuzzylite.Engine;
import com.fuzzylite.FuzzyLite;
import com.fuzzylite.Op;

import com.fuzzylite.term.Term;
import com.fuzzylite.term.Trapezoid;
import com.fuzzylite.term.Triangle;
import com.fuzzylite.variable.InputVariable;

import java.util.ArrayList;
import java.util.List;

 
public class Fuzzification {
    
     
   Engine engine;
   
   
    public Fuzzification(){
     this.engine = new Engine();
     
              engine.setName("FuzzyByaes");  
    }
    // a and b are the limits of the rang of the values that the fuzyy node can be taoked
    public InputVariable createFuzzyNode(String name,double a, double b){
        InputVariable e= new InputVariable (name);
        
        e.setRange(a, b);
    return e;    
    }
    
     
    public void addFuzzyState(InputVariable e, Term t ){
              e.addTerm(t);
           
    }
    
    
    
   public double getMembershipdegree(InputVariable e, double a, String t){
      e.setInputValue(a);
      
      
    engine.process();
    
   return e.getTerm(t).membership(a);
   }
   
    public double normlize(double val, double sum){
    return val/sum;
    }
    
    
    public static void main(String args[]){
    Fuzzification f= new Fuzzification();
    InputVariable v= f.createFuzzyNode("taill",0,130);
    
   f. addFuzzyState(v, new Trapezoid("LOW", 0, 0, 50,70 ));
   f. addFuzzyState(v, new Trapezoid("High", 50, 80, 100,130 ));
   double sum=f.getMembershipdegree(v,65, "High")+f.getMembershipdegree(v,65, "LOW");
     System.out.println("le degrer ="+f.normlize(f.getMembershipdegree(v,65, "LOW"),sum));
   System.out.println("le degrer ="+f.normlize(f.getMembershipdegree(v,65, "High"),sum));
    }
    
    
    
    
}
/**/