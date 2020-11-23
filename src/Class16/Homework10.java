package Class16;

import java.util.*;

public class Homework10 {

//     * Question 1:
//     * Create a method, that will return all duplicates values with count from the given List<String>
//     * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
//     * Output:
//     *      happy - 2
//     *      joy - 3
//     *      laugh - 2

    public void returnDuplicates(List<String> words) {
        Map<String, Integer> countDuplicates = new HashMap<>();

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            int count = 1;
            for (int n = i + 1; n < words.size(); n++) {
                if (words.get(n).equalsIgnoreCase(word)) {
                    count++;
                }
            }
            if (count > 1 && !countDuplicates.containsKey(word.toLowerCase())) {
                countDuplicates.put(word.toLowerCase(), count);
            }
        }
        System.out.println(countDuplicates);
        //not sure how to get output like (please advise) :
        //Output:
        //      happy - 2
        //      joy - 3
        //      laugh - 2
    }


//     * Question 2:
//     * Create a hashMap with any numbers of key-value pairs from the user
//     * Key should be Integer
//     * Value should be String
//     *
//     * Create method that will print the keys with same value, else "All keys have different values"
//     *
//     * Input to method -> [{101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"}]
//     * Output (print) ->
//     *      "happy" with keys -> 101, 103, 106
//     *      "peace" with keys -> 102, 105
//     *
//     * Input to method -> [{111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"}]
//     * Output (print) ->
//     *      All keys have different values

    public void keyPairs(Map<Integer, String> myMap) {
        Set<Integer> keys = myMap.keySet();
        Map<String, Set<Integer>> valueSame = new HashMap<>();

        for (Integer i : keys) {
            Set<Integer> keyDouble = new HashSet<>();
            String keyValue = myMap.get(i);
            for (Integer j : keys) {

                if (!j.equals(i))
                {
                    if (myMap.get(j).equalsIgnoreCase(keyValue)) {
                        keyDouble.add(i);
                        keyDouble.add(j);
                    }
                }
            }
            if (keyDouble.size() > 0) {
                valueSame.put(keyValue.toLowerCase(), keyDouble);
            }
        }
        if (valueSame.size() > 0) {
            for (String words : valueSame.keySet()) {
                System.out.println(words + " with keys -> " + valueSame.get(words));
            }
        } else {
            System.out.println("All keys have different values!");
        }
    }
}

