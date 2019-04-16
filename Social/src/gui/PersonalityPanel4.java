package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;




public class PersonalityPanel4 extends JPanel {
	private static final long serialVersionUID = 1L;
	private static final int START_X = 20;
	private static final int START_Y = 50;
	
	private GUI4 sim;
	
	private OPannel op=  new OPannel();
	private CPannel cpa= new CPannel();
	private EPannel epa= new EPannel();
	private APannel apa= new APannel();
	private NPannel npa= new NPannel();
	
	
	private JButton o= new JButton("Ouverture d'esprit");
	private JButton c= new JButton("Conscienciosité");
	private JButton e= new JButton("Extraversion");
	private JButton a= new JButton("Amabilité");
	private JButton n= new JButton("Nevroticisme");
	
	private JButton info= new JButton();
	private JButton info2=new JButton();
	private JButton info3=new JButton();
	private JButton info4=new JButton();
	private JButton info5=new JButton();

	
	
	
	public PersonalityPanel4() {
		initLayout();
		initActions();
	}
	
	public void initLayout() {
		setLayout(null);
		
		
		info.setIcon(new ImageIcon("src/img_projet/info.png"));
		info.setBorderPainted(false);
		info.setFocusPainted(false);
		info.setContentAreaFilled(false);
		add(info);
		info.setBounds(START_X+232, START_Y+2, 10, 10);
		add(o);
		o.setBounds(START_X+105, START_Y, 140, 30);
		
		info2.setIcon(new ImageIcon("src/img_projet/info.png"));
		info2.setBorderPainted(false);
		info2.setFocusPainted(false);
		info2.setContentAreaFilled(false);
		add(info2);
		info2.setBounds(START_X+232, START_Y+42, 10, 10);
		add(c);
		c.setBounds(START_X+105, START_Y+40, 140, 30);
		
		info3.setIcon(new ImageIcon("src/img_projet/info.png"));
		info3.setBorderPainted(false);
		info3.setFocusPainted(false);
		info3.setContentAreaFilled(false);
		add(info3);
		info3.setBounds(START_X+232, START_Y+82, 10, 10);
		add(e);
		e.setBounds(START_X+105, START_Y+80, 140, 30);
		
		info4.setIcon(new ImageIcon("src/img_projet/info.png"));
		info4.setBorderPainted(false);
		info4.setFocusPainted(false);
		info4.setContentAreaFilled(false);
		add(info4);
		info4.setBounds(START_X+232, START_Y+122, 10, 10);
		add(a);
		a.setBounds(START_X+105, START_Y+120, 140, 30);

		info5.setIcon(new ImageIcon("src/img_projet/info.png"));
		info5.setBorderPainted(false);
		info5.setFocusPainted(false);
		info5.setContentAreaFilled(false);
		add(info5);
		info5.setBounds(START_X+232, START_Y+162, 10, 10);
		add(n);
		n.setBounds(START_X+105, START_Y+160, 140, 30);
	}
	
	public void initActions() {
		info.addActionListener(new OAction());
		info2.addActionListener(new CAction());
		info3.addActionListener(new EAction());
		info4.addActionListener(new AAction());
		info5.addActionListener(new NAction());
		
		o.addActionListener(new SimAction());
		c.addActionListener(new SimAction());
		e.addActionListener(new SimAction());
		a.addActionListener(new SimAction());
		n.addActionListener(new SimAction());
		
	}
	
	private class OAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JFrame f4= new JFrame();
			f4.setVisible(true);
			f4.setSize(750, 75);
			f4.setLocationRelativeTo(null);
			f4.add(op);
		}
	}
	
	private class CAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame f4= new JFrame();
			f4.setVisible(true);
			f4.setSize(820, 75);
			f4.setLocationRelativeTo(null);
			f4.add(cpa);
			
		}
		
	}
	private class EAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame f4= new JFrame();
			f4.setVisible(true);
			f4.setSize(730, 75);
			f4.setLocationRelativeTo(null);
			f4.add(epa);
			
		}
		
	}
	private class AAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame f4= new JFrame();
			f4.setVisible(true);
			f4.setSize(800,75);
			f4.setLocationRelativeTo(null);
			f4.add(apa);
			
		}
		
	}
	private class NAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame f4= new JFrame();
			f4.setVisible(true);
			f4.setSize(1160, 75);
			f4.setLocationRelativeTo(null);
			f4.add(npa);
			
		}
		
	}
	
	private class SimAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			sim= new GUI4("Social Simulation");
			setVisible(false);
			
		}
		
	}
}
