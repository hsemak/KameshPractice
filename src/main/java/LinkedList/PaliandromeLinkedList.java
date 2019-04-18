package LinkedList;

import java.util.Stack;

public class PaliandromeLinkedList {
   static LinkedList.Node head;
    static Stack<LinkedList.Node> stack;
    public static void main(String [] args) {
        LinkedList list = new LinkedList();

        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        head  = list.head;
        pushElementsToStack();
        checkForPaliandrome();

    }
    static void pushElementsToStack() {
        stack=new Stack<>();
        LinkedList.Node temp = head;
        while(temp!=null) {
            stack.push(temp);
            temp=temp.next;
        }

    }
    static void checkForPaliandrome() {
        String flag= "Paliandrome";
        while (head!=null) {
            int listValue=head.data;
            int reverse = stack.pop().data;
            if (listValue != reverse) {
                flag = "Not Paliandrome";
                break;
            }
            head= head.next;
        }
        System.out.println("Flag" + flag);
    }


}
