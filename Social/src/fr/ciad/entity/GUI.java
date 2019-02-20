package fr.ciad.entity;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;





public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;





	public GUI(String title) {
		super(title);
		setFocusable(true);
		init();
		
	}
	
	public void init() {
		
		new JFrame("Social");
		setResizable(false);
		getContentPane().setBackground(Color.GREEN);
		setSize(1000,635);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JButton button = new JButton("Personnage");
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		button.setBounds(100,515, 200, 50);
		
		JLabel name = new JLabel("Nom:");
		name.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		name.setBounds(75,5, 200, 50);
		
		JButton age = new JButton("Tranche d'age:");
		age.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		age.setBounds(50,270, 200, 50);
		
		JButton sexe = new JButton("sexe:");
		sexe.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		sexe.setBounds(50,325, 200, 50);
		
		JButton Relation = new JButton("Relation:");
		Relation.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		Relation.setBounds(50,380, 200, 50);
		
		JButton metier = new JButton("Métier:");
		metier.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		metier.setBounds(50,435, 200, 50);
		
						
		JPanel operationZone = new JPanel();
		operationZone.setLayout(null);
		operationZone.setBounds(600,5,390,590);
		operationZone.add(button);
		operationZone.add(name);
		operationZone.add(age);
		operationZone.add(sexe);
		operationZone.add(Relation);
		operationZone.add(metier);
		
		getContentPane().add(operationZone);
				
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
		

	
	
	public static void main(String[] args) {
		new GUI("");
	}
}
