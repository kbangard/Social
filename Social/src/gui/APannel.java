package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class APannel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel def4= new JLabel("(A) Agréabilité (amabilité) : une tendance à être compatissant et coopératif plutôt que soupçonneux et antagonique envers les autres");
	public APannel () {
		initLayout();
	}
	
	public void initLayout() {
		add(def4);
	}

}
