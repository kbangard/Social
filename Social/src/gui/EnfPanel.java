package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class EnfPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private static final int START_X = 20;
	private static final int START_Y = 100;
	
	private JButton jb1= new JButton();
	private JButton jb2= new JButton();
	private JButton jb3= new JButton();
	private JButton jb4= new JButton();
	private JButton jb5= new JButton();
	private JButton jb6= new JButton();

	
	private InformationsPannel jp= new InformationsPannel();
	public EnfPanel() {
	initLayout();
	initActions();
		
		
	}
	
	public void initLayout() {
		//Button 1
				setLayout(null);
				jb1.setIcon(new ImageIcon("src/img_projet/reading_90.png"));
				jb1.setBounds(START_X+40,START_Y,90,90);
				jb1.setBorderPainted(false);
				jb1.setFocusPainted(false);
				jb1.setContentAreaFilled(false);
				add(jb1);
				
				//Button 2
				jb2.setIcon(new ImageIcon("src/img_projet/user-2_75.png"));
				jb2.setBounds(START_X-10,START_Y-50,75,75);
				jb2.setBorderPainted(false);
				jb2.setFocusPainted(false);
				jb2.setContentAreaFilled(false);
				add(jb2);
				
				//Button 3
				jb3.setIcon(new ImageIcon("src/img_projet/user-15_75.png"));
				jb3.setBounds(START_X-10,START_Y+70,75,75);
				jb3.setBorderPainted(false);
				jb3.setFocusPainted(false);
				jb3.setContentAreaFilled(false);
				add(jb3);
				
				//Button 4
				jb4.setIcon(new ImageIcon("src/img_projet/student_70.png"));
				jb4.setBounds(START_X+100,START_Y-40,70,70);
				jb4.setBorderPainted(false);
				jb4.setFocusPainted(false);
				jb4.setContentAreaFilled(false);
				add(jb4);
				
				//Button 5
				jb5.setIcon(new ImageIcon("src/img_projet/user-8_70.png"));
				jb5.setBounds(START_X+250,START_Y-15,70,70);
				jb5.setBorderPainted(false);
				jb5.setFocusPainted(false);
				jb5.setContentAreaFilled(false);
				add(jb5);
				
				//Button 6
				jb6.setIcon(new ImageIcon("src/img_projet/user-9_70.png"));
				jb6.setBounds(START_X+330,START_Y+30,70,70);
				jb6.setBorderPainted(false);
				jb6.setFocusPainted(false);
				jb6.setContentAreaFilled(false);
				add(jb6);
				
				

				
				
				validate();

		
	}
	
	public void initActions() {
		jb1.addActionListener(new AddAction());
		jb2.addActionListener(new AddAction());
		jb3.addActionListener(new AddAction());
		jb4.addActionListener(new AddAction());
		jb5.addActionListener(new AddAction());
		jb6.addActionListener(new AddAction());

		
	}
	
	private class AddAction implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JFrame f= new JFrame();
			f.setTitle("INFORMATIONS");
			f.setSize(400,200);
			f.setLocationRelativeTo(null);
			f.setResizable(false);
			f.setVisible(true);
			f.add(jp);
			
		}
	}	
	
	
		public void paintComponent(Graphics g) {
			  super.paintComponent(g);
				setBackground(Color.WHITE);

		  }

}


