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
	public JMenuBar cdt;//�����˵���
	public JMenu wj;//�˵�
	public JMenuItem dk;//�˵���
	
	public JFileChooser chooser = new JFileChooser();
	public File file;
	public String fileName;
	public AudioClip adc;
	public boolean loop = false;
	
	public Test1(){
		super("������");
		
		
		JPanel mbs = new JPanel(new GridLayout());
		String flag = "��ӭʹ�ã�";
		bq = new JLabel(flag);
		mb.add(bq);

		bt1 = new JButton("����");
		bt1.addActionListener(this);
		bt2 = new JButton("ֹͣ");
		bt2.addActionListener(this);
		bt3 = new JButton("ѭ��");
		bt3.addActionListener(this);
		
		cdt = new JMenuBar();
		wj = new JMenu("�ļ�");
		dk = new JMenuItem("��");
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
		// TODO �Զ����ɵķ������
		if (e.getActionCommand() .equals("ѭ��")){
			String flag = "ѭ������:" + fileName;
			loop =! loop;
			adc.loop();
			setFrame(flag);
		}

		if (e.getActionCommand().equals("��")){
			int val = chooser.showOpenDialog(this);
			if (val == chooser.APPROVE_OPTION){
				file = chooser.getSelectedFile();//����ѡ���ļ�
				fileName = file.getName();
			}
			String flag = "�����ڲ���:" + fileName;
			this.setFrame(flag);
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
		
		if (e.getActionCommand() .equals("����")){
			String flag = "�����ڲ���:" + fileName;
			this.setFrame(flag);
			if (adc == null){
				setFrame(flag);
				adc.play();
			}
		}
		if (e.getActionCommand() == "ֹͣ"){
			String flag = "��ֹͣ����:" + fileName;
			this.setFrame(flag);
			adc.stop();
		}
	}
	
	public static void main(String[] args) {
			// TODO �Զ����ɵķ������
			new Test1();
	}
}
