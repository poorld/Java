package �������������;
import java.awt.*;
import javax.swing.*;

public class Test_1 extends JFrame{
	JPanel mb1,mb2;
	JLabel text1,text2;
	JComboBox xlk;
	JList lb;
	JScrollPane gd;
	
	public static void main (String[] args){
		Test_1 t = new Test_1();
	}
	
	public Test_1(){
		mb1 = new JPanel();
		mb2 = new JPanel();
		text1 = new JLabel("����");
		text2 = new JLabel("רҵ");
		
		String[] gj = {"����","�㶫","����","����"};
		xlk = new JComboBox(gj);
		
		String[] zy = {"��ש","����","����","˾��","����","���"};
		lb = new JList(zy);
		lb.setVisibleRowCount(3);
		gd = new JScrollPane(lb);
		
		this.setLayout(new GridLayout(2,1));
		mb1.add(text1);		mb1.add(xlk);
		mb2.add(text2);		mb2.add(gd);//�͵�ѡ��ť��ͬ������Ҫ��ӹ������
		
		this.add(mb1);		this.add(mb2);
		
		this.setTitle("������");
		this.setBounds(200,200,200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
}
