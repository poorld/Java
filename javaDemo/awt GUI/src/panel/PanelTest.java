package panel;
import java.awt.*;
public class PanelTest {

	public static void main(String[] args) {
		Frame f = new Frame("My panel");//���һ��Frame�����ڣ�
		Panel p = new Panel(null);//���panel
		f.setBounds(300,300,500,500);//����freme��ʼx,y,w,h
		f.setBackground(new Color(0,0,255));//���ñ�����ɫ
		p.setBounds(50,50,400,400);//����panel��ʼx,y,w,h
		p.setBackground(new Color(255,0,0));//���ñ�����ɫ
		f.add(p);//��panel��ӵ�frame����ʾ
		f.setVisible(true);
	}

}
