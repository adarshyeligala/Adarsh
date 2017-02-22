
public class Ifelseif {
	   int marks;
	  public void mark(int marks){
		   
		    if(marks>=65&& marks<75){
		    	 System.out.println("He or she is failed");
		    }
		    else if(marks>=75&&marks<85){
		    	 System.out.println("He gets D grade");
		    }
		    else if(marks>=85&&marks<90){
		    	System.out.println("He gets c grade");
		    }
		    else if(marks>=90&&marks<100){
		    	System.out.println("he gets b grade");
		    }
		    else if(marks==100){
		    	System.out.println("he gets distinction");
		    }
		    else {
		    	 System.out.println("invalid");
		    }
	  }

	public static void main(String[] args) {
		Ifelseif ob= new Ifelseif();
		ob.mark(82);
		
		

	}

}
