package leetcode.MergeStringsAlternately;

import static org.junit.jupiter.api.Assertions.*;

import leetcode.LongestCharacters.LongestCharacters;
import org.junit.jupiter.api.Test;

class MergeStringsATest {
	@Test
	void testAll() {
		assertAll(
			() -> test("abc", "pqr", "apbqcr"),
			() -> test("ab", "pqrs", "apbqrs"),
			() -> test("abcd", "pq", "apbqcd")
		);
	}

	private void test(String word1, String word2, String expected) {

		MergeStringsA solution = new MergeStringsA();
		String actual = solution.mergeAlternately(word1, word2);
		System.out.printf("expected=%s, actual=%s%n", expected, actual);

		assertEquals(expected, actual);
	}

}