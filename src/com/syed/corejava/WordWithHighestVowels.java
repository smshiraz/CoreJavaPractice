package com.syed.corejava;

public class WordWithHighestVowels {

	public static void main(String[] args) {
		String sentence = "Java programming is very interesting";

		String[] words = sentence.split(" ");
		String resultWord = "";
		int maxVowelCount = 0;

		for (String word : words) {
			int count = countVowels(word);

			if (count > maxVowelCount) {
				maxVowelCount = count;
				resultWord = word;
			}
		}

		System.out.println("Word with highest vowels: " + resultWord);
		System.out.println("Number of vowels: " + maxVowelCount);
	}

	private static int countVowels(String word) {
		int count = 0;
		word = word.toLowerCase();

		for (char ch : word.toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}
}
