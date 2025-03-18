package Question3;

import java.util.ArrayList;
import java.util.List;

public class Question3 {
    public static List<Long> makeFirst100Fibonacci() {
        List<Long> numbers = new ArrayList<>();
        numbers.add(0L);
        numbers.add(1L);

        long prev = 0;
        long curr = 1;

        for (int i = 2; i < 100; i++) {
            long next = prev + curr;
            numbers.add(next);
            prev = curr;
            curr = next;
        }

        return numbers;
    }
}
