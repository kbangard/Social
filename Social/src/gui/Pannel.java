package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Pannel extends JPanel{
	private static final long serialVersionUID = 1L;
	private static final int START_X = 20;
	private static final int START_Y = 100;
	private JButton jb;
	/**public void paintComponent(Graphics g) {
		 super.paintComponent(g);
		 Graphics2D g2 = (Graphics2D) g;
		 setBackground(Color.WHITE);
		}**/
	public void initLayout(){
		jb.setIcon(new ImageIcon("src/img_projet/man.png"));
		add(jb);
		validate();
		}
}
