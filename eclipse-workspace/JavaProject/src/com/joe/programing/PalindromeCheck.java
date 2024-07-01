package com.joe.programing;

/*
	Using recursion :
		1 take the variable in string
		2 create a new variable to store the reversed value
		3 
		
 */


import java.util.*;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String word = "malayalam";
		System.out.println("Is " + word + " palindrome? - " + isPalindrome(word));

	}

	public static   boolean isPalindrome(String word) {
//		String reverseWord = getReverseWordUsingRecursion(word);
//		System.out.println("Using recursion: "+reverseWord);
//		if (word.equals(reverseWord)) {
//			return true;
//		}
//		return false;
		
		String reversedWord = getReverseWordUsingFor(word);
		System.out.println("Using recursion: "+reversedWord);
		if (word.equals(reversedWord)) {
			return true;
		}
		return false;
	}

	public static String getReverseWordUsingRecursion(String word) {
		if (word == null || word.isEmpty()) {
			return word;
		}

		return word.charAt(word.length() - 1) + getReverseWordUsingRecursion(word.substring(0, word.length() - 1));
	}
	
	public static String getReverseWordUsingFor(String word) {
		String reverseWord= "";
		int str = word.length();
		for (int i = str-1;i>=0;--i) {
			reverseWord = reverseWord + word.charAt(i);
		}
		return reverseWord;
		
	}

}
