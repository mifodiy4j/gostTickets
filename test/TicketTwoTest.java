import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TicketTwoTest {

    @Test
    public void factorialFiveOk() {
        BigInteger result = TicketTwo.factorial(5);
        assertEquals(BigInteger.valueOf(120), result);
    }

    @Test
    public void getResultFiveAndThreeOk() {
        BigInteger result = TicketTwo.getResult(5, 3);
        assertEquals(BigInteger.valueOf(10), result);
    }
}
