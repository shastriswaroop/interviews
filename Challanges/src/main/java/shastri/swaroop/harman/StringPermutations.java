package shastri.swaroop.harman;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// //For a given string write all the permutations of it
// abc -- >abc,acb,bac,bca,cab,cba
// abcd -->abcd, abdc....

//https://www.journaldev.com/526/java-program-to-find-all-permutations-of-a-string#:~:targetText=Permutation%20of%20String%20in%20Java,and%20permute%20the%20remaining%20chars.&targetText=First%20char%20%3D%20A%20and%20remaining,available%20positions%20in%20the%20permutations.

public class StringPermutations {
	
	private static Set<String> permutationFinder(String str) {
		Set<String> permutations = new HashSet<String>();
		if(str==null) {
			return null;
		}
		
		if(str.length()==0) {
			permutations.add("");
			return permutations;
		}
		char firstChar = str.charAt(0);
		String residualString = str.substring(1);		
		Set<String> words = permutationFinder(residualString);
		for(String word:words) {
			for(int index=0; index<=word.length(); index++) {
				permutations.add((insertChar(word, firstChar, index )));
			}
		}
		return permutations;
	}
	
	private static String insertChar(String str, char ch, int i) {
		String lStr = str.substring(0, i);
		String rStr = str.substring(i);
		
		return lStr + ch + rStr;
	}
	
	public static void main(String args[]) {
	//	System.out.println("HELLO");
		String str1 = "HELLO";
		for(String word : permutationFinder(str1)) {
			System.out.println(word);
		}
	}
	

}
