import java.util.Scanner;
public class addTwoNumbers{
public static void main(String[] args){
	int value1, value2, sum;

	Scanner sc = new Scanner(System.in);
	System.out.println("welcome to EgoSoft's SUMS program");
	
	System.out.println("Enter first value");
	value1 =sc.nextInt();
	
	System.out.println("Enter second value");
	value2 =sc.nextInt();
	
	sum = value1 + value2;
	
	System.out.println("the sum of " + value1 + " and " + value2 + " is: " + sum);
	}
}