import Question1.Question1;
import Question2.Question2;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        List<Character> letters = new ArrayList<Character>();
        letters.add('a');
        letters.add('b');
        letters.add('c');

        System.out.println("sum By for loop  " +new Question1(). sumByForLoop(numbers));
        System.out.println("sum By for do while  " +new Question1(). sumByForDoLoop(numbers));
        System.out.println("sum By for recurse  " +new Question1(). sumByForRecurse(numbers));

        List<Object> mergedList = new Question2().mergedList(letters, numbers);
        System.out.println("mergedList.. "+mergedList);
    }
}