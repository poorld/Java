package �¼�����;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TFPassword {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TFPassword t = new TFPassword();
		t.new TFFrame("�����");
	}
	
	class TFFrame extends Frame{
		TFFrame(String name){
		super(name);
		TextField tf = new TextField();
		tf.addActionListener(new TFActionListener());
		tf.setEchoChar('*');//�����������ʾ����Ϊ **********
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
