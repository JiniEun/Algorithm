package leetcode.MergeStringsAlternately;

public class MergeStringsA {

	public String mergeAlternately(String word1, String word2) {
		StringBuilder results = new StringBuilder();

		int minLength = word1.length();
		boolean lengthFlag = word1.length() >= word2.length();
		if (lengthFlag) {
			minLength = word2.length();
		}

		for (int i = 0; i < minLength; i++) {
			results.append(word1.charAt(i));
			results.append(word2.charAt(i));
		}

		if (lengthFlag) {
			results.append(word1.substring(minLength));
		} else {
			results.append(word2.substring(minLength));
		}
		return results.toString();
	}

}
