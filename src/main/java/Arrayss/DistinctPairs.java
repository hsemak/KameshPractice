package Arrayss;

import java.util.HashMap;
import java.util.Map;

public class DistinctPairs {

    public static void main(String [] args) {
        int a[] ={6,6,3,9,3,5,1};
        int k=12;
        int n=a.length;
        Map<Integer,Integer> unique= new HashMap ();
        int count=0;

        for (int i=0;i<n;i++)  {
            for (int j= i+1;j<n;j++) {
                if (a[i] + a[j] == k) {
                    unique.put(new Integer (a[i]) , new Integer (a[j]));
                }
            }
        }
        unique.size();



    }

}
