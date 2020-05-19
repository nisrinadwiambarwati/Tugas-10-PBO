/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;

/**
 *
 * @author ASUS
 */
import java.awt.*;

public class AWT1 {
public static void main(String[] args) {
                Frame myFrame = new Frame("Contoh program AWT");
                Label myLabel = new Label("Selamat belajar JAVA AWT");
                myFrame.add(myLabel);
                myFrame.setSize(300,250);
                myFrame.show();
                }
}

