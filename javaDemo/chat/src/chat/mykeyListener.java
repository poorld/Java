package chat;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class mykeyListener implements KeyListener {
	private JTextField wbk;
	private JTextArea wby;
	public mykeyListener(JTextField wbk,JTextArea wby){
		this.wbk = wbk;
		this.wby = wby;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO �Զ����ɵķ������

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO �Զ����ɵķ������
		if (e.getKeyCode() == KeyEvent.VK_ENTER){//������س��������ð�ť��
			new btnListener(wbk,wby).mouseClicked(null);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO �Զ����ɵķ������

	}

}
