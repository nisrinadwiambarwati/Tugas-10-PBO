/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.*;
 
public class BelajarSwing {

    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Contoh program Swing");
        JLabel myLabel = new JLabel("Selamat Datang di SWING!");
        myFrame.add(myLabel);
        
        myFrame.setSize(400,250);
     
        myFrame.setVisible(true); 
      
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
    }
          
}

   
