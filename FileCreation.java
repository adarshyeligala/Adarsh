package adarsh;
import java.io.*;
import java.nio.file.Files;
public class FileCreation {
	 
	public static void main(String[] args) {
		
 File file= new File("d:\\adarsh\\chintu\\vinay.txt");

            FileWriter writer=null;
            if(!file.exists()){      
        try{
        	 file.createNewFile();
        	 writer= new FileWriter(file);
        	 writer.write("hello hi Good morning");
        }
catch (FileNotFoundException e) { 
	e.printStackTrace();
}
        catch(IOException e){
        	e.printStackTrace();
        }
        finally{
        	try{
        		writer.close();
        	}
        	catch(IOException e){
        		e.printStackTrace();
       }
      }
	}
  }
}

	 