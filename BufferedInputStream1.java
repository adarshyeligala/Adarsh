package adarsh;
import java.io.*;
public class BufferedInputStream1 {
	public static void main(String[] args) {
	File obj= new File("d:\\adarsh.txt");
	FileInputStream obj1= null;
	BufferedInputStream obj2=null;
	if(obj.exists()){
		    try {
			obj1= new FileInputStream(obj);
			obj2= new BufferedInputStream(obj1);
			 int data= obj2.read();
			while(data!=-1){
				System.out.println((char)data);
		//System.out.println(data+"="+(char)data);
				data=obj2.read();
			}
		   }	
		 catch (FileNotFoundException e)
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
