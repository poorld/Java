package ���java;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;

public class CommonComponent{
	public static void main (String args[]){
	Frame f = new Frame("����");
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox male = new Checkbox("��" , cbg , true);
	Checkbox female = new Checkbox("Ů" , cbg , false);
	Checkbox married = new Checkbox("�Ƿ��ѻ�?" , false);
	f.setBounds(100,100,500,500);
	f.add(male);
	f.add(female);
	f.add(married);
	f.pack();
	f.setVisible(true);
}
}
