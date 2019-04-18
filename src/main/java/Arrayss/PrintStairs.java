package Arrayss;

public class PrintStairs {

    public static void main(String [] args ) {
        int n=6;
        String p="#";
        int i =0;
        String value= "%" +n+"s";
        while (i<6) {
        String q = stringAppend(p,i);

            System.out.printf(" %6s %n",q);
            i++;
        }
    }
    static String stringAppend(String p,int i) {
        p="#";
        if (i==0) {
            return "#";
        }
        else {
            int j=0;
            StringBuffer str=new StringBuffer();
            while (j<=i) {
                str.append("#");
                j++;

            }
            return str.toString();
        } }
}
