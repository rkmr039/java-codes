/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Queue
{
	ArrayList<Integer> line = new ArrayList<Integer>(1);
	int left;
	int right;
	int head;
	
	Queue()
	{
		head=0;	
		right=0;
		left=0;
	}
	
	public void insert(int val)
	{
  	line.add(left,val);
		right++;
		//System.out.println("Right: "+right+"\nLeft: "+left);
		
	}
	
	public void delete()
	{
		line.remove(--right);
		//right--;
		//System.out.println("Right: "+right+"\nLeft: "+left);
	}
	
	public void show()
	{
		System.out.println("Right: "+right+"\nLeft: "+left);
		System.out.println(line);
		
		
		}
		
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Queue using ArrayList");
		Queue q1=new Queue();     
		q1.insert(5);
		q1.insert(6);
		q1.insert(7);
		q1.show();
		q1.delete();
		q1.show();
		                                                                  
		
		
	}
}
