package com.kamesh.KameshPractice;


import java.util.*;

public class pairofsocks {

public static void main (String [] args) {
    int arr[] = {10,20,20,10,10,30,50,10,20};

    Set<Integer> values = new HashSet<>();
    for (int i: arr) {
        values.add(i);
    }
    int sum=0;
    for (Integer setvalue : values) {
        int iteration=0;
        for (int j=0;j<arr.length;j++) {
            if (setvalue.intValue() == arr[j]) {
                iteration++;
            } }
        if (iteration > 0 && iteration/2 >= 1) {
            int value = iteration/2;
            sum=sum+value;
        }

    }
    System.out.println(sum);



}

}
