package ���java;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleMenu {
	private Frame f = new Frame("�˵�����");
	private MenuBar mb = new MenuBar();
	Menu file = new Menu("�ļ�");
	Menu edit = new Menu("�༭");
	
	Menu search = new Menu("����");
	Menu about = new Menu("����");
	MenuItem seItem = new MenuItem("�����ؼ���");
	MenuItem abItem = new MenuItem("��������");
	
	MenuItem newItem = new MenuItem("�½�");
	MenuItem saveItem = new MenuItem("����");
	MenuItem cleanItem = new MenuItem("���");
	//����exitItem�˵��ָ��ʹ��"Ctrl + x"��ݼ�
	MenuItem exitItem = new MenuItem("�˳�" , new MenuShortcut(KeyEvent.VK_X));
	CheckboxMenuItem autoWrap = new CheckboxMenuItem("�Զ�����");
	MenuItem copyItem = new MenuItem("����");
	MenuItem pasteItem = new MenuItem("ճ��");
	Menu format = new Menu("��ʽ");
	//����commentItem�˵��ָ��ʹ��"Ctrl+Shift+/"��ݼ�
	MenuItem commentItem = new MenuItem("ע��" , new MenuShortcut(KeyEvent.VK_SLASH , true));
	MenuItem cancelItem = new MenuItem("ȡ��ע��");
	private TextArea ta = new TextArea(6 , 40);
	private void init(){
		//�������ڲ������ʽ�����˵�������
		ActionListener menuListener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String cmd = e.getActionCommand();
				ta.append("������" + cmd + "���˵�" + "\n");
				if(cmd.equals("�˳�")){
					System.exit(0);
				}
			}
		};
		//���
		ActionListener cleanListener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ta.setText("�ı������");
			}
		};
		//������
		ActionListener fuckListener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String fuck = e.getActionCommand();
				ta.append(fuck + "����ԣ�\n");
				System.out.println("666");
			}
		};
		search.add(seItem);
		about.add(abItem);
		
		
		seItem.addActionListener(fuckListener);
		abItem.addActionListener(fuckListener);
		cleanItem.addActionListener(cleanListener);
		//ΪcommentItem�˵�������¼�������
		commentItem.addActionListener(menuListener);
		exitItem.addActionListener(menuListener);
		//Ϊfile�˵���Ӳ˵���
		file.add(newItem);
		file.add(saveItem);
		file.add(cleanItem);
		file.add(exitItem);
		//Ϊedit�˵���Ӳ˵���
		edit.add(autoWrap);
		//ʹ��addSeparator������Ӳ˵��ָ���
		edit.addSeparator();
		edit.add(copyItem);
		edit.add(pasteItem);
		//Ϊformat�˵���Ӳ˵���
		format.add(commentItem);
		format.add(cancelItem);
		//ʹ�����new MenuItem("-")�ķ�ʽ��Ӳ˵��ָ���
		edit.add(new MenuItem("-"));
		//��format�˵���ϵ�edit�˵��У��γɶ����˵�
		edit.add(format);
		//��file��edit�˵���ӵ�mb�˵�����
		mb.add(file);
		mb.add(edit);
		mb.add(search);
		mb.add(about);
		//Ϊ�������ò˵���
		f.setMenuBar(mb);
		//�������ڲ������ʽ�������¼�������
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args){
		new SimpleMenu().init();
	}
}
