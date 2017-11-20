package 单选框;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Test {
	JFrame f;
	JPanel mb;
	JLabel bq1,bq2,bq3;
	JRadioButton r1,r2,r3;
	ButtonGroup dxz;
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Test t = new Test();
	}
	public Test(){
		f = new JFrame("test");
		
		dxz = new ButtonGroup();
		bq1 = new JLabel(new ImageIcon("image/tx.jpg"));
		bq2 = new JLabel(new ImageIcon("image/tx.jpg"));
		bq3 = new JLabel(new ImageIcon("image/tx.jpg"));
		r1 = new JRadioButton("美女");
		r2 = new JRadioButton("紫棋");
		r3 = new JRadioButton("哒哒");
		dxz.add(r1); dxz.add(r2); dxz.add(r3);
		mb = new JPanel(new FlowLayout());
		mb.add(r1); mb.add(r2); mb.add(r3);

		f.add(bq1);
		f.add(mb,BorderLayout.SOUTH);
		f.setVisible(true);
		f.setBounds(100, 100, 300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	/*public void addRadioButton(final String text){
		r = new JRadioButton(text);
		dxz.add(r);
		mb.add(r);
		r.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				if("美女".equals(text)){
					bq1 = new JLabel(new ImageIcon("image/tx.jpg"));
					f.add(bq1);
				}else if("紫棋".equals(text)){
					bq2 = new JLabel(new ImageIcon("image/tx.jpg"));
				}else if("哒哒".equals(text)){
					bq2 = new JLabel(new ImageIcon("image/tx.jpg"));
				}
			}
		});
	}
	*/
}
