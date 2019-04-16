package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JFrame;

public class EnterSimGUI extends JFrame implements Runnable{
	private EnterPanel ep;
	
	public EnterSimGUI() {
		ep= new EnterPanel();
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		contentPane.add(BorderLayout.CENTER, ep);
		setSize(400,350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		setVisible(true);
	}
	public static void main(String[] args) {
		EnterSimGUI simulation = new EnterSimGUI();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
