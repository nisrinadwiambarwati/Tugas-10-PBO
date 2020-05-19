/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventhandling;

/**
 *
 * @author ASUS
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class testes extends JFrame implements ActionListener  {

    private JButton tombol;

	public testes() {
		super ("Event Handling");	

		Container container = getContentPane();
		container.setLayout(new FlowLayout());		

		tombol = new JButton ("Click Me!");
		tombol.addActionListener(this);
		container.add(tombol);		

		setSize (300,200);
		setVisible (true);
	}

    
   public static void main (String arg[]) {
		testes test = new testes();
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed (ActionEvent e) {
		if (e.getSource() == tombol) {
			JOptionPane.showMessageDialog(null, "You click me, guys !!!");
		}
	}

}
