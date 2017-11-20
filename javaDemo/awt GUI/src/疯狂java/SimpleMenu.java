package 疯狂java;

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
	private Frame f = new Frame("菜单测试");
	private MenuBar mb = new MenuBar();
	Menu file = new Menu("文件");
	Menu edit = new Menu("编辑");
	
	Menu search = new Menu("搜索");
	Menu about = new Menu("关于");
	MenuItem seItem = new MenuItem("搜索关键字");
	MenuItem abItem = new MenuItem("关于我们");
	
	MenuItem newItem = new MenuItem("新建");
	MenuItem saveItem = new MenuItem("保存");
	MenuItem cleanItem = new MenuItem("清空");
	//创建exitItem菜单项，指定使用"Ctrl + x"快捷键
	MenuItem exitItem = new MenuItem("退出" , new MenuShortcut(KeyEvent.VK_X));
	CheckboxMenuItem autoWrap = new CheckboxMenuItem("自动换行");
	MenuItem copyItem = new MenuItem("复制");
	MenuItem pasteItem = new MenuItem("粘帖");
	Menu format = new Menu("格式");
	//创建commentItem菜单项，指定使用"Ctrl+Shift+/"快捷键
	MenuItem commentItem = new MenuItem("注释" , new MenuShortcut(KeyEvent.VK_SLASH , true));
	MenuItem cancelItem = new MenuItem("取消注释");
	private TextArea ta = new TextArea(6 , 40);
	private void init(){
		//以匿名内部类的形式创建菜单监听器
		ActionListener menuListener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String cmd = e.getActionCommand();
				ta.append("单击“" + cmd + "”菜单" + "\n");
				if(cmd.equals("退出")){
					System.exit(0);
				}
			}
		};
		//清除
		ActionListener cleanListener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ta.setText("文本以清空");
			}
		};
		//骂人呢
		ActionListener fuckListener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String fuck = e.getActionCommand();
				ta.append(fuck + "你麻痹！\n");
				System.out.println("666");
			}
		};
		search.add(seItem);
		about.add(abItem);
		
		
		seItem.addActionListener(fuckListener);
		abItem.addActionListener(fuckListener);
		cleanItem.addActionListener(cleanListener);
		//为commentItem菜单项添加事件监听器
		commentItem.addActionListener(menuListener);
		exitItem.addActionListener(menuListener);
		//为file菜单添加菜单项
		file.add(newItem);
		file.add(saveItem);
		file.add(cleanItem);
		file.add(exitItem);
		//为edit菜单添加菜单项
		edit.add(autoWrap);
		//使用addSeparator方法添加菜单分割线
		edit.addSeparator();
		edit.add(copyItem);
		edit.add(pasteItem);
		//为format菜单添加菜单项
		format.add(commentItem);
		format.add(cancelItem);
		//使用添加new MenuItem("-")的方式添加菜单分割线
		edit.add(new MenuItem("-"));
		//将format菜单组合到edit菜单中，形成二级菜单
		edit.add(format);
		//将file、edit菜单添加到mb菜单条中
		mb.add(file);
		mb.add(edit);
		mb.add(search);
		mb.add(about);
		//为窗口设置菜单条
		f.setMenuBar(mb);
		//以匿名内部类的形式来创建事件监听器
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
