package Class9;

import java.util.Arrays;

public class Homework7 {

    // 1. Create a method to add all the numbers in a array with double-values
    public void addDoubles(double[] values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        System.out.println("The sum of the values in your array is: " + sum);
    }

    // 2. Create a method to verify if the input-int-number is prime or not
    public boolean primeNumber(int inputNumber) {
        boolean isPrime = true;
        if (inputNumber <= 1) {
            isPrime = false;
            return isPrime;
        } else {
            for (int i = 2; i <= inputNumber / 2; i++) {    //"inputNumber / 2" because an int value is not divisible by more than its half
                if (inputNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        }
    }

    // 3. Create a method to find if given string is palindrome.
    public boolean isPalindrome(String word) {
        char[] letters = word.toCharArray();        //I know we haven't studied toCharArray but my logic took me down this route

        int i = 0;
        int j = letters.length - 1;
        while (j > i) {
            if (letters[i] != letters[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // 4. Write a method to print(no return) the duplicate values in a given String array.
    public void duplicateWord(String[] words) {      //I am having a lot of trouble having this method print only each duplicate word once. Please advise
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((words[i].equalsIgnoreCase(words[j])) && (i != j)) {
                    System.out.println("Duplicate words: " + words[j]);
                }
            }
        }
    }

    // 5. Write a method to print(no return) the common values between two arrays (string arrays)
    public void commonValues(String[] arr1, String[] arr2) {        //I am having a lot of trouble having this method print only each duplicate word once. Please advise
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    System.out.println(arr1[i]);

                }

            }

        }
    }
}