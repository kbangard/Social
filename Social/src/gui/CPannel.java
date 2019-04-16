package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CPannel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel def2= new JLabel("Conscienciosité (conscience morale) : autodiscipline, respect des obligations, organisation plutôt que spontanéité ; orienté vers des buts");
	public CPannel () {
		initLayout();
	}
	
	public void initLayout() {
		add(def2);
	}

}
