package Demo;
import java.awt.BorderLayout;
import java.awt.Color;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

import javax.swing.*;


public class FrameDemo {
	private JFrame f;
	private JPanel mb;
	private JButton btn;
	public FrameDemo(){
		try {
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.frameBorderStyle.translucencyAppleLike;
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		btn = new JButton("操你妈");
		mb = new JPanel();
		f = new JFrame();
		btn.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
		
		f.add(mb);
		f.add(btn,BorderLayout.SOUTH);
		f.setVisible(true);
		f.setSize(300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		new FrameDemo();
	}
}
