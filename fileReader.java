package adarsh;
import java.io.*;
public class fileReader {
	public static void main(String[] args) {
		FileReader reader= null;
		File file= new File("d:\\cs.txt");
		if(file.exists());
		try{
			reader = new FileReader(file);
			int data=0;
			while((data=reader.read())!=-1){
				System.out.print(data+"="+(char)data);
			}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try{
				reader.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		

	}

}
