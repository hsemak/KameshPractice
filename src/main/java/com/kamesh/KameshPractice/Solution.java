package com.kamesh.KameshPractice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int ignoreBit=0;
        List<Integer> values = new ArrayList<>();
        while (ignoreBit < arr.length) {
            int sum=0;
            for (int i=0;i<arr.length;i++) {
                if (!( i == ignoreBit)) {
                    sum=arr[i] + sum;
                }
            }
            values.add(new Integer(sum));
            ignoreBit++;
        }
        Collections.sort(values);
        System.out.println(values.get(0).intValue() + "" + values.get(values.size()-1).intValue());


    }





    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};


        miniMaxSum(arr);

        scanner.close();
    }
}
