import java.util.Scanner;
public class poweredNumbers{
	public static void main(String[] args) {
		Double number, power;
		System.out.println("CALCULATE YOUR POWERED NUMBER");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number:");
		number=sc.nextDouble();
		System.out.println("Enter Power:");
		power=sc.nextDouble();
		
		System.out.println("Your result is: " + Math.pow(number,power));
	}
}