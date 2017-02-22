//program for reading a file in (char) or in (bytes) 
package adarsh;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class IOreader {
static FileInputStream obj1;
public static void main(String[] args){  
File obj= new File("d:\\adarsh.txt");
 if(obj.exists()){
	 try{
		 obj1=new FileInputStream(obj);
		 int data= obj1.read();
		 while(data!=-1){
			 //System.out.println((char)data);
			 //System.out.println(data);
			System.out.println(data+"="+(char)data);
			data=obj1.read();
		 }
	 } 
		 catch(FileNotFoundException e)
		 {
			 e.printStackTrace();
		 }
			catch(IOException e)
			{
				e.printStackTrace();
			}
	 finally{
		 try
		 {
			 obj1.close();
		 }
		 catch(IOException e)
		 {
			 e.printStackTrace();
		 }
		 
	 }
 }
}
}
	 
	 
	


	 

 
