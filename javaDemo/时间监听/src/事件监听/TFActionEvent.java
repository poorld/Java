package 事件监听;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TFActionEvent {

	public static void main(String[] args) {
		TFActionEvent t = new TFActionEvent();
		t.new TFFrame("666");

	}
	class TFFrame extends Frame {
		TFFrame(String name){
			super(name);
			TextField tf = new TextField();
			add(tf);//添加TextField到Frame
			tf.addActionListener(new TFActionListener());
			pack();
			setVisible(true);
		}
	}
	
	class TFActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			TextField tf = (TextField)e.getSource();
			System.out.println(tf.getText());
			tf.setText("");
		}
	}

}
