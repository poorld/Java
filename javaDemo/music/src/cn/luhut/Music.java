package cn.luhut;

import javax.swing.JApplet;
import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;//�����������

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
			//���ñ����Խ��ı䴰�ڱ߿���ʽ���� 
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		f = new JFrame("���ֲ�����");
		String flag = "��ӭʹ�ã�\n00";
		JPanel mb = new JPanel();
		tip = new JLabel();
		tip.setText(flag);
		mb.add(tip);
		
		JMenuBar cdt = new JMenuBar();
		JMenu cd = new JMenu("�ļ�");
		JMenuItem open = new JMenuItem("��");
		
		JButton play = new JButton("����");
		JButton stop = new JButton("ֹͣ");
		JButton loop = new JButton("ѭ��");
		
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
		f.setLocationRelativeTo(null);           //�ô��������ʾ
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO �Զ����ɵķ������
		if(e.getActionCommand().equals("��")){
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
				// TODO �Զ����ɵ� catch ��
				e1.printStackTrace();
				System.out.println("�޷�����!");
				
			}
		}
	}
	
	public void setFrame(String flag){
		tip.setText(flag);
		f.add(tip,BorderLayout.NORTH);
	}
	
	
	
	public static void main(String args[]){
			UIManager.put("RootPane.setupButtonVisible", false); 
			//���ô˿�����Ϊfalse����ʾ�ر�֮��BeautyEye LNF��Ĭ����true 
			new Music();
		}
}


