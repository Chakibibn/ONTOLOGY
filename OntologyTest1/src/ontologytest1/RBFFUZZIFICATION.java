package ontologytest1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Winsido
 */
import com.fuzzylite.term.Function;
import com.fuzzylite.term.Linear;
import com.fuzzylite.term.Triangle;
import com.fuzzylite.variable.InputVariable;
import ontologytest1.Fuzzification;
public class RBFFUZZIFICATION {
   public static void main (String [] args){
       
         String  [] features = {"Age","BMI","WBC","RBC","HGB","Plat","AST 1","ALT 1","ALT4","ALT12","ALT24","ALT36","ALT48","ALTafter24w","RNA Base","RNA 4","RNA 12","RNA EOT","RNA EF","Baselinehistological staging"};
         Fuzzification f = new Fuzzification();
         InputVariable v;
         for(int i = 0; i<features.length;i++){
             if(features[i].equals("Age")){
             v = f.createFuzzyNode(features[i], 27.35, 54.45);
             //f.addFuzzyState(v, new );
             //f.addFuzzyState(v, new );
             }
             if(features[i].equals("BMI")){
                 v = f.createFuzzyNode(features[i], 19.84, 33.97);
                 //f.addFuzzyState(v, new );
                 f.addFuzzyState(v, new Triangle("LowBMI", 19.84,37.16,23.25,27.08));
                 f.addFuzzyState(v, new Triangle("HighBMI",19.84,37.16,27.08,30.56));
                 
                // f.addFuzzyState(v, new  );
             
             }
             if(features[i].equals("WBC")){
                 v = f.createFuzzyNode(features[i], 1577.35, 10731.37);
                 //f.addFuzzyState(v, new );
                 f.addFuzzyState(v, new Triangle("NeutralWBC", 1577.35,13514.65,4332.96,7448.01));
               // f.addFuzzyState(v, new  );
             }
             if(features[i].equals("RBC")){
                 v = f.createFuzzyNode(features[i], 3632918.7, 4829417.27);
                 //f.addFuzzyState(v, new );
                 f.addFuzzyState(v, new Triangle("NeutralRBC", 3632918.7,5201954.3,4002675.3,4433769.95));
               // f.addFuzzyState(v, new  );
             }
             if(features[i].equals("HGB")){
                 v = f.createFuzzyNode(features[i], 9.09, 14.58);
                 //f.addFuzzyState(v, new );
                 f.addFuzzyState(v, new Triangle("NeutralHGB", 9.09,15.91,10.48,12.49));
               // f.addFuzzyState(v, new  );
             }
             if(features[i].equals("Plat")){
             v = f.createFuzzyNode(features[i], 72459.19, 205026.24);
                 //f.addFuzzyState(v, new );
                 f.addFuzzyState(v, new Triangle("NeutralPlat", 72459.19,247017.81,112065.27,158007.71));
               // f.addFuzzyState(v, new  );
             }
             if(features[i].equals("AST 1")){
             v = f.createFuzzyNode(features[i], 25.23, 114.85);
                 //f.addFuzzyState(v, new );
                 f.addFuzzyState(v, new Triangle("NeutralAST1", 25.23,141.77,52.84,84.59));
               // f.addFuzzyState(v, new  );
             }
             if(features[i].equals("ALT 1")){
             v = f.createFuzzyNode(features[i], 25.27, 115.13);
                 //f.addFuzzyState(v, new );
                 f.addFuzzyState(v, new Triangle("NeutralALT1", 25.27,141.73,52.79,83.0));
               // f.addFuzzyState(v, new  );
             }
             if(features[i].equals("ALT4")){
                 v = f.createFuzzyNode(features[i], 24.94, 115.35);
                 //f.addFuzzyState(v, new );
                 f.addFuzzyState(v, new Triangle("NeutralALT4", 24.94,142.06,52.17,82.91));
               // f.addFuzzyState(v, new  );
             }
             if(features[i].equals("ALT12")){
                 v = f.createFuzzyNode(features[i], 25.19, 115.01);
                 //f.addFuzzyState(v, new );
                 f.addFuzzyState(v, new Triangle("NeutralALT12", 25.19,141.81,52.02,83.77));
               // f.addFuzzyState(v, new  );
             }
             if(features[i].equals("ALT24")){
             v = f.createFuzzyNode(features[i], 25.12, 114.07);
                 //f.addFuzzyState(v, new );
                 f.addFuzzyState(v, new Triangle("NeutralALT24", 25.19,141.81,52.02,83.77));
               // f.addFuzzyState(v, new  );
             }
             if(features[i].equals("ALT36")){
             v = f.createFuzzyNode(features[i], -8.99, 114.5);
                 //f.addFuzzyState(v, new );
                 f.addFuzzyState(v, new Triangle("NeutralALT36",-8.99,141.99,51.97,83.82));
               // f.addFuzzyState(v, new  );
             }
             if(features[i].equals("ALT48")){
                v = f.createFuzzyNode(features[i], -8.89, 114.63);
                 //f.addFuzzyState(v, new );
                 f.addFuzzyState(v, new Triangle("NeutralALT48",-8.89,141.89,51.76,82.83));
               // f.addFuzzyState(v, new  );
             }
             if(features[i].equals("ALTafter24w")){
             v = f.createFuzzyNode(features[i], 1.25, 41.84);
                 //f.addFuzzyState(v, new );
                 f.addFuzzyState(v, new Triangle("NeutralALTafter24w",1.25,48.75,24.87,33.25));
               // f.addFuzzyState(v, new  );
             }
             if(features[i].equals("RNA Base")){
             v = f.createFuzzyNode(features[i], -187507.01, 909466.06);
                 //f.addFuzzyState(v, new );
                 // f.addFuzzyState(v, new  );
             }
             if(features[i].equals("RNA 4")){
             v = f.createFuzzyNode(features[i], -191952.68, 933249.57);
                 //f.addFuzzyState(v, new );
                 // f.addFuzzyState(v, new  );
             }
             if(features[i].equals("RNA 12")){
             v = f.createFuzzyNode(features[i], -151176.25, 582623.34);
                 //f.addFuzzyState(v, new );
                 // f.addFuzzyState(v, new  );
             }
             if(features[i].equals("RNA EOT")){
             v = f.createFuzzyNode(features[i], -140160.92, 573675.58);
                 //f.addFuzzyState(v, new );
                 // f.addFuzzyState(v, new  );
             }
             if(features[i].equals("RNA EF")){
             v = f.createFuzzyNode(features[i], -141825.14, 586231.28);
                 //f.addFuzzyState(v, new );
                 // f.addFuzzyState(v, new  );
             }
             if(features[i].equals("Baselinehistological staging")){
              v = f.createFuzzyNode(features[i], 0.41, 4.0);
                 //f.addFuzzyState(v, new );
                 f.addFuzzyState(v, new Triangle("LowBaselinehistologicalstaging", 0.41,4.59,1.0,2.0));
                 f.addFuzzyState(v, new Triangle("HighBaselinehistologicalstaging",0.41,4.59,2.0,3.0));
                // f.addFuzzyState(v, new  );
             }
             
         }
   
   } 
}
