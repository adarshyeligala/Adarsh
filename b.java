	    
		import java.io.File;
		import java.io.FileNotFoundException;
		import java.io.FileReader;
		import java.io.IOException;
		  public class b{
			public static void main(String[] args) {
				FileReader reader=null;
				File file=new File("d://testout.txt");
				if(file.exists()){
				try {
					reader=new FileReader(file);
					int data=reader.read();
					while(data!=-1){
						System.out.println(data);
					}
				} catch (FileNotFoundException e) { 
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				finally{
					try {
						reader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			}
		 
	}

 
