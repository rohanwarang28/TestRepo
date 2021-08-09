package com.qa;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class A {

	
	public static void main(String args[]) {
		
		String s = "Hello World";
		
		char ch[] = s.toCharArray();
		Map<Character,Integer> m1 = new HashMap<Character,Integer>();
		
		
		for(char c1:ch) {
			if(m1.containsKey(c1)) {
				
				m1.put(c1, m1.get(c1)+1);
				
			}
			else{
				
				m1.put(c1, 1);
			}
			
		}
		
		
		for(Entry e : m1.entrySet()) {
			
			System.out.println(e.getKey()+" " + e.getValue());
			
		}
			
		}
		

	
	}
	

