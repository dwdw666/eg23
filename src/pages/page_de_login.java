package pages;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class page_de_login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page_de_login window = new page_de_login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public page_de_login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Border blackline = BorderFactory.createLineBorder(new Color(21,50,207));
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 886, 613);
		frame.getContentPane().add(panel);
		panel.setBackground(new Color(162,203,246));
		panel.setLayout(null);
		
		JPanel logIn = new JPanel();
		logIn.setBounds(239, 192, 445, 213);
		panel.add(logIn);
		logIn.setLayout(null);
		
		JLabel title_logIn = new JLabel("Identification");
		title_logIn.setHorizontalAlignment(SwingConstants.CENTER);
		title_logIn.setBounds(114, 24, 200, 30);
		title_logIn.setBorder(blackline);
		logIn.add(title_logIn);
		
		JLabel title = new JLabel("DEPARTEMENT MANAGEMENT");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(243, 30, 430, 50);
		title.setBorder(blackline);
		panel.add(title );
		
		JLabel uttLabel = new JLabel();
		uttLabel.setBounds(10, 10, 210, 90);
		panel.add(uttLabel);
	}
}
