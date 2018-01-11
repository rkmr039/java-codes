public class SimpleInterest
{

	int p,n;
	double r,si;

	public SimpleInterest()
	{
		p = 1000;
		n = 3;
		r = 8.5;
		si = p*n*r/100;

	}

	public void show()
	{
		System.out.println("Simple Interest: "+si);
	}


	public static void main(String []args)
	{
		
		SimpleInterest interest = new SimpleInterest();
		interest.show();

		

	}



}