package »­±Ê¿ò;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test{

	    public static void main(String[] args) {
	        Frame f = new Frame();
	        Panel p= new Panel() {
	 
	            @Override
	            public void paint(Graphics g) {
	                // TODO Auto-generated method stub
	                super.paint(g);
	                g.setColor(Color.GRAY);
	                for (int x = 0; x < 400; x+=20){
	                	g.fill3DRect(x, 0, 20, 20, true);
	                }
	            }
	             
	        };
	        f.setVisible(true);
	        f.setBounds(100, 100, 400, 400);
	        f.add(p);
	    }
}
