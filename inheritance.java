
public class inheritance {
	 int a=100,b=200,c;
	 public void sum(int a,int b){
		  c=a+b;
		  System.out.println(c); 
	 }
}
	  class x extends inheritance{
		  public void add(){
			  c=a+b;
		 System.out.println(c);
		 System.out.println(super.a);
		  }
	public static void main(String[] args) {
		    x ob= new x();
		    ob.add();
	

	}

}
