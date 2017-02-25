package ch1;

import java.util.Arrays;

public class Ch1_questions {


    // 1.1 Is Unique
    // Implement an algorithm to determine if a string has all unique characters.
    // What if you cannot use additional data structures?
    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }

        boolean[] char_set = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }

    // 1.2 Check Permutation:
    // Given two strings, write a method to decide if one is a permutation of the other.
    public static boolean isPermutation(String s1, String s2) {
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    // 1.3 URLify
    // Write a method to replace all spaces in a string with '%20:
    // You may assume that the string has sufficient space at the end to hold the additional characters,
    // and that you are given the "true" length of the string.
    // Note: If implementing in Java, please use a character array so that you can perform this operation in place.
    // EXAMPLE:
    // INPUT: "Mr John Smith    ", 13
    // OUTPUT: "Mr%20John%Smith"
    public static String replace(String str) {
        String[] words = str.split(" ");
        StringBuilder sentence = new StringBuilder(words[0]);
        System.out.println(sentence);

        for (int i = 1; i < words.length; ++i) {
            sentence.append("%20");
            sentence.append(words[i]);
        }

        return sentence.toString();
    }

    public static void main(String[] args) {
        System.out.println(replace("John Smith    is cool"));
    }
}
