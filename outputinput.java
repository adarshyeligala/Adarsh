package adarsh;
import java.io.*;
public class outputinput {
	public static void main(String[] args) {
		String s="hello";
		try{
 FileOutputStream file= new FileOutputStream("d:\\counter strike.txt");
 FileInputStream  ride= new FileInputStream("d:\\counter strike.txt");
      byte[]byteArray=s.getBytes();
       file.write(byteArray);
         int g;
         while((g=ride.read())!=-1){
         System.out.println(g+"="+(char)g);
       file.close();
       
	}
		}
		catch(Exception e){
			e.printStackTrace();
		}

}
}
