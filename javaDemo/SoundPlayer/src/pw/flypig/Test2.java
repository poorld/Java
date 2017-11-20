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
			double jd = progressBar.getPercentComplete();//返回进度条的完成百分比。注意，此数介于 0.0 和 1.0 之间。 
			dqjd = progressBar.getString();//返回百分百
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
		bq.setText("当前进度:" + a + "%" + "已完成:" + dqjd);
		this.add(bq,BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		new Test2();
	}
}