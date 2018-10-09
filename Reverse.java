// programe for reversing A STRING AND GET RETURN SAME 
// reverse() is not present in he String class 
// revesee() is only present in StringBuffer class
// reverse() will reverse each character and each word also
// to reverse a String class object convert it into StringBuffer class object

public class Reverse
{
	public static void main(String []args)
	{
		// String to StringBuffer
		String name = "Rishab Kumar Choudhary";
		StringBuffer reverseName = new StringBuffer(name);
		System.out.println(reverseName.reverse());
		
		// StringBuffer to String
		name = reverseName.toString();
		System.out.println(name);
		
		
	}
	
} 
