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
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import common.DataBase;
import common.Person;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gestion_des_enseignants {

	private JFrame frame;
	private JTextField textField;
	private DataBase database;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					gestion_des_enseignants window = new gestion_des_enseignants();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	public void run() {
		try {
			gestion_des_enseignants window = new gestion_des_enseignants();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public gestion_des_enseignants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initDataBase() {
		Person person1 = new Person(1, "Taojun", "Wang","1234556666","taojun.wang@utt.fr","Taojun Wang","Professeur",new String[] {"LO12", "EG23", "LO02"} ,"80","1 Sept. 2017");
		Person person2 = new Person(2, "Zhengyang", "Su","9888888888","zhengyang.su@utt.fr","Zhengyang Su","Contractuel",new String[] {"LO14", "LO12", "LO02"} ,"40","16 Sept. 2017");
		
		this.database = new DataBase(person1 ,person2);
	}
	private void initialize() {
		
		initDataBase();
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
		
		JLabel titreLabel = new JLabel("Gestion des enseignants");
		titreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titreLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		titreLabel.setForeground(new Color(21, 50, 207));
		titreLabel.setOpaque(true);
		titreLabel.setBackground(new Color(115, 175, 237));
		titreLabel.setBounds(243, 30, 400, 50);
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
		
		textField = new JTextField();
		textField.setBounds(10, 49, 160, 29);
		panel_left.add(textField);
		textField.setColumns(10);
		
		JLabel chercheText = new JLabel("Qui recherchez-vous?");
		chercheText.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		chercheText.setHorizontalAlignment(SwingConstants.CENTER);
		chercheText.setBounds(10, 10, 268, 30);
		chercheText.setForeground(new Color(21, 50, 207));
		
		panel_left.add(chercheText);
		
		JLabel col1_Label = new JLabel("Pr\u00E9nom");
		col1_Label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		col1_Label.setHorizontalAlignment(SwingConstants.CENTER);
		col1_Label.setBounds(10, 90, 80, 40);
		col1_Label.setForeground(new Color(21, 50, 207));
		col1_Label.setOpaque(true);
		col1_Label.setBackground(new Color(115, 175, 237));
		panel_left.add(col1_Label);
		col1_Label.setBorder(blackline);
		
		JLabel col2_Label = new JLabel("Nom");
		col2_Label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		col2_Label.setHorizontalAlignment(SwingConstants.CENTER);
		col2_Label.setBounds(90, 90, 80, 40);
		col2_Label.setForeground(new Color(21, 50, 207));
		col2_Label.setOpaque(true);
		col2_Label.setBackground(new Color(115, 175, 237));
		panel_left.add(col2_Label);
		col2_Label.setBorder(blackline);
		
		JLabel col3_Label = new JLabel("Choix");
		col3_Label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		col3_Label.setHorizontalAlignment(SwingConstants.CENTER);
		col3_Label.setBounds(170, 90, 108, 40);
		col3_Label.setForeground(new Color(21, 50, 207));
		col3_Label.setOpaque(true);
		col3_Label.setBackground(new Color(115, 175, 237));
		panel_left.add(col3_Label);
		col3_Label.setBorder(blackline);
		
		//les datas et choisir button
		JLabel row1_label1 = new JLabel("Pr\u00E9nom1");
		row1_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row1_label1.setForeground(new Color(21, 50, 207));
		row1_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_label1.setBounds(10, 130, 80, 40);
		panel_left.add(row1_label1);
		row1_label1.setBorder(blackline);
		
		JLabel row1_label2 = new JLabel("Nom1");
		row1_label2.setHorizontalAlignment(SwingConstants.CENTER);
		row1_label2.setForeground(new Color(21, 50, 207));
		row1_label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_label2.setBounds(90, 130, 80, 40);
		panel_left.add(row1_label2);
		row1_label2.setBorder(blackline);
		
		JLabel row2_label1 = new JLabel("Pr\u00E9nom2");
		row2_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row2_label1.setForeground(new Color(21, 50, 207));
		row2_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row2_label1.setBounds(10, 170, 80, 40);
		panel_left.add(row2_label1);
		row2_label1.setBorder(blackline);
		
		JLabel row2_label2 = new JLabel("Nom2");
		row2_label2.setHorizontalAlignment(SwingConstants.CENTER);
		row2_label2.setForeground(new Color(21, 50, 207));
		row2_label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row2_label2.setBounds(90, 170, 80, 40);
		panel_left.add(row2_label2);
		row2_label2.setBorder(blackline);
		
		JLabel row3_label1 = new JLabel("Pr\u00E9nom3");
		row3_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row3_label1.setForeground(new Color(21, 50, 207));
		row3_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row3_label1.setBounds(10, 210, 80, 40);
		panel_left.add(row3_label1);
		row3_label1.setBorder(blackline);
		
		JLabel row3_label2 = new JLabel("Nom3");
		row3_label2.setHorizontalAlignment(SwingConstants.CENTER);
		row3_label2.setForeground(new Color(21, 50, 207));
		row3_label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row3_label2.setBounds(90, 210, 80, 40);
		panel_left.add(row3_label2);
		row3_label2.setBorder(blackline);
		
		JLabel row4_label1 = new JLabel("Pr\u00E9nom4");
		row4_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row4_label1.setForeground(new Color(21, 50, 207));
		row4_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row4_label1.setBounds(10, 250, 80, 40);
		panel_left.add(row4_label1);
		row4_label1.setBorder(blackline);
		
		JLabel row4_label2 = new JLabel("Nom4");
		row4_label2.setHorizontalAlignment(SwingConstants.CENTER);
		row4_label2.setForeground(new Color(21, 50, 207));
		row4_label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row4_label2.setBounds(90, 250, 80, 40);
		panel_left.add(row4_label2);
		row4_label2.setBorder(blackline);
		
		JLabel row5_label1 = new JLabel("Pr\u00E9nom5");
		row5_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row5_label1.setForeground(new Color(21, 50, 207));
		row5_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row5_label1.setBounds(10, 290, 80, 40);
		panel_left.add(row5_label1);
		row5_label1.setBorder(blackline);
		
		JLabel row5_label2 = new JLabel("Nom5");
		row5_label2.setHorizontalAlignment(SwingConstants.CENTER);
		row5_label2.setForeground(new Color(21, 50, 207));
		row5_label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row5_label2.setBounds(90, 290, 80, 40);
		panel_left.add(row5_label2);
		row5_label2.setBorder(blackline);
		
		JLabel row6_label1 = new JLabel("Pr\u00E9nom6");
		row6_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row6_label1.setForeground(new Color(21, 50, 207));
		row6_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row6_label1.setBounds(10, 330, 80, 40);
		panel_left.add(row6_label1);
		row6_label1.setBorder(blackline);
		
		JLabel row6_label2 = new JLabel("Nom6");
		row6_label2.setHorizontalAlignment(SwingConstants.CENTER);
		row6_label2.setForeground(new Color(21, 50, 207));
		row6_label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row6_label2.setBounds(90, 330, 80, 40);
		panel_left.add(row6_label2);
		row6_label2.setBorder(blackline);
		
		JLabel row7_label1 = new JLabel("Pr\u00E9nom7");
		row7_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row7_label1.setForeground(new Color(21, 50, 207));
		row7_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row7_label1.setBounds(10, 370, 80, 40);
		panel_left.add(row7_label1);
		row7_label1.setBorder(blackline);
		
		JLabel row7_label2 = new JLabel("Nom7");
		row7_label2.setHorizontalAlignment(SwingConstants.CENTER);
		row7_label2.setForeground(new Color(21, 50, 207));
		row7_label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row7_label2.setBounds(90, 370, 80, 40);
		panel_left.add(row7_label2);
		row7_label2.setBorder(blackline);
		
		JLabel row8_label1 = new JLabel("Pr\u00E9nom8");
		row8_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row8_label1.setForeground(new Color(21, 50, 207));
		row8_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row8_label1.setBounds(10, 410, 80, 40);
		panel_left.add(row8_label1);
		row8_label1.setBorder(blackline);
		
		JLabel row8_label2 = new JLabel("Nom8");
		row8_label2.setHorizontalAlignment(SwingConstants.CENTER);
		row8_label2.setForeground(new Color(21, 50, 207));
		row8_label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row8_label2.setBounds(90, 410, 80, 40);
		panel_left.add(row8_label2);
		row8_label2.setBorder(blackline);
		
		JButton row1_button_3 = new JButton("Enter");
		row1_button_3.setForeground(new Color(21, 50, 207));
		row1_button_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_button_3.setBounds(180, 49, 98, 29);
		panel_left.add(row1_button_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(blackline);
		panel_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel_1.setBounds(170, 130, 108, 40);
		panel_left.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("");
		rdbtnNewRadioButton_1_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNewRadioButton_1_1.setBounds(41, 10, 21, 21);
		rdbtnNewRadioButton_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(rdbtnNewRadioButton_1_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(blackline);
		panel_1_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel_1_1.setBounds(170, 170, 108, 40);
		panel_left.add(panel_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton();
		rdbtnNewRadioButton_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_1_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNewRadioButton_1_1_1.setBounds(41, 10, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_1_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(blackline);
		panel_1_2.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel_1_2.setBounds(170, 210, 108, 40);
		panel_left.add(panel_1_2);
		
		JRadioButton rdbtnNewRadioButton_1_1_2 = new JRadioButton("");
		rdbtnNewRadioButton_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_1_2.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNewRadioButton_1_1_2.setBounds(41, 10, 21, 21);
		panel_1_2.add(rdbtnNewRadioButton_1_1_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(blackline);
		panel_1_3.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel_1_3.setBounds(170, 250, 108, 40);
		panel_left.add(panel_1_3);
		
		JRadioButton rdbtnNewRadioButton_1_1_3 = new JRadioButton("");
		rdbtnNewRadioButton_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_1_3.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNewRadioButton_1_1_3.setBounds(41, 10, 21, 21);
		panel_1_3.add(rdbtnNewRadioButton_1_1_3);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBorder(blackline);
		panel_1_4.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel_1_4.setBounds(170, 290, 108, 40);
		panel_left.add(panel_1_4);
		
		JRadioButton rdbtnNewRadioButton_1_1_4 = new JRadioButton("");
		rdbtnNewRadioButton_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_1_4.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNewRadioButton_1_1_4.setBounds(41, 10, 21, 21);
		panel_1_4.add(rdbtnNewRadioButton_1_1_4);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setLayout(null);
		panel_1_5.setBorder(blackline);
		panel_1_5.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel_1_5.setBounds(170, 330, 108, 40);
		panel_left.add(panel_1_5);
		
		JRadioButton rdbtnNewRadioButton_1_1_5 = new JRadioButton("");
		rdbtnNewRadioButton_1_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_1_5.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNewRadioButton_1_1_5.setBounds(41, 10, 21, 21);
		panel_1_5.add(rdbtnNewRadioButton_1_1_5);
		
		JPanel panel_1_6 = new JPanel();
		panel_1_6.setLayout(null);
		panel_1_6.setBorder(blackline);
		panel_1_6.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel_1_6.setBounds(170, 370, 108, 40);
		panel_left.add(panel_1_6);
		
		JRadioButton rdbtnNewRadioButton_1_1_6 = new JRadioButton("");
		rdbtnNewRadioButton_1_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_1_6.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNewRadioButton_1_1_6.setBounds(41, 10, 21, 21);
		panel_1_6.add(rdbtnNewRadioButton_1_1_6);
		
		JPanel panel_1_7 = new JPanel();
		panel_1_7.setLayout(null);
		panel_1_7.setBorder(blackline);
		panel_1_7.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel_1_7.setBounds(170, 410, 108, 40);
		panel_left.add(panel_1_7);
		

		JRadioButton rdbtnNewRadioButton_1_1_7 = new JRadioButton();
		rdbtnNewRadioButton_1_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_1_7.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNewRadioButton_1_1_7.setBounds(41, 10, 21, 21);
		panel_1_7.add(rdbtnNewRadioButton_1_1_7);
		
		ButtonGroup group = new ButtonGroup();
		group.add( rdbtnNewRadioButton_1_1);
		group.add( rdbtnNewRadioButton_1_1_1);
		group.add( rdbtnNewRadioButton_1_1_2);
		group.add( rdbtnNewRadioButton_1_1_3);
		group.add( rdbtnNewRadioButton_1_1_4);
		group.add( rdbtnNewRadioButton_1_1_5);
		group.add( rdbtnNewRadioButton_1_1_6);
		group.add( rdbtnNewRadioButton_1_1_7);
		
		JPanel panel_rightdown = new JPanel();
		panel_rightdown.setBounds(286, 260, 600, 353);
		frame.getContentPane().add(panel_rightdown);
		panel_rightdown.setBackground(new Color(162,203,246));
		panel_rightdown.setBorder(blackline);
		panel_rightdown.setLayout(null);
		
		JLabel resultatText1 = new JLabel("Types de l\u2019enseignant : ");
		resultatText1.setForeground(new Color(21, 50, 207));
		resultatText1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		resultatText1.setBounds(25, 25, 275, 55);
		panel_rightdown.add(resultatText1);
		
		JLabel typeLabel = new JLabel("Professeur");
		typeLabel.setForeground(new Color(21, 50, 207));
		typeLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		typeLabel.setBounds(330, 25, 210, 55);
		panel_rightdown.add(typeLabel);
		
		JLabel resultatText2 = new JLabel("Liste des UEs : ");
		resultatText2.setForeground(new Color(21, 50, 207));
		resultatText2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		resultatText2.setBounds(25, 115, 275, 55);
		panel_rightdown.add(resultatText2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"LO12", "EG23", "LO02"}));
		comboBox.setForeground(new Color(21, 50, 207));
		comboBox.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		comboBox.setBounds(330, 115, 210, 55);
		panel_rightdown.add(comboBox);
		
		JLabel resultatText3 = new JLabel("Nombre d\u2019heures suppl\u00E9mentaires : ");
		resultatText3.setForeground(new Color(21, 50, 207));
		resultatText3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		resultatText3.setBounds(25, 190, 275, 55);
		panel_rightdown.add(resultatText3);
		
		JLabel resultatText3_1 = new JLabel();
		resultatText3_1.setText("(les 5 derni\u00E8res ann\u00E9es)");
		resultatText3_1.setForeground(new Color(21, 50, 207));
		resultatText3_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		resultatText3_1.setBounds(25, 210, 275, 55);
		panel_rightdown.add(resultatText3_1);
		
		JLabel heureLabel = new JLabel("40h");
		heureLabel.setForeground(new Color(21, 50, 207));
		heureLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		heureLabel.setBounds(330, 190, 210, 55);
		panel_rightdown.add(heureLabel);
		
		JLabel resultatText4 = new JLabel("Date d\u2019entr\u00E9e dans le d\u00E9partement  : ");
		resultatText4.setForeground(new Color(21, 50, 207));
		resultatText4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		resultatText4.setBounds(25, 295, 275, 55);
		panel_rightdown.add(resultatText4);
		
		JLabel dateLabel = new JLabel("1 Sept. 2017");
		dateLabel.setForeground(new Color(21, 50, 207));
		dateLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		dateLabel.setBounds(330, 295, 210, 55);
		panel_rightdown.add(dateLabel);
		
		
		JPanel panel_righttop = new JPanel();
		panel_righttop.setBounds(286, 110, 600, 152);
		frame.getContentPane().add(panel_righttop);
		panel_righttop.setBackground(new Color(162,203,246));
		panel_righttop.setBorder(blackline);
		panel_righttop.setLayout(null);
		
		JLabel userLabel = new JLabel();
		userLabel.setBounds(30, 15, 120, 120);
		userLabel.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
		panel_righttop.add(userLabel);
		
		JLabel nameLabel = new JLabel("Pr\u00E9nom NOM");
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		nameLabel.setForeground(new Color(21, 50, 207));
		nameLabel.setBounds(171, 30, 250, 40);
		panel_righttop.add(nameLabel);
		
		JLabel telLabel = new JLabel("T\u00E9l : 06 23 12 07 03");
		telLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		telLabel.setHorizontalAlignment(SwingConstants.CENTER);
		telLabel.setForeground(new Color(21, 50, 207));
		telLabel.setBounds(171, 80, 150, 30);
		panel_righttop.add(telLabel);
		
		JLabel mailLabel = new JLabel("Email : prenom.nom@utt.fr");
		mailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mailLabel.setForeground(new Color(21, 50, 207));
		mailLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		mailLabel.setBounds(331, 80, 195, 30);
		panel_righttop.add(mailLabel);
		
		JButton row1_button_1 = new JButton("Contactez-le");
		row1_button_1.setForeground(new Color(21, 50, 207));
		row1_button_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_button_1.setBounds(171, 113, 170, 29);
		panel_righttop.add(row1_button_1);
		
		//reflect
		rdbtnNewRadioButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Person person0 = database.getPerson(0);
				nameLabel.setText(person0.nameLabel);
				telLabel.setText(person0.telLabel);
				mailLabel.setText(person0.mailLabel);
				typeLabel.setText(person0.typeLabel);
				heureLabel.setText(person0.heure);
				dateLabel.setText(person0.date);
				comboBox.setModel(new DefaultComboBoxModel(person0.ues));
			}
		});
		
		rdbtnNewRadioButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Person person = database.getPerson(1);
				nameLabel.setText(person.nameLabel);
				telLabel.setText(person.telLabel);
				mailLabel.setText(person.mailLabel);
				typeLabel.setText(person.typeLabel);
				heureLabel.setText(person.heure);
				dateLabel.setText(person.date);
				comboBox.setModel(new DefaultComboBoxModel(person.ues));
				
			}
		});
		
		
	}
	
}
