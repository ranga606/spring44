package com.rs.JavaTutorial;

public class StringIntern {

	
	public static void main(String[] args) {
	String s1 = "Hello Java";
	String s2 = "Hey i am good";
		
	 String rs_a = "Hello Java";
	 String rs_b = "Hello Java";
	 System.out.println(rs_a == rs_b); // True
	 System.out.println(rs_a.equals(rs_b)); // True
	
	 
	 String rs_c = new String("hi Java code");
	 String rs_d = "hi Java code";
	 System.out.println(rs_c == rs_d); // false
	 System.out.println(rs_c.equals(rs_d)); // True
	 
	 
	 String s3 = new String("Hello Java").intern();
	 System.out.println(rs_a == s3); // .intern() T
	
	 
	  rs_b = "Hello Java";
	 System.out.println(rs_a == rs_b); // true
	 
	 rs_b =  s1.intern();
	 System.out.println(rs_b.intern() == s1.intern()); // true
	 
	 
	 
	
 
	}
	
	
	
}
