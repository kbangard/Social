package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class APannel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel def4= new JLabel("(A) Agr�abilit� (amabilit�) : une tendance � �tre compatissant et coop�ratif plut�t que soup�onneux et antagonique envers les autres");
	public APannel () {
		initLayout();
	}
	
	public void initLayout() {
		add(def4);
	}

}
