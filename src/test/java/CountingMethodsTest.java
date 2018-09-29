import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingMethodsTest {

    CountingMethods count;

    @BeforeEach
    public void before(){
        count = new CountingMethods();

    }

    @Test
    public void additionTest () {
        double a = 2;
        double b = 3;
        assertEquals(5.0,count.addition(a,b));
    }

    @Test
    public void substractionTest() {
        double a = 6;
        double b = 3;
        assertEquals(3.0,count.subtraction(a,b));
    }

    @Test
    public void multiplicationTest() {
        double a = 2;
        double b = 3;
        assertEquals(6.0,count.multiplication(a,b));
    }

    @Test
    public void divisionTest() {
        double a = 6;
        double b = 3;
        assertEquals(2.0,count.division(a,b));
    }

    @Test
    public void divisionByZero() {
        double a = 6;
        double b = 0;
        assertThrows(ArithmeticException.class, () -> new CountingMethods().division(======a,b) ) ;
    }









}