package frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameTest2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		FrameTest2 ft = new FrameTest2();
		ft.new TFFrame("小哒哒计算器");
	}
	
	class TFFrame extends Frame {
		TextField p1,p2,p3;//plus加
		TextField re1,re2,re3;//reduce减
		TextField ri1,ri2,ri3;//ride乘
		TextField ex1,ex2,ex3;//except 除
		
		public TFFrame(String name){
			super(name);
			p1 = new TextField(10);
			p2 = new TextField(10);
			p3 = new TextField(15);
			Button b = new Button("=");
			b.addActionListener(new PlusMonitor());
			Label tip = new Label("加法:");
			Label plus = new Label("+");
			setBounds(100,100,450,200);
			add(tip);
			add(p1);
			add(plus);
			add(p2);
			add(b);
			add(p3);
			setResizable(false);//设置不可改变窗口
			setLayout(new FlowLayout());
			setVisible(true);
			
			//减法
			re1 = new TextField(10);
			re2 = new TextField(10);
			re3 = new TextField(15);
			Button rebut = new Button("=");
			rebut.addActionListener(new ReduceMonitor());
			Label rebtip = new Label("减法:");
			Label reduce = new Label("-");
			add(rebtip);
			add(re1);
			add(reduce);
			add(re2);
			add(rebut);
			add(re3);
			
			//乘法ride
			ri1 = new TextField(10);
			ri2 = new TextField(10);
			ri3 = new TextField(15);
			Label r = new Label("乘法:");
			Label ride = new Label("*");
			Button rideButton = new Button("=");
			rideButton.addActionListener(new RideMonitor());
			add(r);
			add(ri1);
			add(ride);
			add(ri2);
			add(rideButton);
			add(ri3);
			
			//except 除
			ex1 = new TextField(10);
			ex2 = new TextField(10);
			ex3 = new TextField(15);
			Label l = new Label("除法:");
			Label ex = new Label("/");
			Button exceptBut = new Button("=");
			exceptBut.addActionListener(new ExceptMonitor());
			add(l);
			add(ex1);
			add(ex);
			add(ex2);
			add(exceptBut);
			add(ex3);
			
			for (int i = 0; i < 10; i++){
				add(new Button("" + i));
			}

		}
		
		
	//加法监听器
	private class PlusMonitor implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int n1 = Integer.parseInt(p1.getText());
			int n2 = Integer.parseInt(p2.getText());
			p3.setText("" + (n1+n2));
		}
	}
	
	//减法监听器
	private class ReduceMonitor implements ActionListener{
		public void actionPerformed(ActionEvent e){
		int n3 = Integer.parseInt(re1.getText());
		int n4 = Integer.parseInt(re2.getText());
		re3.setText("" + (n3-n4));
		}
	}
	
	//乘法监听器
	private class RideMonitor implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int ri_1 = Integer.parseInt(ri1.getText());
			int ri_2 = Integer.parseInt(ri2.getText());
			ri3.setText("" + (ri_1 * ri_2));
		}
	}
	
	//除法监听器
	private class ExceptMonitor implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double ex_1 = Integer.parseInt(ex1.getText());
			double ex_2 = Integer.parseInt(ex2.getText());
			ex3.setText("" + (ex_1 / ex_2));
		}
	}
	
	}
}
