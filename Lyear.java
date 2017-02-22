package coreJava;
import java.util.Scanner;
public class Lyear {
	public static void main(String[] args) {
		int year;
		System.out.println("enter the year to check whether the given year is leap year or not");
		Scanner sc= new Scanner(System.in);
		year= sc.nextInt();

      if(year%4==0){
    	  System.out.println("It is leap year");
      }
      else if(year%100==0)
      {
    	  System.out.println("It is not a leap year");
      }
      else
      {
    	  System.out.println("it is not leap year");
      }
	}

}
