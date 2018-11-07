package com.rs.JavaTutorial;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TestInterface implements interface2{

	@Override
	public void printst() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printtag() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		  Map<String,String> m1=new HashMap<String,String>();  
		m1.put("a", "HashMap");
		m1.put("x", "java2");
		m1.put("b", "Hyden");
		m1.put("c", "java2s");
		
		  Map<String,String> sm=new TreeMap<String,String>();  
		
		  sm.put("a", "HashMap");
		  sm.put("x", "java2");
		  sm.put("b", "Hyden");
		  sm.put("c", "java2s");
		
		 Map<String,String> lm=new LinkedHashMap<String,String>();  
		 lm.put("a", "HashMap");
		 lm.put("x", "java2");
		 lm.put("b", "Hyden");
		 lm.put("c", "java2s");
		
		System.out.println("---------------------HashMap------------------------");
		for(Map.Entry<String, String> m: m1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println("--------------------TreeMap-------------------------");
		for(Map.Entry<String, String> m: sm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println("-------------------LinkedHashMap--------------------------");
		for(Map.Entry<String, String> m: lm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());  
		}
		
		m1.put("d", "java2s");
		System.out.println("-------------------after adding element to hashmap--------------------------");
		for(Map.Entry<String, String> m: m1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());  
		}
		
		
	}

}
