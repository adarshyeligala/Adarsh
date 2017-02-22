package adarsh;
import java.io.*;
public class BufferedReader1 {
	public static void main(String args[]){
	File obj= new File("d:\\adarsh.txt");
	FileReader obj1= null;
	BufferedReader obj2= null;
	if(obj.exists()){
	         try{
	       obj1= new FileReader(obj);
	       obj2= new BufferedReader(obj1);
	       String s= obj2.readLine();
	       while(s!=null){
	    	   System.out.println(s);
	    	   s= obj2.readLine();
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
	        	 try{
	        		 obj2.close();
	        	 }
	        	 catch(IOException e)
	        	 {
	        		 e.printStackTrace();
	        	 }
	         }
	     }
	}
}

 
