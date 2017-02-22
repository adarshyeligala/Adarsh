
public class Ifelse{
	int age;
	public void age(int age){
		if(age>40)
		{
			System.out.println("you are eligible for cm post");
		 		if(age<18)
		 		{
		 			System.out.println("you are not eligible to vote ");
		 		}        
		 		else 
		 		{
		 			System.out.println("welcome to vote");
		 		}
		       }
	           else
	   	      {
	    }
	}
	public static void main(String[] args) {
		 Ifelse ob = new Ifelse();
		 ob.age(41);
	}
}

