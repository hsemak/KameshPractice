package LinkedList;

public class PrintMiddleNumberLinkedList {
    public static void main(String [] args ) {
       LinkedList list = new LinkedList();
       list.push(1);
       list.push(2);
       list.push(3);
       list.push(4);
       LinkedList.Node n = list.head;
       printmiddlenumber(n);


    }
    static void printmiddlenumber(LinkedList.Node n) {
        int count=0;
        LinkedList.Node temp = n;
        while (n != null) {
            n=n.next;
            count =count+1;
        }
        int middle = count/2;
        int value=0;
        while (temp!=null && value != middle) {
            temp = temp.next;
            value = value+1;

        }
        System.out.println("Middle Number " + temp.data);

    }

}
