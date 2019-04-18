package Arrayss;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BirthDayCalendar {

    public static void main(String [] args) {
        int [] ar= {3,2,1,3};

        int highest =ar[0];
        int count=0;

        Set<Integer> highestSet = new HashSet();
        for (int i=0;i<ar.length;i++) {
            highestSet.add(new Integer(ar[i]));
        }
        Integer max =  Collections.max(highestSet);
        for (int j=0;j<ar.length;j++) {
            if (max.intValue() == ar[j]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
