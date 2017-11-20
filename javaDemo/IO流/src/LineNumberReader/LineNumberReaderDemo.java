package LineNumberReader;
import java.io.*;

//getLineNumber : ��ȡ�к�
//setLineNumber(100) : ��101��ʼ

public class LineNumberReaderDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		FileReader fr = null;
		LineNumberReader lnr = null;
		try{
			fr = new FileReader("text/text1");
			lnr = new LineNumberReader(fr);
			
			String line;
			while ((line = lnr.readLine()) != null){
				//getLineNumber : ��ȡ�к�
				System.out.println(lnr.getLineNumber() + ":" + line);
			}
			System.out.println();
		}catch(Exception e){
			System.out.println(e);
		}
		finally{
			try{
				lnr.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}

}
