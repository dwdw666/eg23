package pages;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import common.Frame_warnning;
import common.LinkLabel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class page_d_accueil {
	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					page_d_accueil window = new page_d_accueil();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public void run() {
		try {
			page_d_accueil window = new page_d_accueil();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public page_d_accueil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Border blackline = BorderFactory.createLineBorder(new Color(21,50,207));
		frame = new Frame_warnning();
		frame.setBounds(100, 100, 900, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		((Frame_warnning) frame).addListener();
		
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
		accueilLabel.setBounds(243, 30, 400, 50);
		panel.add(accueilLabel);
		accueilLabel.setBorder(new LineBorder(new Color(21, 50, 207), 2));
		
		JLabel uttLabel = new LinkLabel("","https://www.utt.fr/");
		uttLabel.setIcon(new ImageIcon(getClass().getResource("/Image/UTT.png")));
		uttLabel.setBounds(10, 10, 210, 90);
		panel.add(uttLabel);
		uttLabel.setBorder(blackline);
		
		JPanel panel_left = new JPanel();
		panel_left.setBounds(0, 110, 273, 503);
		frame.getContentPane().add(panel_left);
		panel_left.setBackground(new Color(162,203,246));
		panel_left.setBorder(blackline);
		panel_left.setLayout(null);
		
		JLabel userLabel = new JLabel();
		userLabel.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
		userLabel.setBounds(74, 71, 120, 120);
		panel_left.add(userLabel);
		
		JLabel nameLabel = new JLabel("Jean-Marc Nigro");
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		nameLabel.setForeground(new Color(21, 50, 207));
		nameLabel.setBounds(37, 201, 195, 40);
		panel_left.add(nameLabel);
		
		JLabel telLabel = new JLabel("T\u00E9l : xx xx xx xx xx");
		telLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		telLabel.setHorizontalAlignment(SwingConstants.CENTER);
		telLabel.setForeground(new Color(21, 50, 207));
		telLabel.setBounds(37, 246, 195, 30);
		panel_left.add(telLabel);
		
		JLabel mailLabel = new JLabel("Email : jean_marc.nigro@utt.fr");
		mailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mailLabel.setForeground(new Color(21, 50, 207));
		mailLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		mailLabel.setBounds(10, 275, 242, 30);
		panel_left.add(mailLabel);
		
		JLabel depLabel = new JLabel("D\u00E9partement : ISI");
		depLabel.setHorizontalAlignment(SwingConstants.CENTER);
		depLabel.setForeground(new Color(21, 50, 207));
		depLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		depLabel.setBounds(37, 315, 195, 30);
		panel_left.add(depLabel);
		
		JButton decButton = new JButton("d\u00E9connection");
		decButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				page_de_login login = new page_de_login();
				login.run();
			}
		});
		decButton.setBounds(45, 372, 187, 40);
		decButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		decButton.setForeground(new Color(21, 50, 207));
		panel_left.add(decButton);
		
		JPanel panel_right = new JPanel();
		panel_right.setBounds(273, 110, 613, 503);
		frame.getContentPane().add(panel_right);
		panel_right.setBackground(new Color(162,203,246));
		panel_right.setBorder(blackline);
		panel_right.setLayout(null);
		
		JButton gde_Button = new JButton("Gestion des enseignants");
		gde_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				gestion_des_enseignants enseignants = new gestion_des_enseignants();
				enseignants.run();
			}
		});
		gde_Button.setForeground(new Color(21, 50, 207));
		gde_Button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		gde_Button.setBounds(114, 71, 400, 50);
		accueilLabel.setBackground(new Color(115, 175, 237));
		panel_right.add(gde_Button);
		
		JButton gdu_Button = new JButton("Gestion des UE");
		gdu_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				gestion_des_UEs ue = new gestion_des_UEs();
				ue.run();
			}
		});
		gdu_Button.setForeground(new Color(21, 50, 207));
		gdu_Button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		gdu_Button.setBounds(114, 150, 400, 50);
		panel_right.add(gdu_Button);
		
		JButton rde_Button = new JButton("R\u00E9partition des \u00E9tudiants");
		rde_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				repartition_des_etudiants etudient = new repartition_des_etudiants();
				etudient.run();
			}
		});
		rde_Button.setForeground(new Color(21, 50, 207));
		rde_Button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		rde_Button.setBounds(114, 230, 400, 50);
		panel_right.add(rde_Button);
		
		JButton sdf_Button = new JButton("Statistiques des flux");
		sdf_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				statistiques_des_flux_entrants_et_sortants flux = new statistiques_des_flux_entrants_et_sortants();
				flux.run();
			}
		});
		sdf_Button.setForeground(new Color(21, 50, 207));
		sdf_Button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		sdf_Button.setBounds(114, 310, 400, 50);
		panel_right.add(sdf_Button);
		
		JButton gds_Button = new JButton("Gestion du semestre en cours");
		gds_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				gestion_du_semestre_en_cours enCours = new gestion_du_semestre_en_cours();
				enCours.run();
			}
		});
		gds_Button.setForeground(new Color(21, 50, 207));
		gds_Button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		gds_Button.setBounds(114, 390, 400, 50);
		panel_right.add(gds_Button);



		
	}
}
