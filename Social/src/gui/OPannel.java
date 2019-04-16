package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class OPannel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel def= new JLabel("(O) Ouverture d'esprit : appréciation de l'art, de l'émotion, de l'aventure, des idées peu communes, curiosité et imagination");
	public OPannel () {
		initLayout();
	}
	
	public void initLayout() {
		add(def);
	}

}
