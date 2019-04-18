package com.kamesh.KameshPractice;

public class RepeatedSign {
    public static void main(String [] args ) {
        long n=100000000;
        String s="a";
        int length = s.length();
        while (length < n) {
             s+= s.substring(0,length);
            length = length+length;
        }
        System.out.print("String" + s);
        char value='a';
        char[] c = s.toCharArray();
        int numberofA=0;
        for (int i=0;i<n;i++) {
            if (c[i]==value) {
                numberofA++;
            }
        }
        System.out.println(numberofA);



    }
}
