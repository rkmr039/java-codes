/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Queue2
{
	int []line = new int[10];
	int left;
	int right;
	int elements;
	
	Queue2()
	{
		elements=0;	
		right=0;
		left=0;
	}
	
	public void insert(int val)
	{
  	line[left]=val;
		right++;
		elements++;
		
	}
	
	public void delete()
	{
		right--;
		elements--;
		//System.out.println("Right: "+right+"\nLeft: "+left);
	}
	
	public void show()
	{
		System.out.println("Right: "+right+"\nLeft: "+left);
	int x = elements;
		System.out.println("No of Elements: "+elements);
	 while(x>-1)
	  {
			System.out.println(line[x]);
			x--;
		}
	}
		
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Queue using Array");
		Queue2 q1=new Queue2();     
		q1.insert(5);
		q1.insert(6);
		q1.insert(7);
		q1.show();
		q1.delete();
		q1.show();
	}
}
