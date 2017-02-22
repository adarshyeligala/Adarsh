package adarsh;
import java.io.*;
public class creatingFile {
public static void main(String[] args) {
	 File file= new File("d:\\chintu.txt");
	 FileWriter Writer= null;
	 if(!file.exists()){
		 try{
			  file.createNewFile();
			  Writer= new FileWriter(file);
			  Writer.write("hello good morning");  
		 }
		 catch(IOException e){
			 e.printStackTrace();
		 }
		  finally{
			  try{
				  Writer.close();
			  }
			  catch(IOException e){
				  e.printStackTrace();
			  }
		  }
	 }
		

	}

}
