package ���java;

import javax.swing.UIManager;

public class AllLookAndFeel {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("��ǰϵͳ���õ�����LAF");
		for (UIManager.LookAndFeelInfo info :
			UIManager.getInstalledLookAndFeels()){
				System.out.println(info.getName() + "--->" + info);
		}
	}

}
