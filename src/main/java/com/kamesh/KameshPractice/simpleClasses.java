package com.kamesh.KameshPractice;

public class simpleClasses {

    public static void main (String[] args) {
        int[] nums={2,10,5,4,8};
        int[] maxes={3,1,7,8};
        int[] counts = new int[maxes.length];

        for (int i=0;i<maxes.length;i++) {
                int value=maxes[i];
            int count=0;
            for (int j=0;j<nums.length;j++) {
                if (nums[j] <= value ) {
                    count++;
                }
            }
            counts[i]=count;
        }
        System.out.println(counts);
    }
}
