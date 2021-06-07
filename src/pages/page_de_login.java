package pages;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import common.Frame_warnning;
import common.LinkLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JPasswordField;

public class page_de_login {

	private JFrame frame;
	private JTextField textField_id;
	private JPasswordField textField_passeWard;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					page_de_login window = new page_de_login();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	public void run() {
		try {
			page_de_login window = new page_de_login();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
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
		frame = new Frame_warnning();
		frame.setBounds(100, 100, 900, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		((Frame_warnning) frame).addListener(); 
		
		Border blackline = BorderFactory.createLineBorder(new Color(21,50,207));
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 886, 613);
		frame.getContentPane().add(panel);
		panel.setBackground(new Color(162,203,246));
		panel.setLayout(null);
		
		JPanel logIn = new JPanel();
		logIn.setBounds(202, 179, 498, 247);
		logIn.setBackground(new Color(115, 175, 237));
		logIn.setBorder(new LineBorder(new Color(21, 50, 207), 2));
		panel.add(logIn);
		logIn.setLayout(null);
		
		JLabel title_logIn = new JLabel("Identification");
		title_logIn.setHorizontalAlignment(SwingConstants.CENTER);
		title_logIn.setBounds(114, 10, 250, 48);
		title_logIn.setBorder(new LineBorder(new Color(21, 50, 207), 2));
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
		
		textField_id = new JTextField();
		textField_id.setBounds(147, 82, 262, 33);
		logIn.add(textField_id);
		textField_id.setColumns(10);
		
		JLabel oublie_mot = new JLabel("Mot de passe oubli¨¦?");
		oublie_mot.setBounds(10, 163, 128, 15);
		logIn.add(oublie_mot);
		
		JButton connecter = new JButton("SE CONNECTER");
		connecter.setBounds(173, 189, 143, 23);
		logIn.add(connecter);
		
		textField_passeWard = new JPasswordField();
		textField_passeWard.setBounds(147, 125, 262, 33);
		logIn.add(textField_passeWard);
		
		JLabel title = new JLabel("DEPARTEMENT MANAGER");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(230, 32, 435, 50);
		title.setBackground(new Color(115, 175, 237));
		title.setOpaque(true);
		title.setBorder(new LineBorder(new Color(21, 50, 207), 2));
		title.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		title.setForeground(new Color(21, 50, 207));
		panel.add(title );
		
		JLabel uttLabel = new LinkLabel("","https://www.utt.fr/");
		uttLabel.setIcon(new ImageIcon(getClass().getResource("/Image/UTT.png")));
		uttLabel.setBounds(10, 10, 210, 90);
		panel.add(uttLabel);
		
		
		connecter.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if( textField_id.getText().equals( "1" ) && textField_passeWard.getText().equals ( "1" )) {
					page_d_accueil accueil = new page_d_accueil();
					frame.dispose();
					accueil.run();
				}else {
					int result = JOptionPane.showConfirmDialog(null, "Veuillez entrer le compte et le mot de passe corrects", " ",JOptionPane.OK_CANCEL_OPTION);
				}
				textField_id.setText("");
				textField_passeWard.setText("");
			}
		});
	}
}
