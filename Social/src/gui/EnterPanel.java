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

public class EnterPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private static final int START_X = 20;
	private static final int START_Y = 100;
	private AvatarPanel ap= new AvatarPanel();
	
	private static final Font LABEL_FONT = new Font(Font.MONOSPACED, Font.BOLD,30);
	
	private JButton ca= new JButton("Choisir Avatar");
	
	private JLabel ssim= new JLabel("SOCIAL SIMULATION");

	public EnterPanel() {
		initLayout();	
		initActions();
	}
	
	public void initLayout() {
		setLayout(null);
		//label
		setBackground(Color.GRAY);
		add(ssim);
		ssim.setFont(LABEL_FONT);
		ssim.setBounds(START_X+20, START_Y-120, 1000, 100);
		
		add(ca);
		ca.setBounds(START_X+100,START_Y, 130,30);
		
	}
	
	public void initActions() {
		ca.addActionListener(new AddAction());
		
	}
	
	private class AddAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame f1= new JFrame();
			f1.setVisible(true);
			f1.setSize(400, 350);
			f1.setLocationRelativeTo(null);
			f1.add(ap);
			dispose();
			}

		
	}

	public void dispose() {
		setVisible(false);
		
	}
	
	
}