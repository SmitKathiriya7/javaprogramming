package Assignment;
import java.util.Scanner;


public class Assignment_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.startsWith("oz")) {//function start with oz
            System.out.println("OZ");
        } else if (str.startsWith("o")) {
            System.out.println("O");
        } else if (str.startsWith("z", 1)) {
            System.out.println("Z");
        } else {
            System.out.println("");
        }

    }
}

