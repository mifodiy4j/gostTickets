import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TicketThreeTest {

    private static final String TEXT = "Hello world, hello world too? And hello world too!";

    @Test
    public void getCountOk() {
        Map<String, Long> result = TicketThree.getCount(TEXT);
        System.out.println(result);
        assertTrue(result.containsKey("and"));
        assertEquals(Long.valueOf(1), result.get("and"));
        assertEquals(4, result.size());
    }
}
