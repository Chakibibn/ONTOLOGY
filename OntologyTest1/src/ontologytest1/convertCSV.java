/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontologytest1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Winsido
 */
public class convertCSV {
     public static void main(String [] args){
        String chemin  = "C:\\Users\\Winsido\\Desktop\\mm\\ontologiefinal.owl";
        try{
        FuzzyOntology o = new FuzzyOntology(chemin);
               // o.addIndividual("22", "LOWBMI");
                  String jdbcURL = "jdbc:mysql://localhost:3306/onto";
        String username = "root";
        String password = "root";
        
 
        //o.addDataProprty("IMC", "tesmiyata3 relation", "test2");
        Connection connection = null;
        
         try{
            connection = DriverManager.getConnection(jdbcURL, username, password);
            connection.setAutoCommit(false);
            Statement st,st2;
            st = connection.createStatement();
            st2 = connection.createStatement();
            String  sql  = "SELECT * FROM onto";
            
            java.sql.ResultSet rs = st.executeQuery(sql);
            
            int i =1;
           
            String patient= null;
            double bmi;
            int age ,gender,fever,nause,headache,diahree,fatigue,boneache,jaundiche,epigasriapain;
            double WBC,RBC,HGB,PLAT,AST1,ALT1,ALT4,ALT12,ALT24,ALT36,ALT48,RNABASE,RNA4,RNA12,RNAEOT,RNAEF,ALTAFTER24W;
            int BHG,BH;
            String nage= null,ngender= null,nbmi= null,nfever= null,nnause= null,nheadache= null,
                    ndiahree = null,nfatigue= null,nboneache= null,njaundiche= null,nepigasriapain= null,nWBC= null,nRBC= null,nHGB= null,
                    nPLAT= null,nAST1= null,nALT1= null,nALT4= null,nALT12= null,nALT24= null,nALT36= null,nALT48= null,nRNABASE= null,
                    nRNA4= null,nRNA12= null,nRNAEOT= null,nRNAEF= null,nBHG= null,nBH= null,naltafter24w=null;
            while (rs.next()) {
                //pour crées tous les individu
                 patient = "patient"+i;
                //récupurer les valeurs 
                age  = Integer.parseInt(rs.getString(1));
                gender  = Integer.parseInt(rs.getString(2));
                bmi = Double.parseDouble(rs.getString(3));
                fever  = Integer.parseInt(rs.getString(4));
                nause = Integer.parseInt(rs.getString(5));
                headache = Integer.parseInt(rs.getString(6));
                diahree = Integer.parseInt(rs.getString(7));
                fatigue = Integer.parseInt(rs.getString(8));
                //boneache = Integer.parseInt(rs.getString(9));
                jaundiche = Integer.parseInt(rs.getString(9));
                epigasriapain = Integer.parseInt(rs.getString(10));
                WBC = Double.parseDouble(rs.getString(11));
                RBC = Double.parseDouble(rs.getString(12));
                HGB = Double.parseDouble(rs.getString(13));
                PLAT = Double.parseDouble(rs.getString(14));
                AST1 = Double.parseDouble(rs.getString(15));
                ALT1 = Double.parseDouble(rs.getString(16));
                ALT4 = Double.parseDouble(rs.getString(17));
                ALT12 = Double.parseDouble(rs.getString(18));
                ALT24 = Double.parseDouble(rs.getString(19));
                ALT36 = Double.parseDouble(rs.getString(20));
                ALT48 = Double.parseDouble(rs.getString(21));
                ALTAFTER24W = Double.parseDouble(rs.getString(22));
                RNABASE = Double.parseDouble(rs.getString(23));
                RNA4 = Double.parseDouble(rs.getString(24));
                RNA12 = Double.parseDouble(rs.getString(25));
                RNAEOT = Double.parseDouble(rs.getString(26));
                RNAEF = Double.parseDouble(rs.getString(27));
               BHG  = Integer.parseInt(rs.getString(28));
               BH   = Integer.parseInt(rs.getString(29));
               //start convertion
               if(age>=0 && age <=39){nage = "YOUNGPATIENT";}else {nage="ADULTEPATIENT";}
               if(gender == 1){ngender = "MALE";}else {ngender = "FEMALE";}
                if(bmi >=0 && bmi <18.5){nbmi = "VERYLOWBMI";}else {
                if(bmi >=18.5 && bmi <25){nbmi = "LOWBMI";}else {
                   if(bmi >=25 && bmi <30){nbmi = "HIGHBMI";} else {
                   if(bmi >=30) { nbmi = "VERYHIGHBMI";}
                                                                    }
                                                                }
                                                    }
                System.err.println("1");
               if(fever == 1){nfever = "Absent";}else {nfever = "Present";}
               if(nause == 1){nnause = "Absent";}else {nnause = "Present";}
               if(headache == 1){nheadache = "Absent";}else {nheadache = "Present";}
               if(diahree == 1){ndiahree = "Absent";}else {ndiahree = "Present";}
               if(fatigue == 1){nfatigue = "Absent";}else {nfatigue = "Present";}
               //if(boneache == 1){nboneache = "Absent";}else {nboneache = "Present";}
               if(jaundiche == 1){njaundiche = "Absent";}else {njaundiche = "Present";}
               if(epigasriapain == 1){nepigasriapain = "Absent";}else {nepigasriapain = "Present";}
               
               if(WBC >=0 && WBC < 4000){nWBC = "LOWWBC";}else {
                 if(WBC >=4000 && WBC < 11000){nWBC = "NETURALWBC";}else{
                 if(WBC >=11000){nWBC = "HIGHWBC";}
                 }  
               }
               
               if(RBC >=0 && RBC < 3000000){nRBC = "LOWRBC";}else {
                 if(RBC >=3000000 && RBC < 5000000){nRBC = "NETURALRBC";}else{
                 if(RBC >=5000000){nRBC = "HIGHRBC";}
                 }  
               }
               
               if(HGB >=0 && HGB < 14){nHGB = "LOWHGB";}else {
                 if(HGB >=14 && HGB < 17.5){nHGB = "NETURALHGB";}else{
                 if(HGB >=17.5){nHGB = "HIGHHGB";}
                 }  
               }
               if(PLAT >=0 && PLAT < 100000){nPLAT = "LOWPLAT";}else {
                 if(PLAT >=100000 && PLAT < 255000){nPLAT = "NETURALPLAT";}else{
                 if(PLAT >=255000){nPLAT = "HIGHPLAT";}
                 }  
               }
               if(AST1 >=0 && AST1 < 20){nAST1 = "LOWAST1";}else {
                 if(AST1 >=20 && AST1 < 40){nAST1 = "NETURALAST1";}else{
                 if(AST1 >=40){nAST1 = "HIGHAST1";}
                 }  
               }
               if(ALT1 >=0 && ALT1 < 20){nALT1 = "LOWALT1";}else {
                 if(ALT1 >=20 && ALT1 < 40){nALT1 = "NETURALALT1";}else{
                 if(ALT1 >=40){nALT1 = "HIGHALT1";}
                 }  
               }
                if(ALT4 >=0 && ALT4 < 20){nALT4 = "LOWALT4";}else {
                 if(ALT4 >=20 && ALT4 < 40){nALT4 = "NETURALALT4";}else{
                 if(ALT4 >=40){nALT4 = "HIGHALT4";}
                 }  
               }
                if(ALT12 >=0 && ALT12 < 20){nALT12 = "LOWALT12";}else {
                 if(ALT12 >=20 && ALT12 < 40){nALT12 = "NETURALALT12";}else{
                 if(ALT12 >=40){nALT12 = "HIGHALT12";}
                 }  
               }
                if(ALT24 >=0 && ALT24 < 20){nALT24 = "LOWALT24";}else {
                 if(ALT24 >=20 && ALT24< 40){nALT24 = "NETURALALT24";}else{
                 if(ALT24 >=40){nALT24 = "HIGHALT24";}
                 }  
               }
                if(ALT36 >=0 && ALT36 < 20){nALT36 = "LOWALT36";}else {
                 if(ALT36 >=20 && ALT36< 40){nALT36 = "NETURALALT36";}else{
                 if(ALT36 >=40){nALT36 = "HIGHALT36";}
                 }  
               }
               
                if(ALT48 >=0 && ALT48 < 20){nALT48 = "LOWALT48";}else {
                 if(ALT48 >=20 && ALT48 < 40){nALT48 = "NETURALALT48";}else{
                 if(ALT48 >=40){nALT48 = "HIGHALT48";}
                 }  
               }
                 if(ALTAFTER24W >=0 && ALTAFTER24W < 20){naltafter24w = "LOWALTAFTER24W";}else {
                 if(ALTAFTER24W >=20 && ALTAFTER24W < 40){naltafter24w = "NETURALALTAFTER24W";}else{
                 if(ALTAFTER24W >=40){naltafter24w = "HIGHALTAFTER24W";}
                 }  
               }
                
               if(RNABASE >=0 && RNABASE <5 ){nRNABASE = "LOWRNABASE";}else {nRNABASE = "HIGHRNABASE";}
               if(RNA4 >=0 && RNA4 <5 ){nRNA4 = "LOWRNA4";}else {nRNA4 = "HIGHRNA4";}
               if(RNA12 >=0 && RNA12 <5 ){nRNA12 = "LOWRNA12";}else {nRNA12 = "HIGHRNA12";}
               if(RNAEOT >=0 && RNAEOT <5 ){nRNAEOT = "LOWRNAEOT";}else {nRNAEOT = "HIGHRNAEOT";}
               if(RNAEF >=0 && RNAEF <5 ){nRNAEF = "LOWRNAEF";}else {nRNAEF = "HIGHRNAEF";}
               if(BHG ==1 ){nBHG ="1";}else {
               if(BHG ==2 ){nBHG ="2";}else {
               if(BHG ==3 ){nBHG ="3";}else {
               if(BHG ==5 ){nBHG ="4";} else {
               if(BHG ==5 ){nBHG ="5";} else {
               if(BHG ==6 ){nBHG ="6";}else {
               if(BHG ==7 ){nBHG ="7";} else {
               if(BHG ==8 ){nBHG ="8";}else {
               if(BHG ==9 ){nBHG ="9";} else {
               if(BHG ==10 ){nBHG ="10";} else {
               if(BHG ==11){nBHG ="11";} else {
               if(BHG ==12 ){nBHG ="12";} else {
               if(BHG ==13 ){nBHG ="13";} else {
               if(BHG ==14 ){nBHG ="14";} else {
               if(BHG ==15 ){nBHG ="15";} else {
               if(BHG ==16 ){nBHG ="16";}
               }
               }
               }
               }
               }
               }
               }
               }
               }
               }
               }
               }
               }
               }
               }
                   
                   
                   
                   
               if(BH == 1) {nBH = "No Fibrosis";}else {
               if(BH == 2) {nBH = "Portal Fibrosis";}else {
               if(BH == 3) {nBH = "New septa";} else {nBH = "May Septa";}}
               }
                 System.err.println("1");
              
sql = "INSERT INTO onto1( PATIENT, AGE, Gender, BMI, FEVER, NAUSEE, HEADACHE, DIAHREE, FATIGUE, JAUNDICE, EPIGASTRICPAIN, WBC, RBC, HGB, PLAT, AST1, ALT1, ALT4, ALT12, ALT24, ALT36, ALT48,ALTAFTER24W, RNABASE, RNA4, RNA12, RNAEOT, RNAEF, BHG, BH) VALUES('"+patient+"', '"+nage+"', '"+ngender+"','"+nbmi+"','"+nfever+"','"+nnause+"','"+nheadache+"','"+ndiahree+"', '"+nfatigue+"', '"+njaundiche+"', '"+nepigasriapain+"', '"+nWBC+"', '"+nRBC+"', '"+nHGB+"', '"+nPLAT+"', '"+nAST1+"', '"+nALT1+"','"+nALT4+"', '"+nALT12+"','"+nALT24+"', '"+nALT36+"','"+nALT48+"', '"+naltafter24w+"', '"+nRNABASE+"', '"+nRNA4+"', '"+nRNA12+"', '"+nRNAEOT+"', '"+nRNAEF+"', '"+nBHG+"', '"+nBH+"')";
              
        st2.executeUpdate(sql);
            i++; 
            System.err.println("******************** ligne num "+i+"*********************"+BHG+"  "+nBHG);
            }
            
         
           
 
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
