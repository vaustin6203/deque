public class Palindrome {

    /** A method that given a String, returns a Deque instance
     * where the characters appear in the same order as the String.
     * @param word
     * @return Deque<Character>
     *
     * @source
     * https://stackoverflow.com/questions/11229986/get-string-character-by-index-java
     * Used source to learn how to access the ith character of a String.
     */
    public Deque<Character> wordToDeque(String word) {
        Deque<Character> linkedDeque = new LinkedListDeque<Character>();
        int i = word.length() - 1;
        while (i >= 0) {
            Character letter = word.charAt(i);
            linkedDeque.addFirst(letter);
            i -= 1;
        }
        return linkedDeque;
    }

    /** A method that reverses the order of the characters in a String.
     * @param word
     * @return String
     */
    private String reverseString(String word) {
        String actual = "";
        int i = word.length() - 1;
        while (i >= 0) {
            actual += word.charAt(i);
            i -= 1;
        }
        return actual;
    }

    public boolean isPalindrome(String word) {
        return word.equals(reverseString(word));
    }

    /** A method that determines is a String is a palindrome by one.
     * @param word
     * @param cc
     * @return boolean
     */
    public boolean isPalindrome(String word, CharacterComparator cc) {
        if (word.length() <= 1) {
            return true;
        } else if (word.length() % 2 != 0) {
            int midIndex = word.length() / 2;
            int i = 0;
            int n = word.length() - 1;
            while (i < midIndex && n > midIndex) {
                boolean charCheck0 = cc.equalChars(word.charAt(i), word.charAt(n));
                if (!charCheck0) {
                    return false;
                }
                i += 1;
                n -= 1;
            }
        } else {
            int k = 0;
            int m = word.length() - 1;
            while (k < m) {
                boolean charCheck1 = cc.equalChars(word.charAt(k), word.charAt(m));
                if (!charCheck1) {
                    return false;
                }
                k += 1;
                m -= 1;
            }
        }
        return true;
    }
}
