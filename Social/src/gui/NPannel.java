package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class NPannel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel def5= new JLabel("(N) Neuroticisme ou n�vrosisme : contraire de stabilit� �motionnelle : tendance � �prouver facilement des �motions d�sagr�ables comme la col�re, l'inqui�tude ou la d�pression, vuln�rabilit�");
	public NPannel () {
		initLayout();
	}
	
	public void initLayout() {
		add(def5);
	}

}
