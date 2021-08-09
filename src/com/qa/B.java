package com.qa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class B extends A{

	
	public void display() {
		
		System.out.println("B display");
	}
	
	public static void main(String args[]) {
		
		
		B b1 = new B();
		b1.display();
		
		A a1 = new A();
		
		
		String s1 = "helloworld";
		char ch[] = s1.toCharArray();
		Set<Character> s2 = new HashSet<Character>();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		String s3="";
		for(char ch1 : ch ) {
			
			/*
			 * if(map.containsKey(ch1)) {
			 * 
			 * map.put(ch1, map.get(ch1)+1); } else {
			 * 
			 * map.put(ch1, 1); }
			 */
			if(s2.add(ch1))
			s3 = s3 + ch1;
		}
		
		System.out.println(s3);
		/*
		 * for(Entry e : map.entrySet()) {
		 * 
		 * 
		 * System.out.println(e.getKey() + "  " + e.getValue()); }
		 */
		
		
	}
}
