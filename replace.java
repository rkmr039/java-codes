class replace
{
	public static void main(String[] args)
	{

		String str = "qw3e34r5t6y";
		System.out.println(str);

		System.out.println("Remove first occurence of 3 from string ");
		System.out.println(str.replaceFirst("3",""));

		System.out.println(str);
		System.out.println("Remove all occurence of 3 fromt string ");
		System.out.println(str.replace("3",""));

		System.out.println(str);
		System.out.println("Remove all numbers fron string without using any loop ");
		System.out.println(str.replaceAll("[0-9]",""));

	}
}