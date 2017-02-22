
public class inherit {
	    int x,y,z;
	    public void sum(int x,int y){
	    	z=x+y;
	    	System.out.println(z);
	    }
} 
	      class  vinay extends inherit{
	    	 public void diff(int x, int y){
	    		z=x-y;
	    		System.out.println(super.x);
	    		System.out.println(z);
	    		z=super.z*10;
	    		
	    		System.out.println("z:"+z);
	    	 }

	public static void main(String[] args) {
		vinay ob= new vinay();
		ob.diff(30, 20);
		ob.sum(30, 50);
	}

}
