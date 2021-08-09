package com.qa;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Demo {
	
	    
		   
		    
		  public static void main(String args[]){    
		  
			  String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};  
			  int size = countries.length;  
			  //logic for sorting   
			  String temp = "";
			  for(int i=0 ; i< size ; i++) {
				  
				  
				  for(int j = i+1 ; j<size ; j++) {
					  
					  
					  if(countries[i].compareTo(countries[j])>0) {
						  
						  
						  temp = countries[j];
						  countries[j] = countries[i];
						  countries[i] = temp;
					  }
					  
				  }
				  
			  }
			  
			  System.out.println(Arrays.toString(countries));
		  }    
		}    
	
	
	//chnges made by indian

///changes are made by indian guy 1
		
	

