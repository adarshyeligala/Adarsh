import java.io.FileWriter;
public class fileWriter {
	public static void main(String[] args) {
		try{
			FileWriter file= new FileWriter("d:\\adarsh.txt");
			file.write("hello java");
			file.close();
		}
		catch(Exception e){
			System.out.println("hi");
			
		}


	}

}
