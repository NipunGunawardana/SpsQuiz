import Question1.Question1;
import Question2.Question2;
import Question3.Question3;
import Question4.Question4;

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
        System.out.println("Question 1 ........");
        System.out.println("sum By for loop  " +new Question1(). sumByForLoop(numbers));
        System.out.println("sum By for do while  " +new Question1(). sumByForDoLoop(numbers));
        System.out.println("sum By for recurse  " +new Question1(). sumByForRecurse(numbers));

        List<Object> mergedList = new Question2().mergedList(letters, numbers);
        System.out.println("mergedList.. "+mergedList);

        List<Long> febonacciValues = new Question3().makeFirst100Fibonacci();
        System.out.println("First 100 febonacci numbers:");
        System.out.println(febonacciValues);

        int[] newNumbers = {50, 2, 1, 9};

        System.out.println("Question 4 ........");
        System.out.println(new Question4().getLargestNumber(newNumbers));
    }
}