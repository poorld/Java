package baseSoundCode;
import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

public class Main{
	public Main(){
		try {
			//设置本属性将改变窗口边框样式定义 
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;//系统默认样式
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;//强立体半透明
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencySmallShadow;//弱立体感半透明
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.generalNoTranslucencyShadow;//普通不透明
			
			/*
			 * 将你的Java程序界面更换成Beauty Eye的外观
			 */
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		/*
		 * 初始化
		 * */
		
		
	}
	
	public static void main(String args[]){
		/*隐藏设置按钮
		设置此开关量为false即表示关闭之，BeautyEye LNF中默认是true 
		*/
		UIManager.put("RootPane.setupButtonVisible", false); 
	
		new Main();
	}

}
