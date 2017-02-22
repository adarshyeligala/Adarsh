package adarsh;
public interface override {
	public void sum();
	public void diff();
	class chandu implements override{
		  int a =100,b=200,c;
		public void sum(){
			c=a+b;
			System.out.println(c);
		}
		public void diff(){
			  c =a-b;
			System.out.println(c);
		}
		public static void main(String args[]){
		 override ob= new chandu();
		 ob.sum();
		 ob.diff();
			
		}
	}

}
