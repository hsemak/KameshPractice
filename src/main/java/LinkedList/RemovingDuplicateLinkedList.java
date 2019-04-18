package LinkedList;

public class RemovingDuplicateLinkedList {

    static LinkedList.Node head;
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.push(1);
        list.push(2);
        list.push(2);
//        list.push(4);
//        list.push(2);
//        list.push(3);
//        list.push(2);
        head  = list.head;
        removingDuplicate();
        DisplayList();
    }
    static void removingDuplicate() {
        LinkedList.Node current = head ;
        LinkedList.Node temp;
        while (current !=null) {
            if (current.next !=null && current.data == current.next.data ) {
                temp=current.next.next;
                current.next=null;
                current.next=temp;
            } else {
                current = current.next;
            }
        }


}
static void DisplayList() {
        while(head!=null) {
            System.out.println("Values" + head.data);
            head= head.next;
        }
}

}
