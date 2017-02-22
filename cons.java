
public class cons {
	int x=100,y=100,z;
	 cons(){
		  z=x+y;
		   System.out.println(z);
	 }
   }
	  class chintu extends cons{
		        chintu( ) { 
		        super(); 
			 System.out.println(super.x);   
			 
		}
	public static void main(String[] args) {
		   chintu ob= new chintu();
	}

}
