package bufferedReader��;
import java.io.*;

public class bufferedReadCopy {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		BufferedReader bufr = null;
		BufferedWriter bufw = null;
		
		try{
			bufr = new BufferedReader(new FileReader("g:/javaRun/io/text1.txt"));
			bufw = new BufferedWriter(new FileWriter("g:/javaRun/io/text1_copy.txt"));
			
			String line = null;//��ȡһ�е�line
			
			while((line = bufr.readLine()) != null){
				bufw.write(line);//�Ѷ�ȡ����ÿһ��lineд���ļ�
				bufw.newLine();
				bufw.flush();
			}
		}catch(IOException e){
			throw new RuntimeException("��дʧ��");
		}
		finally{
			try{
				if (bufr != null)
					bufr.close();
			}catch(IOException e){
				throw new RuntimeException("��ȡ�ر�ʧ�ܣ�");
			}
			
			try{
				if (bufw != null)
					bufw.close();
			}catch(IOException e){
				throw new RuntimeException("��ȡд��ʧ��!");
			}
		}
	}

}
