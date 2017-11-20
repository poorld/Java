package imageIO;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ZoomImage {
	//设置缩小后的图片大小
	private final int WIDTH = 800;
	private final int HEIGHT = 650;
	//定义一个BufferedImage对象,用于保存缩小后的位图
	BufferedImage image = new BufferedImage(WIDTH , HEIGHT , BufferedImage.TYPE_INT_RGB);
	Graphics g = image.getGraphics();
	public void zoom() throws Exception{
		//读取原始位图
		Image srcImage = ImageIO.read(new File("E:/F盘/图片/272041.jpg"));
		//将原始位图缩小后绘制到image中
		g.drawImage(srcImage, 0, 0, WIDTH, HEIGHT, null);
		//将Image对象输出到磁盘
		ImageIO.write(image, "jpeg", new File("G:666.jpg"));
	}
	public static void main(String[] args) throws Exception{
		new ZoomImage().zoom();
	}
}
