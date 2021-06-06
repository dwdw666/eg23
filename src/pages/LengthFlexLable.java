package pages;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
public class LengthFlexLable extends JLabel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean isclick = false;
	public LengthFlexLable(String string) {
		super(string);
		listen();
	}
	
	public void setLength(){
		int width = this.getWidth();
		if(isclick == false) {
			this.setBounds(this.getX(), this.getY(), width+200, this.getHeight());
			this.setOpaque(true);
			isclick = true;
		}else {
			this.setBounds(this.getX(), this.getY(), width-200, this.getHeight());
			this.setOpaque(false);
			isclick = false;
		}
	}
	
	public void listen() {
	this.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			setLength();
		}
	});
}
}
