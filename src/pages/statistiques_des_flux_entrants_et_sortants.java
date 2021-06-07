package pages;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.AncestorListener;

import common.Frame_warnning;
import common.LengthFlexLable;
import common.LinkLabel;

import javax.swing.event.AncestorEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class statistiques_des_flux_entrants_et_sortants {

	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static boolean click = false;
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					statistiques_des_flux_entrants_et_sortants window = new statistiques_des_flux_entrants_et_sortants();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	public void run() {
		try {
			statistiques_des_flux_entrants_et_sortants window = new statistiques_des_flux_entrants_et_sortants();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Create the application.
	 */
	public statistiques_des_flux_entrants_et_sortants() {
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
		((Frame_warnning) frame).addListener();  //add close warnning
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 0, 886, 110);
		frame.getContentPane().add(panel);
		panel.setBackground(new Color(162,203,246));
		panel.setLayout(null);
		panel.setBorder(blackline);
		
		JLabel titreLabel = new JLabel("Statistiques des flux entrants et sortants");

		titreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titreLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		titreLabel.setForeground(new Color(21, 50, 207));
		titreLabel.setOpaque(true);
		titreLabel.setBackground(new Color(115, 175, 237));
		titreLabel.setBounds(230, 30, 496, 50);
		panel.add(titreLabel);
		titreLabel.setBorder(new LineBorder(new Color(21, 50, 207), 2));
		
		JLabel uttLabel = new LinkLabel("","https://www.utt.fr/");
		uttLabel.setIcon(new ImageIcon(getClass().getResource("/Image/UTT.png")));
		uttLabel.setBounds(10, 10, 210, 90);
		panel.add(uttLabel);
		uttLabel.setBorder(blackline);
		
		JButton row1_button_2 = new JButton("Retour");
		row1_button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				page_d_accueil accueil = new page_d_accueil();
				accueil.run();
			}
		});
		row1_button_2.setForeground(new Color(21, 50, 207));
		row1_button_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		row1_button_2.setBounds(736, 42, 140, 35);
		panel.add(row1_button_2);
		
		JPanel panel_left = new JPanel();
		panel_left.setBorder(blackline);
		panel_left.setBounds(0, 110, 288, 503);
		frame.getContentPane().add(panel_left);
		panel_left.setBackground(new Color(162,203,246));
		panel_left.setLayout(null);
		
		JLabel col1_Label = new JLabel("Type");
		col1_Label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		col1_Label.setHorizontalAlignment(SwingConstants.CENTER);
		col1_Label.setBounds(10, 23, 93, 40);
		col1_Label.setForeground(new Color(21, 50, 207));
		col1_Label.setOpaque(true);
		col1_Label.setBackground(new Color(115, 175, 237));
		panel_left.add(col1_Label);
		col1_Label.setBorder(blackline);
		
		JLabel col2_Label = new JLabel(" Nombre");
		col2_Label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		col2_Label.setHorizontalAlignment(SwingConstants.CENTER);
		col2_Label.setBounds(102, 23, 98, 40);
		col2_Label.setForeground(new Color(21, 50, 207));
		col2_Label.setOpaque(true);
		col2_Label.setBackground(new Color(115, 175, 237));
		panel_left.add(col2_Label);
		col2_Label.setBorder(blackline);
		
		JLabel col3_Label = new JLabel("Choix");
		col3_Label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		col3_Label.setHorizontalAlignment(SwingConstants.CENTER);
		col3_Label.setBounds(200, 23, 78, 40);
		col3_Label.setForeground(new Color(21, 50, 207));
		col3_Label.setOpaque(true);
		col3_Label.setBackground(new Color(115, 175, 237));
		panel_left.add(col3_Label);
		col3_Label.setBorder(blackline);
		
		//les datas et choisir button
		JLabel row1_label1 = new LengthFlexLable("Nombre d\u2019\u00E9tudiants r\u00E9orient\u00E9s ");
		row1_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row1_label1.setForeground(new Color(21, 50, 207));
		row1_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_label1.setBounds(10, 63, 93, 55);
		panel_left.add(row1_label1);
		row1_label1.setBorder(blackline);
		
		JLabel row1_label2 = new LengthFlexLable("17");
		row1_label2.setHorizontalAlignment(SwingConstants.CENTER);
		row1_label2.setForeground(new Color(21, 50, 207));
		row1_label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_label2.setBounds(102, 63, 98, 55);
		panel_left.add(row1_label2);
		row1_label2.setBorder(blackline);
		
		JLabel row2_label1 = new LengthFlexLable("Nombre de d\u00E9missionnaires");
		row2_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row2_label1.setForeground(new Color(21, 50, 207));
		row2_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row2_label1.setBounds(10, 118, 93, 50);
		panel_left.add(row2_label1);
		row2_label1.setBorder(blackline);
		
		JLabel row2_label2 = new JLabel("20\r\n");
		row2_label2.setHorizontalAlignment(SwingConstants.CENTER);
		row2_label2.setForeground(new Color(21, 50, 207));
		row2_label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row2_label2.setBounds(102, 118, 98, 50);
		panel_left.add(row2_label2);
		row2_label2.setBorder(blackline);
		
		JLabel row3_label1 = new LengthFlexLable("Nombre d\u2019admissions TC ");
		row3_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row3_label1.setForeground(new Color(21, 50, 207));
		row3_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row3_label1.setBounds(10, 168, 93, 50);
		panel_left.add(row3_label1);
		row3_label1.setBorder(blackline);
		
		JLabel row3_label2 = new JLabel("19");
		row3_label2.setHorizontalAlignment(SwingConstants.CENTER);
		row3_label2.setForeground(new Color(21, 50, 207));
		row3_label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row3_label2.setBounds(102, 168, 98, 50);
		panel_left.add(row3_label2);
		row3_label2.setBorder(blackline);
		
		JLabel row4_label1 = new LengthFlexLable("Nombre d\u2019admissions IUT");
		row4_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row4_label1.setForeground(new Color(21, 50, 207));
		row4_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row4_label1.setBounds(10, 218, 93, 50);
		panel_left.add(row4_label1);
		row4_label1.setBorder(blackline);
		
		JLabel row4_label2 = new JLabel("14");
		row4_label2.setHorizontalAlignment(SwingConstants.CENTER);
		row4_label2.setForeground(new Color(21, 50, 207));
		row4_label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row4_label2.setBounds(102, 218, 98, 50);
		panel_left.add(row4_label2);
		row4_label2.setBorder(blackline);
		
		JLabel row5_label1 = new LengthFlexLable("Nombre d\u2019admissions Pr\u00E9pa");
		row5_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row5_label1.setForeground(new Color(21, 50, 207));
		row5_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row5_label1.setBounds(10, 268, 93, 50);
		panel_left.add(row5_label1);
		row5_label1.setBorder(blackline);
		
		JLabel row5_label2 = new JLabel("17");
		row5_label2.setHorizontalAlignment(SwingConstants.CENTER);
		row5_label2.setForeground(new Color(21, 50, 207));
		row5_label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row5_label2.setBounds(102, 268, 98, 50);
		panel_left.add(row5_label2);
		row5_label2.setBorder(blackline);
		
		JLabel row6_label1 = new LengthFlexLable("Changement de branche \u00AB entrant \u00BB");
		row6_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row6_label1.setForeground(new Color(21, 50, 207));
		row6_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row6_label1.setBounds(10, 318, 93, 50);
		panel_left.add(row6_label1);
		row6_label1.setBorder(blackline);
		
		JLabel row6_label2 = new JLabel("16");
		row6_label2.setHorizontalAlignment(SwingConstants.CENTER);
		row6_label2.setForeground(new Color(21, 50, 207));
		row6_label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row6_label2.setBounds(102, 318, 98, 50);
		panel_left.add(row6_label2);
		row6_label2.setBorder(blackline);
		
		JLabel row7_label1 = new LengthFlexLable("Changement de branche \u00AB sortant \u00BB");
		row7_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row7_label1.setForeground(new Color(21, 50, 207));
		row7_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row7_label1.setBounds(10, 368, 93, 50);
		panel_left.add(row7_label1);
		row7_label1.setBorder(blackline);
		
		JLabel row7_label2 = new JLabel("20");
		row7_label2.setHorizontalAlignment(SwingConstants.CENTER);
		row7_label2.setForeground(new Color(21, 50, 207));
		row7_label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row7_label2.setBounds(102, 368, 98, 50);
		panel_left.add(row7_label2);
		row7_label2.setBorder(blackline);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(blackline);
		panel_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel_1.setBounds(200, 63, 78, 55);
		panel_left.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton();
		rdbtnNewRadioButton_1_1.setSelected(true);
		rdbtnNewRadioButton_1_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNewRadioButton_1_1.setBounds(30, 16, 21, 21);
		rdbtnNewRadioButton_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(rdbtnNewRadioButton_1_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(blackline);
		panel_1_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel_1_1.setBounds(200, 118, 78, 50);
		panel_left.add(panel_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("");
		rdbtnNewRadioButton_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_1_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNewRadioButton_1_1_1.setBounds(30, 16, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_1_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(blackline);
		panel_1_2.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel_1_2.setBounds(200, 168, 78, 50);
		panel_left.add(panel_1_2);
		
		JRadioButton rdbtnNewRadioButton_1_1_2 = new JRadioButton("");
		rdbtnNewRadioButton_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_1_2.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNewRadioButton_1_1_2.setBounds(30, 16, 21, 21);
		panel_1_2.add(rdbtnNewRadioButton_1_1_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(blackline);
		panel_1_3.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel_1_3.setBounds(200, 218, 78, 50);
		panel_left.add(panel_1_3);
		
		JRadioButton rdbtnNewRadioButton_1_1_3 = new JRadioButton("");
		rdbtnNewRadioButton_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_1_3.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNewRadioButton_1_1_3.setBounds(30, 16, 21, 21);
		panel_1_3.add(rdbtnNewRadioButton_1_1_3);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBorder(blackline);
		panel_1_4.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel_1_4.setBounds(200, 268, 78, 50);
		panel_left.add(panel_1_4);
		
		JRadioButton rdbtnNewRadioButton_1_1_4 = new JRadioButton("");
		rdbtnNewRadioButton_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_1_4.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNewRadioButton_1_1_4.setBounds(30, 16, 21, 21);
		panel_1_4.add(rdbtnNewRadioButton_1_1_4);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setLayout(null);
		panel_1_5.setBorder(blackline);
		panel_1_5.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel_1_5.setBounds(200, 318, 78, 50);
		panel_left.add(panel_1_5);
		
		JRadioButton rdbtnNewRadioButton_1_1_5 = new JRadioButton("");
		rdbtnNewRadioButton_1_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_1_5.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNewRadioButton_1_1_5.setBounds(30, 10, 21, 21);
		panel_1_5.add(rdbtnNewRadioButton_1_1_5);
		
		JPanel panel_1_6 = new JPanel();
		panel_1_6.setLayout(null);
		panel_1_6.setBorder(blackline);
		panel_1_6.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel_1_6.setBounds(200, 368, 78, 50);
		panel_left.add(panel_1_6);
		
		JRadioButton rdbtnNewRadioButton_1_1_6 = new JRadioButton("");
		rdbtnNewRadioButton_1_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_1_6.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNewRadioButton_1_1_6.setBounds(30, 16, 21, 21);
		panel_1_6.add(rdbtnNewRadioButton_1_1_6);
		
		ButtonGroup group = new ButtonGroup();
		group.add( rdbtnNewRadioButton_1_1);
		group.add( rdbtnNewRadioButton_1_1_1);
		group.add( rdbtnNewRadioButton_1_1_2);
		group.add( rdbtnNewRadioButton_1_1_3);
		group.add( rdbtnNewRadioButton_1_1_4);
		group.add( rdbtnNewRadioButton_1_1_5);
		group.add( rdbtnNewRadioButton_1_1_6);
		
		JPanel panel_right = new JPanel();
		panel_right.setLayout(null);
		panel_right.setBackground(new Color(162, 203, 246));
		panel_right.setBounds(286, 110, 600, 503);
		panel_right.setBorder(blackline);
		frame.getContentPane().add(panel_right);
		
		JLabel human_image = new JLabel();
		human_image.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
		human_image.setBounds(26, 40, 120, 120);
		panel_right.add(human_image);
		
		JLabel human_image_1 = new JLabel();
		human_image_1.setBounds(168, 40, 120, 120);
		human_image_1.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
		panel_right.add(human_image_1);
		
		JLabel human_image_2 = new JLabel();
		human_image_2.setBounds(317, 40, 120, 120);
		human_image_2.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
		panel_right.add(human_image_2);
		
		JLabel human_image_3 = new JLabel();
		human_image_3.setBounds(460, 40, 120, 120);
		human_image_3.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
		panel_right.add(human_image_3);
		
		JLabel lable_semestre_1 = new JLabel("Pr\u00E9nom Nom ");
		lable_semestre_1.setHorizontalAlignment(SwingConstants.CENTER);
		lable_semestre_1.setForeground(new Color(21, 50, 207));
		lable_semestre_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lable_semestre_1.setBounds(36, 157, 96, 30);
		panel_right.add(lable_semestre_1);
		
		JLabel lable_semestre_2 = new JLabel("Pr\u00E9nom Nom ");
		lable_semestre_2.setHorizontalAlignment(SwingConstants.CENTER);
		lable_semestre_2.setForeground(new Color(21, 50, 207));
		lable_semestre_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lable_semestre_2.setBounds(178, 157, 96, 30);
		panel_right.add(lable_semestre_2);
		
		JLabel lable_semestre_3 = new JLabel("Pr\u00E9nom Nom ");
		lable_semestre_3.setHorizontalAlignment(SwingConstants.CENTER);
		lable_semestre_3.setForeground(new Color(21, 50, 207));
		lable_semestre_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lable_semestre_3.setBounds(327, 157, 103, 30);
		panel_right.add(lable_semestre_3);
		
		JLabel lable_semestre_4 = new JLabel("Pr\u00E9nom Nom ");
		lable_semestre_4.setHorizontalAlignment(SwingConstants.CENTER);
		lable_semestre_4.setForeground(new Color(21, 50, 207));
		lable_semestre_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lable_semestre_4.setBounds(470, 157, 110, 30);
		panel_right.add(lable_semestre_4);
		
		JLabel human_image_4 = new JLabel();
		human_image_4.setBounds(26, 198, 120, 120);
		human_image_4.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
		panel_right.add(human_image_4);
		
		JLabel lable_semestre_1_1 = new JLabel("Pr\u00E9nom Nom ");
		lable_semestre_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lable_semestre_1_1.setForeground(new Color(21, 50, 207));
		lable_semestre_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lable_semestre_1_1.setBounds(36, 314, 96, 30);
		panel_right.add(lable_semestre_1_1);
		
		JLabel human_image_5 = new JLabel();
		human_image_5.setBounds(168, 198, 120, 120);
		human_image_5.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
		panel_right.add(human_image_5);
		
		JLabel lable_semestre_2_1 = new JLabel("Pr\u00E9nom Nom ");
		lable_semestre_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lable_semestre_2_1.setForeground(new Color(21, 50, 207));
		lable_semestre_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lable_semestre_2_1.setBounds(178, 314, 110, 30);
		panel_right.add(lable_semestre_2_1);
		
		JLabel human_image_6 = new JLabel();
		human_image_6.setBounds(317, 198, 120, 120);
		human_image_6.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
		panel_right.add(human_image_6);
		
		JLabel lable_semestre_3_1 = new JLabel("Pr\u00E9nom Nom ");
		lable_semestre_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lable_semestre_3_1.setForeground(new Color(21, 50, 207));
		lable_semestre_3_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lable_semestre_3_1.setBounds(327, 314, 110, 30);
		panel_right.add(lable_semestre_3_1);
		
		JLabel human_image_7 = new JLabel();
		human_image_7.setBounds(460, 198, 120, 120);
		human_image_7.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
		panel_right.add(human_image_7);
		
		JLabel lable_semestre_4_1 = new JLabel("Pr\u00E9nom Nom ");
		lable_semestre_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lable_semestre_4_1.setForeground(new Color(21, 50, 207));
		lable_semestre_4_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lable_semestre_4_1.setBounds(470, 314, 96, 30);
		panel_right.add(lable_semestre_4_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(583, 0, 17, 503);
		panel_right.add(scrollBar);
		
		JLabel human_image_8 = new JLabel();
		human_image_8.setBounds(26, 354, 120, 120);
		human_image_8.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
		panel_right.add(human_image_8);
		
		JLabel human_image_9 = new JLabel();
		human_image_9.setBounds(168, 354, 120, 120);
		human_image_9.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
		panel_right.add(human_image_9);
		
		JLabel human_image_6_1 = new JLabel();
		human_image_6_1.setBounds(317, 354, 120, 120);
		human_image_6_1.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
		panel_right.add(human_image_6_1);
		
		JLabel human_image_7_1 = new JLabel();
		human_image_7_1.setBounds(460, 354, 120, 120);
		human_image_7_1.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
		panel_right.add(human_image_7_1);
		
		JLabel lable_semestre_1_1_1 = new JLabel("Pr\u00E9nom Nom ");
		lable_semestre_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lable_semestre_1_1_1.setForeground(new Color(21, 50, 207));
		lable_semestre_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lable_semestre_1_1_1.setBounds(36, 470, 96, 30);
		panel_right.add(lable_semestre_1_1_1);
		
		JLabel lable_semestre_2_1_1 = new JLabel("Pr\u00E9nom Nom ");
		lable_semestre_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lable_semestre_2_1_1.setForeground(new Color(21, 50, 207));
		lable_semestre_2_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lable_semestre_2_1_1.setBounds(178, 470, 110, 30);
		panel_right.add(lable_semestre_2_1_1);
		
		JLabel lable_semestre_3_1_1 = new JLabel("Pr\u00E9nom Nom ");
		lable_semestre_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lable_semestre_3_1_1.setForeground(new Color(21, 50, 207));
		lable_semestre_3_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lable_semestre_3_1_1.setBounds(327, 470, 110, 30);
		panel_right.add(lable_semestre_3_1_1);
		
		JLabel lable_semestre_4_1_1 = new JLabel("Pr\u00E9nom Nom ");
		lable_semestre_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lable_semestre_4_1_1.setForeground(new Color(21, 50, 207));
		lable_semestre_4_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lable_semestre_4_1_1.setBounds(470, 470, 96, 30);
		panel_right.add(lable_semestre_4_1_1);
		
		JLabel lblNewLabel = new JLabel("Nombre d\u2019\u00E9tudiants r\u00E9orient\u00E9s");
		lblNewLabel.setForeground(new Color(21, 50, 207));
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblNewLabel.setBounds(26, 10, 474, 30);
		panel_right.add(lblNewLabel);
		rdbtnNewRadioButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Nombre d¡¯¨¦tudiants r¨¦orient¨¦s");
			}
		});
		rdbtnNewRadioButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Nombre de d¨¦missionnaire");
			}
		});
		rdbtnNewRadioButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Nombre de d'admissions TC");
			}
		});
		rdbtnNewRadioButton_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Nombre de d'admissions IUT");
			}
		});
		rdbtnNewRadioButton_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Nombre de d'admissions Pr¨¦pa");
			}
		});
		rdbtnNewRadioButton_1_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Changement de branche <<entrant>>");
			}
		});
		rdbtnNewRadioButton_1_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Changement de branche <<sortant>>");
			}
		});
	}
}
