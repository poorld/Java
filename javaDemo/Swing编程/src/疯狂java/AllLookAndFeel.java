package 疯狂java;

import javax.swing.UIManager;

public class AllLookAndFeel {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("当前系统可用的所有LAF");
		for (UIManager.LookAndFeelInfo info :
			UIManager.getInstalledLookAndFeels()){
				System.out.println(info.getName() + "--->" + info);
		}
	}

}
