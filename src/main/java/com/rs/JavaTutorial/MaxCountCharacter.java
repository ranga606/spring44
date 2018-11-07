package com.rs.JavaTutorial;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MaxCountCharacter {

	public static void main(String[] args) {
		
		MaxCountCharacter st = new MaxCountCharacter();
		st.getMaxCount("hi how are you are yue aa xx aa");
		
	}
	
	
	private void findLength(String S) {
		char[] array = S.toCharArray();
				int count = 1;
				int max = 0;
				char maxChar = 0;
				for(int i=1; i<array.length; i++){ // Start from 1 since we want to compare it with the char in index 0
				    if(array[i]==array[i-1]){
				        count++;
				    } else {
				        if(count>max){  // Record current run length, is it the maximum?
				            max=count;
				            maxChar=array[i-1];
				        }
				        count = 1; // Reset the count
				    }
				}
				if(count>max){
				    max=count; // This is to account for the last run
				    maxChar=array[array.length-1];
				}
				System.out.println("Longest run: "+max+", for the character "+maxChar); // Print the maximum.
		
		
		
	}
	
	private void getMaxCount(String str) {
		
		Map<Character,Integer> map= new Hashtable<>();
		for(int i=0; i<str.length(); i++) {
			char current = str.charAt(i);
			if(current==' ')
			continue;	
			
			if(map.get(current) == null) {
				map.put(current, 1);
			}else {
				map.put(current, map.get(current)+1);
			}
		}
		
		int maxcount =0;
		char maxchar = 'a';
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			if(maxcount < entry.getValue()) {
				maxcount = entry.getValue();
				maxchar = entry.getKey();
			}
			
		}
		
		System.out.println("max count"+ maxcount +" max char :" +maxchar);
		
	}
	
	
	
}
