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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import common.Frame_warnning;
import common.LinkLabel;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class repartition_des_etudiants {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					repartition_des_etudiants window = new repartition_des_etudiants();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	public void run() {
		try {
			repartition_des_etudiants window = new repartition_des_etudiants();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public repartition_des_etudiants() {
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
		((Frame_warnning) frame).addListener(); //add close warnning  
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 0, 886, 110);
		frame.getContentPane().add(panel);
		panel.setBackground(new Color(162,203,246));
		panel.setLayout(null);
		panel.setBorder(blackline);
		
		JLabel titreLabel = new JLabel("R¨¦partition des ¨¦tudiants");
		titreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titreLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		titreLabel.setForeground(new Color(21, 50, 207));
		titreLabel.setOpaque(true);
		titreLabel.setBackground(new Color(115, 175, 237));
		titreLabel.setBounds(244, 31, 400, 40);
		panel.add(titreLabel);
		titreLabel.setBorder(blackline);
		
		JLabel uttLabel = new LinkLabel("","https://www.utt.fr/");
		uttLabel.setIcon(new ImageIcon(getClass().getResource("/Image/UTT.png")));
		uttLabel.setBounds(10, 10, 210, 90);
		panel.add(uttLabel);
		uttLabel.setBorder(blackline);
		
		JButton retour = new JButton("Retour");
		retour.setBounds(716, 33, 122, 40);
		panel.add(retour);
		retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				page_d_accueil accueil = new page_d_accueil();
				accueil.run();
			}
		});
		retour.setForeground(new Color(21, 50, 207));
		retour.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		
		JPanel panel_left = new JPanel();
		panel_left.setToolTipText("aaa");
		panel_left.setBounds(0, 110, 274, 503);
		frame.getContentPane().add(panel_left);
		panel_left.setBackground(new Color(162,203,246));
		panel_left.setBorder(blackline);
		panel_left.setLayout(null);
		
		
		JLabel lable_semestre = new JLabel("Smestre: ");
		lable_semestre.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lable_semestre.setForeground(new Color(21, 50, 207));
		lable_semestre.setBounds(10, 43, 80, 30);
		panel_left.add(lable_semestre);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2020A", "2020P", "2019A", "2019P"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(154, 50, 66, 23);
		panel_left.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setToolTipText("");
		comboBox_1.setBounds(154, 118, 66, 23);
		panel_left.add(comboBox_1);
		
		JLabel niveau = new JLabel("Pour niveau:  ");
		niveau.setForeground(new Color(21, 50, 207));
		niveau.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		niveau.setBounds(10, 111, 102, 30);
		panel_left.add(niveau);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setToolTipText("");
		comboBox_2.setBounds(154, 191, 66, 23);
		panel_left.add(comboBox_2);
		
		JLabel categorie = new JLabel("Pour cat¨¦gorie: ");
		categorie.setForeground(new Color(21, 50, 207));
		categorie.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		categorie.setBounds(10, 184, 116, 30);
		panel_left.add(categorie);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"ISI1", "ISI2", "ISI3", "ISI4", "ISI5"}));
				comboBox_2.setModel(new DefaultComboBoxModel(new String[] {}));
			}
		});
		rdbtnNewRadioButton.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNewRadioButton.setBounds(127, 118, 21, 23);
		panel_left.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"TCBR", "ST09", "ATN", "IPL", "VDC", "ST10", "ST51", "ST52"}));
				comboBox_1.setModel(new DefaultComboBoxModel(new String[] {}));
			}
		});
		rdbtnNewRadioButton_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		rdbtnNewRadioButton_1.setBounds(127, 191, 21, 23);
		panel_left.add(rdbtnNewRadioButton_1);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);


		JPanel panel_right = new JPanel();
		panel_right.setBounds(274, 110, 612, 503);
		frame.getContentPane().add(panel_right);
		panel_right.setBackground(new Color(162,203,246));
		panel_right.setBorder(blackline);
		panel_right.setLayout(null);
		
		JLabel human_image = new JLabel();
		human_image.setBounds(26, 40, 120, 120);
		human_image.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
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
		
		JLabel lable_semestre_1 = new JLabel("Pr¨¦nom Nom ");
		lable_semestre_1.setHorizontalAlignment(SwingConstants.CENTER);
		lable_semestre_1.setForeground(new Color(21, 50, 207));
		lable_semestre_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lable_semestre_1.setBounds(36, 157, 96, 30);
		panel_right.add(lable_semestre_1);
		
		JLabel lable_semestre_2 = new JLabel("Pr¨¦nom Nom ");
		lable_semestre_2.setHorizontalAlignment(SwingConstants.CENTER);
		lable_semestre_2.setForeground(new Color(21, 50, 207));
		lable_semestre_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lable_semestre_2.setBounds(178, 157, 96, 30);
		panel_right.add(lable_semestre_2);
		
		JLabel lable_semestre_3 = new JLabel("Pr¨¦nom Nom ");
		lable_semestre_3.setHorizontalAlignment(SwingConstants.CENTER);
		lable_semestre_3.setForeground(new Color(21, 50, 207));
		lable_semestre_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lable_semestre_3.setBounds(327, 157, 103, 30);
		panel_right.add(lable_semestre_3);
		
		JLabel lable_semestre_4 = new JLabel("Pr¨¦nom Nom ");
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
		scrollBar.setBounds(595, 0, 17, 503);
		panel_right.add(scrollBar);
		
		JLabel human_image_8 = new JLabel();
		human_image_8.setBounds(26, 354, 120, 120);
		human_image_8.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
		panel_right.add(human_image_8);
		
		JLabel human_image_5_1 = new JLabel();
		human_image_5_1.setBounds(168, 354, 120, 120);
		human_image_5_1.setIcon(new ImageIcon(getClass().getResource("/Image/user.png")));
		panel_right.add(human_image_5_1);
		
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
		
		JLabel titreLabel_1 = new JLabel("R\u00E9partition des \u00E9tudiants");
		titreLabel_1.setOpaque(true);
		titreLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		titreLabel_1.setForeground(new Color(21, 50, 207));
		titreLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		titreLabel_1.setBackground(new Color(162,203,246));
		titreLabel_1.setBounds(94, 5, 400, 40);
		panel_right.add(titreLabel_1);
		
		
	}
}
