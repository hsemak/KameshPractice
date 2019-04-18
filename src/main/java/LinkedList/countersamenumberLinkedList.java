package LinkedList;

public class countersamenumberLinkedList {
    static  LinkedList.Node head;
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(1);
        list.push(3);
        list.push(1);
        list.push(5);
        head = list.head;
        countnumber(5);
    }
   static void countnumber(int n) {
        int count =0;

        while (head !=null ) {
            if (head.data == n) {
                count =count+1;
            }
            head = head.next;
        }
        System.out.println("Count" + count);
    }
}

