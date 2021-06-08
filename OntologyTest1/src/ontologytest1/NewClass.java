/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontologytest1;
import java.io.*;
import java.sql.*;

/**
 *
 * @author Winsido
 */
public class NewClass {
    public static void main (String [] args ) throws SQLException {
        //from CSV TO DB
    String jdbcURL = "jdbc:mysql://localhost:3306/onto";
        String username = "root";
        String password = "root";
        String csvFilePath = "C:\\Users\\Winsido\\Desktop\\mm\\HCV-Egy-Data.csv";
 
        int batchSize = 20;
        Connection connection = null;
        
         try{
 
            connection = DriverManager.getConnection(jdbcURL, username, password);
            connection.setAutoCommit(false);
 
            String sql = "INSERT INTO onto(AGE, Gender, BMI, FEVER, NAUSEE, HEADACHE, DIAHREE, FATIGUE, JAUNDICE, EPIGASTRICPAIN, WBC, RBC, HGB, PLAT, AST1, ALT1, ALT4,ALT12, ALT24, ALT36, ALT48, ALTAFTER24W, RNABASE, RNA4, RNA12, RNAEOT, RNAEF, BHG, BH) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
 
            BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath));
            String lineText = null;
 
            int count = 0;
 
            lineReader.readLine(); // skip header line
 
            while ((lineText = lineReader.readLine()) != null) {
                
                String[] data = lineText.split(",");
                int age = Integer.parseInt(data[0]);
                int gender = Integer.parseInt(data[1]);
                float bmi = Float.parseFloat(data[2]);
                int fever = Integer.parseInt(data[3]);
                int nause = Integer.parseInt(data[4]);
                int headache = Integer.parseInt(data[5]);
                int diahree = Integer.parseInt(data[6]);
                int fatigue = Integer.parseInt(data[7]);
                System.err.println("1");
               //int boneache = Integer.parseInt(data[8]);
                int jaundiche = Integer.parseInt(data[8]);
                int epigasriapain = Integer.parseInt(data[9]);
                double WBC = Double.parseDouble(data[10]);
                double RBC = Double.parseDouble(data[11]);
                double HGB = Double.parseDouble(data[12]);
                double PLAT = Double.parseDouble(data[13]);
                double AST1 = Double.parseDouble(data[14]);
                double ALT1 = Double.parseDouble(data[15]);
                double ALT4 = Double.parseDouble(data[16]);
                double ALT12 = Double.parseDouble(data[17]);
                double ALT24 = Double.parseDouble(data[18]);
                double ALT36 = Double.parseDouble(data[19]);
                double ALT48 = Double.parseDouble(data[20]);
                double ALTafter24w = Double.parseDouble(data[21]);
                double RNABASE = Double.parseDouble(data[22]);
                double RNA4 = Double.parseDouble(data[23]);
                double RNA12 = Double.parseDouble(data[24]);
                double RNAEOT = Double.parseDouble(data[25]);
                double RNAEF = Double.parseDouble(data[26]);
                int BHG = Integer.parseInt(data[27]);
                int BH = Integer.parseInt(data[28]);
                System.err.println("2");
                
                statement.setInt(1, age);
                statement.setInt(2, gender);
                statement.setFloat(3, bmi);
                statement.setInt(4, fever);
                statement.setInt(5, nause);
                statement.setInt(6, headache);
                statement.setInt(7, diahree);
                statement.setInt(8, fatigue);
                //statement.setInt(9, boneache);
                statement.setInt(9, jaundiche);
                statement.setInt(10, epigasriapain);
                statement.setDouble(11, WBC);
                statement.setDouble(12, RBC);
                statement.setDouble(13, HGB);
                statement.setDouble(14, PLAT);
                statement.setDouble(15, AST1);
                statement.setDouble(16, ALT1);
                statement.setDouble(17, ALT4);
                statement.setDouble(18, ALT12);
                statement.setDouble(19, ALT24);
                statement.setDouble(20, ALT36);
                statement.setDouble(21, ALT48);
                statement.setDouble(22, ALTafter24w);
                statement.setDouble(23, RNABASE);
                statement.setDouble(24, RNA4);
                statement.setDouble(25, RNA12);
                statement.setDouble(26, RNAEOT);
                statement.setDouble(27, RNAEF);
                statement.setInt(28, BHG);
                statement.setInt(29, BH);
              
                
 
                
 
                statement.addBatch();
                        
                if (count % batchSize == 0) {
                    statement.executeBatch();
                }
            }
 
            lineReader.close();
 
            // execute the remaining queries
            statement.executeBatch();
 
            connection.commit();
            connection.close();
             System.err.println("WORK");
 
        }catch (IOException ex) {
            System.err.println(ex);
        }
    }
    
}
