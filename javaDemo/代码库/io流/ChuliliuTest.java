import java.io.*;

class ChuliliuTest{
	public static void main(String args []){
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try{
			fileReader = new FileReader("f://666.txt");
			bufferedReader = new BufferedReader(fileReader);
			String line;
			while(true){
				line = bufferedReader.readLine();
				if(line == null){
					break;
				}
				System.out.println(line);
			}
		}
		catch(Exception e){
			System.out.println(e);	
		}
		finally{
			try{
			fileReader.close();
			bufferedReader.close();
			}
			catch(Exception e){
				System.out.println(e);	
			}
		}
	}
}
