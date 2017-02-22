
public class overload {
	    

	int x,y,z;
         public void sum(int x, int y){
        	  z=x+y;
        	   System.out.println(z);
         }
           int a,b,c,d;
             public void sum(int a,int b, int c){
            	  d=a+b+c;
            	   System.out.println(d);
             }
           
	public static void main(String[] args) {
		  overload ob= new overload();
		  ob.sum(30, 50,90);
		
	}
}
