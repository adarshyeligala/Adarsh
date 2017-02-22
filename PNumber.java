package coreJava;
import java.util.Scanner;
public class PNumber { 
public static void main(String[] args) {
	int r,sum=0,temp,n;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the number to check wheter the given num is palindrome or not");System.out.println("Enter the number to check wheter the given num is palindrome or not");
 n=sc.nextInt();
 temp=n;
           while(n>0){
        	  r=n%10;
        	  sum= (sum*10)+r;
        	  n=n/10;
           }
       if(temp==sum)
       {
    	   System.out.println("It is palindrome number");
       }
       else
       {
    	   System.out.println("It is not palindrome number");
       }
  
		

	}

}
