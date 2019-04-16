package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FaduPannel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PersonalityPanel3 pp3= new PersonalityPanel3();
	
	private JLabel aNom= new JLabel("Nom:");
	private JLabel aPrenom= new JLabel("Prenom:");
	private JLabel aSexe= new  JLabel ("Sexe: Femme");
	private JLabel aAge= new JLabel ("Tranche d'âge: 20 ans et plus");
	
	private JTextField tNom= new JTextField();
	private JTextField tPrenom= new JTextField();
	
	private JButton ok=new JButton("ok");
		
	
	public FaduPannel() {
		initLayout();
		initActions();
	}
	
	public void initLayout() {
		GridLayout grid= new GridLayout(4,2);
		setLayout(grid);
		
		//Line 1
		add(aNom);
		add(tNom);
		
		//Line 2
		add(aPrenom);
		add(tPrenom);
		
		//Line 3
		add(aSexe);
		
		//Line 4
		add(aAge);
		
		//Line 5
		add(ok);
		
		}
	
	public void initActions() {
		ok.addActionListener(new PersonnalityAction());
		
	}
	
	private class PersonnalityAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JFrame f3= new JFrame();
		f3.setVisible(true);
		f3.setSize(400, 350);
		f3.setLocationRelativeTo(null);
		f3.add(pp3);
		dispose();
		
	}
	public void dispose() {
		setVisible(false);
		
	}
	
	}

}
