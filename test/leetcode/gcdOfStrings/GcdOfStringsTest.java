package leetcode.gcdOfStrings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GcdOfStringsTest {

	@Test
	void testAll() {
		assertAll(
			() -> test("ABCABC", "ABC", "ABC"),
			() -> test("ABABAB", "ABAB", "AB"),
			() -> test("LEET", "CODE", "")
		);
	}

	private void test(String string1, String string2, String expected) {

		GcdOfStrings solution = new GcdOfStrings();
		String actual = solution.gcdOfStrings(string1, string2);

		assertEquals(expected, actual);
	}

}