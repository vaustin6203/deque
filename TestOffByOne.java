import org.junit.Test;
import static org.junit.Assert.*;

public class TestOffByOne {
    // You must use this CharacterComparator and not instantiate
    // new ones, or the autograder might be upset.
    static CharacterComparator offByOne = new OffByOne();

    @Test
    public void testequalChars() {
        boolean test1 = offByOne.equalChars('c', 'b');
        boolean test2 = offByOne.equalChars('m', 'n');
        assertTrue(test1);
        assertTrue(test2);
    }

    @Test
     public void testNotequalChars() {
        boolean test1 = offByOne.equalChars('b', 'z');
        boolean test2 = offByOne.equalChars('x', 'x');
        assertFalse(test1);
        assertFalse(test2);
    }

    @Test
     public void testequalCharsCorners() {
        boolean test1 = offByOne.equalChars('%', '&');
        boolean test2 = offByOne.equalChars('A', 'B');
        boolean test3 = offByOne.equalChars('A', 'b');
        boolean test4 = offByOne.equalChars(' ', '!');
        assertTrue(test1);
        assertTrue(test2);
        assertFalse(test3);
        assertTrue(test4);
    }

}
