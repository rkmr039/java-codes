import java.util.*;


public class Arrays
{
	int array[];
	int size;

	Arrays(int size)
	{
		this.size = size;
		array = new int[this.size];
	}

	void getArray()
	{
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter "+this.size+" Integers");
		for(i=0; i<this.size; i++)
		{
			array[i] = sc.nextInt();
		}
		sc.close();
	}

	void showArray()
	{
		for(int i:this.array)
			System.out.println(" "+i);	
		System.out.println("");
	}
	public static void main(String args[])
	{
		// Object of class Arrays having array of size 5 
		Arrays a = new Arrays(5);
		a.getArray();
		a.showArray();
	}

}
