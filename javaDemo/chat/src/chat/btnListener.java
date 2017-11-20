package chat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class btnListener implements MouseListener {
	private JTextField wbk;
	private JTextArea wby;
	public btnListener(JTextField wbk,JTextArea wby){
		this.wbk = wbk;
		this.wby = wby;
	}
	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		String content = wbk.getText();
		if (null!=content && !content.trim().equals("")){
			wby.append("ÎÒ:" + content + "\n");
			wbk.setText("");
		}
		else{
			JOptionPane.showMessageDialog(null, "ÄÚÈÝÎª¿Õ£¡");
		}
		
	}
	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {}
	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {}
	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {}
	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {}
}
