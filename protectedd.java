package adarsh;
public class protectedd {
	    int x=100,y=200,z;
	    protected void sum(){
		    z=x+y;
		    System.out.println(z);
	   }
}
     class chintu extends protectedd{
    	  protected void diff(){
    		  z=x-y;
    		  System.out.println(z);
    		  System.out.println(super.x); 
    		  super.sum();
    	  }
	public static void main(String[] args) {
		chintu ob= new chintu();
		ob.diff();
	}
}
