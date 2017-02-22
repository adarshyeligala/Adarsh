package coreJava;
import java.util.Scanner;
public class primenumber {
	public static void main(String[] args) {
		int i, m=0,temp=0,n;
 Scanner sc= new Scanner(System.in);
 System.out.println("enter the number to check wheter it is prime or not");
  n=sc.nextInt();
  m=n/2;
  for(i=2;i<=m;i++){
	  if(n%i==0){    
 // System.out.println("it is not prime number");
  temp=0;
  System.out.println("it is not prime number");
//break;
  }
  }
	  if(temp==1){    
		  
		  System.out.println("It is   prime");
		  
	  }
}     
}
  
		
	

	


