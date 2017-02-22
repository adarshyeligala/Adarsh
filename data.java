public class data {
	int x,y,z;
	  public void sum(int x, int y){
		    z=x+y;
		     System.out.println(z);
	  }
	    public void diff(int x, int y){
	    	 z=x-y;
	    	 System.out.println(z);
	    }
	      public void mul(int x, int y){
	    	   z=x*y;
	    	   System.out.println(z);
	      }
	       public void div(int x, int y){
	    	    z=x/y;
	    	    System.out.println(z);
	       }
	       public void mod(int x, int y){
	    	    z=x%y;
	    	     System.out.println(z);
	       }
   public static void main(String[] args) {
	   data ob= new data();
	   ob.sum(10, 20);
	   ob.diff(30, 20);
	   ob.mul(30, 2);
	   ob.div(20, 2);
	   ob.mod(10, 2);
	

	}

}
