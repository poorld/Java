package �ֽ����������;
import java.io.*;

public class Copymp3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		long start = System.currentTimeMillis();
		copy();
		long end = System.currentTimeMillis();
		System.out.println((end-start) + "����");
	}
	
	public static void copy(){
		BufferedInputStream buis = null;
		BufferedOutputStream buos = null;
		try{
			buis = new BufferedInputStream(new FileInputStream("mp3/��ֻ����.mp3"));
			buos = new BufferedOutputStream(new FileOutputStream("mp3/��ֻ����copy.mp3"));
			int by = 0;
			
			while ((by=buis.read())!=-1){
				buos.write(by);
			}
		}catch(IOException e){
			throw new RuntimeException("����ʧ��");
		}
		
		finally{
			try{
				buis.close();
			}catch(IOException e){
				throw new RuntimeException("��ȡ�ر�ʧ��");
			}
			
			try{
				buos.close();
			}catch(IOException e){
				throw new RuntimeException("д��ر�ʧ��");
			}
		}
	}
}

