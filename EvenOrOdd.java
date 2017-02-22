package coreJava;
import java.util.Scanner; 
public class EvenOrOdd {
public static void main(String[] args) {
	int c;
System.out.println("Enter an integer to check whether it is even or odd");
  Scanner sc= new Scanner(System.in);
  c=sc.nextInt();
  if(c/2*2==c){
  System.out.println("you have entered even number");
  }
  else
 System.out.println("you have entered odd number");
       }

}
