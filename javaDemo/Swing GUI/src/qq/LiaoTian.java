package qq;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class LiaoTian{
	JFrame f;
	JPanel panel;
	JTextField text;
	JTextArea area;
	JButton send,close;
	JLabel bq,tip;
	JDialog dialog;
	JScrollPane gdt;
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		LiaoTian l = new LiaoTian();
	}
	public LiaoTian(){
		f = new JFrame("qq����");
		dialog = new JDialog(f,"��ʾ");
		text = new JTextField(20);
		close = new JButton("�ر�");
		panel = new JPanel();
		send = new JButton("����");
		tip = new JLabel();
		
		send.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String content = text.getText();
				if(content!=null && !content.trim().equals("")){
					area.setForeground(Color.GRAY);
					area.append("�ң�" + content + "\n");
				}
				else{
//					area.setForeground(Color.RED);
//					area.append("���ܷ��Ϳ���Ϣ��\n");
					dialog.setVisible(true);
					dialog.setLayout(new BorderLayout());
					dialog.setModal(true);
					dialog.setResizable(false);
					dialog.setBounds(300, 50, 200, 100);
					if(dialog.getComponents().length ==1){
					dialog.add(tip);
					}
					tip.setForeground(Color.RED);
					tip.setText("���ܷ��Ϳ���Ϣ!");
					dialog.add(close,BorderLayout.SOUTH);
				}
				text.setText("");
			}
		});
		text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				String content = text.getText();
				if(e.getKeyChar() == KeyEvent.VK_ENTER){
					area.append("�Ҳݣ�" + content + "\n");
					text.setText("");
				}
			}
		});
		
		//�رհ�ť������
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				dialog.dispose();
			}
		});
		area = new JTextArea();
		gdt = new JScrollPane(area);
		bq = new JLabel("������Ϣ");
		panel.add(bq);
		panel.add(text);
		panel.add(send);
		
		f.add(gdt);
		f.add(panel,BorderLayout.SOUTH);
		f.setVisible(true);
		f.setResizable(false);
		f.setBounds(200, 50, 500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}