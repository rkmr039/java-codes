// Print the longest palindrom word available in input given through command line
// CMD INPUT: madam arora is malayalam teacher
// OUTPUT : malayalam

class LongestPalindrom
{
	
	public static boolean IsPalindrom(String word)
	{
		boolean flag = false;
		int l = word.length();
		int i = 0;
		while(i != l/2)
		{
			if(word.charAt(i) == word.charAt(l-1)) flag = true;
			i++;
		}
		return flag;
	}
	public static void main(String[] args)
	{
		int max = 0;
		int len = 0,i = 0 ;
		String word,result = null;
		int k = args.length;
		if(k > 0) 
			{
				while((k--) != 0)
				{
					word = args[i];
					if(IsPalindrom(word))
					{
						//System.out.println("Palindrom : "+ word);
						len = word.length();
						if(max < len) 
							{
								max = len;
								result = word;
							}
					}i++;
				}System.out.println(result);
			}
		else System.out.println("\nCMD ARGUMENT NOT AVAILABLE");
	}
}