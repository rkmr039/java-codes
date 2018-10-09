// euqlas() is a method in String as well as StringBuffer class
// if the equals() is not overridden locally then object class method is called
// that performs object refrence comparison 

public class Equals
{
	String name;
	Equals(String str)
	{
			this.name = str;
	}
	
	public static void main(String []args)
	{
		Equals s1 = new Equals("Anvi");
		Equals s2 = new Equals("Anvi");
		System.out.println(s1.equals(s2));
		// false, because
		// object is created in heap area having different refrences
		
		String s3 = "Rishab";
		String s4 = "Rishab";
		System.out.println(s3.equals(s4));
		// true, because 
		// object is created in SCP
		// refrence of same content object is same but name could be different 
		
		StringBuffer s5 = new StringBuffer("Raja");
		StringBuffer s6 = new StringBuffer("Raja");
		System.out.println(s5.equals(s6));
		// false, because 
		// object is create in heap area having different refrences
			
	}
}