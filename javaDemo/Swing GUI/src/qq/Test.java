package qq;
import java.awt.*;

import javax.swing.*;

public class Test extends JFrame{
	JPanel mb1,mb2;
	JLabel bq1,bq2,bq3;
	JButton b1,b2,b3,b4;
	JTextField wbk;
	JPasswordField mmk;
	JCheckBox box1,box2;
	JLabel wj,qx,sq;//���ǣ�ȡ��������
	
	public static void main(String[] args){
		Test t = new Test();
	}
	
	public Test(){
		bq1 = new JLabel(new ImageIcon("image/hero.jpg"));
		bq2 = new JLabel("�ʺ�",JLabel.CENTER);
		bq3 = new JLabel("����",JLabel.CENTER);
		b1 = new JButton("���");
		b2 = new JButton("��¼");
		b3 = new JButton("ȡ��");
		b4 = new JButton("����");
		box1 = new JCheckBox("��ס����");
		box2 = new JCheckBox("�Զ���¼");
		wbk = new JTextField(20);
		mmk = new JPasswordField(20);
		
		
		wj = new JLabel("��������",JLabel.CENTER);
		qx = new JLabel("�����Ϣ",JLabel.CENTER);
		sq = new JLabel("<html><a href='http://xdd520.xyz'>�����ʺ�</a>",JLabel.CENTER);
		sq.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		wj.setForeground(Color.BLUE);
		wj.setFont(new Font("����",Font.PLAIN,16));
		qx.setForeground(Color.BLUE);
		qx.setFont(new Font("����",Font.PLAIN,16));

		
		
		mb1 = new JPanel(new GridLayout(3,3));
		mb1.add(bq2);	mb1.add(wbk);	mb1.add(wj);
		mb1.add(bq3);	mb1.add(mmk);	mb1.add(qx);
		mb1.add(box1);	mb1.add(box2);	mb1.add(sq);
		
		mb2 = new JPanel();
		//mb2.setBackground(Color.BLUE);
		mb2.add(b2);	mb2.add(b3);
		
		//����ͼ��
		ImageIcon tp = new ImageIcon("image/qqtitle.png");
		this.setIconImage(tp.getImage());
		
		this.setTitle("QQ��¼");
		this.add(bq1,BorderLayout.NORTH);
		this.add(mb1,BorderLayout.CENTER);
		this.add(mb2,BorderLayout.SOUTH);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300, 100, 405, 330);
		this.setResizable(false);
	}
}
