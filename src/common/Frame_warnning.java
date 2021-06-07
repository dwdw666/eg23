package common;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Frame_warnning extends JFrame {
	public Frame_warnning() {
		super();
	}
	
	public void addListener() {
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); //set default etat;
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Voulez-vous quitter?", " ",JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if(result == JOptionPane.OK_OPTION){
                    System.exit(0);
                }
			}
		});
	}
}
