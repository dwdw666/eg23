package pages;

import java.awt.Color;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.JButton;


public class page_d_accueil {
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page_d_accueil window = new page_d_accueil();
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
	public page_d_accueil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		Border blackline = BorderFactory.createLineBorder(new Color(21,50,207));
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 0, 886, 110);
		frame.getContentPane().add(panel);
		panel.setBackground(new Color(162,203,246));
		panel.setLayout(null);
		panel.setBorder(blackline);
		
		JLabel accueilLabel = new JLabel("ACCUEIL");
		accueilLabel.setHorizontalAlignment(SwingConstants.CENTER);
		accueilLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		accueilLabel.setForeground(new Color(21, 50, 207));

		accueilLabel.setOpaque(true);
		accueilLabel.setBackground(new Color(115, 175, 237));
		accueilLabel.setBounds(243, 30, 400, 40);
		panel.add(accueilLabel);
		accueilLabel.setBorder(blackline);
		
		JLabel uttLabel = new JLabel();
		uttLabel.setIcon(new ImageIcon(getClass().getResource("/Image/UTT.png")));
		uttLabel.setBounds(10, 10, 210, 90);
		panel.add(uttLabel);
		
		JPanel panel_left = new JPanel();
		panel_left.setBounds(0, 110, 215, 503);
		frame.getContentPane().add(panel_left);
		panel_left.setBackground(new Color(162,203,246));
		panel_left.setBorder(blackline);
		panel_left.setLayout(null);
		
		JLabel userLabel = new JLabel();
		userLabel.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
		userLabel.setBounds(20, 20, 170, 170);
		panel_left.add(userLabel);
		
		JLabel nameLabel = new JLabel("Pr\u00E9nom NOM");
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		nameLabel.setForeground(new Color(21, 50, 207));
		nameLabel.setBounds(10, 200, 195, 40);
		panel_left.add(nameLabel);
		
		JLabel telLabel = new JLabel("T\u00E9l : 06 23 12 07 03");
		telLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		telLabel.setHorizontalAlignment(SwingConstants.CENTER);
		telLabel.setForeground(new Color(21, 50, 207));
		telLabel.setBounds(10, 245, 195, 30);
		panel_left.add(telLabel);
		
		JLabel mailLabel = new JLabel("Email : prenom.nom@utt.fr");
		mailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mailLabel.setForeground(new Color(21, 50, 207));
		mailLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		mailLabel.setBounds(10, 280, 195, 30);
		panel_left.add(mailLabel);
		
		JLabel depLabel = new JLabel("D\u00E9partement : ISI");
		depLabel.setHorizontalAlignment(SwingConstants.CENTER);
		depLabel.setForeground(new Color(21, 50, 207));
		depLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		depLabel.setBounds(10, 315, 195, 30);
		panel_left.add(depLabel);
		
		JButton decButton = new JButton("d\u00E9connection");
		decButton.setBounds(20, 372, 170, 40);
		decButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		decButton.setForeground(new Color(21, 50, 207));
		panel_left.add(decButton);
		
		JPanel panel_right = new JPanel();
		panel_right.setBounds(214, 110, 672, 503);
		frame.getContentPane().add(panel_right);
		panel_right.setBackground(new Color(162,203,246));
		panel_right.setBorder(blackline);
		panel_right.setLayout(null);
		
		JButton gde_Button = new JButton("Gestion des enseignants");
		gde_Button.setForeground(new Color(21, 50, 207));
		gde_Button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		gde_Button.setBounds(150, 70, 400, 50);
		panel_right.add(gde_Button);
		
		JButton gde_Button_1 = new JButton("Gestion des enseignants");
		gde_Button_1.setForeground(new Color(21, 50, 207));
		gde_Button_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		gde_Button_1.setBounds(150, 150, 400, 50);
		panel_right.add(gde_Button_1);
		
		JButton gde_Button_2 = new JButton("Gestion des enseignants");
		gde_Button_2.setForeground(new Color(21, 50, 207));
		gde_Button_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		gde_Button_2.setBounds(150, 230, 400, 50);
		panel_right.add(gde_Button_2);
		
		JButton gde_Button_3 = new JButton("Gestion des enseignants");
		gde_Button_3.setForeground(new Color(21, 50, 207));
		gde_Button_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		gde_Button_3.setBounds(150, 310, 400, 50);
		panel_right.add(gde_Button_3);
		
		JButton gde_Button_4 = new JButton("Gestion des enseignants");
		gde_Button_4.setForeground(new Color(21, 50, 207));
		gde_Button_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		gde_Button_4.setBounds(150, 390, 400, 50);
		panel_right.add(gde_Button_4);



		
	}
}
