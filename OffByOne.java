public class OffByOne implements CharacterComparator {

    /** A method that determines if two characters are off by one.
     * @param x
     * @param y
     * @return boolean
     * @source
     * https://www.tutorialspoint.com/java/lang/math_abs_int.htm
     * Used source to learn how to get the absolute value of an integer. */
    @Override
    public boolean equalChars(char x, char y) {
        int difference = java.lang.Math.abs(x - y);
        return difference == 1;
    }
}
