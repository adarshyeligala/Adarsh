package adarsh;
import java.io.*;
public class ThreadFileInputStream extends Thread{
	public void run(){
	File obj= new File("d:\\adarsh.txt");
	FileInputStream obj1= null;
	byte data[]= new byte[(int)obj.length()];
	if(obj.exists()){
		             try {
					obj1= new FileInputStream(obj);
					obj1.read(data);
					for(byte b:data){
						System.out.println((char)b);
					}
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
		        	   try {
						obj1.close();
					} catch (IOException e) {
					 e.printStackTrace();
					}
		           }
	              }
	       }

	public static void main(String[] args) {
	ThreadFileInputStream ob= new ThreadFileInputStream();
		ob.start();
 
	        }
 	       }

          
