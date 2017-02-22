package adarsh;

public class privatee {
	private int x=100,y=200,z;
	 private void sum(){
		  z=x+y;
		  System.out.println(z);
	  }
	       private void diff(){
	    	  z=x-y;
	    	  System.out.println(z);
	      }
	public static void main(String[] args) {
		privatee ob= new privatee();
		ob.sum();
		ob.diff();
		 

	}

}
