package PractisePrograms.Collections.UsingComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringLentghSort {
    public static void main(String[] args){
        List<String> words = Arrays.asList("apple", "bananaaaaaaaa", "date", "egg","hi");

        Collections.sort(words, new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println("Sorted by length(asc) : " + words);

        //Descending
        Collections.sort(words, (o1, o2) -> o2.length() - o1.length());
        System.out.println("Sorted by length(desc) : " + words);
    }
}
