package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI5 extends JFrame implements Runnable {
	private static final Dimension IDEAL_MAIN_DIMENSION = new Dimension(800, 400);

	private static Font font = new Font(Font.MONOSPACED, Font.BOLD, 20);

	/**
	 * The normal speed is 1000, e.q. one refresh per second (1000 milliseconds).
	 */
	private static final int CHRONO_SPEED = 1000;

	private static final long serialVersionUID = 1L;

	/**
	 * The core functional part : the chronometer.
	 */
	private Chronometer chronometer = new Chronometer();
	private AvatarPanel ap= new AvatarPanel();


	private JButton startButton = new JButton(" Start ");
	private JButton clearButton = new JButton(" Clear ");
	private JButton change= new JButton("Changer Avatar");


	private JLabel hourLabel = new JLabel("Hour:");
	private JLabel minuteLabel = new JLabel("Minute:");
	private JLabel secondLabel = new JLabel("Second:");

	private JLabel hourValue = new JLabel("");
	private JLabel minuteValue = new JLabel("");
	private JLabel secondValue = new JLabel("");

	private JPanel control = new JPanel();

	/**
	 * This instance is used in the inner classes for different action listeners.
	 */
	private GUI5 instance = this;

	/**
	 * Initial status of for the start button.
	 */
	private boolean stop = true;
	private AdofPanel panneau;
	
	public GUI5(String title) {
		super(title);
		init();
		
	}
		
	public void init() {
		updateValues();

		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		control.setLayout(new FlowLayout(FlowLayout.CENTER));
		hourLabel.setFont(font);
		control.add(hourLabel);
		hourValue.setFont(font);
		control.add(hourValue);

		minuteLabel.setFont(font);
		control.add(minuteLabel);
		minuteValue.setFont(font);
		control.add(minuteValue);

		secondLabel.setFont(font);
		control.add(secondLabel);
		secondValue.setFont(font);
		control.add(secondValue);

		startButton.setFont(font);
		startButton.addActionListener(new StartStopAction());
		control.add(startButton);

		clearButton.setFont(font);
		clearButton.addActionListener(new ClearAction());
		control.add(clearButton);
		
		change.setFont(font);
		change.addActionListener(new ChangeAction());
		control.add(change);

		contentPane.add(BorderLayout.NORTH, control);

		
		panneau= new AdofPanel();
		panneau.setPreferredSize(IDEAL_MAIN_DIMENSION);
		
		contentPane.add(BorderLayout.SOUTH, panneau);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setPreferredSize(IDEAL_MAIN_DIMENSION);
		setResizable(false);
		
			
	}
	
	private void updateValues() {
		// This part is for textual time printing.
		CyclicCounter hour = chronometer.getHour();
		hourValue.setText(hour.toString() + " ");

		CyclicCounter minute = chronometer.getMinute();
		minuteValue.setText(minute.toString() + " ");

		CyclicCounter second = chronometer.getSecond();
		secondValue.setText(second.toString() + " ");

	}
	
	private class StartStopAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (!stop) {
				stop = true;
				startButton.setText(" Start ");
			} else {
				stop = false;
				startButton.setText(" Pause ");
				Thread chronoThread = new Thread(instance);
				chronoThread.start();
			}
		}
	}

	private class ClearAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			stop = true;
			startButton.setText(" Start ");
			chronometer.init();
			updateValues();
		}

	}
	
	private class ChangeAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame f1= new JFrame();
			f1.setVisible(true);
			f1.setSize(400, 350);
			f1.setLocationRelativeTo(null);
			f1.add(ap);
			dispose();
			}

		
	}

	public void dispose() {
		setVisible(false);
		
}
	
	/**
	 * Defines what to do for each time unit (by default 1 second) : it increments the chronometer
	 */
	@Override
	public void run() {
		while (!stop) {
			try {
				Thread.sleep(CHRONO_SPEED);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			chronometer.increment();
			
			// Ensure that the chronometer is not stopped during the iteration.
			if (!stop) {
				updateValues();
			}
		}		
	}
	
	public static void main(String[] args) {
		GUI5 simulation = new GUI5("Social Simulation");
		
	}

}
