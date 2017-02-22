import java.io.*;

public class InputOutput {
	public static void main(String[] args) {
		try{	 
	FileOutputStream file= new FileOutputStream ("D:\\testout.txt");
	 String s="hi hello";
	 byte b[]=s.getBytes();
	 file.write(b);
	 file.close();
	 System.out.println("hello java");
		}	
	 catch(Exception e){
		 System.out.println("e");
	     }
  
	

	}

}
