package gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AvatarPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private FaduPannel fa= new FaduPannel();
	private HadoPannel had= new HadoPannel();
	private FadoPannel fad= new FadoPannel();
	private HePannel he= new HePannel();
	private FePannel fe= new FePannel();
	
	private JButton a2= new JButton();
	private JButton a3= new JButton();
	private JButton a4= new JButton();
	private JButton a5= new JButton();
	private JButton a6= new JButton();

	
	
	public AvatarPanel() {
		initLayout();
		initActions();
	}
	
	public void initActions() {
		a2.addActionListener(new CreationAction2());
		a3.addActionListener(new CreationAction3());
		a4.addActionListener(new CreationAction4());
		a5.addActionListener(new CreationAction5());
		a6.addActionListener(new CreationAction6());

	}
	
	public void initLayout() {
		GridLayout grid = new GridLayout(2, 3);
		setBackground(Color.GRAY);
		setLayout(grid);
		
		
		a2.setIcon(new ImageIcon("src/img_projet/ado_h.png"));
		a2.setBorderPainted(false);
		a2.setFocusPainted(false);
		a2.setContentAreaFilled(false);
		add(a2);
		
		a3.setIcon(new ImageIcon("src/img_projet/enfant_h.png"));
		a3.setBorderPainted(false);
		a3.setFocusPainted(false);
		a3.setContentAreaFilled(false);
		add(a3);
		
		//Line 2
		a4.setIcon(new ImageIcon("src/img_projet/adulte_f.png"));
		a4.setBorderPainted(false);
		a4.setFocusPainted(false);
		a4.setContentAreaFilled(false);
		add(a4);
		
		a5.setIcon(new ImageIcon("src/img_projet/ado_f.png"));
		a5.setBorderPainted(false);
		a5.setFocusPainted(false);
		a5.setContentAreaFilled(false);
		add(a5);
		
		a6.setIcon(new ImageIcon("src/img_projet/enfant_f.png"));
		a6.setBorderPainted(false);
		a6.setFocusPainted(false);
		a6.setContentAreaFilled(false);
		add(a6);
		
		
	}
	
	private class CreationAction2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JFrame f2= new JFrame();
			f2.setVisible(true);
			f2.setSize(400, 350);
			f2.setLocationRelativeTo(null);
			f2.add(had);
			dispose();
			
			}
		public void dispose() {
			setVisible(false);
		
	}
	
		
}
	
	private class CreationAction3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame f2= new JFrame();
			f2.setVisible(true);
			f2.setSize(400, 350);
			f2.setLocationRelativeTo(null);
			f2.add(he);
			dispose();
			
			}

	public void dispose() {
		setVisible(false);
		
	}
}
 
	private class CreationAction4 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame f2= new JFrame();
			f2.setVisible(true);
			f2.setSize(400, 350);
			f2.setLocationRelativeTo(null);
			f2.add(fa);
			dispose();
			
			}

	public void dispose() {
		setVisible(false);
		
	}
}
	
	private class CreationAction5 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame f2= new JFrame();
			f2.setVisible(true);
			f2.setSize(400, 350);
			f2.setLocationRelativeTo(null);
			f2.add(fad);
			dispose();
			
			}

	public void dispose() {
		setVisible(false);
		
	}
}
	
	private class CreationAction6 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame f2= new JFrame();
			f2.setVisible(true);
			f2.setSize(400, 350);
			f2.setLocationRelativeTo(null);
			f2.add(fe);
			dispose();
			
			}

	public void dispose() {
		setVisible(false);
		
	}
}

}
