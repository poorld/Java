package baseSoundCode;
import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

public class Main{
	public Main(){
		try {
			//���ñ����Խ��ı䴰�ڱ߿���ʽ���� 
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;//ϵͳĬ����ʽ
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;//ǿ�����͸��
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencySmallShadow;//������а�͸��
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.generalNoTranslucencyShadow;//��ͨ��͸��
			
			/*
			 * �����Java������������Beauty Eye�����
			 */
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		/*
		 * ��ʼ��
		 * */
		
		
	}
	
	public static void main(String args[]){
		/*�������ð�ť
		���ô˿�����Ϊfalse����ʾ�ر�֮��BeautyEye LNF��Ĭ����true 
		*/
		UIManager.put("RootPane.setupButtonVisible", false); 
	
		new Main();
	}

}
