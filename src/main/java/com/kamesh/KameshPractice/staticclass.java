package com.kamesh.KameshPractice;

public class staticclass {

    public static class staticInnerClass {
        public void display() {
            System.out.println("Hello From non static method");
        }
        public static String  display(String a) {
            System.out.println("Hello From static method");
        return null;
        }

    }
    public class innerClass {
        public void display() {
            System.out.println("Hello From non static method");
        }


    }
    public static void main (String [] args) {
        staticclass.staticInnerClass classes = new staticclass.staticInnerClass();
        classes.display();
        classes.display("HEllo");

        staticclass outer = new staticclass();
        staticclass.innerClass inner = outer.new innerClass();
        inner.display();

    }
}
