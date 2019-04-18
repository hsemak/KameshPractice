package Stack;

import static jdk.nashorn.internal.objects.NativeArray.push;

public class StackUsingArray {
    static int array[] = new int[10];
    static int top;
    static
    {
        top =-1;
    }
    public static void main(String[] args ) {
        push(1);
        push(2);
        pop();

    }
    static void push (int i) {
        top = top+1;
        array[top] = i;

    }
    static void pop () {
        int x = array[top];
        top = top -1;
        System.out.println("Value x" + x);

    }


}
