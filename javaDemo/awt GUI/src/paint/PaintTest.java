package paint;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class PaintTest {

	public static void main(String[] args) {
		PaintTest pt = new PaintTest();
		pt.new TFFrame().lunchFrame();

	}
	
	class TFFrame extends Frame{
		public void lunchFrame(){
			setBounds(100,100,600,600);
			setVisible(true);
		}
		public void paint(Graphics g){
			Color c = g.getColor();
			g.setColor(Color.RED);
			g.fillOval(50, 50, 100, 100);//圆
			g.setColor(Color.BLUE);
			g.fillRect(100, 100, 50, 50);//长方形
			g.setColor(Color.BLACK);
			g.drawLine(0, 300, 600, 300);//直线
			g.drawLine(300, 0, 300, 600);
			g.drawLine(0, 600, 600, 0);
			g.setColor(c);//还原现场
		}
	}

}
