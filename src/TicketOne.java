public class TicketOne {

    private static final String TWO = "Two";
    private static final String SEVEN = "Seven";
    private static final String TWO_SEVEN = "TwoSeven";
    private static final String SEPARATOR = "; ";

    public void outNumber(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(checkNumber(i));
            System.out.print(SEPARATOR);
        }
    }

    private String checkNumber(int n) {
        String result = String.valueOf(n);
        if (n % 7 == 0) {
            result = SEVEN;
            if (n % 2 == 0) {
                result = TWO_SEVEN;
            }
        } else if (n % 2 == 0) {
            result = TWO;
        }
        return result;
    }
}
