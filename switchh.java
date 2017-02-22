
public class switchh { 
	 char grade= 'd';
     public void grade(){
		switch (grade){
		 case 'a':
			 System.out.println("He is excellent");
			 break;
		 case 'b':
			 System.out.println("well done");
			 break;
		 case 'c':
			 System.out.println("good marks");
			 break;
		 case 'd':
		 System.out.println("invalid");
		 }
     }

	public static void main(String[] args) {
		switchh ob= new switchh();
		ob.grade();
		 

	}

}
