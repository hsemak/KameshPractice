package com.kamesh.KameshPractice;



import java.util.Arrays;

public class SwtichingElementsInArray {

    public static void main(String[] args ) {
        int a[] = {1,2,3,4,5,6,7};
        int b[] = new int[a.length];

        System.arraycopy(a,2,a,0,5);

        System.out.println();


    }

}
