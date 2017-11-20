
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;


public class Main{
	private JFrame f;
	private JLabel labelbg;
	private JPanel mb2,mb3;
	private JLabel zh,mm;
	private JTextField wbk;
	private JPasswordField mmk;
	private JButton bt1,bt2;
	private JDialog countDialog;
	
	static{
		System.out.println("���ڳ�ʼ��");
	}
	
	public Main(){
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
		java.net.URL imageURL = Main.class.getResource("1.jpg");
		labelbg = new JLabel(new ImageIcon(imageURL));
		
		mb2.setLayout(new GridLayout(2,1));
		mb2.add(zh);	mb2.add(wbk);
		mb2.add(mm);	mb2.add(mmk);
		
		mb3.setLayout(new GridLayout(1,2));
		mb3.add(bt1);	mb3.add(bt2);
		
		//f.add(countDialog);
		f.add(labelbg,BorderLayout.NORTH);
		f.add(mb2);
		f.add(mb3,BorderLayout.SOUTH);
		
		/*****************************************����������********************************************/

		JOptionPane.showMessageDialog(null, "����ʹ��" + Count.jishu() + "��");
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
	
	public static class Count{
		static Properties prop = new Properties();
		public static int jishu(){
			int count = 0;
			File file = null;
			FileInputStream fis = null;
			FileOutputStream fos = null;
			try {
				file = new File("C:/count.ini");
				if (!file.exists()){
					file.createNewFile();
				}
				fis = new FileInputStream(file);
				prop.load(fis);
				//int count = 0;
				String value = prop.getProperty("time");
				if (value!=null){
					count = Integer.parseInt(value);
					if (count>=5){
						JOptionPane.showMessageDialog(null, "���ý���,���ֵ��");
						System.exit(0);
					}
				}
				count++;
				System.out.println("���Ѿ�ʹ����" + count + "��,����" +(5-count)+ "��ʹ�û��ᣬ��ץ��ʱ���ֵ��");
				prop.setProperty("time", count+"");
				fos = new FileOutputStream(file);
				prop.store(fos,"zhushi");
			} catch (Exception e) {
				System.out.println(e);
			}
			finally{
				try {
					fis.close();
					fos.close();
				}catch(Exception e) {
					System.out.println(e);
				}
			}
			return count;
		}
	}
	
	public static void main(String args[]){
		/*�������ð�ť
		���ô˿�����Ϊfalse����ʾ�ر�֮��BeautyEye LNF��Ĭ����true 
		*/
		UIManager.put("RootPane.setupButtonVisible", false); 
		new Main();
	}

}
