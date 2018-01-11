import java.util.Scanner;

public class SmallStack
{

	public void fun1(int n,int condition)
	{		
		if(n<condition)
		{
			System.out.println("Push: "+n);
			fun1(++n,condition);
			System.out.println("Pop: "+--n); 
		}
	}

	public static void main(String []args)
	{
		int x = 0;
		SmallStack stack1 = new SmallStack();
		System.out.println("Enter th enumber of stack element: ");
		Scanner scanner  = new Scanner(System.in);
		int condition = 1+scanner.nextInt();
		stack1.fun1(x,condition);
	}
}