package com.Aman;
public class Q1_A4_2 {
    //    public static void main(String ... args){
//        String s ="there is a cat";
//        char []ch = s.toCharArray();
//        String[]A=new String[4];
//        int index = 0;
//        for(int i = 0; i<=ch.length-1;i++)
//            if(ch[i]!=' '){
//                A[index]=A[index]+ch[i];
//            }else
//                index++;
    static char[] swap(String str, int i, int j) {
        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }
    public static void main(String[] args) {
        String s = "sathya";
        System.out.println(swap(s, 5, s.length() - 2));
        System.out.println(swap(s, 0, s.length() - 1));

        System.out.println(s);
    }
}