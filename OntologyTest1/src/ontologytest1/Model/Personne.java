/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontologytest1.Model;
import ontologytest1.FuzzyOntology;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

/**
 *
 * @author Winsido
 */
public class Personne {
    
    FuzzyOntology o;
     String patient ,age ,gender ,fever ,nause ,headache ,diahree ,fatigue ,boneache ,jaundiche ,epigasriapain ,BHG ,BH , bmi , WBC ,RBC ,HGB ,PLAT ,AST1 ,ALT1 ,ALT4 ,ALT12 ,ALT24 ,ALT36 ,ALT48 ,ALTAFTER24W,RNABASE ,RNA4 ,RNA12 ,RNAEOT ,RNAEF ;
        
       String age1,gender1,fever1,nause1,headache1,diahree1,fatigue1,boneache1,jaundiche1 ,epigasriapain1 ,BHG1 ,BH1 , bmi1 , WBC1 ,RBC1 ,HGB1 ,PLAT1 ,AST11 ,ALT11 ,ALT41 ,ALT121 ,ALT241 ,ALT361 ,ALT481 ,ALTAFTER24W1,RNABASE1 ,RNA41 ,RNA121 ,RNAEOT1 ,RNAEF1 ;
   
       public Personne(){
    String chemin  = "C:\\Users\\Winsido\\Desktop\\mm\\ontologiefinalbienconstruite.owl";
        o = new FuzzyOntology(chemin);
    }
       public Personne (String patient ,String age ,String gender ,String fever ,String nause ,String headache ,String diahree ,String fatigue ,String boneache ,String jaundiche ,String epigasriapain ,String BHG ,String BH ,String bmi ,String WBC ,String RBC ,String HGB ,String PLAT ,String AST1 ,String ALT1 ,String ALT4 ,String ALT12 ,String ALT24 ,String ALT36 ,String ALT48 ,String ALTAFTER24W,String RNABASE ,String RNA4 ,String RNA12 ,String RNAEOT ,String RNAEF ) {
   this.patient = patient ;
   this.age = age;
   this.gender= gender ;
   this.fever=fever ;
   this.nause = nause ;
   this.headache = headache ;
   this.diahree=diahree ;
   this.fatigue=fatigue ;
   this.boneache=boneache ;
   this.jaundiche=jaundiche ;
   this.epigasriapain=epigasriapain ;
   this.BHG=BHG ;
   this.BH=BH ;
   this.bmi=bmi ;
   this.WBC=WBC ;
   this.RBC = RBC;
   this.HGB=HGB ;
   this.PLAT=PLAT ;
   this.AST1=AST1 ;
   this.ALT1=ALT1 ;
   this.ALT4=ALT4 ;
   this.ALT12=ALT12 ;
   this.ALT24=ALT24 ;
   this.ALT36=ALT36 ;
   this.ALT48=ALT48 ;
   this.ALTAFTER24W=ALTAFTER24W;
   this.RNABASE=RNABASE ;
   this.RNA4=RNA4 ;
   this.RNA12=RNA12 ;
   this.RNAEOT=RNAEOT ;
   this.RNAEF = RNAEF;
                 /*age1 = "age"+patient;
                 gender1 = "gender"+patient;
                 bmi1 = "IMC"+patient;
                 fever1 = "fever"+patient;
                 nause1 = "nause"+patient;
                 headache1 = "headache"+patient;
                 diahree1 = "diahree"+patient;
                 fatigue1 = "fatigue"+patient;
                 boneache1 = "boneache"+patient;
                 jaundiche1 = "jaundiche"+patient;
                 epigasriapain1 = "epigasriapain"+patient;
                 WBC1 = "WBC"+patient;
                 RBC1 = "RBC"+patient;
                 HGB1 = "HGB"+patient;
                 PLAT1 = "PLAT"+patient;
                 AST11 = "AST1"+patient;
               
                 ALT11 = "ALT1"+patient;
                 ALT41 = "ALT4"+patient;
                 ALT121 = "ALT12"+patient;
                 ALT241 = "ALT24"+patient;
                 ALT361 = "ALT36"+patient;
                 ALT481 = "ALT48"+patient;
                 ALTAFTER24W1 = "ALTAFTER24W"+patient;
                 RNABASE1 = "RNABASE"+patient;
                 RNA41 = "RNA4"+patient;
                 RNA121 = "RNA12"+patient;
                 RNAEOT1 = "RNAEOT"+patient;
                 RNAEF1 = "RNAEF"+patient;
                 BHG1 = "BHG"+patient;
                 BH1 = "BH"+patient;*/
                 String chemin  = "C:\\Users\\Winsido\\Desktop\\mm\\ontologiefinalbienconstruite.owl";
                 o = new FuzzyOntology(chemin);
   }
       public void rempliratt() {
          age1 = "age"+this.patient;
                 gender1 = "gender"+this.patient;
                 bmi1 = "IMC"+this.patient;
                 fever1 = "fever"+this.patient;
                 nause1 = "nause"+this.patient;
                 headache1 = "headache"+this.patient;
                 diahree1 = "diahree"+this.patient;
                 fatigue1 = "fatigue"+this.patient;
                 boneache1 = "boneache"+this.patient;
                 jaundiche1 = "jaundiche"+this.patient;
                 epigasriapain1 = "epigasriapain"+this.patient;
                 WBC1 = "WBC"+this.patient;
                 RBC1 = "RBC"+this.patient;
                 HGB1 = "HGB"+this.patient;
                 PLAT1 = "PLAT"+this.patient;
                 AST11 = "AST1"+this.patient;
               
                 ALT11 = "ALT1"+this.patient;
                 ALT41 = "ALT4"+this.patient;
                 ALT121 = "ALT12"+this.patient;
                 ALT241 = "ALT24"+this.patient;
                 ALT361 = "ALT36"+this.patient;
                 ALT481 = "ALT48"+this.patient;
                 ALTAFTER24W1 = "ALTAFTER24W"+this.patient;
                 RNABASE1 = "RNABASE"+this.patient;
                 RNA41 = "RNA4"+this.patient;
                 RNA121 = "RNA12"+this.patient;
                 RNAEOT1 = "RNAEOT"+this.patient;
                 RNAEF1 = "RNAEF"+this.patient;
                 BHG1 = "BHG"+this.patient;
                 BH1 = "BH"+this.patient;}
   //hna ki dir bel vue w controller dirlou paramétre Ontologie
   public void addtoOnto() throws OWLOntologyStorageException {
       //ajouter les individues
                o.addIndividual(patient, "Patient");
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
                //o.addIndividual(BH1, "Histologique_de_base");
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
                
                
                //ajouter avec data property
                o.addDataProprty(bmi1, "hasBMI", bmi);
                o.addDataProprty(jaundiche1, "aJauinisse", jaundiche);
                o.addDataProprty(diahree1, "adiahrée", diahree);
                o.addDataProprty(epigasriapain1, "aepigasrticpain", epigasriapain);
                o.addDataProprty(fatigue1, "aFatigue", fatigue);
                o.addDataProprty(boneache1, "aBoneache", boneache);
                o.addDataProprty(fever1, "afiévre", fever);
                o.addDataProprty(headache1, "aMauxdetete", headache);
                o.addDataProprty(nause1, "aNausée", nause);
                o.addDataProprty(BHG1, "aGraduationhistologiquedebase", BHG);
                //o.addDataProprty(BH1, "aHistologiquedebase", BH);
                o.addDataProprty(ALT11, "hasALT1", ALT1);
                o.addDataProprty(ALT41, "hasALT4", ALT4);
                o.addDataProprty(ALT121, "hasALT12", ALT12);
                o.addDataProprty(ALT241, "hasALT24", ALT24);
                o.addDataProprty(ALT361, "hasALT36", ALT36);
                o.addDataProprty(ALT481, "hasALT48", ALT48);
                o.addDataProprty(ALTAFTER24W1, "hasALTafter24w", ALTAFTER24W);
                o.addDataProprty(AST11, "hasAST1", AST1);
                o.addDataProprty(HGB1, "hasHGB", HGB);
                o.addDataProprty(PLAT1, "hasPlat", PLAT);
                o.addDataProprty(RBC1, "hasRBC", RBC);
                o.addDataProprty(RNA121, "hasRNA12", RNA12);
                o.addDataProprty(RNA41, "hasRNA4", RNA4);
                o.addDataProprty(RNABASE1, "hasRNABASE", RNABASE);
                o.addDataProprty(RNAEF1, "hasRNAEF", RNAEF);
                o.addDataProprty(RNAEOT1, "hasRNAEOT", RNAEOT);
                o.addDataProprty(WBC1, "hasWBC", WBC);
                o.addDataProprty(patient, "hasGender", gender);
                o.addDataProprty(patient, "hasAge", age);
                
                //relier un patient avec touts les critéres 
                /*o.linkIndividuals(patient, age, "hasAge1");
                o.linkIndividuals(patient, gender, "hasGender1");*/
                o.linkIndividuals(patient, bmi1, "hasBMI");
                o.linkIndividuals(patient, jaundiche1, "aJauinisse");
                o.linkIndividuals(patient, diahree1, "adiahrée");
                o.linkIndividuals(patient, epigasriapain1, "aepigasrticpain");
                o.linkIndividuals(patient, fatigue1, "aFatigue");
                o.linkIndividuals(patient, boneache1, "aBoneache");
                o.linkIndividuals(patient, fever1, "afiévre");
                o.linkIndividuals(patient, headache1, "aMauxdetete");
                o.linkIndividuals(patient, nause1, "aNausée");
                o.linkIndividuals(patient, BHG1, "aGraduationhistologiquedebase");
               // o.linkIndividuals(patient, BH1, "aHistologiquedebase");
                o.linkIndividuals(patient, ALT11, "hasALT1");
                o.linkIndividuals(patient, ALT41, "hasALT4");
                o.linkIndividuals(patient, ALT121, "hasALT12");
                o.linkIndividuals(patient, ALT241, "hasALT24");
                o.linkIndividuals(patient, ALT361, "hasALT36");
                o.linkIndividuals(patient, ALT481, "hasALT48");
                o.linkIndividuals(patient, ALTAFTER24W1, "hasALTafter24w");
                o.linkIndividuals(patient, AST11, "hasAST1");
                o.linkIndividuals(patient, HGB1, "hasHGB");
                o.linkIndividuals(patient, PLAT1, "hasPlat");
                o.linkIndividuals(patient, RBC1, "hasRBC");
                o.linkIndividuals(patient, RNA121, "hasRNA12");
                o.linkIndividuals(patient, RNA41, "hasRNA4");
                o.linkIndividuals(patient, RNABASE1, "hasRNABASE");
                o.linkIndividuals(patient, RNAEF1, "hasRNAEF");
                o.linkIndividuals(patient, RNAEOT1, "hasRNAEOT");
                o.linkIndividuals(patient, WBC1, "hasWBC");
            System.out.println(" "+patient+" "+age1+" "+gender1+" "+fever1+" "+nause1 +" "+headache1+" "+diahree1+" "+fatigue1+" "+boneache1+" "+jaundiche1+" "+epigasriapain1+" "+BHG1+" "+ bmi1 +" " +WBC1 +" "+RBC1 +" "+HGB1 +" "+ PLAT1 +" "+AST11 +" "+ALT11 +" "+ALT41 +" "+ALT121 +" "+ALT241 +" "+ALT361 +" "+ALT481 +" "+ALTAFTER24W1+" "+RNABASE1 +" "+RNA41 +" "+RNA121 +" "+RNAEOT1 +" "+RNAEF1 );
         
      
   }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFever() {
        return fever;
    }

    public void setFever(String fever) {
        this.fever = fever;
    }

    public String getNause() {
        return nause;
    }

    public void setNause(String nause) {
        this.nause = nause;
    }

    public String getHeadache() {
        return headache;
    }

    public void setHeadache(String headache) {
        this.headache = headache;
    }

    public String getDiahree() {
        return diahree;
    }

    public void setDiahree(String diahree) {
        this.diahree = diahree;
    }

    public String getFatigue() {
        return fatigue;
    }

    public void setFatigue(String fatigue) {
        this.fatigue = fatigue;
    }

    public String getBoneache() {
        return boneache;
    }

    public void setBoneache(String boneache) {
        this.boneache = boneache;
    }

    public String getJaundiche() {
        return jaundiche;
    }

    public void setJaundiche(String jaundiche) {
        this.jaundiche = jaundiche;
    }

    public String getEpigasriapain() {
        return epigasriapain;
    }

    public void setEpigasriapain(String epigasriapain) {
        this.epigasriapain = epigasriapain;
    }

    public String getBHG() {
        return BHG;
    }

    public void setBHG(String BHG) {
        this.BHG = BHG;
    }

    public String getBH() {
        return BH;
    }

    public void setBH(String BH) {
        this.BH = BH;
    }

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public String getWBC() {
        return WBC;
    }

    public void setWBC(String WBC) {
        this.WBC = WBC;
    }

    public String getRBC() {
        return RBC;
    }

    public void setRBC(String RBC) {
        this.RBC = RBC;
    }

    public String getHGB() {
        return HGB;
    }

    public void setHGB(String HGB) {
        this.HGB = HGB;
    }

    public String getPLAT() {
        return PLAT;
    }

    public void setPLAT(String PLAT) {
        this.PLAT = PLAT;
    }

    public String getAST1() {
        return AST1;
    }

    public void setAST1(String AST1) {
        this.AST1 = AST1;
    }

    public String getALT1() {
        return ALT1;
    }

    public void setALT1(String ALT1) {
        this.ALT1 = ALT1;
    }

    public String getALT4() {
        return ALT4;
    }

    public void setALT4(String ALT4) {
        this.ALT4 = ALT4;
    }

    public String getALT12() {
        return ALT12;
    }

    public void setALT12(String ALT12) {
        this.ALT12 = ALT12;
    }

    public String getALT24() {
        return ALT24;
    }

    public void setALT24(String ALT24) {
        this.ALT24 = ALT24;
    }

    public String getALT36() {
        return ALT36;
    }

    public void setALT36(String ALT36) {
        this.ALT36 = ALT36;
    }

    public String getALT48() {
        return ALT48;
    }

    public void setALT48(String ALT48) {
        this.ALT48 = ALT48;
    }

    public String getALTAFTER24W() {
        return ALTAFTER24W;
    }

    public void setALTAFTER24W(String ALTAFTER24W) {
        this.ALTAFTER24W = ALTAFTER24W;
    }

    public String getRNABASE() {
        return RNABASE;
    }

    public void setRNABASE(String RNABASE) {
        this.RNABASE = RNABASE;
    }

    public String getRNA4() {
        return RNA4;
    }

    public void setRNA4(String RNA4) {
        this.RNA4 = RNA4;
    }

    public String getRNA12() {
        return RNA12;
    }

    public void setRNA12(String RNA12) {
        this.RNA12 = RNA12;
    }

    public String getRNAEOT() {
        return RNAEOT;
    }

    public void setRNAEOT(String RNAEOT) {
        this.RNAEOT = RNAEOT;
    }

    public String getRNAEF() {
        return RNAEF;
    }

    public void setRNAEF(String RNAEF) {
        this.RNAEF = RNAEF;
    }

    public String getAge1() {
        return age1;
    }

    public void setAge1(String age1) {
        this.age1 = age1;
    }

    public String getGender1() {
        return gender1;
    }

    public void setGender1(String gender1) {
        this.gender1 = gender1;
    }

    public String getFever1() {
        return fever1;
    }

    public void setFever1(String fever1) {
        this.fever1 = fever1;
    }

    public String getNause1() {
        return nause1;
    }

    public void setNause1(String nause1) {
        this.nause1 = nause1;
    }

    public String getHeadache1() {
        return headache1;
    }

    public void setHeadache1(String headache1) {
        this.headache1 = headache1;
    }

    public String getDiahree1() {
        return diahree1;
    }

    public void setDiahree1(String diahree1) {
        this.diahree1 = diahree1;
    }

    public String getFatigue1() {
        return fatigue1;
    }

    public void setFatigue1(String fatigue1) {
        this.fatigue1 = fatigue1;
    }

    public String getBoneache1() {
        return boneache1;
    }

    public void setBoneache1(String boneache1) {
        this.boneache1 = boneache1;
    }

    public String getJaundiche1() {
        return jaundiche1;
    }

    public void setJaundiche1(String jaundiche1) {
        this.jaundiche1 = jaundiche1;
    }

    public String getEpigasriapain1() {
        return epigasriapain1;
    }

    public void setEpigasriapain1(String epigasriapain1) {
        this.epigasriapain1 = epigasriapain1;
    }

    public String getBHG1() {
        return BHG1;
    }

    public void setBHG1(String BHG1) {
        this.BHG1 = BHG1;
    }

    public String getBH1() {
        return BH1;
    }

    public void setBH1(String BH1) {
        this.BH1 = BH1;
    }

    public String getBmi1() {
        return bmi1;
    }

    public void setBmi1(String bmi1) {
        this.bmi1 = bmi1;
    }

    public String getWBC1() {
        return WBC1;
    }

    public void setWBC1(String WBC1) {
        this.WBC1 = WBC1;
    }

    public String getRBC1() {
        return RBC1;
    }

    public void setRBC1(String RBC1) {
        this.RBC1 = RBC1;
    }

    public String getHGB1() {
        return HGB1;
    }

    public void setHGB1(String HGB1) {
        this.HGB1 = HGB1;
    }

    public String getPLAT1() {
        return PLAT1;
    }

    public void setPLAT1(String PLAT1) {
        this.PLAT1 = PLAT1;
    }

    public String getAST11() {
        return AST11;
    }

    public void setAST11(String AST11) {
        this.AST11 = AST11;
    }

    public String getALT11() {
        return ALT11;
    }

    public void setALT11(String ALT11) {
        this.ALT11 = ALT11;
    }

    public String getALT41() {
        return ALT41;
    }

    public void setALT41(String ALT41) {
        this.ALT41 = ALT41;
    }

    public String getALT121() {
        return ALT121;
    }

    public void setALT121(String ALT121) {
        this.ALT121 = ALT121;
    }

    public String getALT241() {
        return ALT241;
    }

    public void setALT241(String ALT241) {
        this.ALT241 = ALT241;
    }

    public String getALT361() {
        return ALT361;
    }

    public void setALT361(String ALT361) {
        this.ALT361 = ALT361;
    }

    public String getALT481() {
        return ALT481;
    }

    public void setALT481(String ALT481) {
        this.ALT481 = ALT481;
    }

    public String getALTAFTER24W1() {
        return ALTAFTER24W1;
    }

    public void setALTAFTER24W1(String ALTAFTER24W1) {
        this.ALTAFTER24W1 = ALTAFTER24W1;
    }

    public String getRNABASE1() {
        return RNABASE1;
    }

    public void setRNABASE1(String RNABASE1) {
        this.RNABASE1 = RNABASE1;
    }

    public String getRNA41() {
        return RNA41;
    }

    public void setRNA41(String RNA41) {
        this.RNA41 = RNA41;
    }

    public String getRNA121() {
        return RNA121;
    }

    public void setRNA121(String RNA121) {
        this.RNA121 = RNA121;
    }

    public String getRNAEOT1() {
        return RNAEOT1;
    }

    public void setRNAEOT1(String RNAEOT1) {
        this.RNAEOT1 = RNAEOT1;
    }

    public String getRNAEF1() {
        return RNAEF1;
    }

    public void setRNAEF1(String RNAEF1) {
        this.RNAEF1 = RNAEF1;
    }
    public void affichage(){
        System.out.println(" "+patient+age+" "+gender+" "+fever+" "+nause +" "+headache+" "+diahree+" "+fatigue+" "+boneache+" "+jaundiche+" "+epigasriapain+" "+BHG+" "+ bmi +" " +WBC +" "+RBC +" "+HGB +" "+ PLAT +" "+AST1 +" "+ALT1 +" "+ALT4 +" "+ALT12 +" "+ALT24 +" "+ALT36 +" "+ALT48 +" "+ALTAFTER24W+" "+RNABASE +" "+RNA4 +" "+RNA12 +" "+RNAEOT +" "+RNAEF );
    }
   /*public static void main (String [] args){
   Personne p = new Personne("rialiiii", "18", "FEMALE", "Absent", "Absent", "Absent", "Absent", "Absent", "Absent", "Absent", "Absent", "1", "No fibrosis", "19.5", "39000", "39000", "15", "15", "39000", "39000", "39000", "39000", "39000", "39000", "39000", "39000", "39000", "39000", "39000", "39000", "39000");
   try{
   p.addtoOnto();
   }catch(OWLOntologyStorageException e){
       System.out.println("ontologytest1.Model.Personne.main()");
   }     
   
   
   }*/
}
