package cn.luhut;

import javax.swing.JApplet;
import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;//导入第三方包

import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;

public class Music implements ActionListener{
	
	private JFrame f;
	private JPanel publicPanel;
	private JLabel tip;
	private JFileChooser chooser = new JFileChooser();
	private File file;
	private String flag;
	private AudioClip adc;
	
	public Music(){
		try {
			//设置本属性将改变窗口边框样式定义 
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		f = new JFrame("音乐播放器");
		String flag = "欢迎使用！\n00";
		JPanel mb = new JPanel();
		tip = new JLabel();
		tip.setText(flag);
		mb.add(tip);
		
		JMenuBar cdt = new JMenuBar();
		JMenu cd = new JMenu("文件");
		JMenuItem open = new JMenuItem("打开");
		
		JButton play = new JButton("播放");
		JButton stop = new JButton("停止");
		JButton loop = new JButton("循环");
		
		JPanel btnPanel = new JPanel();
		
		btnPanel.add(play);
		btnPanel.add(stop);
		btnPanel.add(loop);
		
		cd.add(open);
		cdt.add(cd);
		
		setFrame(flag);
		f.setJMenuBar(cdt);
		f.add(mb);
		f.add(btnPanel,BorderLayout.SOUTH);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 300);
		f.setLocationRelativeTo(null);           //让窗体居中显示
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		if(e.getActionCommand().equals("打开")){
			int val = chooser.showOpenDialog(f);
			if(val == chooser.APPROVE_OPTION){
				file = chooser.getSelectedFile();
				String fileName = file.getName();
			}
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
	}
	
	public void setFrame(String flag){
		tip.setText(flag);
		f.add(tip,BorderLayout.NORTH);
	}
	
	
	
	public static void main(String args[]){
			UIManager.put("RootPane.setupButtonVisible", false); 
			//设置此开关量为false即表示关闭之，BeautyEye LNF中默认是true 
			new Music();
		}
}


