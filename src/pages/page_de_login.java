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
		
		Border blackline = BorderFactory.createLineBorder(Color.black); //border of login panel
		
		JPanel login = new JPanel();
		login.setBounds(206, 188, 450, 220);
		frame.getContentPane().add(login);
		login.setLayout(null);
		login.setBorder(blackline);
		
		
		JLabel id = new JLabel("id");
		id.setHorizontalAlignment(SwingConstants.CENTER);
		id.setBounds(42, 79, 65, 15);
		login.add(id);
		
		JLabel mot_de_passe = new JLabel("mot_de_passe");
		mot_de_passe.setHorizontalAlignment(SwingConstants.CENTER);
		mot_de_passe.setBounds(29, 125, 104, 15);
		login.add(mot_de_passe);
		
		JLabel idientification = new JLabel("idientification");
		idientification.setHorizontalAlignment(SwingConstants.CENTER);
		idientification.setBounds(138, 25, 200, 30);
		login.add(idientification);
		
		JTextPane input_id = new JTextPane();
		input_id.setBounds(171, 79, 200, 25);
		login.add(input_id);
		
		JTextPane input_mot = new JTextPane();
		input_mot.setBounds(171, 125, 200, 25);
		login.add(input_mot);
		
		JLabel oublier_mot_de_passe = new JLabel("oublier?");
		oublier_mot_de_passe.setHorizontalAlignment(SwingConstants.CENTER);
		oublier_mot_de_passe.setBounds(39, 150, 58, 15);
		login.add(oublier_mot_de_passe);
		
		JButton connecter = new JButton("se connecter");
		connecter.setBounds(138, 174, 120, 25);
		login.add(connecter);
		
		JLabel title = new JLabel("DEPARTEMENT MANAGEMENT");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("ËÎÌו", Font.BOLD, 12));
		title.setBounds(222, 34, 430, 50);
		frame.getContentPane().add(title);
	}
}
