package adarsh;
import java.io.*;
public class Readingfile{
	public static void main(String[] args) {
		FileReader reader= null;
		File file= new File("d:\\chintu.txt");
		if(file.exists()){
			try{
				reader= new FileReader(file);
				int data= 0;
				while((data=reader.read())!=-1){
					//System.out.println((char)data);
					System.out.println(data+"="+(char)data);
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
}

 
