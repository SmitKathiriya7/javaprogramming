package Assignment;
import java.util.Scanner;



    public class Assignment_5{
        //Made by smit kathiriya
        //21CE053
        public static void main(String[] args) {
            Scanner kr=new Scanner(System.in);
            System.out.println("enter first string");
            String a = kr.next();
            System.out.println("enter second string");

            String b = kr.next();
            int count = 0;
            int len = Math.min(a.length(), b.length());
//        System.out.println(len);
            for (int i = 0; i <len-1; i++) {// for pair making
                String aSub = a.substring(i, i + 2); // for making sub string
                String bSub = b.substring(i, i + 2);
                if (aSub.equals(bSub)) {
                    count++;  // for same String
                }
            }
            System.out.print("Number of substrings appear in the same place :");
            System.out.println(count); // print
        }



}
