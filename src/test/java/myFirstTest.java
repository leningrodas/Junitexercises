import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class myFirstTest {



    @Test
    public void testifequals() {
        String expected = "codeup";
        String actual = "codeup1";

        assertEquals(expected, actual);

    }

    @Test
    public void testnotequal(){
        String expected = "codeup";
        String actual = "codeup";

        assertNotEquals(expected,actual);
    }


    @Test
    public void testIfListAreNotSame(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);

    }

    @Test
    public void testifArrayEquals(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 4;

        assertArrayEquals(numbers,otherNumbers);
    }



    @Test
    public void testArrayEqualsnot(){
        String language = "PHP";
        language.contains("H"); // use assertTrue for this statement
        language.contains("J"); // use assertFalse for this statement

        assertFalse(language.contains("H"));
        assertTrue(language.contains("J"));
    }
//
//
//    @Test
//    public void testIfCompanyNameIsEquals() {
//        String expected = "Codeup";
//        String actual = "Codeup";
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testIfChangeIsCorrect() {
//        Double price = 10.0;
//        Double discount = 4.5;
//
//        assertEquals(5.5, price - discount, 0);
//        assertEquals(5.1, price - discount, 0.5);
//        assertNotEquals(4.9, price - discount, 0.5);
//    }
//
//    @Test
//    public void testIfObjectsAreDifferent() {
//        Object dog = new Object();
//        Object sheep = new Object();
//        Object clonnedSheep = sheep;
//
//        assertNotSame(sheep, dog);
//        assertSame(sheep, clonnedSheep);
//    }
//
//    @Test
//    public void testIfGreaterOrLesserThanWorks() {
//
//        boolean learningTDD = true;
//
//        assertTrue(learningTDD);
//        assertTrue("5 is greater than 4", 5 < 4);
//        assertFalse("5 is not greater than 6", 5 > 6);
//    }






}
