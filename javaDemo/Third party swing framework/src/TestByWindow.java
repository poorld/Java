import javax.swing.JFrame;
import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

public class TestByWindow{
	
	private JFrame f = null;
	
	public void TestByWindow(){
		try
	    {
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
	        org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
	        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			f = new JFrame("����");
	        f.setVisible(true);
	        f.setBounds(300, 50, 300, 300);
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
	public static void main(String[] args) throws Exception {
		// TODO �Զ����ɵķ������
		BeautyEyeLNFHelper.launchBeautyEyeLNF();
		new TestByWindow();
	}
}


