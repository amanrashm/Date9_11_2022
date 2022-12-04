import java.util.*;
// import statement for utility package
public class Q1_A2 {
    //class initialization
    public static void main(String[] args) { // main method allocates memory for the code /project....
        Scanner x = new Scanner(System.in); // output Statement
        String firstString = x.next(); //taking input from user via keyboard
        String secondString = x.next(); // taking input from user via keyboard
        System.out.println("Check if the first String and second String is anagram of each other: " + isAnagram(firstString, secondString)); // output Statement
    }
    public static boolean isAnagram(String firstString, String secondString) { //methods with inputs parameters
        char[] firstStringCharArray = firstString.toLowerCase().toCharArray(); // declaring firstStringCharArray a value in lowerCase
        char[] secondStringCharArray = secondString.toLowerCase().toCharArray(); // declaring secondStringCharArray a value in lowerCase
        Arrays.sort(firstStringCharArray); // sorting array in ascending order
        Arrays.sort(secondStringCharArray); // sorting array in ascending order
        return Arrays.equals(firstStringCharArray, secondStringCharArray); // return statement checks value with the help of .equalsMethod and returns boolean after checking...
    }
}