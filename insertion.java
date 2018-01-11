class insertion
{
	public static void main(String []args)
	{
		int array[] = {5,9,3,7,2,0,55,33,10,72,17,99};
		int i,j,temp;
		//System.out.println(array.length);

		for(i=1; i<array.length; i++)
		{
			temp = array[i];
			j= i-1;
			while(j>=0)
			{
				if(temp <array[j])
				{
					array[j+1] = array[j];
					array[j] = temp;
				}

				j--;
			}
		}
		System.out.println("");
		for(int k:array)
		{

			System.out.print(" "+k);
		}
		System.out.println("");
	}
}