package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CPannel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel def2= new JLabel("Conscienciosit� (conscience morale) : autodiscipline, respect des obligations, organisation plut�t que spontan�it� ; orient� vers des buts");
	public CPannel () {
		initLayout();
	}
	
	public void initLayout() {
		add(def2);
	}

}
