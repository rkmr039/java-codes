
public class toCharArray
{
	public static void main(String args[]) 

	{
		String str = "This is a String";

		// String object to character array 
		char charArray[] = str.toCharArray();

		for(char t : charArray)
			{
				System.out.println(t);
			}
	}
} 