package imageIO;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ZoomImage {
	//������С���ͼƬ��С
	private final int WIDTH = 800;
	private final int HEIGHT = 650;
	//����һ��BufferedImage����,���ڱ�����С���λͼ
	BufferedImage image = new BufferedImage(WIDTH , HEIGHT , BufferedImage.TYPE_INT_RGB);
	Graphics g = image.getGraphics();
	public void zoom() throws Exception{
		//��ȡԭʼλͼ
		Image srcImage = ImageIO.read(new File("E:/F��/ͼƬ/272041.jpg"));
		//��ԭʼλͼ��С����Ƶ�image��
		g.drawImage(srcImage, 0, 0, WIDTH, HEIGHT, null);
		//��Image�������������
		ImageIO.write(image, "jpeg", new File("G:666.jpg"));
	}
	public static void main(String[] args) throws Exception{
		new ZoomImage().zoom();
	}
}
