package Interface;

public class Print extends  PrintingName {
    public static void main(String[] args) {
        PrintingName p = new Print();
        p.home();
        p.printName();
    }
    @Override
    public void home() {

        System.out.println("Chandrakumar");
    }
//    @Override
//    public void printName() {
//        System.out.println("Kamesh");
//    }


}
