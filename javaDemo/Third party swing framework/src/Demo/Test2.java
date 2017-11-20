package Demo;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;
import org.w3c.dom.events.MouseEvent;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.*;


public class Test2{
	private JFrame f;
	private JLabel labelbg;
	private JPanel mb2,mb3;
	private JLabel zh,mm;
	private JTextField wbk;
	private JPasswordField mmk;
	private JButton bt1,bt2;
	
	public Test2(){
		try {
			//���ñ����Խ��ı䴰�ڱ߿���ʽ���� 
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;//ǿ�����͸��
			
			/*
			 * �����Java������������Beauty Eye�����
			 */
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		/***************************************** �����ʼ������********************************************/
		f = new JFrame("��½");
		mb2 = new JPanel();
		mb3 = new JPanel();
		zh = new JLabel("�ʺţ�",JLabel.CENTER);
		zh.setForeground(Color.BLACK);
		zh.setFont(new Font("����",Font.PLAIN,16));
		mm = new JLabel("���룺",JLabel.CENTER);
		mm.setForeground(Color.BLACK);
		mm.setFont(new Font("����",Font.PLAIN,16));
		wbk = new JTextField(15);
		mmk = new JPasswordField(15);
		bt1 = new JButton("��¼");
		bt1.setForeground(Color.WHITE);;
		bt1.setFont(new Font("����",Font.PLAIN,14));
		bt1.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.blue));//��ɫ��ť
		bt2 = new JButton("ע��");
		bt2.setForeground(Color.WHITE);;
		bt2.setFont(new Font("����",Font.PLAIN,14));
		bt2.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));//��ɫ��ť
		
		
		/***************************************** �¼���������� ********************************************/
		//��¼��ť��Ӽ�����
		bt1.addMouseListener(new bt1Listener());
		//ע�ᰴť��Ӽ�����
		bt2.addMouseListener(new bt2Listener());
		//�����س�����
		mmk.addKeyListener(new mmkListener());
		
		/***************************************** ����������  ********************************************/
		labelbg = new JLabel(new ImageIcon("image/1.jpg"));
		
		mb2.setLayout(new GridLayout(2,1));
		mb2.add(zh);	mb2.add(wbk);
		mb2.add(mm);	mb2.add(mmk);
		
		mb3.setLayout(new GridLayout(1,2));
		mb3.add(bt1);	mb3.add(bt2);
		
		f.add(labelbg,BorderLayout.NORTH);
		f.add(mb2);
		f.add(mb3,BorderLayout.SOUTH);
		/*****************************************����������********************************************/

		
		f.setVisible(true);
		f.setResizable(false);
		f.setLocation(200, 200);
		f.setSize(390, 280);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//��ť1������
	public class bt1Listener implements MouseListener{
		@Override
		public void mouseClicked(java.awt.event.MouseEvent e) {
			// TODO �Զ����ɵķ������
			if (null == wbk.getText() || "".equals(wbk.getText()))
			{
				JOptionPane.showMessageDialog(null, "�û�������Ϊ��");
			}
			else if (null == mmk.getText() || "".equals(mmk.getText())){
				JOptionPane.showMessageDialog(null, "���벻��Ϊ��");
			}
			else if (null != wbk && "1039059930".equals(wbk.getText()) &&
					 null != mmk && "12345".equals(mmk.getText())){
				JOptionPane.showMessageDialog(null, "��¼�ɹ�!\n�ʺ�Ϊ:" + wbk.getText() + "\n"
						+ "����Ϊ:" + mmk.getText());
			}
			else{
				JOptionPane.showMessageDialog(null, "�ʺŻ��������");
			}
		}
		@Override
		public void mousePressed(java.awt.event.MouseEvent e) {}
		@Override
		public void mouseReleased(java.awt.event.MouseEvent e) {}
		@Override
		public void mouseEntered(java.awt.event.MouseEvent e) {}
		@Override
		public void mouseExited(java.awt.event.MouseEvent e) {}

	}
	
	//��ť2������
	public class bt2Listener implements MouseListener{
		@Override
		public void mouseClicked(java.awt.event.MouseEvent e) {
			// TODO �Զ����ɵķ������
			JOptionPane.showMessageDialog(null, "ע�����:\n" + "http://flypig.pw");
			try {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler http://flypig.pw");
			} catch (IOException e1) {
				// TODO �Զ����ɵ� catch ��
				e1.printStackTrace();
			}
		}
		@Override
		public void mousePressed(java.awt.event.MouseEvent e) {}
		@Override
		public void mouseReleased(java.awt.event.MouseEvent e) {}
		@Override
		public void mouseEntered(java.awt.event.MouseEvent e) {}
		@Override
		public void mouseExited(java.awt.event.MouseEvent e) {}
	}
	
	//�����س�����
	public class mmkListener implements KeyListener{
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO �Զ����ɵķ������
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO �Զ����ɵķ������	
			if (e.getKeyCode() == KeyEvent.VK_ENTER){
				new bt1Listener().mouseClicked(null);
			}
		}

		@Override   
		public void keyReleased(KeyEvent e) {
			// TODO �Զ����ɵķ������
		}
	}
	
	
	public static void main(String args[]){
		/*�������ð�ť
		���ô˿�����Ϊfalse����ʾ�ر�֮��BeautyEye LNF��Ĭ����true 
		*/
		UIManager.put("RootPane.setupButtonVisible", false); 
		new Test2();
	}

}
