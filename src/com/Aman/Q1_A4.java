package com.Aman;
import java.util.regex.Pattern;
public class Q1_A4 {
    // Java Program to reverse a String
// without using inbuilt String function
    // Method to reverse words of a String
    static String reverseWords(String str) {
        // Specifying the pattern to be searched
        Pattern pattern = Pattern.compile("\\s");
        // splitting String str with a pattern
        // (i.e )splitting the string whenever there
        // is whitespace and store in temp array.
        String[] temp = pattern.split(str);
        StringBuilder result = new StringBuilder();
        // Iterate over the temp array and store
        // the string in reverse order.
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result.insert(0, temp[i]);
            else
                result.insert(0, " " + temp[i]);
        }
        return result.toString();
    }
    // Driver methods to test above method
    public static void main(String[] args) {
        String s1 = "There is a Cat";
        System.out.println(reverseWords(s1));

        String s2 = " Cat is there";
        System.out.println(reverseWords(s2));
    }
}