import java.util.*;

class Search
{
	ArrayList<Integer> array = new ArrayList<Integer>(1);
	int item;

	/*Search()
	{
		Scanner scanner = new Scanner(System.in);
	}*/
	public void getArray()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		while(!scanner.hasNextInt())
		{
			scanner.next();
			System.out.println("Please Enter integer...");
		}
		int elements = scanner.nextInt();
		System.out.println("Enter "+elements+" integers: ");
		for(int i =0; i<elements; i++)
		{
			array.add(i,scanner.nextInt());
		}

	}	


	public void linearSearch( int item)
	{
		int comparisons=0;
		for(int i:this.array)
		{
			comparisons++;
			if(item == i)
			{
				System.out.println("Found...");
				break;
			}

			else if(i == array.size())
			{
				System.out.println("Not Found....");
				break;
			}
		}
		System.out.println("Comparisons: "+comparisons);
	}

	public void binarySearch(int item)
	{
		
	}

	public int getItem()
	{
		int item;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the element want to search: ");
		item = scanner.nextInt();
		return item;

	}

	/*public void binarySearch(int array[], int item)
	{


	}*/	
	public static void main(String []args)
	{
		Search aryObj = new Search();

		aryObj.getArray();

		int item = aryObj.getItem();
		
		aryObj.linearSearch(item);
		aryObj.binarySearch(item);
	}
}