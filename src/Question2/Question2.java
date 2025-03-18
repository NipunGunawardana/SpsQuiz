package Question2;

import java.util.ArrayList;
import java.util.List;

public class Question2 {
    public   List<Object> mergedList(List<Character> list1, List<Integer> list2) {
        List<Object> result = new ArrayList<>();
        int listSize1 = list1.size();
        int listSize2 = list2.size();
        int maxSize = Math.max(listSize1, listSize2);

        for (int i = 0; i < maxSize; i++) {
            if (i < listSize1) {
                result.add(list1.get(i));
            }
            if (i < listSize2) {
                result.add(list2.get(i));
            }
        }

        return result;
    }
}
