package ��ִ���;
import java.awt.*;

import javax.swing.JSplitPane;
import javax.swing.*;

public class Main extends JFrame{
	JLabel bq;//�ұ�ͼ���ǩ
	JList lb;//����б�
	JSplitPane cf;//���
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Main m = new Main();
	}
	public Main(){
		String[] name = {"�������","��Ϸ����","ƽ�����","�������","�������"};
		lb = new JList(name);
		
		bq = new JLabel(new ImageIcon("image/biaoqian.jpg"));
		
		cf = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,lb,bq);//���Ҳ��
		//cf = new JSplitPane(JSplitPane.VERTICAL_SPLIT,lb,bq);//���²��
		cf.setOneTouchExpandable(true);//������������
		
		this.add(cf);
		this.setBounds(350, 80, 660, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
}
