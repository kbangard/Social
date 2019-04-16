package gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class InformationsPannel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	//Informations
	private JLabel avatarNom= new JLabel("Nom :");
	private JLabel avatarPrenom= new JLabel("Prenom: ");
	private JLabel avatarSexe= new JLabel("Sexe: ");
	private JLabel avatarHumeur= new JLabel("Humeur actuelle: ");
	
	//Humeur 
	private JLabel o= new JLabel("O: ");
	private JLabel c= new JLabel("C:");
	private JLabel e= new JLabel("E: ");
	private JLabel a= new JLabel("A:");
	private JLabel n= new JLabel("N:");

	
	private JTextField nom= new JTextField (20);
	private JTextField prenom= new JTextField(20);
	private JTextField sexe= new JTextField(20);
	private JButton humeur= new JButton();
	
	private JProgressBar bar1= new JProgressBar();
	private JProgressBar bar2= new JProgressBar();
	private JProgressBar bar3= new JProgressBar();
	private JProgressBar bar4= new JProgressBar();
	private JProgressBar bar5= new JProgressBar();


	
	public InformationsPannel() {
		initLayout();
		
	}
	private void initLayout() {
		GridLayout grid = new GridLayout(9, 2);
		setLayout(grid);
		
		
		//Line 1
		add(avatarNom);
		add(nom);

		//Line 2
		add(avatarPrenom);
		add(prenom);
		
		//Line 3
		add(avatarSexe);
		add(sexe);

		//Line 4
		add(avatarHumeur);
		humeur.setIcon(new ImageIcon("src/img_projet/happy.png"));
		humeur.setBorderPainted(false);
		humeur.setFocusPainted(false);
		humeur.setContentAreaFilled(false);
		add(humeur);
		
		
		//Line 5
		add(o);
		add(bar1);
		bar1.setValue(70);
		bar1.setStringPainted(true);
		bar1.setForeground(Color.DARK_GRAY);
		
		//Line 6
		add(c);
		add(bar2);
		bar2.setValue(50);
		bar2.setStringPainted(true);
		bar2.setForeground(Color.DARK_GRAY);



		
		//Line 7
		add(e);
		add(bar3);
		bar3.setValue(30);
		bar3.setStringPainted(true);
		bar3.setForeground(Color.DARK_GRAY);


		
		//Line 8
		add(a);
		add(bar4);
		bar4.setValue(80);
		bar4.setStringPainted(true);
		bar4.setForeground(Color.DARK_GRAY);


		
		//Line 9
		add(n);
		add(bar5);
		bar5.setValue(25);
		bar5.setStringPainted(true);
		bar5.setForeground(Color.DARK_GRAY);


		
		
	}
	



}
