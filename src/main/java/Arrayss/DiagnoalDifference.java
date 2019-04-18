package Arrayss;

public class DiagnoalDifference {
    public int n=3;
    public static void Sample(String s)
     {
               System.out.println("String");
            }
     public static void Sample(Object o)
     {
              System.out.println("Object");
         }
    public static void Sample(Integer s)
   {
             System.out.println("Integer");
          }

    public static void main (String[] args) {
//        int arr [] [] = {{1,2,3},{4,5,6},{9,8,9}};
//    int firstsum =0;
//       for (int i=0;i<arr.length;i++) {
//           firstsum= arr[i][i] + firstsum;
//        }
//        int secondsum=0;
//       int size =arr.length-1;
//       for (int j=0;j<arr.length;j++) {
//           secondsum=arr[j][size] + secondsum;
//           size --;
//       }
//       int diff = firstsum -secondsum;
//       System.out.println(diff);

        int a=7;
        System.out.println(a++ + ++a);

        System.out.println(Month.March.ordinal());
//            Sample(null);
        String s1 = "xyz";
        String s2 = s1;
        s1 += "d";
        System.out.println(s1 + " " + s2 + " " + (s1==s2));
        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = sb1;
        sb1.append("d");
        System.out.println(sb1 + " " + sb2 + " " + (sb1==sb2));
}




enum Month
{
    January, February, April, March, May, July
};}