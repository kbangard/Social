package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class Fenetre extends JFrame implements ActionListener {
  private JButton bouton;
  private JButton bouton2;
  private JPanel panel;
  private JTextField textField;
  private JLabel label;
  private JPanel pan;
  public Fenetre(){
	  this.setTitle("Social");
	  this.setSize(400, 300);
	  this.setLocationRelativeTo(null);
	  this.setResizable(false);
	  this.setVisible(true);
	  this.setContentPane(buildContentPane());
  }
  

	private JPanel buildContentPane(){
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.white);
		
		textField= new JTextField(10);
		panel.add(textField);
		
		bouton=new JButton("Homme");
		panel.add(bouton);
		
		bouton2= new JButton("Femme");
		panel.add(bouton2);
		return panel;
		
	}

	
	public static void main(String[] args) {
		Fenetre fenetre= new Fenetre();
		
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}
}

	

