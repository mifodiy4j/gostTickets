import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class TicketThree {

    private static final String SEPARATOR = " |\\,|\\.|\\!|\\?|\\;|\\:";

    public static Map<String, Long> getCount(String text) {
        String[] words = text.split(SEPARATOR);

        Map<String, Long> wordWithCount = Arrays.stream(words)
                .filter(word -> word.length() > 1)
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> sorted = wordWithCount
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect(toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        return sorted;
    }
}
