import java.io.*;
public class fileReader1 {

	public static void main(String[] args) {
 Reader fileReader = new FileReader("c:\\data\\input-text.txt");
		int data = fileReader.read();
		while(data != -1) {
		  file.write();
		  data = fileReader.read();
		}
		file.close()

	}

}
