package common;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JLabel;
/**
 * 
 * 
 * @author dwdw666
 *
 */
public class LinkLabel extends JLabel {
    private static final long serialVersionUID = 1L;
    /** ��������ʾ������ */
    private String text;
    /** �������� */
    private URL link = null;
    /** �����ǩ��Ĭ����ɫ */
    private Color preColor = null;

    /** * ����һ�������� * @param vText ��ʾ������ * @param vLink ���ӵ�ַ */
    public LinkLabel(String vText, String vLink) {
        super("<html>" + vText + "</html>");
        this.text = vText;
        try {
            if (!vLink.startsWith("http://"))
                vLink = "http://" + vLink;
            this.link = new URL(vLink);
        } catch (MalformedURLException err) {
            err.printStackTrace();
        }
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                LinkLabel.this.setCursor(Cursor
                        .getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                if (preColor != null)
                    LinkLabel.this.setForeground(preColor);
                LinkLabel.this.setText("<html>" + text + "</html>");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                LinkLabel.this.setCursor(Cursor
                        .getPredefinedCursor(Cursor.HAND_CURSOR));
                preColor = LinkLabel.this.getForeground();
                LinkLabel.this.setForeground(Color.BLUE);
                LinkLabel.this.setText("<html><u>" + text + "</u></html>");
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(link.toURI());
                } catch (IOException err) {
                    err.printStackTrace();
                } catch (URISyntaxException err) {
                    err.printStackTrace();
                }
            }
        });
    }
}

