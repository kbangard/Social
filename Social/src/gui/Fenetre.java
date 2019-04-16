package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class Fenetre extends JFrame {
  private JButton jb;
  private JPanel jp;
	  public Fenetre(){
	  setTitle("Social");
	  setSize(400, 300);
	  setLocationRelativeTo(null);
	  setResizable(true);
	  setVisible(true);
	  jp= new JPanel();
	  
	  jb= new JButton();
	  jb.setIcon(new ImageIcon("src/img_projet/man2.png"));
	  jb.setPreferredSize(new Dimension(60,60));
	  jp.add(jb);
	  add(jp);
	  
	  validate();
  }
	
	public static void main(String[] args) {
		Fenetre fenetre= new Fenetre();
		
	}
}


	
	

