package com.kamesh.KameshPractice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

    public static void main(String[] args) {
        String s="07:05:45PM";
        DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        String output = null;
        try {
             date = df.parse(s);
            output = sdf.format(date);
            System.out.println(output);
        } catch(Exception e) {

        }

    }
}
