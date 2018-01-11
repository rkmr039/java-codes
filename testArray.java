import java.util.Scanner;

class testArray
{
	int array[] = new int[10];

	void fillArray()
	{
		System.out.println("Enter 10 numbers...");
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<10; i++)
		{
			array[i] = scanner.nextInt();
		}
		scanner.close();

	}

	void showArray()
	{
		int counter=0;
		for(int i:array)
		{
			System.out.println("Index: "+counter);
			System.out.println(i);
			counter++;
		}
	}
	public static void main(String []args)
	{
		testArray array1 = new testArray();
		array1.fillArray();

		array1.showArray();


	}
}