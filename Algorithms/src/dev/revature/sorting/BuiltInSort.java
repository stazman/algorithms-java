package dev.revature.sorting;

import java.util.*;

public class BuiltInSort {
	
	String[] unsorted = {"eel", "ant", "bear", "dog", "cat", "fox"};
	

	// This caused an error:
	//	Arrays.sort(unsorted);
	

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>(); 
		
		al.add("my");
		al.add("dog's");
		al.add("name");
		al.add("is");
		al.add("cash");
		
		for( String word : al ) {
			System.out.println(word);
		}
		
		Collections.sort(al);
		
		for( String word : al ) {
			System.out.println(word);
		}

	}

}