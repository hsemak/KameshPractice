package com.kamesh.KameshPractice;



import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Palindrome {
    public static void main(String[] args ) {
        String [] a = {"a","b","c","c","b","a"};
        List<String> values = Arrays.asList(a);
        Collections.reverse(values);
        String[] b = values.stream().toArray(String[]::new);
        String n = "Equal";
        for (int i=0;i<a.length;i++) {
                if (! (a[i].equals(b[i]))) {
                    n="Not Equal";
                    break;
                }
        }
        System.out.println(n);

    }

}
