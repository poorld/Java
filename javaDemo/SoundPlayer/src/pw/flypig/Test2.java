package pw.flypig;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Test2 extends JFrame {

	JLabel bq = new JLabel();
	String dqjd ;
	public Test2(){
		super();
		setSize(200,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		JProgressBar progressBar = new JProgressBar();
		getContentPane().add(progressBar,BorderLayout.NORTH);
		progressBar.setStringPainted(true);
		for (int i = 0;i <= 100;i++){
			progressBar.setValue(i);
			double jd = progressBar.getPercentComplete();//���ؽ���������ɰٷֱȡ�ע�⣬�������� 0.0 �� 1.0 ֮�䡣 
			dqjd = progressBar.getString();//���ذٷְ�
			setFrame(jd,dqjd);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void setFrame(double jd,String dqjd) {
		int a = (int) (jd*100);
		bq.setText("��ǰ����:" + a + "%" + "�����:" + dqjd);
		this.add(bq,BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		new Test2();
	}
}