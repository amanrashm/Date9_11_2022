package com.Aman;
//add in package
public class Q1_A1 {
    //create class (class doesn't allocate space
    public static void main(String[] args) {
        //main  method allocates space for the project in heap
        String inputString = "malayalam";
        //declaring and initializing string value
        int length = inputString.length();
        // initializing length with array value length
        int i, begin, end, middle;
        // declaring variable in int datatype
        begin = 0;//initializing variable with value
        end = length - 1;//initializing variable with value
        middle = (begin + end) / 2;//initializing variable with value
        for (i = begin; i <= middle; i++) { // for loop
            if (inputString.charAt(begin) == inputString.charAt(end)) { //conditional blocks
                begin++; // post increment after
                end--; // post decrement after
            } else { //conditional blocks
                System.out.println("Not a palindrome.");//output statement
                break; // breaks statement
            }
        }
        if (i == middle + 1) { //conditional blocks
            System.out.println("Palindrome."); // output statement
        }
    }
}