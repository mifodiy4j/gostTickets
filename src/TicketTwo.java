import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class TicketTwo {

    private static Map<Integer, BigInteger> cashe = new HashMap<>();

    public static BigInteger getResult(int m, int r) {
        BigInteger result = factorial(m).divide(factorial(r));
        result = result.divide(factorial(m - r));
        return result;
    }

    public static BigInteger factorial(int n) {
        BigInteger result;
        if (n == 0) {
            return BigInteger.ONE;
        }
        result = cashe.get(n);
        if (result != null) {
            return result;
        }
        result = BigInteger.valueOf(n).multiply(factorial(n - 1));
        cashe.put(n, result);
        return result;
    }
}
