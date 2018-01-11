import java.util.Scanner;

public class LuJava45
{
	public static void main(String []args)
	{
		System.out.println("Enter any number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("Your Input: "+number);
		int sum =0;	
		while (number >0)
		{
			sum = sum+number%10;
			number = number/10;
		}

		System.out.print("Sum of Digits: "+sum+"\n");
		scanner.close();
	}
}