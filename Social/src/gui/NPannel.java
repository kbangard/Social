package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class NPannel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel def5= new JLabel("(N) Neuroticisme ou névrosisme : contraire de stabilité émotionnelle : tendance à éprouver facilement des émotions désagréables comme la colère, l'inquiétude ou la dépression, vulnérabilité");
	public NPannel () {
		initLayout();
	}
	
	public void initLayout() {
		add(def5);
	}

}
