package adarsh;
import java.io.*;
public class FileInputStreamm {
	public static void main(String[] args) {
	File obj= new File("d:\\adarsh.txt");
	byte data[]= new byte[(int)obj.length()];
	FileInputStream obj1= null;
	if(obj.exists()){
		     try {
				obj1= new FileInputStream(obj);
				 obj1.read(data);
				 for(byte b:data){
					 System.out.println((char)b);
					 obj1.read(data);
			}
		   }
    
	catch (FileNotFoundException e) 
	      { 
				e.printStackTrace();
			}
	catch(IOException e){
		e.printStackTrace();
	}
	 finally{
		 try{
			 obj1.close();
		 }
		 catch(IOException e){
			 e.printStackTrace();
		 }
	 }
	 

	}

}
}
