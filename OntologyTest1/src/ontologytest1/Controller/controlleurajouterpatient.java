/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontologytest1.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ontologytest1.*;
import ontologytest1.Model.Personne;
import ontologytest1.View.Ajouterpatient;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
/**
 *
 * @author Winsido
 */
public class controlleurajouterpatient {
    private Ajouterpatient ajouterpatientView;
    private Personne personne;

    public controlleurajouterpatient(Ajouterpatient ajouterpatientView, Personne personne) throws AWTException {
        this.ajouterpatientView = ajouterpatientView;
        this.personne = personne;
       initControlleur(); 
    }

    
public void initControlleur() throws AWTException{
    Robot r = new Robot();
    ajouterpatientView.getAddi().addMouseListener(new MouseAdapter() {
			public void mouseClicked (MouseEvent ev) {
			/*	
                                ou je dois écrire mon code 
			 */
                        String patient ,age ,gender ,fever ,nause ,headache ,diahree ,fatigue ,boneache ,jaundiche ,epigasriapain ,BHG ,BH , bmi , WBC ,RBC ,HGB ,PLAT ,AST1 ,ALT1 ,ALT4 ,ALT12 ,ALT24 ,ALT36 ,ALT48 ,ALTAFTER24W,RNABASE ,RNA4 ,RNA12 ,RNAEOT ,RNAEF,gender1 ,fever1 ,nause1 ,headache1 ,diahree1 ,fatigue1 ,boneache1 ,jaundiche1 ,epigasriapain1;
			
                         patient = ajouterpatientView.getPatient().getText().toString();
                        age = ajouterpatientView.getAge().getText().toString();
                        //BHG = ajouterpatientView.getGrading()getText();
                        //BH = ajouterpatientView. ;
                        bmi =  ajouterpatientView.getBmi().getText().toString();
                        WBC =  ajouterpatientView.getWBC().getText().toString();
                        RBC = ajouterpatientView.getRBC().getText().toString();
                        HGB = ajouterpatientView.getHGB().getText().toString();
                        PLAT = ajouterpatientView.getPLAT().getText().toString();
                        AST1 = ajouterpatientView.getAST1().getText().toString();
                        ALT1= ajouterpatientView.getALT1().getText().toString();
                        ALT4= ajouterpatientView.getALT4().getText().toString();
                        ALT12 = ajouterpatientView.getALT12().getText().toString();
                        ALT24 = ajouterpatientView.getALT24().getText().toString();
                        ALT36 = ajouterpatientView.getALT36().getText().toString();
                        ALT48= ajouterpatientView.getALT48().getText().toString();
                        ALTAFTER24W= ajouterpatientView.getALT24W().getText().toString();
                        RNABASE = ajouterpatientView.getRNABASE().getText().toString();
                        RNA4= ajouterpatientView.getRNA4().getText().toString();
                        RNA12 = ajouterpatientView.getRNA12().getText().toString();
                        RNAEOT = ajouterpatientView.getRNAEOT().getText().toString();
                        RNAEF = ajouterpatientView.getRNAEF().getText().toString();
                       gender = ajouterpatientView.getSexe().getSelectedItem().toString();
                       fever = ajouterpatientView.getFievre().getSelectedItem().toString() ;
                       nause = ajouterpatientView.getNausee().getSelectedItem().toString() ;
                       headache = ajouterpatientView.getMaux().getSelectedItem().toString() ;
                       diahree = ajouterpatientView.getDiarrhee().getSelectedItem().toString() ;
                       fatigue = ajouterpatientView.getFatigue().getSelectedItem().toString() ;
                       boneache = ajouterpatientView.getBoneache().getSelectedItem().toString() ;
                       jaundiche =  ajouterpatientView.getJaunisse().getSelectedItem().toString();
                       epigasriapain = ajouterpatientView.getDouleur().getSelectedItem().toString() ;
                       BHG=  ajouterpatientView.getGrading().getSelectedItem().toString();
                          try{
		                                
                               personne.setPatient(patient);
                               personne.setAge(age);
                               personne.setGender(gender);
                               if(fever.equals("Absent")){fever1 ="1";}else {fever1 ="2";}
                               if(nause.equals("Absent")){nause1 ="1";}else {nause1 ="2";}
                               if(headache.equals("Absent")){headache1 ="1";}else {headache1 ="2";}
                               if(diahree.equals("Absent")){diahree1 ="1";}else {diahree1 ="2";}
                               if(fatigue.equals("Absent")){fatigue1 ="1";}else {fatigue1 ="2";}
                               if(boneache.equals("Absent")){boneache1 ="1";}else {boneache1 ="2";}
                               if(jaundiche.equals("Absent")){jaundiche1 ="1";}else {jaundiche1 ="2";}
                               if(epigasriapain.equals("Absent")){epigasriapain1 ="1";}else {epigasriapain1 ="2";}
                               personne.setFever(fever1);
                               personne.setNause(nause1);
                               personne.setHeadache(headache1);
                               personne.setDiahree(diahree1);
                               personne.setFatigue(fatigue1);
                               personne.setBoneache(boneache1);
                               personne.setJaundiche(jaundiche1);
                               personne.setEpigasriapain(epigasriapain1);
                               personne.setBHG(BHG);
                               personne.setBmi(bmi);
                               personne.setWBC(WBC);
                               personne.setRBC(RBC);
                               personne.setPLAT(PLAT);
                               personne.setHGB(HGB);
                               personne.setAST1(AST1);
                               personne.setALT1(ALT1);
                               personne.setALT4(ALT4);
                               personne.setALT12(ALT12);
                               personne.setALT24(ALT24);
                               personne.setALT36(ALT36);
                               personne.setALT48(ALT48);
                               personne.setALTAFTER24W(ALTAFTER24W);
                               personne.setRNABASE(RNABASE);
                               personne.setRNA4(RNA4);
                               personne.setRNA12(RNA12);
                               personne.setRNAEOT(RNAEOT);
                               personne.setRNAEF(RNAEF);
                             try {
                                 personne.rempliratt();
                                personne.affichage();
                                personne.addtoOnto();
                                JOptionPane.showMessageDialog(null, "Patient ajouté ","Information",JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            } catch (OWLOntologyStorageException ex) {
                                JOptionPane.showMessageDialog(null, "Revoir vos attributs","Error",JOptionPane.ERROR_MESSAGE);
                            }
                               }catch(Exception e ){}
                      }
		}) ;
     ajouterpatientView.getPatient().addKeyListener(new KeyAdapter() {
			public void keyReleased (KeyEvent ev) {
			if(ev.getKeyCode() == KeyEvent.VK_0 || ev.getKeyCode() == KeyEvent.VK_1 || ev.getKeyCode() == KeyEvent.VK_2 || ev.getKeyCode() == KeyEvent.VK_3 || ev.getKeyCode() == KeyEvent.VK_4
                                || ev.getKeyCode() == KeyEvent.VK_5 || ev.getKeyCode() == KeyEvent.VK_6 || ev.getKeyCode() == KeyEvent.VK_7 || ev.getKeyCode() == KeyEvent.VK_8 || ev.getKeyCode() == KeyEvent.VK_9 ||
                                ev.getKeyCode() == KeyEvent.VK_NUMPAD0 || ev.getKeyCode() == KeyEvent.VK_NUMPAD1 || ev.getKeyCode() == KeyEvent.VK_NUMPAD2 || ev.getKeyCode() == KeyEvent.VK_NUMPAD3 || ev.getKeyCode() == KeyEvent.VK_NUMPAD4
                                || ev.getKeyCode() == KeyEvent.VK_NUMPAD5 || ev.getKeyCode() == KeyEvent.VK_NUMPAD6 || ev.getKeyCode() == KeyEvent.VK_NUMPAD7 || ev.getKeyCode() == KeyEvent.VK_NUMPAD8 || ev.getKeyCode() == KeyEvent.VK_NUMPAD9)
                        {JOptionPane.showMessageDialog(null, "le nom ne contient pas des chiffres merci","Error",JOptionPane.ERROR_MESSAGE);
                        ajouterpatientView.getPatient().setText("");
                        }
                      }
		});
     ajouterpatientView.getAge().addKeyListener(new KeyAdapter() {
			public void keyReleased (KeyEvent ev) {
	if(ev.getKeyCode() == KeyEvent.VK_A || ev.getKeyCode() == KeyEvent.VK_Z || ev.getKeyCode() == KeyEvent.VK_E || ev.getKeyCode() == KeyEvent.VK_R || ev.getKeyCode() == KeyEvent.VK_T || ev.getKeyCode() == KeyEvent.VK_Y || ev.getKeyCode() == KeyEvent.VK_U || ev.getKeyCode() == KeyEvent.VK_I || ev.getKeyCode() == KeyEvent.VK_O || ev.getKeyCode() == KeyEvent.VK_P 
                || ev.getKeyCode() == KeyEvent.VK_Q || ev.getKeyCode() == KeyEvent.VK_S || ev.getKeyCode() == KeyEvent.VK_D || ev.getKeyCode() == KeyEvent.VK_F || ev.getKeyCode() == KeyEvent.VK_G || ev.getKeyCode() == KeyEvent.VK_H || ev.getKeyCode() == KeyEvent.VK_J || ev.getKeyCode() == KeyEvent.VK_K || ev.getKeyCode() == KeyEvent.VK_L || ev.getKeyCode() == KeyEvent.VK_M || ev.getKeyCode() == KeyEvent.VK_W
                || ev.getKeyCode() == KeyEvent.VK_X || ev.getKeyCode() == KeyEvent.VK_C || ev.getKeyCode() == KeyEvent.VK_V || ev.getKeyCode() == KeyEvent.VK_B || ev.getKeyCode() == KeyEvent.VK_N ){
            JOptionPane.showMessageDialog(null, "le nom ne contient pas des lettres merci","Error",JOptionPane.ERROR_MESSAGE);
            ajouterpatientView.getAge().setText("");
                }
            }
                    
		});
     ajouterpatientView.getBmi().addKeyListener(new KeyAdapter() {
			public void keyReleased (KeyEvent ev) {
	if(ev.getKeyCode() == KeyEvent.VK_A || ev.getKeyCode() == KeyEvent.VK_Z || ev.getKeyCode() == KeyEvent.VK_E || ev.getKeyCode() == KeyEvent.VK_R || ev.getKeyCode() == KeyEvent.VK_T || ev.getKeyCode() == KeyEvent.VK_Y || ev.getKeyCode() == KeyEvent.VK_U || ev.getKeyCode() == KeyEvent.VK_I || ev.getKeyCode() == KeyEvent.VK_O || ev.getKeyCode() == KeyEvent.VK_P 
                || ev.getKeyCode() == KeyEvent.VK_Q || ev.getKeyCode() == KeyEvent.VK_S || ev.getKeyCode() == KeyEvent.VK_D || ev.getKeyCode() == KeyEvent.VK_F || ev.getKeyCode() == KeyEvent.VK_G || ev.getKeyCode() == KeyEvent.VK_H || ev.getKeyCode() == KeyEvent.VK_J || ev.getKeyCode() == KeyEvent.VK_K || ev.getKeyCode() == KeyEvent.VK_L || ev.getKeyCode() == KeyEvent.VK_M || ev.getKeyCode() == KeyEvent.VK_W
                || ev.getKeyCode() == KeyEvent.VK_X || ev.getKeyCode() == KeyEvent.VK_C || ev.getKeyCode() == KeyEvent.VK_V || ev.getKeyCode() == KeyEvent.VK_B || ev.getKeyCode() == KeyEvent.VK_N ){
            JOptionPane.showMessageDialog(null, "le nom ne contient pas des lettres merci","Error",JOptionPane.ERROR_MESSAGE);
            ajouterpatientView.getBmi().setText("");
                }
            }
                    
		});
     ajouterpatientView.getWBC().addKeyListener(new KeyAdapter() {
			public void keyReleased (KeyEvent ev) {
	if(ev.getKeyCode() == KeyEvent.VK_A || ev.getKeyCode() == KeyEvent.VK_Z || ev.getKeyCode() == KeyEvent.VK_E || ev.getKeyCode() == KeyEvent.VK_R || ev.getKeyCode() == KeyEvent.VK_T || ev.getKeyCode() == KeyEvent.VK_Y || ev.getKeyCode() == KeyEvent.VK_U || ev.getKeyCode() == KeyEvent.VK_I || ev.getKeyCode() == KeyEvent.VK_O || ev.getKeyCode() == KeyEvent.VK_P 
                || ev.getKeyCode() == KeyEvent.VK_Q || ev.getKeyCode() == KeyEvent.VK_S || ev.getKeyCode() == KeyEvent.VK_D || ev.getKeyCode() == KeyEvent.VK_F || ev.getKeyCode() == KeyEvent.VK_G || ev.getKeyCode() == KeyEvent.VK_H || ev.getKeyCode() == KeyEvent.VK_J || ev.getKeyCode() == KeyEvent.VK_K || ev.getKeyCode() == KeyEvent.VK_L || ev.getKeyCode() == KeyEvent.VK_M || ev.getKeyCode() == KeyEvent.VK_W
                || ev.getKeyCode() == KeyEvent.VK_X || ev.getKeyCode() == KeyEvent.VK_C || ev.getKeyCode() == KeyEvent.VK_V || ev.getKeyCode() == KeyEvent.VK_B || ev.getKeyCode() == KeyEvent.VK_N ){
            JOptionPane.showMessageDialog(null, "le nom ne contient pas des lettres merci","Error",JOptionPane.ERROR_MESSAGE);
            ajouterpatientView.getWBC().setText("");
                }
            }
                    
		});
     ajouterpatientView.getRBC().addKeyListener(new KeyAdapter() {
			public void keyReleased (KeyEvent ev) {
	if(ev.getKeyCode() == KeyEvent.VK_A || ev.getKeyCode() == KeyEvent.VK_Z || ev.getKeyCode() == KeyEvent.VK_E || ev.getKeyCode() == KeyEvent.VK_R || ev.getKeyCode() == KeyEvent.VK_T || ev.getKeyCode() == KeyEvent.VK_Y || ev.getKeyCode() == KeyEvent.VK_U || ev.getKeyCode() == KeyEvent.VK_I || ev.getKeyCode() == KeyEvent.VK_O || ev.getKeyCode() == KeyEvent.VK_P 
                || ev.getKeyCode() == KeyEvent.VK_Q || ev.getKeyCode() == KeyEvent.VK_S || ev.getKeyCode() == KeyEvent.VK_D || ev.getKeyCode() == KeyEvent.VK_F || ev.getKeyCode() == KeyEvent.VK_G || ev.getKeyCode() == KeyEvent.VK_H || ev.getKeyCode() == KeyEvent.VK_J || ev.getKeyCode() == KeyEvent.VK_K || ev.getKeyCode() == KeyEvent.VK_L || ev.getKeyCode() == KeyEvent.VK_M || ev.getKeyCode() == KeyEvent.VK_W
                || ev.getKeyCode() == KeyEvent.VK_X || ev.getKeyCode() == KeyEvent.VK_C || ev.getKeyCode() == KeyEvent.VK_V || ev.getKeyCode() == KeyEvent.VK_B || ev.getKeyCode() == KeyEvent.VK_N ){
            JOptionPane.showMessageDialog(null, "le nom ne contient pas des lettres merci","Error",JOptionPane.ERROR_MESSAGE);
            ajouterpatientView.getRBC().setText("");
                }
            }
                    
		});
     ajouterpatientView.getHGB().addKeyListener(new KeyAdapter() {
			public void keyReleased (KeyEvent ev) {
	if(ev.getKeyCode() == KeyEvent.VK_A || ev.getKeyCode() == KeyEvent.VK_Z || ev.getKeyCode() == KeyEvent.VK_E || ev.getKeyCode() == KeyEvent.VK_R || ev.getKeyCode() == KeyEvent.VK_T || ev.getKeyCode() == KeyEvent.VK_Y || ev.getKeyCode() == KeyEvent.VK_U || ev.getKeyCode() == KeyEvent.VK_I || ev.getKeyCode() == KeyEvent.VK_O || ev.getKeyCode() == KeyEvent.VK_P 
                || ev.getKeyCode() == KeyEvent.VK_Q || ev.getKeyCode() == KeyEvent.VK_S || ev.getKeyCode() == KeyEvent.VK_D || ev.getKeyCode() == KeyEvent.VK_F || ev.getKeyCode() == KeyEvent.VK_G || ev.getKeyCode() == KeyEvent.VK_H || ev.getKeyCode() == KeyEvent.VK_J || ev.getKeyCode() == KeyEvent.VK_K || ev.getKeyCode() == KeyEvent.VK_L || ev.getKeyCode() == KeyEvent.VK_M || ev.getKeyCode() == KeyEvent.VK_W
                || ev.getKeyCode() == KeyEvent.VK_X || ev.getKeyCode() == KeyEvent.VK_C || ev.getKeyCode() == KeyEvent.VK_V || ev.getKeyCode() == KeyEvent.VK_B || ev.getKeyCode() == KeyEvent.VK_N ){
            JOptionPane.showMessageDialog(null, "le nom ne contient pas des lettres merci","Error",JOptionPane.ERROR_MESSAGE);
            ajouterpatientView.getHGB().setText("");
                }
            }
                    
		});
     ajouterpatientView.getPLAT().addKeyListener(new KeyAdapter() {
			public void keyReleased (KeyEvent ev) {
	if(ev.getKeyCode() == KeyEvent.VK_A || ev.getKeyCode() == KeyEvent.VK_Z || ev.getKeyCode() == KeyEvent.VK_E || ev.getKeyCode() == KeyEvent.VK_R || ev.getKeyCode() == KeyEvent.VK_T || ev.getKeyCode() == KeyEvent.VK_Y || ev.getKeyCode() == KeyEvent.VK_U || ev.getKeyCode() == KeyEvent.VK_I || ev.getKeyCode() == KeyEvent.VK_O || ev.getKeyCode() == KeyEvent.VK_P 
                || ev.getKeyCode() == KeyEvent.VK_Q || ev.getKeyCode() == KeyEvent.VK_S || ev.getKeyCode() == KeyEvent.VK_D || ev.getKeyCode() == KeyEvent.VK_F || ev.getKeyCode() == KeyEvent.VK_G || ev.getKeyCode() == KeyEvent.VK_H || ev.getKeyCode() == KeyEvent.VK_J || ev.getKeyCode() == KeyEvent.VK_K || ev.getKeyCode() == KeyEvent.VK_L || ev.getKeyCode() == KeyEvent.VK_M || ev.getKeyCode() == KeyEvent.VK_W
                || ev.getKeyCode() == KeyEvent.VK_X || ev.getKeyCode() == KeyEvent.VK_C || ev.getKeyCode() == KeyEvent.VK_V || ev.getKeyCode() == KeyEvent.VK_B || ev.getKeyCode() == KeyEvent.VK_N ){
            JOptionPane.showMessageDialog(null, "le nom ne contient pas des lettres merci","Error",JOptionPane.ERROR_MESSAGE);
            ajouterpatientView.getPLAT().setText("");
                }
            }
                    
		});
     ajouterpatientView.getAST1().addKeyListener(new KeyAdapter() {
			public void keyReleased (KeyEvent ev) {
	if(ev.getKeyCode() == KeyEvent.VK_A || ev.getKeyCode() == KeyEvent.VK_Z || ev.getKeyCode() == KeyEvent.VK_E || ev.getKeyCode() == KeyEvent.VK_R || ev.getKeyCode() == KeyEvent.VK_T || ev.getKeyCode() == KeyEvent.VK_Y || ev.getKeyCode() == KeyEvent.VK_U || ev.getKeyCode() == KeyEvent.VK_I || ev.getKeyCode() == KeyEvent.VK_O || ev.getKeyCode() == KeyEvent.VK_P 
                || ev.getKeyCode() == KeyEvent.VK_Q || ev.getKeyCode() == KeyEvent.VK_S || ev.getKeyCode() == KeyEvent.VK_D || ev.getKeyCode() == KeyEvent.VK_F || ev.getKeyCode() == KeyEvent.VK_G || ev.getKeyCode() == KeyEvent.VK_H || ev.getKeyCode() == KeyEvent.VK_J || ev.getKeyCode() == KeyEvent.VK_K || ev.getKeyCode() == KeyEvent.VK_L || ev.getKeyCode() == KeyEvent.VK_M || ev.getKeyCode() == KeyEvent.VK_W
                || ev.getKeyCode() == KeyEvent.VK_X || ev.getKeyCode() == KeyEvent.VK_C || ev.getKeyCode() == KeyEvent.VK_V || ev.getKeyCode() == KeyEvent.VK_B || ev.getKeyCode() == KeyEvent.VK_N ){
            JOptionPane.showMessageDialog(null, "le nom ne contient pas des lettres merci","Error",JOptionPane.ERROR_MESSAGE);
            ajouterpatientView.getAST1().setText("");
                }
            }
                    
		});
    ajouterpatientView.getALT1().addKeyListener(new KeyAdapter() {
			public void keyReleased (KeyEvent ev) {
	if(ev.getKeyCode() == KeyEvent.VK_A || ev.getKeyCode() == KeyEvent.VK_Z || ev.getKeyCode() == KeyEvent.VK_E || ev.getKeyCode() == KeyEvent.VK_R || ev.getKeyCode() == KeyEvent.VK_T || ev.getKeyCode() == KeyEvent.VK_Y || ev.getKeyCode() == KeyEvent.VK_U || ev.getKeyCode() == KeyEvent.VK_I || ev.getKeyCode() == KeyEvent.VK_O || ev.getKeyCode() == KeyEvent.VK_P 
                || ev.getKeyCode() == KeyEvent.VK_Q || ev.getKeyCode() == KeyEvent.VK_S || ev.getKeyCode() == KeyEvent.VK_D || ev.getKeyCode() == KeyEvent.VK_F || ev.getKeyCode() == KeyEvent.VK_G || ev.getKeyCode() == KeyEvent.VK_H || ev.getKeyCode() == KeyEvent.VK_J || ev.getKeyCode() == KeyEvent.VK_K || ev.getKeyCode() == KeyEvent.VK_L || ev.getKeyCode() == KeyEvent.VK_M || ev.getKeyCode() == KeyEvent.VK_W
                || ev.getKeyCode() == KeyEvent.VK_X || ev.getKeyCode() == KeyEvent.VK_C || ev.getKeyCode() == KeyEvent.VK_V || ev.getKeyCode() == KeyEvent.VK_B || ev.getKeyCode() == KeyEvent.VK_N ){
            JOptionPane.showMessageDialog(null, "le nom ne contient pas des lettres merci","Error",JOptionPane.ERROR_MESSAGE);
            ajouterpatientView.getALT1().setText("");
                }
            }
                    
		});
    ajouterpatientView.getALT4().addKeyListener(new KeyAdapter() {
			public void keyReleased (KeyEvent ev) {
	if(ev.getKeyCode() == KeyEvent.VK_A || ev.getKeyCode() == KeyEvent.VK_Z || ev.getKeyCode() == KeyEvent.VK_E || ev.getKeyCode() == KeyEvent.VK_R || ev.getKeyCode() == KeyEvent.VK_T || ev.getKeyCode() == KeyEvent.VK_Y || ev.getKeyCode() == KeyEvent.VK_U || ev.getKeyCode() == KeyEvent.VK_I || ev.getKeyCode() == KeyEvent.VK_O || ev.getKeyCode() == KeyEvent.VK_P 
                || ev.getKeyCode() == KeyEvent.VK_Q || ev.getKeyCode() == KeyEvent.VK_S || ev.getKeyCode() == KeyEvent.VK_D || ev.getKeyCode() == KeyEvent.VK_F || ev.getKeyCode() == KeyEvent.VK_G || ev.getKeyCode() == KeyEvent.VK_H || ev.getKeyCode() == KeyEvent.VK_J || ev.getKeyCode() == KeyEvent.VK_K || ev.getKeyCode() == KeyEvent.VK_L || ev.getKeyCode() == KeyEvent.VK_M || ev.getKeyCode() == KeyEvent.VK_W
                || ev.getKeyCode() == KeyEvent.VK_X || ev.getKeyCode() == KeyEvent.VK_C || ev.getKeyCode() == KeyEvent.VK_V || ev.getKeyCode() == KeyEvent.VK_B || ev.getKeyCode() == KeyEvent.VK_N ){
            JOptionPane.showMessageDialog(null, "le nom ne contient pas des lettres merci","Error",JOptionPane.ERROR_MESSAGE);
            ajouterpatientView.getALT4().setText("");
                }
            }
                    
		});
    ajouterpatientView.getALT12().addKeyListener(new KeyAdapter() {
			public void keyReleased (KeyEvent ev) {
	if(ev.getKeyCode() == KeyEvent.VK_A || ev.getKeyCode() == KeyEvent.VK_Z || ev.getKeyCode() == KeyEvent.VK_E || ev.getKeyCode() == KeyEvent.VK_R || ev.getKeyCode() == KeyEvent.VK_T || ev.getKeyCode() == KeyEvent.VK_Y || ev.getKeyCode() == KeyEvent.VK_U || ev.getKeyCode() == KeyEvent.VK_I || ev.getKeyCode() == KeyEvent.VK_O || ev.getKeyCode() == KeyEvent.VK_P 
                || ev.getKeyCode() == KeyEvent.VK_Q || ev.getKeyCode() == KeyEvent.VK_S || ev.getKeyCode() == KeyEvent.VK_D || ev.getKeyCode() == KeyEvent.VK_F || ev.getKeyCode() == KeyEvent.VK_G || ev.getKeyCode() == KeyEvent.VK_H || ev.getKeyCode() == KeyEvent.VK_J || ev.getKeyCode() == KeyEvent.VK_K || ev.getKeyCode() == KeyEvent.VK_L || ev.getKeyCode() == KeyEvent.VK_M || ev.getKeyCode() == KeyEvent.VK_W
                || ev.getKeyCode() == KeyEvent.VK_X || ev.getKeyCode() == KeyEvent.VK_C || ev.getKeyCode() == KeyEvent.VK_V || ev.getKeyCode() == KeyEvent.VK_B || ev.getKeyCode() == KeyEvent.VK_N ){
            JOptionPane.showMessageDialog(null, "le nom ne contient pas des lettres merci","Error",JOptionPane.ERROR_MESSAGE);
            ajouterpatientView.getALT12().setText("");
                }
            }
                    
		});
    ajouterpatientView.getALT24().addKeyListener(new KeyAdapter() {
			public void keyReleased (KeyEvent ev) {
	if(ev.getKeyCode() == KeyEvent.VK_A || ev.getKeyCode() == KeyEvent.VK_Z || ev.getKeyCode() == KeyEvent.VK_E || ev.getKeyCode() == KeyEvent.VK_R || ev.getKeyCode() == KeyEvent.VK_T || ev.getKeyCode() == KeyEvent.VK_Y || ev.getKeyCode() == KeyEvent.VK_U || ev.getKeyCode() == KeyEvent.VK_I || ev.getKeyCode() == KeyEvent.VK_O || ev.getKeyCode() == KeyEvent.VK_P 
                || ev.getKeyCode() == KeyEvent.VK_Q || ev.getKeyCode() == KeyEvent.VK_S || ev.getKeyCode() == KeyEvent.VK_D || ev.getKeyCode() == KeyEvent.VK_F || ev.getKeyCode() == KeyEvent.VK_G || ev.getKeyCode() == KeyEvent.VK_H || ev.getKeyCode() == KeyEvent.VK_J || ev.getKeyCode() == KeyEvent.VK_K || ev.getKeyCode() == KeyEvent.VK_L || ev.getKeyCode() == KeyEvent.VK_M || ev.getKeyCode() == KeyEvent.VK_W
                || ev.getKeyCode() == KeyEvent.VK_X || ev.getKeyCode() == KeyEvent.VK_C || ev.getKeyCode() == KeyEvent.VK_V || ev.getKeyCode() == KeyEvent.VK_B || ev.getKeyCode() == KeyEvent.VK_N ){
            JOptionPane.showMessageDialog(null, "le nom ne contient pas des lettres merci","Error",JOptionPane.ERROR_MESSAGE);
            ajouterpatientView.getALT24().setText("");
                }
            }
                    
		});
    ajouterpatientView.getALT36().addKeyListener(new KeyAdapter() {
			public void keyReleased (KeyEvent ev) {
	if(ev.getKeyCode() == KeyEvent.VK_A || ev.getKeyCode() == KeyEvent.VK_Z || ev.getKeyCode() == KeyEvent.VK_E || ev.getKeyCode() == KeyEvent.VK_R || ev.getKeyCode() == KeyEvent.VK_T || ev.getKeyCode() == KeyEvent.VK_Y || ev.getKeyCode() == KeyEvent.VK_U || ev.getKeyCode() == KeyEvent.VK_I || ev.getKeyCode() == KeyEvent.VK_O || ev.getKeyCode() == KeyEvent.VK_P 
                || ev.getKeyCode() == KeyEvent.VK_Q || ev.getKeyCode() == KeyEvent.VK_S || ev.getKeyCode() == KeyEvent.VK_D || ev.getKeyCode() == KeyEvent.VK_F || ev.getKeyCode() == KeyEvent.VK_G || ev.getKeyCode() == KeyEvent.VK_H || ev.getKeyCode() == KeyEvent.VK_J || ev.getKeyCode() == KeyEvent.VK_K || ev.getKeyCode() == KeyEvent.VK_L || ev.getKeyCode() == KeyEvent.VK_M || ev.getKeyCode() == KeyEvent.VK_W
                || ev.getKeyCode() == KeyEvent.VK_X || ev.getKeyCode() == KeyEvent.VK_C || ev.getKeyCode() == KeyEvent.VK_V || ev.getKeyCode() == KeyEvent.VK_B || ev.getKeyCode() == KeyEvent.VK_N ){
            JOptionPane.showMessageDialog(null, "le nom ne contient pas des lettres merci","Error",JOptionPane.ERROR_MESSAGE);
            ajouterpatientView.getALT36().setText("");
                }
            }
                    
		});
    ajouterpatientView.getALT48().addKeyListener(new KeyAdapter() {
			public void keyReleased (KeyEvent ev) {
	if(ev.getKeyCode() == KeyEvent.VK_A || ev.getKeyCode() == KeyEvent.VK_Z || ev.getKeyCode() == KeyEvent.VK_E || ev.getKeyCode() == KeyEvent.VK_R || ev.getKeyCode() == KeyEvent.VK_T || ev.getKeyCode() == KeyEvent.VK_Y || ev.getKeyCode() == KeyEvent.VK_U || ev.getKeyCode() == KeyEvent.VK_I || ev.getKeyCode() == KeyEvent.VK_O || ev.getKeyCode() == KeyEvent.VK_P 
                || ev.getKeyCode() == KeyEvent.VK_Q || ev.getKeyCode() == KeyEvent.VK_S || ev.getKeyCode() == KeyEvent.VK_D || ev.getKeyCode() == KeyEvent.VK_F || ev.getKeyCode() == KeyEvent.VK_G || ev.getKeyCode() == KeyEvent.VK_H || ev.getKeyCode() == KeyEvent.VK_J || ev.getKeyCode() == KeyEvent.VK_K || ev.getKeyCode() == KeyEvent.VK_L || ev.getKeyCode() == KeyEvent.VK_M || ev.getKeyCode() == KeyEvent.VK_W
                || ev.getKeyCode() == KeyEvent.VK_X || ev.getKeyCode() == KeyEvent.VK_C || ev.getKeyCode() == KeyEvent.VK_V || ev.getKeyCode() == KeyEvent.VK_B || ev.getKeyCode() == KeyEvent.VK_N ){
            JOptionPane.showMessageDialog(null, "le nom ne contient pas des lettres merci","Error",JOptionPane.ERROR_MESSAGE);
            ajouterpatientView.getALT48().setText("");
                }
            }
                    
		});
    ajouterpatientView.getALT24W().addKeyListener(new KeyAdapter() {
			public void keyReleased (KeyEvent ev) {
	if(ev.getKeyCode() == KeyEvent.VK_A || ev.getKeyCode() == KeyEvent.VK_Z || ev.getKeyCode() == KeyEvent.VK_E || ev.getKeyCode() == KeyEvent.VK_R || ev.getKeyCode() == KeyEvent.VK_T || ev.getKeyCode() == KeyEvent.VK_Y || ev.getKeyCode() == KeyEvent.VK_U || ev.getKeyCode() == KeyEvent.VK_I || ev.getKeyCode() == KeyEvent.VK_O || ev.getKeyCode() == KeyEvent.VK_P 
                || ev.getKeyCode() == KeyEvent.VK_Q || ev.getKeyCode() == KeyEvent.VK_S || ev.getKeyCode() == KeyEvent.VK_D || ev.getKeyCode() == KeyEvent.VK_F || ev.getKeyCode() == KeyEvent.VK_G || ev.getKeyCode() == KeyEvent.VK_H || ev.getKeyCode() == KeyEvent.VK_J || ev.getKeyCode() == KeyEvent.VK_K || ev.getKeyCode() == KeyEvent.VK_L || ev.getKeyCode() == KeyEvent.VK_M || ev.getKeyCode() == KeyEvent.VK_W
                || ev.getKeyCode() == KeyEvent.VK_X || ev.getKeyCode() == KeyEvent.VK_C || ev.getKeyCode() == KeyEvent.VK_V || ev.getKeyCode() == KeyEvent.VK_B || ev.getKeyCode() == KeyEvent.VK_N ){
            JOptionPane.showMessageDialog(null, "le nom ne contient pas des lettres merci","Error",JOptionPane.ERROR_MESSAGE);
            ajouterpatientView.getALT24W().setText("");
                }
            }
                    
		});
    ajouterpatientView.getRNABASE().addKeyListener(new KeyAdapter() {
			public void keyReleased (KeyEvent ev) {
	if(ev.getKeyCode() == KeyEvent.VK_A || ev.getKeyCode() == KeyEvent.VK_Z || ev.getKeyCode() == KeyEvent.VK_E || ev.getKeyCode() == KeyEvent.VK_R || ev.getKeyCode() == KeyEvent.VK_T || ev.getKeyCode() == KeyEvent.VK_Y || ev.getKeyCode() == KeyEvent.VK_U || ev.getKeyCode() == KeyEvent.VK_I || ev.getKeyCode() == KeyEvent.VK_O || ev.getKeyCode() == KeyEvent.VK_P 
                || ev.getKeyCode() == KeyEvent.VK_Q || ev.getKeyCode() == KeyEvent.VK_S || ev.getKeyCode() == KeyEvent.VK_D || ev.getKeyCode() == KeyEvent.VK_F || ev.getKeyCode() == KeyEvent.VK_G || ev.getKeyCode() == KeyEvent.VK_H || ev.getKeyCode() == KeyEvent.VK_J || ev.getKeyCode() == KeyEvent.VK_K || ev.getKeyCode() == KeyEvent.VK_L || ev.getKeyCode() == KeyEvent.VK_M || ev.getKeyCode() == KeyEvent.VK_W
                || ev.getKeyCode() == KeyEvent.VK_X || ev.getKeyCode() == KeyEvent.VK_C || ev.getKeyCode() == KeyEvent.VK_V || ev.getKeyCode() == KeyEvent.VK_B || ev.getKeyCode() == KeyEvent.VK_N ){
            JOptionPane.showMessageDialog(null, "le nom ne contient pas des lettres merci","Error",JOptionPane.ERROR_MESSAGE);
            ajouterpatientView.getRNABASE().setText("");
                }
            }
                    
		});
    ajouterpatientView.getRNA4().addKeyListener(new KeyAdapter() {
			public void keyReleased (KeyEvent ev) {
	if(ev.getKeyCode() == KeyEvent.VK_A || ev.getKeyCode() == KeyEvent.VK_Z || ev.getKeyCode() == KeyEvent.VK_E || ev.getKeyCode() == KeyEvent.VK_R || ev.getKeyCode() == KeyEvent.VK_T || ev.getKeyCode() == KeyEvent.VK_Y || ev.getKeyCode() == KeyEvent.VK_U || ev.getKeyCode() == KeyEvent.VK_I || ev.getKeyCode() == KeyEvent.VK_O || ev.getKeyCode() == KeyEvent.VK_P 
                || ev.getKeyCode() == KeyEvent.VK_Q || ev.getKeyCode() == KeyEvent.VK_S || ev.getKeyCode() == KeyEvent.VK_D || ev.getKeyCode() == KeyEvent.VK_F || ev.getKeyCode() == KeyEvent.VK_G || ev.getKeyCode() == KeyEvent.VK_H || ev.getKeyCode() == KeyEvent.VK_J || ev.getKeyCode() == KeyEvent.VK_K || ev.getKeyCode() == KeyEvent.VK_L || ev.getKeyCode() == KeyEvent.VK_M || ev.getKeyCode() == KeyEvent.VK_W
                || ev.getKeyCode() == KeyEvent.VK_X || ev.getKeyCode() == KeyEvent.VK_C || ev.getKeyCode() == KeyEvent.VK_V || ev.getKeyCode() == KeyEvent.VK_B || ev.getKeyCode() == KeyEvent.VK_N ){
            JOptionPane.showMessageDialog(null, "le nom ne contient pas des lettres merci","Error",JOptionPane.ERROR_MESSAGE);
            ajouterpatientView.getRNA4().setText("");
                }
            }
                    
		});
    ajouterpatientView.getRNA12().addKeyListener(new KeyAdapter() {
			public void keyReleased (KeyEvent ev) {
	if(ev.getKeyCode() == KeyEvent.VK_A || ev.getKeyCode() == KeyEvent.VK_Z || ev.getKeyCode() == KeyEvent.VK_E || ev.getKeyCode() == KeyEvent.VK_R || ev.getKeyCode() == KeyEvent.VK_T || ev.getKeyCode() == KeyEvent.VK_Y || ev.getKeyCode() == KeyEvent.VK_U || ev.getKeyCode() == KeyEvent.VK_I || ev.getKeyCode() == KeyEvent.VK_O || ev.getKeyCode() == KeyEvent.VK_P 
                || ev.getKeyCode() == KeyEvent.VK_Q || ev.getKeyCode() == KeyEvent.VK_S || ev.getKeyCode() == KeyEvent.VK_D || ev.getKeyCode() == KeyEvent.VK_F || ev.getKeyCode() == KeyEvent.VK_G || ev.getKeyCode() == KeyEvent.VK_H || ev.getKeyCode() == KeyEvent.VK_J || ev.getKeyCode() == KeyEvent.VK_K || ev.getKeyCode() == KeyEvent.VK_L || ev.getKeyCode() == KeyEvent.VK_M || ev.getKeyCode() == KeyEvent.VK_W
                || ev.getKeyCode() == KeyEvent.VK_X || ev.getKeyCode() == KeyEvent.VK_C || ev.getKeyCode() == KeyEvent.VK_V || ev.getKeyCode() == KeyEvent.VK_B || ev.getKeyCode() == KeyEvent.VK_N ){
            JOptionPane.showMessageDialog(null, "le nom ne contient pas des lettres merci","Error",JOptionPane.ERROR_MESSAGE);
            ajouterpatientView.getRNA12().setText("");
                }
            }
                    
		});
    ajouterpatientView.getRNAEF().addKeyListener(new KeyAdapter() {
			public void keyReleased (KeyEvent ev) {
	if(ev.getKeyCode() == KeyEvent.VK_A || ev.getKeyCode() == KeyEvent.VK_Z || ev.getKeyCode() == KeyEvent.VK_E || ev.getKeyCode() == KeyEvent.VK_R || ev.getKeyCode() == KeyEvent.VK_T || ev.getKeyCode() == KeyEvent.VK_Y || ev.getKeyCode() == KeyEvent.VK_U || ev.getKeyCode() == KeyEvent.VK_I || ev.getKeyCode() == KeyEvent.VK_O || ev.getKeyCode() == KeyEvent.VK_P 
                || ev.getKeyCode() == KeyEvent.VK_Q || ev.getKeyCode() == KeyEvent.VK_S || ev.getKeyCode() == KeyEvent.VK_D || ev.getKeyCode() == KeyEvent.VK_F || ev.getKeyCode() == KeyEvent.VK_G || ev.getKeyCode() == KeyEvent.VK_H || ev.getKeyCode() == KeyEvent.VK_J || ev.getKeyCode() == KeyEvent.VK_K || ev.getKeyCode() == KeyEvent.VK_L || ev.getKeyCode() == KeyEvent.VK_M || ev.getKeyCode() == KeyEvent.VK_W
                || ev.getKeyCode() == KeyEvent.VK_X || ev.getKeyCode() == KeyEvent.VK_C || ev.getKeyCode() == KeyEvent.VK_V || ev.getKeyCode() == KeyEvent.VK_B || ev.getKeyCode() == KeyEvent.VK_N ){
            JOptionPane.showMessageDialog(null, "le nom ne contient pas des lettres merci","Error",JOptionPane.ERROR_MESSAGE);
            ajouterpatientView.getRNAEF().setText("");
                }
            }
                    
		});
    ajouterpatientView.getRNAEOT().addKeyListener(new KeyAdapter() {
			public void keyReleased (KeyEvent ev) {
	if(ev.getKeyCode() == KeyEvent.VK_A || ev.getKeyCode() == KeyEvent.VK_Z || ev.getKeyCode() == KeyEvent.VK_E || ev.getKeyCode() == KeyEvent.VK_R || ev.getKeyCode() == KeyEvent.VK_T || ev.getKeyCode() == KeyEvent.VK_Y || ev.getKeyCode() == KeyEvent.VK_U || ev.getKeyCode() == KeyEvent.VK_I || ev.getKeyCode() == KeyEvent.VK_O || ev.getKeyCode() == KeyEvent.VK_P 
                || ev.getKeyCode() == KeyEvent.VK_Q || ev.getKeyCode() == KeyEvent.VK_S || ev.getKeyCode() == KeyEvent.VK_D || ev.getKeyCode() == KeyEvent.VK_F || ev.getKeyCode() == KeyEvent.VK_G || ev.getKeyCode() == KeyEvent.VK_H || ev.getKeyCode() == KeyEvent.VK_J || ev.getKeyCode() == KeyEvent.VK_K || ev.getKeyCode() == KeyEvent.VK_L || ev.getKeyCode() == KeyEvent.VK_M || ev.getKeyCode() == KeyEvent.VK_W
                || ev.getKeyCode() == KeyEvent.VK_X || ev.getKeyCode() == KeyEvent.VK_C || ev.getKeyCode() == KeyEvent.VK_V || ev.getKeyCode() == KeyEvent.VK_B || ev.getKeyCode() == KeyEvent.VK_N ){
            JOptionPane.showMessageDialog(null, "le nom ne contient pas des lettres merci","Error",JOptionPane.ERROR_MESSAGE);
            ajouterpatientView.getRNAEOT().setText("");
                }
            }
                    
		});
       
		
	}
    
    
    
}
