package gui;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Panneau extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int START_X = 20;
	private static final int START_Y = 100;
  public void paintComponent(Graphics g) {
	  super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		printPlayers(g2);
		printLocation(g2);
		setBackground(Color.WHITE);

  }
  
  private void printPlayers(Graphics2D g2) {
	  g2.drawImage(SimulationUtility.readImage("src/img_projet/man.png"), START_X+40, START_Y, 60, 60, null);
	  g2.drawImage(SimulationUtility.readImage("src/img_projet/user-1.png"), START_X-10, START_Y-50, 45, 45, null);
	  g2.drawImage(SimulationUtility.readImage("src/img_projet/user.png"), START_X-10, START_Y+70, 45, 45, null);
	  g2.drawImage(SimulationUtility.readImage("src/img_projet/user-20.png"), START_X+100, START_Y-40, 45, 45, null);
	  

	  
  }
  private void printLocation(Graphics2D g2) {
	  g2.drawImage(SimulationUtility.readImage("src/img_projet/house-4.png"), START_X+40, START_Y-100, 40, 40, null);
	  g2.drawImage(SimulationUtility.readImage("src/img_projet/location.png"), START_X+250, START_Y-100, 40, 40, null);
	  g2.drawImage(SimulationUtility.readImage("src/img_projet/briefcase.png"), START_X+450, START_Y-100, 40, 40, null);
	  
	  
	  
  }
}   
