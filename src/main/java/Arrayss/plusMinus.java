package Arrayss;

import java.text.DecimalFormat;

public class plusMinus {

    public static void main(String [] args) {

        int[] arr = {-4,3,-9,0,4,1};
        double negative =0;
        double positive=0;
        double numberofZeros=0;
        DecimalFormat f = new DecimalFormat("00.000000");

        for (int i=0;i<arr.length;i++) {

            if (arr[i] < 0) {
                negative++;
            }
            else if (arr[i] > 0) {
                positive++;

            }
            else {
                numberofZeros ++;
            }
            }

        System.out.println(f.format(positive/arr.length));
        System.out.println(f.format(negative/arr.length));
        System.out.println(f.format(numberofZeros/arr.length));



    }
}
