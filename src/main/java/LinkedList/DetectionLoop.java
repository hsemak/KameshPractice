package LinkedList;

import sun.awt.image.ImageWatched;

public class DetectionLoop {
    static  LinkedList.Node head;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        head = list.head;
        LinkedList.Node temp = head;
        while (temp !=null ) {

            if (temp.next ==null) {
                temp.next = head;
                break;
            }
            temp = temp.next;
        }
        detectLoop();
System.out.println(head);
    }
    static int detectLoop()
    {
        LinkedList.Node slow_p = head, fast_p = head;
        while (slow_p != null && fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                System.out.println("Found loop");


                return 1;
            }
        }
        return 0;
    }

}
