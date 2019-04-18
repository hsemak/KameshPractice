package com.kamesh.KameshPractice;


public class ArrayRotation {

public static void main(String[] args) {
    int a[] =  {1,2,3,4,5,6,7};

    int temp[] = new int[2];

    int b[] = new int[a.length];

    for (int i=0;i<2;i++) {
        temp[i]=a[i];
    }
    int value=0;
    for (int j=2;j<a.length;j++) {
        b[value] = a[j];
        value++;
    }



}
}
