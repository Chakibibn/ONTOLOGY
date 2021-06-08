/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontologytest1.Runner;

/**
 *
 * @author Winsido
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import ontologytest1.Controller.controlleurajouterpatient;
import ontologytest1.Model.Personne;
import ontologytest1.View.Ajouterpatient;
public class RunAjouterpatient {
    public static void main(String []args) throws AWTException{
        Ajouterpatient v=new Ajouterpatient();
        Personne m = new Personne();
           controlleurajouterpatient c=new controlleurajouterpatient(v,m);
    c.initControlleur();}
}
