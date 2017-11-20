package 事件监听;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TFPassword {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TFPassword t = new TFPassword();
		t.new TFFrame("密码框");
	}
	
	class TFFrame extends Frame{
		TFFrame(String name){
		super(name);
		TextField tf = new TextField();
		tf.addActionListener(new TFActionListener());
		tf.setEchoChar('*');//设置输入的显示符号为 **********
		add(tf);
		pack();
		setVisible(true);
		}
	}
	
	class TFActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			TextField tf =(TextField)e.getSource();
			System.out.println(tf.getText());
			tf.setText("");
		}
	}

}
