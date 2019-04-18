package Arrayss;


import java.time.Clock;

public class sampletest {

    public static  void main(String [] args ) {

      String a ="DUDU";
      char b[] = a.toCharArray();
      int U=0;
      int D=0;
      int n=b.length;
      int count=0;
      boolean belowSea = false;
      for (int i=0;i<b.length;i++) {

        if (new Character(b[i]).toString().equals("U")) {
            U=U+1;

        }
        else if (new Character(b[i]).toString().equals("D")) {
            U=U-1; }
        else {
            break;
        }
          if(!belowSea && U < 0)
          {
              count++;
              belowSea = true;
          }

          if(U >= 0)//We are back above sea level
              belowSea = false;
      }
        System.out.println("Valley" + count);

    }

    }
