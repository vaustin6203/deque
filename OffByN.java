public class OffByN implements CharacterComparator {
    private int num;

    /** A constructor that sets the value (N) that a palindrome must be
     * off by to return true'
     * @param N
     */
    public OffByN(int N) {
        num = N;
    }

    /** A method that determines if two characters are off by num N.
     * @param x
     * @param y
     * @return boolean */
    @Override
    public boolean equalChars(char x, char y) {
        int difference = java.lang.Math.abs(x - y);
        return difference == num;
    }
}
