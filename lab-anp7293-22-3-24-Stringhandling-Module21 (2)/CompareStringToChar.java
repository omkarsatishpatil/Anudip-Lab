package com.string_lab;

public class CompareStringToChar {

	public static void main(String[] args) {

		String str1 = "Dog is Animal.";
		String str2 = "Cat is Animal";
		CharSequence cs = "Dog is Animal.";
		
		System.out.println("Compare String to CharSequence1: " +str1.equals(cs));
		System.out.println("Compare String to CharSequence2: " +str2.equals(cs));
		
	}

}
