package adarsh;
import java.io.*;
public class FC {
	static String s="hello chandu good afternoon";
	public static void main(String[] args) {
	File file= new File("d:\\uff.txt");
	 FileWriter Writer= null;
	      System.out.println(s);
	 
	       if(!file. exists()){
	    	   try{
	    		   file.createNewFile();
	    		   Writer.write("Hello hi");
	    	   }
	    	   catch(IOException e)
	    	   {
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

	 