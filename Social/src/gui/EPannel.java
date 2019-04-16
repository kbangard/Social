package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class EPannel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel def3= new JLabel("(E) Extraversion : énergie, émotions positives, tendance à chercher la stimulation et la compagnie des autres, fonceur");
	public EPannel () {
		initLayout();
	}
	
	public void initLayout() {
		add(def3);
	}

}
