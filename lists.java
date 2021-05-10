package day9;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class lists
{
	public static void main(String[] args)
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("apple");
		a.add("mango");
		a.add("grapes");	

        LinkedList<String> l = new LinkedList<String>();
	    l.add("hyderabad");
	    l.add("chennai");
	    l.add("karnataka");
	
	lists ll=new lists();
	ll.display(a);
	ll.display(l);
	}
	
	public void display(List<String>list)
	{
		for(String s : list)
		{
		   System.out.println(s);
		}
	}
}