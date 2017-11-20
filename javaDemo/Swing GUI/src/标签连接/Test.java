package 标签连接;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test extends JFrame{
	JLabel bq1,bq2,bq3;
	JButton an;
	JPanel mb;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Test t = new Test();
	}
	public Test(){
		bq1 = new JLabel("测试",JLabel.CENTER);
		bq1.setFont(new Font("宋体",Font.PLAIN,30));
		bq1.setForeground(Color.RED);
		
		bq2 = new JLabel("<html><a href='xdd520.xyz'>电影</a>");
		bq2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//经过标签时变手势
		bq3 = new JLabel("55");
		
		an = new JButton(new ImageIcon("image/anniu.jpg"));
		
		
		mb = new JPanel();
	
		mb.add(bq1);
		mb.add(bq2);
		mb.add(bq3);
		mb.add(an);
		
		ImageIcon tp = new ImageIcon("image/tx.jpg");
		this.setIconImage(tp.getImage());
		this.setTitle("标签测试");
		this.add(mb);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 300, 100);
	}

}
