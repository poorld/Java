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
		// TODO 自动生成的方法存根
		LiaoTian l = new LiaoTian();
	}
	public LiaoTian(){
		f = new JFrame("qq聊天");
		dialog = new JDialog(f,"提示");
		text = new JTextField(20);
		close = new JButton("关闭");
		panel = new JPanel();
		send = new JButton("发送");
		tip = new JLabel();
		
		send.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String content = text.getText();
				if(content!=null && !content.trim().equals("")){
					area.setForeground(Color.GRAY);
					area.append("我：" + content + "\n");
				}
				else{
//					area.setForeground(Color.RED);
//					area.append("不能发送空信息！\n");
					dialog.setVisible(true);
					dialog.setLayout(new BorderLayout());
					dialog.setModal(true);
					dialog.setResizable(false);
					dialog.setBounds(300, 50, 200, 100);
					if(dialog.getComponents().length ==1){
					dialog.add(tip);
					}
					tip.setForeground(Color.RED);
					tip.setText("不能发送空信息!");
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
					area.append("我草：" + content + "\n");
					text.setText("");
				}
			}
		});
		
		//关闭按钮监听器
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				dialog.dispose();
			}
		});
		area = new JTextArea();
		gdt = new JScrollPane(area);
		bq = new JLabel("聊天信息");
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