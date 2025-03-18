package Question1;

import java.util.ArrayList;
import java.util.List;

public class Question1 {


    public  int sumByForLoop(List<Integer> list) {
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return total;
    }
    public  int sumByForDoLoop(List<Integer> list) {
        int total = 0;
        int i = 0;
        do {
            total += list.get(i);
            i++;
        } while (i < list.size());
        return total;
    }
    public int sumByForRecurse(List<Integer> list) {
        return recursion(list, 0);

    }

    private int recursion(List<Integer> list, int index) {
        if (index == list.size()) {
            return 0;
        }
        return list.get(index) + recursion(list, index + 1);
    }
}
