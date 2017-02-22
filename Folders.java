package adarsh;
import java.io.File;
public class Folders {
	public static void main(String[] args) {
	    File file = new File("d:\\chintu");
 if (!file.exists()) {
 if (file.mkdir()) {
 System.out.println("Directory is created");
		     } else {
		    	 System.out.println("Failed to create directory!");
		            }
		        }

 File files = new File("d:\\chandu\\vinay\\ranga");
		    if (!files.exists()) {
		     if (files.mkdirs()) {
 System.out.println("Multiple directories are created!");
		         } else {
      System.out.println("Failed to create multiple directories!");
		         }
		        }

		    }

		
	}


