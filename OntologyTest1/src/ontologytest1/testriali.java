/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontologytest1;

import com.hp.hpl.jena.query.ResultSet;
import ontologytest1.FuzzyOntology;
import java.io.FileReader;
import java.util.LinkedList;
import org.eclipse.jdt.core.dom.BreakStatement;
import com.opencsv.CSVReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Winsido
 */
public class testriali {
    public static void main(String [] args){
        String chemin  = "C:\\Users\\Winsido\\Desktop\\mm\\ontologiefinalbienconstruite.owl";
        try{
        FuzzyOntology o = new FuzzyOntology(chemin);
               // o.addIndividual("22", "LOWBMI");
                  String jdbcURL = "jdbc:mysql://localhost:3306/onto";
        String username = "root";
        String password = "root";
        String csvFilePath = "C:\\Users\\Winsido\\Desktop\\mm\\HCV-Egy-Data.csv";
 
        //o.addDataProprty("IMC", "tesmiyata3 relation", "test2");
        Connection connection = null;
        
         try{
           /* connection = DriverManager.getConnection(jdbcURL, username, password);
            connection.setAutoCommit(false);
            Statement st;
            st = connection.createStatement();
            String  sql  = "SELECT * FROM onto";
            
            java.sql.ResultSet rs = st.executeQuery(sql);
            */
            //System.err.println(""+o.getDataProperties().size());
             //System.err.println(""+o.getClass().getName());
             //System.err.println(""+o.getDataProperties().size());
             //System.err.println(""+o.getDataProperties().size());
             LinkedList<String> fdt=o.getObjectProperties();
		/*LinkedList<String> fdt=fo.getDataProperties();*/
		
		
		 for (int i=0;i<fdt.size();i++) System.out.println(fdt.get(i));
           
            
         //   int i =1;
         ////  String patient= null,age= null,gender= null,fever= null,nause= null,headache= null,diahree= null,fatigue= null,boneache= null,jaundiche= null,epigasriapain= null,BHG= null,BH= null, bmi= null, WBC= null,RBC= null,HGB= null,PLAT= null,AST1= null,ALT1= null,ALT4= null,ALT12= null,ALT24= null,ALT36= null,ALT48= null,ALTAFTER24W=null,RNABASE= null,RNA4= null,RNA12= null,RNAEOT= null,RNAEF= null;
         //  String age1= null,gender1= null,fever1= null,nause1= null,headache1= null,diahree1= null,fatigue1= null,boneache1= null,jaundiche1= null,epigasriapain1= null,BHG1= null,BH1= null, bmi1= null, WBC1= null,RBC1= null,HGB1= null,PLAT1= null,AST11= null,ALT11= null,ALT41= null,ALT121= null,ALT241= null,ALT361= null,ALT481= null,ALTAFTER24W1=null,RNABASE1= null,RNA41= null,RNA121= null,RNAEOT1= null,RNAEF1= null;
           
          //  while (rs.next()) {
                //pour crées tous les individu
               /*  patient = "patient"+i;
                 age1 = "age"+i;
                 gender1 = "gender"+i;
                 bmi1 = "IMC"+i;
                 fever1 = "fever"+i;
                 nause1 = "nause"+i;
                 headache1 = "headache"+i;
                 diahree1 = "diahree"+i;
                 fatigue1 = "fatigue"+i;
                 boneache1 = "boneache"+i;
                 jaundiche1 = "jaundiche"+i;
                 epigasriapain1 = "epigasriapain"+i;
                 WBC1 = "WBC"+i;
                 RBC1 = "RBC"+i;
                 HGB1 = "HGB"+i;
                 PLAT1 = "PLAT"+i;
                 AST11 = "AST1"+i;
               
                 ALT11 = "ALT1"+i;
                 ALT41 = "ALT4"+i;
                 ALT121 = "ALT12"+i;
                 ALT241 = "ALT24"+i;
                 ALT361 = "ALT36"+i;
                 ALT481 = "ALT48"+i;
                 ALTAFTER24W1 = "ALTAFTER24W"+i;
                 RNABASE1 = "RNABASE"+i;
                 RNA41 = "RNA4"+i;
                 RNA121 = "RNA12"+i;
                 RNAEOT1 = "RNAEOT"+i;
                 RNAEF1 = "RNAEF"+i;
                 BHG1 = "BHG"+i;
                 BH1 = "BH"+i;
                */
                
                //récupurer les valeurs 
                /*age  = rs.getString(1);
                gender  = rs.getString(2);
                bmi = rs.getString(3);
                fever = rs.getString(4);
                nause = rs.getString(5);
                headache = rs.getString(6);
                diahree = rs.getString(7);
                fatigue = rs.getString(8);
                boneache = rs.getString(8);
                jaundiche = rs.getString(9);
                epigasriapain = rs.getString(10);
                WBC = rs.getString(11);
                RBC = rs.getString(12);
                HGB = rs.getString(13);
                PLAT = rs.getString(14);
                AST1 = rs.getString(15);
                ALT1 = rs.getString(16);
                ALT4 = rs.getString(17);
                ALT12 = rs.getString(18);
                ALT24 = rs.getString(19);
                ALT36 = rs.getString(20);
                ALT48 = rs.getString(21);
                ALTAFTER24W = rs.getString(22);
                RNABASE = rs.getString(23);
                RNA4 = rs.getString(24);
                RNA12 = rs.getString(25);
                RNAEOT = rs.getString(26);
                RNAEF = rs.getString(27);
               BHG  = rs.getString(28);
               BH   = rs.getString(29);
              */
               // System.err.println(i+" "+age+" "+bmi+" "+gender+" "+fever+" "+nause+" "+headache+" "+diahree);
                //System.err.println(""+patient);
                //ajouter tous les individus
                /*o.addIndividual(patient, "Patient");
                o.addIndividual(jaundiche1, "Jaunisse");
                o.addIndividual(bmi1, "IMC");
                o.addIndividual(diahree1, "Diahrée");
                o.addIndividual(epigasriapain1, "epegastrique_pain");
                o.addIndividual(fatigue1, "fatigue");
                o.addIndividual(boneache1, "boneache");
                o.addIndividual(fever1, "fiévre");
                o.addIndividual(headache1, "maux_de_tete");
                o.addIndividual(nause1, "nausée");
                o.addIndividual(BHG1, "Graduation_Histologique_de_base");
                o.addIndividual(BH1, "Histologique_de_base");
                o.addIndividual(ALT11, "ALT1");
                o.addIndividual(ALT41, "ALT4");
                o.addIndividual(ALT121, "ALT12");
                o.addIndividual(ALT241, "ALT24");
                o.addIndividual(ALT361, "ALT36");
                o.addIndividual(ALT481, "ALT48");
                o.addIndividual(ALTAFTER24W1, "ALTafter24w");
                o.addIndividual(AST11, "AST1");
                o.addIndividual(HGB1, "HGB");
                o.addIndividual(PLAT1, "PLAT");
                o.addIndividual(RBC1, "RBC");
                o.addIndividual(RNA121, "RNA12");
                o.addIndividual(RNA41, "RNA4");
                o.addIndividual(RNABASE1, "RNABASE");
                o.addIndividual(RNAEF1, "RNAEF");
                o.addIndividual(RNAEOT1, "RNAEOT");
                o.addIndividual(WBC1, "WBC");
                */
                //attribuer pour chaque individu une valeur 
                /*o.addDataProprty(bmi1, "hasbmi", bmi);
                o.addDataProprty(jaundiche1, "hasjaundiche", jaundiche);
                o.addDataProprty(diahree1, "hasdiahree", diahree);
                o.addDataProprty(epigasriapain1, "hasepigasriapain", epigasriapain);
                o.addDataProprty(fatigue1, "hasfatigue", fatigue);
                o.addDataProprty(boneache1, "hasboneache", boneache);
                o.addDataProprty(fever1, "hasfever", fever);
                o.addDataProprty(headache1, "hasheadache", headache);
                o.addDataProprty(nause1, "hasnause", nause);
                o.addDataProprty(BHG1, "hasBHG", BHG);
                o.addDataProprty(BH1, "hasBH", BH);
                o.addDataProprty(ALT11, "hasAlt1", ALT1);
                o.addDataProprty(ALT41, "hasAlt4", ALT4);
                o.addDataProprty(ALT121, "hasAlt12", ALT12);
                o.addDataProprty(ALT241, "hasAlt24", ALT24);
                o.addDataProprty(ALT361, "hasAlt36", ALT36);
                o.addDataProprty(ALT481, "hasAlt48", ALT48);
                o.addDataProprty(ALTAFTER24W1, "hasAlt24w", ALTAFTER24W);
                o.addDataProprty(AST11, "hasAst1", AST1);
                o.addDataProprty(HGB1, "hasHgb", HGB);
                o.addDataProprty(PLAT1, "hasPlat", PLAT);
                o.addDataProprty(RBC1, "hasRbc", RBC);
                o.addDataProprty(RNA121, "hasRna12", RNA12);
                o.addDataProprty(RNA41, "hasRna4", RNA4);
                o.addDataProprty(RNABASE1, "hasRnaBASE", RNABASE);
                o.addDataProprty(RNAEF1, "hasRnaEF", RNAEF);
                o.addDataProprty(RNAEOT1, "hasRnaEOT", RNAEOT);
                o.addDataProprty(WBC1, "hasWbc", WBC);*/
                /*hadou zedthm dok*/
               /* o.addDataProprty(patient, "hasGender", gender);
                o.addDataProprty(patient, "hasAge", age);*/
                /**/
                //relier un patient avec touts les critéres 
                /*o.linkIndividuals(patient, bmi1, "hasbmi");*/
                 /*hadou zedthm dok*/
                //o.linkIndividuals(patient, age, "hasAge1");
                //o.linkIndividuals(patient, gender, "hasGender1");
                /**/
                /*o.linkIndividuals(patient, jaundiche1, "hasjaundiche");
                o.linkIndividuals(patient, diahree1, "hasdiahree");
                o.linkIndividuals(patient, epigasriapain1, "hasepigasriapain");
                o.linkIndividuals(patient, fatigue1, "hasfatigue");
                o.linkIndividuals(patient, boneache1, "hasboneache");
                o.linkIndividuals(patient, fever1, "hasfever");
                o.linkIndividuals(patient, headache1, "hasheadache");
                o.linkIndividuals(patient, nause1, "hasnause");
                o.linkIndividuals(patient, BHG1, "hasBHG");
                o.linkIndividuals(patient, BH1, "hasBH");
                o.linkIndividuals(patient, ALT11, "hasAlt1");
                o.linkIndividuals(patient, ALT41, "hasAlt4");
                o.linkIndividuals(patient, ALT121, "hasAlt12");
                o.linkIndividuals(patient, ALT241, "hasAlt24");
                o.linkIndividuals(patient, ALT361, "hasAlt36");
                o.linkIndividuals(patient, ALT481, "hasAlt48");
                o.linkIndividuals(patient, ALTAFTER24W1, "hasAlt24w");
                o.linkIndividuals(patient, AST11, "hasAst1");
                o.linkIndividuals(patient, HGB1, "hasHgb");
                o.linkIndividuals(patient, PLAT1, "hasPlat");
                o.linkIndividuals(patient, RBC1, "hasRbc");
                o.linkIndividuals(patient, RNA121, "hasRna12");
                o.linkIndividuals(patient, RNA41, "hasRna4");
                o.linkIndividuals(patient, RNABASE1, "hasRnaBASE");
                o.linkIndividuals(patient, RNAEF1, "hasRnaEF");
                o.linkIndividuals(patient, RNAEOT1, "hasRnaEOT");
                o.linkIndividuals(patient, WBC1, "hasWbc");
                
                
                
                
            
           i++; 
            System.err.println("******************** ligne num "+i+"*********************");
            }            }
*/
            
         
           
 
            // execute the remaining queries
        
            connection.commit();
            connection.close();
             System.err.println("WORK");
 
        
                
            //System.out.println(""+o.getClasses());
            //System.out.println(""+o.getDataTypes());
            //System.out.println(""+o.getDataProperties());
            //System.out.println(""+o.getFuzzyDataTypes());
            //System.out.println(""+o.getIndividuals());
            
            
        /*
         System.err.println("Nos Class Sont les suivants : ");
            for (int i = 0;i<o.getClasses().size();i++){
               System.out.println("\n "+o.getClasses().get(i));
               break;
                }*/  
           
      /*  Scanner sc = new Scanner(new File("C:\\Users\\Winsido\\Desktop\\mm\\HCV-Egy-Data.csv"));  
        sc.useDelimiter("");
        while (sc.hasNext())   
            {  
                System.out.print(sc.next());   
            }   
        sc.close(); */ 
        
        }
        catch(Exception e){
        System.err.println("e"+e);}
        
    }catch(Exception e){}
    
}
}
