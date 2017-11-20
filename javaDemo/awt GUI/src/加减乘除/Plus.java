package ¼Ó¼õ³Ë³ý;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Plus {

	public static void main(String[] args) {
		Plus p = new Plus();
		p.new TFFrame();

	}
	
	public class TFFrame extends Frame{
		TextField num1,num2,plus;
		public void launchFrame(){
			num1 = new TextField(10);
			num2 = new TextField(10);
		    plus = new TextField(15);
			Label l = new Label("+");
			Button b1 = new Button("=");
			b1.addActionListener(new Monitor());
			setLayout(new FlowLayout());
			add(num1);
			add(l);
			add(num2);
			add(b1);
			add(plus);
			pack();
			setVisible(true);
		}
	
		public class Monitor implements ActionListener{
			public void actionPerformed(ActionEvent e){
				int n1 = Integer.parseInt(num1.getText());
				int n2 = Integer.parseInt(num2.getText());
				plus.setText("" + (n1+n2));
			}
		}
	}
}
