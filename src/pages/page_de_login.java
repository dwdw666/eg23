package pages;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class page_de_login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

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
		logIn.setBounds(202, 179, 498, 247);
		logIn.setBackground(new Color(115, 175, 237));
		panel.add(logIn);
		logIn.setLayout(null);
		
		JLabel title_logIn = new JLabel("Identification");
		title_logIn.setHorizontalAlignment(SwingConstants.CENTER);
		title_logIn.setBounds(114, 10, 250, 48);
		title_logIn.setBorder(blackline);
		title_logIn.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		title_logIn.setForeground(new Color(21, 50, 207));
		logIn.add(title_logIn);
		
		JLabel id = new JLabel("Id:");
		id.setHorizontalAlignment(SwingConstants.CENTER);
		id.setBounds(30, 88, 64, 15);
		id.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		id.setForeground(new Color(21, 50, 207));
		logIn.add(id);
		
		JLabel passeWord = new JLabel("Mot de passe : ");
		passeWord.setBounds(10, 130, 111, 17);
		passeWord.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		passeWord.setForeground(new Color(21, 50, 207));
		logIn.add(passeWord);
		
		textField = new JTextField();
		textField.setBounds(147, 82, 262, 33);
		logIn.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(147, 125, 262, 33);
		logIn.add(textField_1);
		
		JLabel oublie_mot = new JLabel("Mot de passe oubli¨¦?");
		oublie_mot.setBounds(10, 163, 128, 15);
		logIn.add(oublie_mot);
		
		JButton connecter = new JButton("SE CONNECTER");
		connecter.setBounds(173, 189, 143, 23);
		logIn.add(connecter);
		
		JLabel title = new JLabel("DEPARTEMENT MANAGEMENT");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(265, 35, 486, 50);
		title.setBackground(new Color(115, 175, 237));
		title.setOpaque(true);
		title.setBorder(blackline);
		title.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		title.setForeground(new Color(21, 50, 207));
		panel.add(title );
		
		JLabel uttLabel = new JLabel();
		uttLabel.setIcon(new ImageIcon(getClass().getResource("/Image/UTT.png")));
		uttLabel.setBounds(10, 10, 210, 90);
		panel.add(uttLabel);
	}
}
