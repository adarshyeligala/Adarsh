package adarsh;
import java.io.*;
public class FileOutputWriterr {
	public static void main(String[] args) {
	File obj= new File("d:\\chintu.txt");
	FileOutputStream obj1= null;
	if(!obj.exists()){
    try {
	String s= "hello Adarsh";
	obj1= new FileOutputStream(obj);
	byte a[]= s.getBytes();
	obj1.write(a);
	System.out.println(s);
	}
    catch (FileNotFoundException e)
    {
	e.printStackTrace();
	}
    catch (IOException e)
    {
	e.printStackTrace();
	}
    finally{
    	try{
    		obj1.close();
    	}
    	catch (IOException e)
        {
    	e.printStackTrace();
    	}
    }
		      
	}
	 

	}

}
