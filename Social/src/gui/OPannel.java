package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class OPannel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel def= new JLabel("(O) Ouverture d'esprit : appr�ciation de l'art, de l'�motion, de l'aventure, des id�es peu communes, curiosit� et imagination");
	public OPannel () {
		initLayout();
	}
	
	public void initLayout() {
		add(def);
	}

}
