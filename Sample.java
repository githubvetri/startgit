package org.list;

import java.util.ArrayList;
import java.util.List;

import org.specifier.Company;

public class Sample  {
public static void main(String[] args) {
	
	
	List<Integer>  li1 = new ArrayList<Integer>();
	
	
	li1.add(10);
	li1.add(20);
	li1.add(30);
	li1.add(40);
	li1.add(50);
	li1.add(10);
	
	
	int size = li1.size();
	System.out.println(size);
	
	Integer integer = li1.get(4);
	System.out.println(integer);
	
	li1.add(3, 130);
	System.out.println(li1);
	
	li1.remove(3);
	System.out.println(li1);
	
	li1.set(3, 230);
	System.out.println(li1);
	
	int indexOf = li1.indexOf(230);
	System.out.println(indexOf);
	
	int lastIndexOf = li1.lastIndexOf(10);
	System.out.println(lastIndexOf);
	
	boolean contains = li1.contains(230);
	System.out.println(contains);
	
	for (int i = 1; i < li1.size(); i++) {
		
		Integer e = li1.get(i);
		System.out.println(e);
		
	}
	System.out.println("***********");
	for (Integer x : li1) {
		
		System.out.println(x);
	}
	
	
	
	
}
}
