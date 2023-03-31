package org.task;

public class StringReverse {

	public static void main(String[] args) {
		
		String s = "codoid";
		String rev = "";
		
		System.out.println("Before Reverse : "+s);
		
		for (int i = s.length()-1; i >=0; i--) {
			char c = s.charAt(i);
			rev = rev + c;
			
		}
		System.out.println("After reverse : "+rev);
	}
}
