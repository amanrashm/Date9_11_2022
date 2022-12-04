import java.io.*;
//importing input and output package..
public class Q1_A3 { //class declaration
    public static void main(String[] args) throws IOException { // main method allocates memory for the code /project.... also throwing exception (IOexception)..
        String ch; // declaring string with a variable
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// we are connecting the BufferedReader stream with the InputStreamReader stream for reading the line by line data from the keyboard.
        System.out.print("Enter the Statement:"); // output Statement
        ch = br.readLine();// reading a line of text.
        int count, len = 0; //declaring dataType
        do { // loop
            try { //try -block
                char[] name =ch.toCharArray();//  returns an Array of chars after converting a String into sequence of characters
                len = name.length; //initializing variable with value...
                count = 0;//variable initialization
                for (int j = 0; j < len; j++) { // for loop
                    if((name[0]==name[j]) && ((name[0]>=65 && name[0]<=91)||(name[0]>=97&&name[0]<=123)||(name[0]>=48&&name[0]<=57))) // conditional block
                        count++; // counting and adding in previous value by 1
                }
                if (count != 0) // conditional block
                    System.out.println(name[0] + " " + count + " Times"); // output Statement
                ch = ch.replace("" + name[0], "");// a new string resulting from replacing all occurrences of old characters in the string with new characters
            } catch (Exception ignored) { // catch block can't be empty so using ignored keyword
            }
        }
        while (len != 1); //conditional loop
    }
}