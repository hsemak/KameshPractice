package Tree;

public class BinaryTree {
    static Node tree;
    public static void main(String[] args) {

        tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
//        tree.left.left = new Node(4);
//        tree.left.right = new Node(5);
//        tree.right.left = new Node(6);
//        tree.right.right = new Node(7);
        display();

    }
    static void display() {
        Node temp = tree;
        while(temp.left !=null) {
            System.out.println("Values" + tree.key);
            System.out.println("Left value" + tree.left.key);
            System.out.println("Left value" + tree.right.key);
            temp = temp.left;




        }
    }

}
