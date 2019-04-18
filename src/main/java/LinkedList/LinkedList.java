package LinkedList;

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next=null; } // Constructor
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(1);
        list.push(2);

        list.push(3);
        list.pushAfter(list.head.next,4);
        list.searchAnElement(5);
        list.searchAnElement(1);
//        list.delete(3);
        list.printList();
        list.getNthIndex(3);
    }

    void printList() {
        Node n = head;
        int count=0;
        while (n!= null) {
            System.out.println("Values" + n.data);
            n= n.next;
            count = count +1;
        }
        System.out.println("Count of Linked list" + count);
    }
    void push(int data) {
        Node newNode = new Node(data);

        if (head ==null) {
            head = newNode;
            return;
         } else {
            Node last= head;
            while (last.next != null) {
                last=last.next;
                }
            last.next = newNode;
            return;
            }
        }
        void pushAfter (Node n , int data) {
        Node prev = n;
        Node newNode= new Node(data);
        newNode.next = prev.next;
        prev.next = newNode;
        }
        void delete (int data) {
            Node temp = head , prev=null;

            if (temp!=null && temp.data == data) {
                prev=temp;
                temp=temp.next;
                return;
            }
            while (temp !=null && temp.data !=data) {
                prev = temp;
                temp=temp.next;
            }
            if (temp==null) return;
            prev.next = temp.next;

        }
        void searchAnElement (int data) {
        Node temp = head;
        while (temp!=null && temp.data != data) {
            temp=temp.next;
        }
        if (temp == null) {
            System.out.println("DataIs not present");
        } else {
            System.out.println("Data Found is " + temp.data);
        }

        }
        void getNthIndex(int index) {
        Node temp =head;
        int count=0;
        while (temp!=null && count !=index) {
            temp=temp.next;
            count=count+1;
        }
        System.out.println("Index " + index + " and Value " + temp.data);
        }

    }

