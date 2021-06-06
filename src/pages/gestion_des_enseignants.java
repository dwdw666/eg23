package pages;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class gestion_des_enseignants {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gestion_des_enseignants window = new gestion_des_enseignants();
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
	public gestion_des_enseignants() {
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
		textField.setBounds(10, 49, 268, 29);
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
		
		JButton row1_button = new JButton("Choisir");
		row1_button.setBounds(170, 130, 108, 40);
		row1_button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_button.setForeground(new Color(21, 50, 207));
		panel_left.add(row1_button);
		
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
		
		JButton row2_button = new JButton("Choisir");
		row2_button.setBounds(170, 170, 108, 40);
		row2_button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row2_button.setForeground(new Color(21, 50, 207));
		panel_left.add(row2_button);
		
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
		
		JButton row3_button = new JButton("Choisir");
		row3_button.setBounds(170, 210, 108, 40);
		row3_button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row3_button.setForeground(new Color(21, 50, 207));
		panel_left.add(row3_button);
		
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
		
		JButton row4_button = new JButton("Choisir");
		row4_button.setBounds(170, 250, 108, 40);
		row4_button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row4_button.setForeground(new Color(21, 50, 207));
		panel_left.add(row4_button);
		
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
		
		JButton row5_button = new JButton("Choisir");
		row5_button.setBounds(170, 290, 108, 40);
		row5_button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row5_button.setForeground(new Color(21, 50, 207));
		panel_left.add(row5_button);
		
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
		
		JButton row6_button = new JButton("Choisir");
		row6_button.setBounds(170, 330, 108, 40);
		row6_button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row6_button.setForeground(new Color(21, 50, 207));
		panel_left.add(row6_button);
		
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
		
		JButton row7_button = new JButton("Choisir");
		row7_button.setBounds(170, 370, 108, 40);
		row7_button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row7_button.setForeground(new Color(21, 50, 207));
		panel_left.add(row7_button);
		
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
		
		JButton row8_button = new JButton("Choisir");
		row8_button.setBounds(170, 410, 108, 40);
		row8_button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row8_button.setForeground(new Color(21, 50, 207));
		panel_left.add(row8_button);

		
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
		
		JLabel resultatText1_1 = new JLabel("Professeur");
		resultatText1_1.setForeground(new Color(21, 50, 207));
		resultatText1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		resultatText1_1.setBounds(330, 25, 210, 55);
		panel_rightdown.add(resultatText1_1);
		
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
		
		JLabel resultatText3_2 = new JLabel("40h");
		resultatText3_2.setForeground(new Color(21, 50, 207));
		resultatText3_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		resultatText3_2.setBounds(330, 190, 210, 55);
		panel_rightdown.add(resultatText3_2);
		
		JLabel resultatText4 = new JLabel("Date d\u2019entr\u00E9e dans le d\u00E9partement  : ");
		resultatText4.setForeground(new Color(21, 50, 207));
		resultatText4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		resultatText4.setBounds(25, 295, 275, 55);
		panel_rightdown.add(resultatText4);
		
		JLabel resultatText4_2 = new JLabel("1 Sept. 2017");
		resultatText4_2.setForeground(new Color(21, 50, 207));
		resultatText4_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		resultatText4_2.setBounds(330, 295, 210, 55);
		panel_rightdown.add(resultatText4_2);
		
		
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
		nameLabel.setBounds(170, 40, 195, 40);
		panel_righttop.add(nameLabel);
		
		JLabel telLabel = new JLabel("T\u00E9l : 06 23 12 07 03");
		telLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		telLabel.setHorizontalAlignment(SwingConstants.CENTER);
		telLabel.setForeground(new Color(21, 50, 207));
		telLabel.setBounds(170, 90, 150, 30);
		panel_righttop.add(telLabel);
		
		JLabel mailLabel = new JLabel("Email : prenom.nom@utt.fr");
		mailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mailLabel.setForeground(new Color(21, 50, 207));
		mailLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		mailLabel.setBounds(330, 90, 195, 30);
		panel_righttop.add(mailLabel);
		
		JButton row1_button_1 = new JButton("Contactez-le");
		row1_button_1.setForeground(new Color(21, 50, 207));
		row1_button_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		row1_button_1.setBounds(375, 40, 150, 40);
		panel_righttop.add(row1_button_1);
	}
}
