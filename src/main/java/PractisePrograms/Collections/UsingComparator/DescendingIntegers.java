package PractisePrograms.Collections.UsingComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DescendingIntegers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 18, 9, 10);

        numbers.sort((o1, o2) -> o2 - o1);
        System.out.println("Sorted by length(desc) : " + numbers);
    }
}
