package Arrayss;

public class JumpingClouds {

    public static void main(String[] args) {
        int[] c = {0,0,0,1,0,0};
        int count=0;
        int i=0;
        while (i < c.length -1 ) {

            int cloud = c[i];

            if (c[i+1] == 1) {
                i=i+2;
                count++;
            }
            else if (c[i+1] ==0 && i < c.length -2 && c[i+2] == 0) {
                count++;
                i=i+2;
            }
            else {
                i++;
                count++;
            }
        }
        System.out.print(count);

    }
}
