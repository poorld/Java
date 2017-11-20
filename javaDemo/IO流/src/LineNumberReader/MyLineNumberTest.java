package LineNumberReader;

import java.io.FileReader;
import java.io.LineNumberReader;

public class MyLineNumberTest {
		public static void main(String[] args) {
			// TODO �Զ����ɵķ������
			FileReader fr = null;
			MyLineNumberReader lnr = null;
			try{
				fr = new FileReader("text/text1");
				lnr = new MyLineNumberReader(fr);
				
				String line;
				lnr.setLineNumber(100);
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
