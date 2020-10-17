package Class9;

public class Homework7_Main {
    public static void main(String[] args) {

        Homework7 a1 = new Homework7();

        // 1. Create a method to add all the numbers in a array with double-values
        double[] values = {4.4, 6.89, 29.4, 86.99, 72.04, 5.8};
        a1.addDoubles(values);

        // 2. Create a method to verify if the input-int-number is prime or not
        boolean isPrime = a1.primeNumber(31);
        System.out.println("Is your value a prime number? " + isPrime);

        // 3. Create a method to find if given string is palindrome.
        boolean palindrome = a1.isPalindrome("level");
        System.out.println("Is your word a palindrome? " + palindrome);

        // 4. Write a method to print(no return) the duplicate values in a given String array.
        String[] words = {"world", "peace", "World" , "jump", "Happy", "jump", "worlD"};
        a1.duplicateWord(words);        //I am having a lot of trouble having this method print only each duplicate word once. Please advise

        // 5. Write a method to print(no return) the common values between two arrays (string arrays)
        String[] arr1 = {"tree", "root", "leaf" , "tree", "Leaf", "tree", "bark"};
        String[] arr2 = {"tree", "grow", "leaf" , "bark"};
        a1.commonValues(arr1, arr2);    //I am having a lot of trouble having this method print only each duplicate word once. Please advise

    }
}
