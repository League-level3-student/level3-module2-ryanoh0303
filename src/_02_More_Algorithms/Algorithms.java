package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	static int j = 0;
	public static int findBrokenEgg(List<String> eggs) {
		for(int i=0; i<eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0;
	}
	public static int countPearls(List<Boolean> oysters) {
		for(int i=0; i<oysters.size(); i++) {
			if(oysters.get(i).equals(true)) {
				j+=1;
			}
		}
		return j;
	}
	public static double findTallest(List<Double> peeps) {
		double max = Integer.MIN_VALUE;
		for(int i=0; i<peeps.size(); i++) {
			if(peeps.get(i)> max) {
				max = peeps.get(i);
			}
		}
		
		return max;
	}

	public static String findLongestWord(List<String> Words) {
		int length = 0;
		String longestWord = "";
		for(int i=0; i<Words.size(); i++) {
			if(Words.get(i).length()>length) {
				length = Words.get(i).length();
				longestWord =  Words.get(i);
			}
		}
		return longestWord;
	}
	public static boolean containsSOS(List<String> message) {
		boolean boo = false;
		for(int i=0; i<message.size(); i++) {
			if(message.get(i).contains("... --- ...")){
				boo = true;
			}
		}
		return boo;
	}
	public static List<Double> sortScores(List<Double> results) {
		int score=0;
		while(score<results.size()) {
			for(int i=0; i<results.size()-1; i++) {
				if(results.get(i)>results.get(i+1)) {
					score=0;
					double switching = results.get(i+1);
					results.set(i+1, results.get(i));
					results.set(i, switching);
					
					
				}
				else {
					score+=1;
				}
			}
			
		}
		
		
		
		return results;

	}
	public static List<String> sortDNA(List<String> unsorted){
		int score=0;
		while(score<unsorted.size()) {
			for(int i=0; i<unsorted.size()-1; i++) {
				if(unsorted.get(i).length()>unsorted.get(i+1).length()) {
					score=0;
					String switching = unsorted.get(i+1);
					unsorted.set(i+1, unsorted.get(i));
					unsorted.set(i, switching);
					
					
				}
				else {
					score+=1;
				}
			}
			
		}
		
		
		return unsorted;
		
	}
	public static List<String> sortWords(List<String> words) {

		int score=0;
		
		while(score<words.size()) {
			for(int i=0; i<words.size()-1; i++) {
				if(words.get(i).compareTo(words.get(i+1))>=0) {
					score=0;
					String switching = words.get(i);
					words.set(i, words.get(i+1));
					words.set(i+1, switching);
					
				}
				else {
					score+=1;
				}
			}
		}
		
		
		
	return words;
}
}