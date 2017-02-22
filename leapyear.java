package coreJava;
import java.util.Scanner;
public class leapyear {
public static void main(String[] args) {
  int year;
 Scanner sc= new Scanner(System.in);
 System.out.print("Enter Year : ");
 year= sc.nextInt();
   if(year%4==0) //&& (yr%100!=0))
   {
	   System.out.println(" it is Leap year");
   }
   else if(year%100==0)
   {
	  System.out.println("This is not a Leap year");
   }
   else if(year%4==0)
   {
	   System.out.println("This is Leap year");
   }
   else{
	   System.out.println("This is not a Leap year");
   }

	}

}
