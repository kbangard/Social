package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class MainGUI extends JFrame implements Runnable{
	private Panneau panneau;
	
	public MainGUI() {
		panneau= new Panneau();
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		contentPane.add(BorderLayout.CENTER, panneau);
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		MainGUI simulation = new MainGUI();
		
	}
	@Override
	
	
	
	
	
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
