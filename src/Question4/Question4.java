package Question4;

import java.util.Arrays;

public class Question4 {

    public  String getLargestNumber(int[] numbers) {
        // Convert numbers to strings
        String[] numStrs = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numStrs[i] = String.valueOf(numbers[i]);
        }

        // Sort strings based on custom comparison
        Arrays.sort(numStrs, (a, b) -> (b + a).compareTo(a + b));

        // Join sorted strings and handle leading zeros
        String result = String.join("", numStrs);
        return result.startsWith("0") ? "0" : result;
    }
}
