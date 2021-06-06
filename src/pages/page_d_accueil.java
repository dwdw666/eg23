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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(20, 20, 170, 170);
		panel_left.add(lblNewLabel);
		
		JPanel panel_right = new JPanel();
		panel_right.setBounds(214, 110, 672, 503);
		frame.getContentPane().add(panel_right);
		panel_right.setBackground(new Color(162,203,246));
		panel_right.setBorder(blackline);
		panel_right.setLayout(null);



		
	}
}
