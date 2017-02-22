
public interface overdd {
      public void sum();
     public void diff();
    class chandu implements overdd{
	    	public void sum() {
				int a=20,b=30,c;
			     c=a+b;
				 System.out.println(c);
	    	}
			
			public void diff() {
				int j,k=3,l=3;
	              j=k-l;
	        System.out.println(j);
			}
   }
      public static void main(String args[]){
    	  overdd obj= new chandu();
    	  obj.sum(); 
      }     
}
