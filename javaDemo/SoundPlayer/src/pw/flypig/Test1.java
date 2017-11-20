package pw.flypig;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FilenameFilter;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;

public class Test1 extends JFrame implements ActionListener{

	public JPanel mb = new JPanel();
	public String flag;
	public JLabel bq = new JLabel();
	public JButton bt1,bt2,bt3;
	public JLabel bg = new JLabel();
	public JMenuBar cdt;//顶级菜单条
	public JMenu wj;//菜单
	public JMenuItem dk;//菜单项
	
	public JFileChooser chooser = new JFileChooser();
	public File file;
	public String fileName;
	public AudioClip adc;
	public boolean loop = false;
	
	public Test1(){
		super("播放器");
		
		
		JPanel mbs = new JPanel(new GridLayout());
		String flag = "欢迎使用！";
		bq = new JLabel(flag);
		mb.add(bq);

		bt1 = new JButton("播放");
		bt1.addActionListener(this);
		bt2 = new JButton("停止");
		bt2.addActionListener(this);
		bt3 = new JButton("循环");
		bt3.addActionListener(this);
		
		cdt = new JMenuBar();
		wj = new JMenu("文件");
		dk = new JMenuItem("打开");
		dk.addActionListener(this);
		
		
		wj.add(dk);
		cdt.add(wj);
		
		mbs.add(bt1);
		mbs.add(bt2);
		mbs.add(bt3);
		
		this.setJMenuBar(cdt);
		this.add(mb,BorderLayout.NORTH);
		this.add(bg);
		this.add(mbs,BorderLayout.SOUTH);
		this.setVisible(true);
		this.setSize(310, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setResizable(false);
	}
	
	public void setFrame(String flag){
		bq.setText(flag);
		mb.add(bq);
		Icon ic = new ImageIcon("image/bg.jpg");
		bg.setIcon(ic);
		//this.add(mb);
		this.add(bg);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		if (e.getActionCommand() .equals("循环")){
			String flag = "循环播放:" + fileName;
			loop =! loop;
			adc.loop();
			setFrame(flag);
		}

		if (e.getActionCommand().equals("打开")){
			int val = chooser.showOpenDialog(this);
			if (val == chooser.APPROVE_OPTION){
				file = chooser.getSelectedFile();//返回选中文件
				fileName = file.getName();
			}
			String flag = "你正在播放:" + fileName;
			this.setFrame(flag);
			try {
				URL url = new URL("file:" + file.getPath());
				adc = JApplet.newAudioClip(url);
				adc.play();
				System.out.println("666");
			} catch (MalformedURLException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
				System.out.println("无法播放!");
				
			}
			
		}
		
		if (e.getActionCommand() .equals("播放")){
			String flag = "你正在播放:" + fileName;
			this.setFrame(flag);
			if (adc == null){
				setFrame(flag);
				adc.play();
			}
		}
		if (e.getActionCommand() == "停止"){
			String flag = "以停止播放:" + fileName;
			this.setFrame(flag);
			adc.stop();
		}
	}
	
	public static void main(String[] args) {
			// TODO 自动生成的方法存根
			new Test1();
	}
}
