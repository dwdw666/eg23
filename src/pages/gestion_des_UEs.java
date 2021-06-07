package pages;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import common.DataBase;
import common.Frame_warnning;
import common.LinkLabel;
import common.Person;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gestion_des_UEs {

	private JFrame frame;
	private DataBase database;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					gestion_des_UEs window = new gestion_des_UEs();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	public void run() {
		try {
			gestion_des_UEs window = new gestion_des_UEs();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public gestion_des_UEs() {
		initialize();
	}
	public void initDataBase() {
		Person person1 = new Person(1, "Taojun", "Wang","Tel : 12 34 55 66 66","Email : taojun.wang@utt.fr","Taojun Wang","Professeur",new String[] {"LO12", "EG23", "LO02"} ,"80","1 Sept. 2017","LO02");
		Person person2 = new Person(2, "Zhengyang", "Su","Tel : 98 88 88 88 88","Email : zhengyang.su@utt.fr","Zhengyang Su","Contractuel",new String[] {"NF16", "LO12", "LO02"} ,"40","16 Sept. 2017","NF16");
		Person person3 = new Person(3, "San", "Zhang","Tel : 16 88 88 88 88","Email : zhengyang.su@utt.fr","San Zhang","Contractuel",new String[] {"LO14", "LO07", "LO02"} ,"60","20 Sept. 2015","LO14");
		Person person4 = new Person(4, "Si", "Li","Tel : 18 67 49 60 74","Email : si.li@utt.fr","Si Li","Professeur",new String[] {"EG23", "IF29", "GL02"} ,"40","1 Fev. 2018","EG23");
		Person person5 = new Person(5, "Wu", "Wang","Tel : 28 75 73 92 75","Email : wang.wu@utt.fr","Wu Wang","Prag",new String[] {"LO12", "NF16", "IF29"} ,"10","1 Sept. 2020","LO12");
		Person person6 = new Person(6, "Liu", "Xiao","Tel : 27 58 96 27 86","Email : liu.xiao@utt.fr","Liu Xiao","Contractuel",new String[] {"IF29", "EG23", "LO12"} ,"50","13 Fev. 2016","IF29");
		Person person7 = new Person(7, "Qiang", "Xu","Tel : 17 84 95 37 59","Email : qiang.xu@utt.fr","Qiang Xu","Professeur",new String[] {"LO07", "NF16", "LO14"} ,"40","11 Sept. 2017","LO07");
		Person person8 = new Person(8, "Wei", "Zhang","Tel : 16 94 73 58 16","Email : wei.zhang@utt.fr","Wei Zhang","Contractuel",new String[] {"GL02", "LO12", "IF29"} ,"5","16 Sept. 2020","GL02");
		this.database = new DataBase(person1 ,person2, person3, person4, person5, person6, person7, person8);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		initDataBase();
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
		
		JLabel titreLabel = new JLabel("Gestion des UEs");
		titreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titreLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		titreLabel.setForeground(new Color(21, 50, 207));
		titreLabel.setOpaque(true);
		titreLabel.setBackground(new Color(115, 175, 237));
		titreLabel.setBounds(243, 30, 400, 50);
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
		row1_button_2.setBounds(700, 40, 140, 35);
		panel.add(row1_button_2);
		
		JPanel panel_left = new JPanel();
		panel_left.setBounds(0, 110, 239, 503);
		frame.getContentPane().add(panel_left);
		panel_left.setBackground(new Color(162,203,246));
		panel_left.setBorder(blackline);
		panel_left.setLayout(null);
		
		JLabel col1_Label = new JLabel("UEs");
		col1_Label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		col1_Label.setHorizontalAlignment(SwingConstants.CENTER);
		col1_Label.setBounds(10, 10, 110, 40);
		col1_Label.setForeground(new Color(21, 50, 207));
		col1_Label.setOpaque(true);
		col1_Label.setBackground(new Color(115, 175, 237));
		panel_left.add(col1_Label);
		col1_Label.setBorder(blackline);
		
		JLabel col3_Label = new JLabel("Choix");
		col3_Label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		col3_Label.setHorizontalAlignment(SwingConstants.CENTER);
		col3_Label.setBounds(118, 10, 108, 40);
		col3_Label.setForeground(new Color(21, 50, 207));
		col3_Label.setOpaque(true);
		col3_Label.setBackground(new Color(115, 175, 237));
		panel_left.add(col3_Label);
		col3_Label.setBorder(blackline);
		
		//les datas et choisir button
		JLabel row1_label1 = new JLabel("LO02");
		row1_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row1_label1.setForeground(new Color(21, 50, 207));
		row1_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_label1.setBounds(10, 50, 110, 40);
		panel_left.add(row1_label1);
		row1_label1.setBorder(blackline);
		
		JLabel row2_label1 = new JLabel("NF16");
		row2_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row2_label1.setForeground(new Color(21, 50, 207));
		row2_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row2_label1.setBounds(10, 90, 110, 40);
		panel_left.add(row2_label1);
		row2_label1.setBorder(blackline);
		
		JLabel row3_label1 = new JLabel("LO14");
		row3_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row3_label1.setForeground(new Color(21, 50, 207));
		row3_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row3_label1.setBounds(10, 130, 110, 40);
		panel_left.add(row3_label1);
		row3_label1.setBorder(blackline);
		
		JLabel row4_label1 = new JLabel("EG23");
		row4_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row4_label1.setForeground(new Color(21, 50, 207));
		row4_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row4_label1.setBounds(10, 170, 110, 40);
		panel_left.add(row4_label1);
		row4_label1.setBorder(blackline);
		
		JLabel row5_label1 = new JLabel("LO12");
		row5_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row5_label1.setForeground(new Color(21, 50, 207));
		row5_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row5_label1.setBounds(10, 210, 110, 40);
		panel_left.add(row5_label1);
		row5_label1.setBorder(blackline);
		
		JLabel row6_label1 = new JLabel("IF29");
		row6_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row6_label1.setForeground(new Color(21, 50, 207));
		row6_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row6_label1.setBounds(10, 250, 110, 40);
		panel_left.add(row6_label1);
		row6_label1.setBorder(blackline);
		
		JLabel row7_label1 = new JLabel("LO07");
		row7_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row7_label1.setForeground(new Color(21, 50, 207));
		row7_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row7_label1.setBounds(10, 290, 110, 40);
		panel_left.add(row7_label1);
		row7_label1.setBorder(blackline);
		
		JLabel row8_label1 = new JLabel("GL02");
		row8_label1.setHorizontalAlignment(SwingConstants.CENTER);
		row8_label1.setForeground(new Color(21, 50, 207));
		row8_label1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row8_label1.setBounds(10, 330, 110, 40);
		panel_left.add(row8_label1);
		row8_label1.setBorder(blackline);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(blackline);
		panel_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel_1.setBounds(118, 50, 108, 40);
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
		panel_1_1.setBounds(118, 90, 108, 40);
		panel_left.add(panel_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("");
		rdbtnNewRadioButton_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_1_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNewRadioButton_1_1_1.setBounds(41, 10, 21, 21);
		panel_1_1.add(rdbtnNewRadioButton_1_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(blackline);
		panel_1_2.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel_1_2.setBounds(118, 130, 108, 40);
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
		panel_1_3.setBounds(118, 170, 108, 40);
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
		panel_1_4.setBounds(118, 210, 108, 40);
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
		panel_1_5.setBounds(118, 250, 108, 40);
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
		panel_1_6.setBounds(118, 290, 108, 40);
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
		panel_1_7.setBounds(118, 330, 108, 40);
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
		panel_rightdown.setBounds(237, 260, 649, 353);
		frame.getContentPane().add(panel_rightdown);
		panel_rightdown.setBackground(new Color(162,203,246));
		panel_rightdown.setBorder(blackline);
		panel_rightdown.setLayout(null);
		
		
		JPanel panel_righttop = new JPanel();
		panel_righttop.setBounds(237, 110, 649, 152);
		frame.getContentPane().add(panel_righttop);
		panel_righttop.setBackground(new Color(162,203,246));
		panel_righttop.setBorder(blackline);
		panel_righttop.setLayout(null);
		
		JLabel userLabel = new JLabel();
		userLabel.setBounds(30, 15, 120, 120);
		userLabel.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
		panel_righttop.add(userLabel);
		
		JLabel nameLabel = new JLabel("Taojun Wang");
		nameLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		nameLabel.setForeground(new Color(21, 50, 207));
		nameLabel.setBounds(170, 50, 252, 40);
		panel_righttop.add(nameLabel);
		
		JLabel telLabel = new JLabel("Tel : 12 34 55 66 66");
		telLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		telLabel.setHorizontalAlignment(SwingConstants.CENTER);
		telLabel.setForeground(new Color(21, 50, 207));
		telLabel.setBounds(170, 90, 150, 30);
		panel_righttop.add(telLabel);
		
		JLabel mailLabel = new JLabel("Email : taojun.wang@utt.fr");
		mailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mailLabel.setForeground(new Color(21, 50, 207));
		mailLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		mailLabel.setBounds(330, 90, 195, 30);
		panel_righttop.add(mailLabel);
		
		JButton row1_button_1 = new JButton("Contactez-le");
		row1_button_1.setForeground(new Color(21, 50, 207));
		row1_button_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_button_1.setBounds(446, 50, 150, 40);
		panel_righttop.add(row1_button_1);
		
		JLabel lblResponsable = new JLabel("Responsable de LO02");
		lblResponsable.setForeground(new Color(21, 50, 207));
		lblResponsable.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblResponsable.setBounds(170, 15, 210, 30);
		panel_righttop.add(lblResponsable);

		rdbtnNewRadioButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Person person = database.getPerson(1);
				nameLabel.setText(person.nameLabel);
				telLabel.setText(person.telLabel);
				mailLabel.setText(person.mailLabel);
				lblResponsable.setText("Responsable de "+person.departement);
			}
		});
		rdbtnNewRadioButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Person person = database.getPerson(2);
				nameLabel.setText(person.nameLabel);
				telLabel.setText(person.telLabel);
				mailLabel.setText(person.mailLabel);
				lblResponsable.setText("Responsable de "+person.departement);
			}
		});
		rdbtnNewRadioButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Person person = database.getPerson(3);
				nameLabel.setText(person.nameLabel);
				telLabel.setText(person.telLabel);
				mailLabel.setText(person.mailLabel);
				lblResponsable.setText("Responsable de "+person.departement);
			}
		});
		rdbtnNewRadioButton_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Person person = database.getPerson(4);
				nameLabel.setText(person.nameLabel);
				telLabel.setText(person.telLabel);
				mailLabel.setText(person.mailLabel);
				lblResponsable.setText("Responsable de "+person.departement);
			}
		});
		rdbtnNewRadioButton_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Person person = database.getPerson(5);
				nameLabel.setText(person.nameLabel);
				telLabel.setText(person.telLabel);
				mailLabel.setText(person.mailLabel);
				lblResponsable.setText("Responsable de "+person.departement);
			}
		});
		rdbtnNewRadioButton_1_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Person person = database.getPerson(6);
				nameLabel.setText(person.nameLabel);
				telLabel.setText(person.telLabel);
				mailLabel.setText(person.mailLabel);
				lblResponsable.setText("Responsable de "+person.departement);
			}
		});
		rdbtnNewRadioButton_1_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Person person = database.getPerson(7);
				nameLabel.setText(person.nameLabel);
				telLabel.setText(person.telLabel);
				mailLabel.setText(person.mailLabel);
				lblResponsable.setText("Responsable de "+person.departement);
			}
		});
		rdbtnNewRadioButton_1_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Person person = database.getPerson(8);
				nameLabel.setText(person.nameLabel);
				telLabel.setText(person.telLabel);
				mailLabel.setText(person.mailLabel);
				lblResponsable.setText("Responsable de "+person.departement);
			}
		});
	}
}
