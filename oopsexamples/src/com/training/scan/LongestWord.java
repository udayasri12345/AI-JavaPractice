package com.training.scan;

public class LongestWord {

	public static void main(String[] args) {
		String[] words = new String[] { "Hi I am Udaya", "Udaya", "Sri", "Hope you are doing well! Enjoy your day!",
				"How are you?" };
		int wordlength = 0;
		String longWord = "";
		for (String word : words) {
			if (wordlength < word.length()) {
				wordlength = word.length();
				longWord = word;
			}

		}
		System.out.println("Longest word among the array is:::" + longWord);
	}

}
