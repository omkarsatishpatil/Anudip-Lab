package com.string_lab;

import java.util.Scanner;

public class ConcateString 
{

	public static void main(String[] args) 
	{
//		String str1 = "Nivedita ";
//		String str2 =str1.concat("Sonkawade");
//		System.out.println("Concate String is :"+str2);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first string string:");
		String str1 = sc.nextLine();
		
		System.out.println("Enter secound string string:");
		String str2 = sc.nextLine();
		
		String str3 = str1+str2;
		System.out.println("Concate String is: "+str3);
	}

}
