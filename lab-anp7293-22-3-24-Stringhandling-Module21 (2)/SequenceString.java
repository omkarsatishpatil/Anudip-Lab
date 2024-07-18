package com.string_lab;

public class SequenceString 
{

	public static void main(String[] args)
	{
		String str1 = "Java is a object oriented programmaming language";
		String sequence = "language";
		boolean containsSequence = str1 .contains(sequence);
		
		if (containsSequence)
		{
			System.out.println("The squence '"+sequence +"' is found in the string");
		}
		else
		{
			System.out.println("The squence '"+sequence +"' is not found in the string");
		}
	}

}
