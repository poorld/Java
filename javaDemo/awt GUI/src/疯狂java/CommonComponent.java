package ·è¿ñjava;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;

public class CommonComponent{
	public static void main (String args[]){
	Frame f = new Frame("²âÊÔ");
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox male = new Checkbox("ÄÐ" , cbg , true);
	Checkbox female = new Checkbox("Å®" , cbg , false);
	Checkbox married = new Checkbox("ÊÇ·ñÒÑ»é?" , false);
	f.setBounds(100,100,500,500);
	f.add(male);
	f.add(female);
	f.add(married);
	f.pack();
	f.setVisible(true);
}
}
