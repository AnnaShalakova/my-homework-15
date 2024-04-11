import org.junit.*;
import static org.junit.Assert.*;

public class Tests {
    @Test
    public void testStandardConstructor() {
        Rational standard = new Rational();
        assertEquals("Standard constructor returns wrong numerator", 0, standard.getNumerator());
        assertEquals("Standard constructor returns wrong denominator", 1, standard.getDenominator());
    }

    @Test
    public void testConstructor() {
        Rational rational = new Rational(1, 2);
        assertEquals(1, rational.getNumerator());
        assertEquals(2, rational.getDenominator());
    }


    @Test(expected = ArithmeticException.class)
    public void testConstructorWithZeroDenominator() {
        new Rational(1, 0);
    }


    @Test
    public void testReduce() {
        Rational rational = new Rational(6, 12);
        assertEquals(1, rational.getNumerator());
        assertEquals(2, rational.getDenominator());
    }


    @Test
    public void testEquals() {
        Rational rational1 = new Rational(1, 2);
        Rational rational2 = new Rational(1, 2);
        assertTrue(rational1.equals(rational2));
    }


    @Test
    public void testNotEquals() {
        Rational rational1 = new Rational(1, 2);
        Rational rational2 = new Rational(2, 3);
        assertFalse(rational1.equals(rational2));
    }


    @Test
    public void testLess() {
        Rational rational1 = new Rational(1, 2);
        Rational rational2 = new Rational(2, 3);
        assertTrue(rational1.less(rational2));
    }


    @Test
    public void testLessOrEqual() {
        Rational a = new Rational(1, 2);
        Rational b = new Rational(1, 2);
        assertTrue(a.lessOrEqual(b));
    }


    @Test
    public void testPlus() {
        Rational rational1 = new Rational(1, 2);
        Rational rational2 = new Rational(1, 3);
        Rational expectedResult = new Rational(5, 6);
        Rational actualResult = rational1.plus(rational2);
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testMinus() {
        Rational rational1 = new Rational(1, 2);
        Rational rational2 = new Rational(1, 3);
        Rational expectedResult = new Rational(-1, 6);
        Rational actualResult = rational1.minus(rational2);
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testMultiply() {
        Rational rational1 = new Rational(1, 2);
        Rational rational2 = new Rational(1, 3);
        Rational expectedResult = new Rational(1, 6);
        Rational actualResult = rational1.multiply(rational2);
        assertEquals(expectedResult, actualResult);
    }

    
    @Test
    public void testDivide() {
        Rational rational1 = new Rational(1, 2);
        Rational rational2 = new Rational(1, 3);
        Rational expectedResult = new Rational(3, 2);
        Rational actualResult = rational1.divide(rational2);
    }
}
