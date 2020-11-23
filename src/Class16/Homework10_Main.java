package Class16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Homework10_Main {

    public static void main(String[] args) {

    Homework10 hw10 = new Homework10();

        //Question 1
        List<String> words = new ArrayList<>();
        words.add("happy");
        words.add("peace");
        words.add("joy");
        words.add("grow");
        words.add("joy");
        words.add("laugh");
        words.add("happy");
        words.add("laugh");
        words.add("joy");

        hw10.returnDuplicates(words);

        //Question 2
        HashMap<Integer, String> pairs = new HashMap<>();
        pairs.put(101,"happy");
        pairs.put(102,"peace");
        pairs.put(103,"Happy");
        pairs.put(104,"learn");
        pairs.put(105,"PEaCe");
        pairs.put(106,"HAPPY");

        hw10.keyPairs(pairs);
    }
}
