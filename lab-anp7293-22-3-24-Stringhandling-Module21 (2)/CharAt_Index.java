package com.string_lab;

import java.util.Scanner;

public class CharAt_Index
{

	public static void main(String[] args)
	{
		
//		String str = "Nivedita Sonkawade";
//		System.out.println("String is:"+str);
//		System.out.println("The character at 2 nd position is: "+str.charAt(2));
//		System.out.println("The character at 6 th position is: "+str.charAt(6));
//		System.out.println("The character at 13 th position is: "+str.charAt(13));
		
		//OR
		// Taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string string:");
		String str1 = sc.nextLine();
		System.out.println("The character at 2 nd position is: "+str1.charAt(5));
	}

}
