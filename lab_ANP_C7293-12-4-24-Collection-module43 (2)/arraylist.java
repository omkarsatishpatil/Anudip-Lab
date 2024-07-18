package com.collectionpractical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  System.out.println("List before sort: "+list_Strings);
		  Collections.sort(list_Strings);
		  System.out.println("List after sort: "+list_Strings);    

	}

}
