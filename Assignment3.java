package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Assignment3 {

	public static void main(String[] args) {
		
		// Question 1
		System.out.println("Question 1");
		List<String> list = new ArrayList<String>();
		list.add("first");
		list.add("second");	
		System.out.println(list.get(0) + ", " + list.get(1));
		String temp = list.get(0);
		list.add(0, list.get(1));
		list.add(1, temp);
		System.out.println(list.get(0) + ", " + list.get(1));
		
		// Question 2
		System.out.println("Question 2");
		List<String> list2 = new ArrayList<String>(list);
		System.out.println(list2.get(0) + ", " + list2.get(1));	
		
		//Question 3
		System.out.println("Question 3");
		list.add("Third");
		ListIterator<String> ite = list.listIterator();
		
		//Not working I don't know why!
		while (ite.hasPrevious()) {
			System.out.println(ite.previous());
		}
		
		// Question 4
		System.out.println("Question 4");
		List<String> list3 = new LinkedList<String>();
		list3.add("first");
		list3.add("two");
		list3.add("three");
		// No such a method!
		//list3.offerLast();
		
		// Question 5
		System.out.println("Question 5");
		System.out.println(list2.contains("first"));
		
		// Question 6
		System.out.println("Question 6");
		List<String> list4 = new ArrayList<String>(); 
		list4.addAll(list);
		ListIterator<String> ite2 = list4.listIterator();
		
		while (ite2.hasNext()) {
			ite2.next();
		}
		
		// Question 7
		
		System.out.println("Question 7");
		
		
	}
	
	

}
