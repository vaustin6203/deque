import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();
    static CharacterComparator offByOne = new OffByOne();

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }

    @Test
    public void testisPalindrome() {
        boolean isPalindrome1 = palindrome.isPalindrome("a");
        boolean isPalindrome2 = palindrome.isPalindrome("racecar");
        assertTrue(isPalindrome1);
        assertTrue(isPalindrome2);
    }

    @Test
    public void testisnotPalindrome() {
        boolean notPalindrome0 = palindrome.isPalindrome("happy");
        assertFalse(notPalindrome0);
    }

    @Test
    public void testisPalindromeCorners() {
        boolean isPalindrome3 = palindrome.isPalindrome("");
        boolean isPalindrome4 = palindrome.isPalindrome(" ");
        boolean isPalindrome5 = palindrome.isPalindrome("       ");
        boolean isPalindrome6 = palindrome.isPalindrome("Racecar");
        assertTrue(isPalindrome3);
        assertTrue(isPalindrome4);
        assertTrue(isPalindrome5);
        assertFalse(isPalindrome6);
    }

    @Test
    public void testisPalindromeby1() {
        boolean isPalindrome0 = palindrome.isPalindrome("flake", offByOne);
        boolean isPalindrome1 = palindrome.isPalindrome("xy", offByOne);
        assertTrue(isPalindrome0);
        assertTrue(isPalindrome1);
    }

    @Test
    public void testisNotPalidromeby1() {
        boolean isNotPalindrome0 = palindrome.isPalindrome("tori", offByOne);
        boolean isNotPalindrome1 = palindrome.isPalindrome("AbCd", offByOne);
        boolean isNotPalindrome2 = palindrome.isPalindrome("fLakE", offByOne);
        assertFalse(isNotPalindrome0);
        assertFalse(isNotPalindrome1);
        assertFalse(isNotPalindrome2);
    }

    @Test
    public void testPalindromeby1Corners() {
        boolean isPalindrome0 = palindrome.isPalindrome("w", offByOne);
        boolean isPalindrome1 = palindrome.isPalindrome("", offByOne);
        boolean isPalindrome2 = palindrome.isPalindrome("AB", offByOne);
        boolean isPalindrome3 = palindrome.isPalindrome("&%'", offByOne);
        assertTrue(isPalindrome0);
        assertTrue(isPalindrome1);
        assertTrue(isPalindrome2);
        assertTrue(isPalindrome3);
    }
}
