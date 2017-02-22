package adarsh;
import java.io.*;
public class FileReaderr {
	public static void main(String[] args) {
		File obj= new File("d:\\adarsh.txt");
		FileReader obj2= null;
		if(obj.exists()){
		       try {
				obj2= new FileReader(obj);
				 int data=obj2.read();
				 while(data!=-1){
				System.out.println(data);
		//System.out.println(data+"="+(char)data);
					 data= obj2.read();
				 }
			} catch (FileNotFoundException e) 
		       {
				e.printStackTrace();
			}
		       catch(IOException e)
		       {
		    	   e.printStackTrace();
		       }
		       finally{
		    	   try{
		    		   obj2.close();
		    	   }
		    	   catch(IOException e){
		    		   e.printStackTrace();
		    	 }
		       }
		     }
           }
}
