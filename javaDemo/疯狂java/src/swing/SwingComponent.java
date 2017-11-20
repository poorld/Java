package swing;
import java.awt.*;


import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class SwingComponent {
	JFrame f = new JFrame("≤‚ ‘");
	JPanel mb = new JPanel();
	Icon okIcon = new ImageIcon("");
	JTextArea wbk = new JTextArea(8,20);
	JButton bt = new JButton("ƒ„¬Ë");
	
	public void init() throws UnsupportedLookAndFeelException{
		f.add(bt,BorderLayout.SOUTH);
		f.add(wbk);
		UIManager.setLookAndFeel(new MetalLookAndFeel());
		f.setBounds(200, 50, 200, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	public static void main(String[] args) throws UnsupportedLookAndFeelException{
		SwingComponent s = new SwingComponent();
		s.init();
		System.out.println(UIManager.getCrossPlatformLookAndFeelClassName());
	}
}