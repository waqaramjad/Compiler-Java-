/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
//import TokenizationMain ;
/**
 *
 * @author hp2
 */
public class Compiler extends TokenizationMain{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Compiler myComp = new Compiler();
       
        System.out.println("hy ");
   try{
                BufferedReader file = new BufferedReader(new FileReader("W:\\5th semester\\compiler project\\Compiler\\src\\compiler\\sampleInput.txt"));
                String line;
//                int noResultFound=0;
                while ((line = file.readLine()) != null) 
                {
                    System.out.println(line);
                    String[] splitStr = line.split("\\s+");
                     myComp.check(splitStr);
//                    System.out.println(splitStr[0]);
//                    System.out.println(splitStr.length);
                    
//                    if (line.contains(name))
//                    {
//                        
//                          JOptionPane.showMessageDialog(null," REPORT CARD \n\n "+line);
//                       noResultFound++; 
//                    }
                }
//                if(noResultFound==0)
//                  JOptionPane.showMessageDialog(null,"Sorry no Result Found");  
                file.close();
        }
        catch(IOException e)
        {}           
    
}

  
}