import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String [] args) {
		int sum = 0, a, temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number=sc.nextInt();
		temp=number;
		while(number>0) {
			a=number%10;
			sum=sum +(a*a*a);
			number=number/10;
		}
		if(temp==sum) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not Armstrong number");
		}
	}
}
