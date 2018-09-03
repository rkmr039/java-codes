// Print the largest Prime number within input string of integer array in ascending order 
// input is given through Command Line 
import java.util.Scanner;
import java.util.StringTokenizer;
class LargestPrime
{

	public static boolean IsPrime(int num)
	{
		boolean flag = false;
		if(num == 2 || num == 3) flag = true;
		else
			{
				for(int i=2; i <= num/2; i++)
				{
					if(num % i == 0)
					{
						flag = false;
						break;
					} 
					else flag = true;
				}
			}
		return flag;
	}
	public static void main(String args[])
	{
		int max = 0,num = 0;
		boolean check = false;
		StringBuilder sb = new StringBuilder(args[0]);
		if(args.length > 0)
		{
			Scanner in = new Scanner(args[0]+",");
			StringTokenizer st = new StringTokenizer(in.nextLine(),",");
			while(st.hasMoreTokens())
			{
				num = Integer.parseInt(st.nextToken());
				//num = Integer.valueOf(st.nextToken());
				//System.out.println("NUM : " + num);
				if( IsPrime(num) )
				{
					max = num;
				}
			}
			System.out.println(max);
		}
	}
}