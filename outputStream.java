package adarsh;
import java.io.*;
public class outputStream {
	public static void main(String[] args) {
	try{
	FileOutputStream file= new FileOutputStream("d:\\cs.txt");
	String s="hello java";
	byte b[]=s.getBytes();	
		file.write(b);
		file.close();
		}
		catch(Exception e){
		System.out.println(e);
		}
	}

}
