
   public interface inter {
	    public void mul (int a, int b);
	    public void sum (int a,int b);
	     public class chandu implements inter{
	    	 int a,b,c;
	    	 public void mul(int a,int b){
	    		 c=a*b;
	    		 System.out.println(c); 
  }
			
			public void sum(int a, int b) {
			int x,y,z;
				c=a+b;
				System.out.println(c);
			}
				
			}
			 public static void main(String args[]){
				 chandu ob= new chandu();
				 ob.sum(100, 200);
				 ob.mul(100,20);
	}
	}

 
