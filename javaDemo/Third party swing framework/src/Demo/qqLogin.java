package Demo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

public class qqLogin {
	private boolean wbkClick = false;//�ı�������
	private JFrame f;
	private JPanel mb;
	private JPanel btnmb;
	private JLabel zh,mm;
	private JTextField wbk;
	private JPasswordField mmk;
	private JButton btn1,btn2;
	
	public qqLogin(){
		try {
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.frameBorderStyle.translucencyAppleLike;
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		f = new JFrame("��¼");
		mb = new JPanel();
		btnmb = new JPanel();
		zh = new JLabel("�ʺ�:",JLabel.CENTER);//��̬�ı�
		wbk = new JTextField("�����ʺ�",30);
		wbk.addMouseListener(new MyMouseAdapter());
		mm = new JLabel("����:",JLabel.CENTER);
		mmk = new JPasswordField(30);
		
		btn1 = new JButton("��¼");
		btn1.addMouseListener(new btn1Listner());
		btn2 = new JButton("����");
		btn2.addMouseListener(new btn2Listener());
		//**���ð�ť��ɫ
		btn1.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
		btn2.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));

		//**���ð�ť��ɫ
		//mb.setLayout(new FlowLayout());   //Ĭ����FlowLayout
		mb.add(zh);	mb.add(wbk);
		mb.add(mm);	mb.add(mmk);
		
		btnmb.add(btn1);
		btnmb.add(btn2);
		
		f.add(mb);
		f.add(btnmb,BorderLayout.SOUTH);
		
		f.setVisible(true);
		f.setSize(300, 190);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);           //�ô��������ʾ	
	}
	
	//��һ�ε���ʺſ����
	public class MyMouseAdapter extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			if (wbkClick == false){
			wbk.setText("");
			wbkClick = true;
			}
		}
	}
	//���ð�ť������
	public class btn2Listener extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			//ȫ�����
			wbk.setText("");
			mmk.setText("");
		}
	}
	
	//��¼��ť������
	public class btn1Listner extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			System.out.println("�����衢");
		}
	}
	
	public static void main(String[] args){
		UIManager.put("RootPane.setupButtonVisible", false); 
		//���ô˿�����Ϊfalse����ʾ�ر�֮��BeautyEye LNF��Ĭ����true 
		new qqLogin();
	}
}
