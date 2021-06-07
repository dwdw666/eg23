package pages;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import common.Frame_warnning;
import common.LengthFlexLable;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gestion_du_semestre_en_cours {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					gestion_du_semestre_en_cours window = new gestion_du_semestre_en_cours();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	public void run() {
		try {
			gestion_du_semestre_en_cours window = new gestion_du_semestre_en_cours();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public gestion_du_semestre_en_cours() {
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
		
		JLabel titreLabel = new JLabel("Gestion du semestre en cours");
		titreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titreLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		titreLabel.setForeground(new Color(21, 50, 207));
		titreLabel.setOpaque(true);
		titreLabel.setBackground(new Color(115, 175, 237));
		titreLabel.setBounds(230, 28, 447, 50);
		panel.add(titreLabel);
		titreLabel.setBorder(new LineBorder(new Color(21, 50, 207), 2));
		
		JLabel uttLabel = new JLabel();
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
		row1_button_2.setBounds(700, 40, 140, 35);
		panel.add(row1_button_2);
		
		JPanel panel_left = new JPanel();
		panel_left.setBounds(0, 110, 288, 503);
		frame.getContentPane().add(panel_left);
		panel_left.setBackground(new Color(162,203,246));
		panel_left.setBorder(blackline);
		panel_left.setLayout(null);
		
		JLabel col1_Label = new JLabel("Type");
		col1_Label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		col1_Label.setHorizontalAlignment(SwingConstants.CENTER);
		col1_Label.setBounds(10, 10, 110, 40);
		col1_Label.setForeground(new Color(21, 50, 207));
		col1_Label.setOpaque(true);
		col1_Label.setBackground(new Color(115, 175, 237));
		panel_left.add(col1_Label);
		col1_Label.setBorder(blackline);
		
		JLabel col2_Label = new JLabel("Nombre");
		col2_Label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		col2_Label.setHorizontalAlignment(SwingConstants.CENTER);
		col2_Label.setBounds(120, 10, 80, 40);
		col2_Label.setForeground(new Color(21, 50, 207));
		col2_Label.setOpaque(true);
		col2_Label.setBackground(new Color(115, 175, 237));
		panel_left.add(col2_Label);
		col2_Label.setBorder(blackline);
		
		JLabel col3_Label = new JLabel("Choix");
		col3_Label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		col3_Label.setHorizontalAlignment(SwingConstants.CENTER);
		col3_Label.setBounds(200, 10, 80, 40);
		col3_Label.setForeground(new Color(21, 50, 207));
		col3_Label.setOpaque(true);
		col3_Label.setBackground(new Color(115, 175, 237));
		panel_left.add(col3_Label);
		col3_Label.setBorder(blackline);
		
		//les datas et choisir button
		JLabel row1_label1 = new LengthFlexLable("<html><body><p>Des ¨¦tudiants<br/>avec leur retard</p></body></html>");
		row1_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row1_label1.setForeground(new Color(21, 50, 207));
		row1_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_label1.setBounds(10, 50, 110, 150);
		panel_left.add(row1_label1);
		row1_label1.setBorder(blackline);
		
		JLabel row1_label2 = new JLabel("5");
		row1_label2.setHorizontalAlignment(SwingConstants.CENTER);
		row1_label2.setForeground(new Color(21, 50, 207));
		row1_label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_label2.setBounds(120, 50, 80, 150);
		panel_left.add(row1_label2);
		row1_label2.setBorder(blackline);
		
		
		JLabel row2_label1 = new LengthFlexLable("<html><body><p>Des ¨¦tudiants dont<br/>le retard est critique</p></body></html>");
		//JLabel row2_label1 = new LengthFlexLable("Des \u00E9tudiants dont le retard est critique");
		row2_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row2_label1.setForeground(new Color(21, 50, 207));
		row2_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row2_label1.setBounds(10, 200, 110, 150);
		panel_left.add(row2_label1);
		row2_label1.setBorder(blackline);
		
		JLabel row2_label2 = new JLabel("3");
		row2_label2.setHorizontalAlignment(SwingConstants.CENTER);
		row2_label2.setForeground(new Color(21, 50, 207));
		row2_label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row2_label2.setBounds(120, 200, 80, 150);
		panel_left.add(row2_label2);
		row2_label2.setBorder(blackline);
		
		JLabel row3_label1 = new LengthFlexLable("<html><body><p>Des ¨¦tudiants candidats<br/>¨¤ l'excellence </p></body></html>");
		//JLabel row3_label1 = new LengthFlexLable("Des \u00E9tudiants candidats \u00E0 l\u2019excellence");
		row3_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row3_label1.setForeground(new Color(21, 50, 207));
		row3_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row3_label1.setBounds(10, 350, 110, 150);
		panel_left.add(row3_label1);
		row3_label1.setBorder(blackline);
		
		JLabel row3_label2 = new JLabel("28");
		row3_label2.setHorizontalAlignment(SwingConstants.CENTER);
		row3_label2.setForeground(new Color(21, 50, 207));
		row3_label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row3_label2.setBounds(120, 350, 80, 150);
		panel_left.add(row3_label2);
		row3_label2.setBorder(blackline);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(blackline);
		panel_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel_1.setBounds(200, 50, 80, 150);
		panel_left.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("");
		rdbtnNewRadioButton_1_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNewRadioButton_1_1.setBounds(30, 64, 21, 21);
		rdbtnNewRadioButton_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(rdbtnNewRadioButton_1_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(blackline);
		panel_1_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel_1_1.setBounds(200, 200, 80, 150);
		panel_left.add(panel_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("");
		rdbtnNewRadioButton_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_1_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNewRadioButton_1_1_1.setBounds(31, 66, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_1_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(blackline);
		panel_1_2.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel_1_2.setBounds(200, 350, 80, 150);
		panel_left.add(panel_1_2);
		
		JRadioButton rdbtnNewRadioButton_1_1_2 = new JRadioButton("");
		rdbtnNewRadioButton_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_1_2.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNewRadioButton_1_1_2.setBounds(29, 55, 21, 21);
		panel_1_2.add(rdbtnNewRadioButton_1_1_2);
		
		ButtonGroup group = new ButtonGroup();
		group.add( rdbtnNewRadioButton_1_1);
		group.add( rdbtnNewRadioButton_1_1_1);
		group.add( rdbtnNewRadioButton_1_1_2);
		
		JPanel panel_rightdown = new JPanel();
		panel_rightdown.setBounds(286, 110, 600, 503);
		frame.getContentPane().add(panel_rightdown);
		panel_rightdown.setBackground(new Color(162,203,246));
		panel_rightdown.setBorder(blackline);
		panel_rightdown.setLayout(null);
		
		JLabel resultatText1 = new JLabel("Des \u00E9tudiants avec leur retard");
		resultatText1.setForeground(new Color(21, 50, 207));
		resultatText1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		resultatText1.setBounds(20, 10, 428, 40);
		panel_rightdown.add(resultatText1);
		
		JLabel resultatText2 = new JLabel("Pr\u00E9nom NOM");
		resultatText2.setHorizontalAlignment(SwingConstants.CENTER);
		resultatText2.setForeground(new Color(21, 50, 207));
		resultatText2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		resultatText2.setBounds(20, 162, 120, 30);
		panel_rightdown.add(resultatText2);
		
		JLabel userLabel = new JLabel();
		userLabel.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
		userLabel.setBounds(20, 48, 120, 120);
		panel_rightdown.add(userLabel);
		
		JLabel col1_Label_1 = new JLabel("Semestre");
		col1_Label_1.setOpaque(true);
		col1_Label_1.setHorizontalAlignment(SwingConstants.CENTER);
		col1_Label_1.setForeground(new Color(21, 50, 207));
		col1_Label_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		col1_Label_1.setBackground(new Color(115, 175, 237));
		col1_Label_1.setBounds(151, 50, 150, 40);
		col1_Label_1.setBorder(blackline);
		panel_rightdown.add(col1_Label_1);
		
		JLabel col2_Label_1 = new JLabel("Cr\u00E9dits");
		col2_Label_1.setOpaque(true);
		col2_Label_1.setHorizontalAlignment(SwingConstants.CENTER);
		col2_Label_1.setForeground(new Color(21, 50, 207));
		col2_Label_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		col2_Label_1.setBackground(new Color(115, 175, 237));
		col2_Label_1.setBounds(301, 50, 124, 40);
		col2_Label_1.setBorder(blackline);
		panel_rightdown.add(col2_Label_1);
		

		
		JLabel row1_label1_1_1 = new JLabel("Autumn 2020");
		row1_label1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		row1_label1_1_1.setForeground(new Color(21, 50, 207));
		row1_label1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_label1_1_1.setBounds(151, 90, 150, 40);
		row1_label1_1_1.setBorder(blackline);
		panel_rightdown.add(row1_label1_1_1);
		
		JLabel row1_label2_1_1 = new JLabel("CS : 4/8");
		row1_label2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		row1_label2_1_1.setForeground(new Color(21, 50, 207));
		row1_label2_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_label2_1_1.setBounds(301, 90, 124, 40);
		row1_label2_1_1.setBorder(blackline);
		panel_rightdown.add(row1_label2_1_1);
		
		JLabel row1_label1_1_1_1 = new JLabel("Autumn 2020");
		row1_label1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		row1_label1_1_1_1.setForeground(new Color(21, 50, 207));
		row1_label1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_label1_1_1_1.setBounds(151, 130, 150, 40);
		row1_label1_1_1_1.setBorder(blackline);
		panel_rightdown.add(row1_label1_1_1_1);
		
		JLabel row1_label2_1_1_1 = new JLabel("TM : 6/8");
		row1_label2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		row1_label2_1_1_1.setForeground(new Color(21, 50, 207));
		row1_label2_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_label2_1_1_1.setBounds(301, 130, 124, 40);
		row1_label2_1_1_1.setBorder(blackline);
		panel_rightdown.add(row1_label2_1_1_1);
		
		JButton row1_button_2_1 = new JButton("Contactez-le");
		row1_button_2_1.setForeground(new Color(21, 50, 207));
		row1_button_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		row1_button_2_1.setBounds(440, 138, 150, 30);
		panel_rightdown.add(row1_button_2_1);
		
		JLabel userLabel_1 = new JLabel();
		userLabel_1.setBounds(20, 199, 120, 120);
		userLabel_1.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
		panel_rightdown.add(userLabel_1);
		
		JLabel col1_Label_1_1 = new JLabel("Semestre");
		col1_Label_1_1.setOpaque(true);
		col1_Label_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		col1_Label_1_1.setForeground(new Color(21, 50, 207));
		col1_Label_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		col1_Label_1_1.setBackground(new Color(115, 175, 237));
		col1_Label_1_1.setBounds(151, 201, 150, 40);
		col1_Label_1_1.setBorder(blackline);
		panel_rightdown.add(col1_Label_1_1);
		
		JLabel row1_label1_1_1_2 = new JLabel("Autumn 2020");
		row1_label1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		row1_label1_1_1_2.setForeground(new Color(21, 50, 207));
		row1_label1_1_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_label1_1_1_2.setBounds(151, 241, 150, 40);
		row1_label1_1_1_2.setBorder(blackline);
		panel_rightdown.add(row1_label1_1_1_2);
		
		JLabel col2_Label_1_1 = new JLabel("Cr\u00E9dits");
		col2_Label_1_1.setOpaque(true);
		col2_Label_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		col2_Label_1_1.setForeground(new Color(21, 50, 207));
		col2_Label_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		col2_Label_1_1.setBackground(new Color(115, 175, 237));
		col2_Label_1_1.setBounds(301, 201, 124, 40);
		col2_Label_1_1.setBorder(blackline);
		panel_rightdown.add(col2_Label_1_1);
		
		JLabel row1_label2_1_1_2 = new JLabel("CS : 4/8");
		row1_label2_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		row1_label2_1_1_2.setForeground(new Color(21, 50, 207));
		row1_label2_1_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_label2_1_1_2.setBounds(301, 241, 124, 40);
		row1_label2_1_1_2.setBorder(blackline);
		panel_rightdown.add(row1_label2_1_1_2);
		
		JLabel row1_label1_1_1_1_1 = new JLabel("Autumn 2020");
		row1_label1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		row1_label1_1_1_1_1.setForeground(new Color(21, 50, 207));
		row1_label1_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_label1_1_1_1_1.setBounds(151, 281, 150, 40);
		row1_label1_1_1_1_1.setBorder(blackline);
		panel_rightdown.add(row1_label1_1_1_1_1);
		
		JLabel row1_label2_1_1_1_1 = new JLabel("TM : 8/8");
		row1_label2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		row1_label2_1_1_1_1.setForeground(new Color(21, 50, 207));
		row1_label2_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_label2_1_1_1_1.setBounds(301, 281, 124, 40);
		row1_label2_1_1_1_1.setBorder(blackline);
		panel_rightdown.add(row1_label2_1_1_1_1);
		
		JLabel resultatText2_1 = new JLabel("Pr\u00E9nom NOM");
		resultatText2_1.setHorizontalAlignment(SwingConstants.CENTER);
		resultatText2_1.setForeground(new Color(21, 50, 207));
		resultatText2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		resultatText2_1.setBounds(20, 313, 120, 30);
		panel_rightdown.add(resultatText2_1);
		
		JLabel userLabel_2 = new JLabel();
		userLabel_2.setBounds(20, 349, 120, 120);
		userLabel_2.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
		panel_rightdown.add(userLabel_2);
		
		JLabel col1_Label_1_2 = new JLabel("Semestre");
		col1_Label_1_2.setOpaque(true);
		col1_Label_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		col1_Label_1_2.setForeground(new Color(21, 50, 207));
		col1_Label_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		col1_Label_1_2.setBackground(new Color(115, 175, 237));
		col1_Label_1_2.setBorder(blackline);
		col1_Label_1_2.setBounds(151, 351, 150, 40);
		panel_rightdown.add(col1_Label_1_2);
		
		JLabel row1_label1_1_1_3 = new JLabel("Autumn 2020");
		row1_label1_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		row1_label1_1_1_3.setForeground(new Color(21, 50, 207));
		row1_label1_1_1_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_label1_1_1_3.setBounds(151, 391, 150, 40);
		row1_label1_1_1_3.setBorder(blackline);
		panel_rightdown.add(row1_label1_1_1_3);
		
		JLabel col2_Label_1_2 = new JLabel("Cr\u00E9dits");
		col2_Label_1_2.setOpaque(true);
		col2_Label_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		col2_Label_1_2.setForeground(new Color(21, 50, 207));
		col2_Label_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		col2_Label_1_2.setBackground(new Color(115, 175, 237));
		col2_Label_1_2.setBounds(301, 351, 124, 40);
		col2_Label_1_2.setBorder(blackline);
		panel_rightdown.add(col2_Label_1_2);
		
		JLabel row1_label2_1_1_3 = new JLabel("CS : 6/8");
		row1_label2_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		row1_label2_1_1_3.setForeground(new Color(21, 50, 207));
		row1_label2_1_1_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_label2_1_1_3.setBounds(301, 391, 124, 40);
		row1_label2_1_1_3.setBorder(blackline);
		panel_rightdown.add(row1_label2_1_1_3);
		
		JLabel row1_label1_1_1_1_2 = new JLabel("Autumn 2020");
		row1_label1_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		row1_label1_1_1_1_2.setForeground(new Color(21, 50, 207));
		row1_label1_1_1_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_label1_1_1_1_2.setBounds(151, 431, 150, 40);
		row1_label1_1_1_1_2.setBorder(blackline);
		panel_rightdown.add(row1_label1_1_1_1_2);
		
		JLabel row1_label2_1_1_1_2 = new JLabel("TM : 6/8");
		row1_label2_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		row1_label2_1_1_1_2.setForeground(new Color(21, 50, 207));
		row1_label2_1_1_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_label2_1_1_1_2.setBounds(301, 431, 124, 40);
		row1_label2_1_1_1_2.setBorder(blackline);
		panel_rightdown.add(row1_label2_1_1_1_2);
		
		JLabel resultatText2_2 = new JLabel("Pr\u00E9nom NOM");
		resultatText2_2.setHorizontalAlignment(SwingConstants.CENTER);
		resultatText2_2.setForeground(new Color(21, 50, 207));
		resultatText2_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		resultatText2_2.setBounds(20, 463, 120, 30);
		panel_rightdown.add(resultatText2_2);
		
		JButton row1_button_2_1_1 = new JButton("Contactez-le");
		row1_button_2_1_1.setForeground(new Color(21, 50, 207));
		row1_button_2_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		row1_button_2_1_1.setBounds(440, 289, 150, 30);
		panel_rightdown.add(row1_button_2_1_1);
		
		JButton row1_button_2_1_2 = new JButton("Contactez-le");
		row1_button_2_1_2.setForeground(new Color(21, 50, 207));
		row1_button_2_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		row1_button_2_1_2.setBounds(440, 439, 150, 30);
		panel_rightdown.add(row1_button_2_1_2);

		rdbtnNewRadioButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultatText1.setText("Des ¨¦tudiants avec leur retard");
				row1_label2_1_1.setText("CS : 4/8");
				row1_label2_1_1_1.setText("TM : 6/8");
				row1_label2_1_1_2.setText("CS : 4/8");
				row1_label2_1_1_1_1.setText("TM : 8/8");
				row1_label2_1_1_3.setText("CS : 6/8");
				row1_label2_1_1_1_1.setText("TM : 6/8");
			}
		});

		rdbtnNewRadioButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultatText1.setText("Des ¨¦tudiants dont le retard est critique");
				row1_label2_1_1.setText("CS : 0/8");
				row1_label2_1_1_1.setText("TM : 0/8");
				row1_label2_1_1_2.setText("CS : 0/8");
				row1_label2_1_1_1_1.setText("TM : 0/8");
				row1_label2_1_1_3.setText("CS : 0/8");
				row1_label2_1_1_1_1.setText("TM : 0/8");
				
				
			}
		});

		rdbtnNewRadioButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultatText1.setText("Des ¨¦tudiants candidats ¨¤ l'excellence");
				row1_label2_1_1.setText("CS : 8/8");
				row1_label2_1_1_1.setText("TM : 8/8");
				row1_label2_1_1_2.setText("CS : 8/8");
				row1_label2_1_1_1_1.setText("TM : 8/8");
				row1_label2_1_1_3.setText("CS : 8/8");
				row1_label2_1_1_1_1.setText("TM : 8/8");
			}
		});
	}
}
