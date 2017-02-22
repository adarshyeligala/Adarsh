
public interface A {
	public class interfacee {
		public void sum() {
		                 }
		public void diff(){
		}

	class b implements A{  
			int x,y,z;
			public void sum(int x, int y){
				z=x+y;
				System.out.println(z);
		}
	}
	            int a,b,c;
	        public void diff(int a, int b){
	        	 c=a-b;
	        	 System.out.println(c);
	        }
		public static void main(String[] args) {
		 interfacee ob=  new interfacee ();
		 ob.sum();
		 ob.diff(30,50);

		}

	}

}
