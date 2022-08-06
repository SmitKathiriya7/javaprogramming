package assignment_2;
import java.util.Scanner;
public class circle {
    double k,radius=1;
    circle() {
        k=(3.14*radius*radius);
        System.out.println("your radius is"+k);
    }
    circle(double x) {
        radius=x;
        //k=(3.14*radius*radius);
        //System.out.println("your radius is"+k);
    }

  public void getarea(){
      k=(3.14*radius*radius);
      System.out.println("your area is"+k);
  }
    public void getperimeter(){
        k=(3.14*2*radius);
        System.out.println("your perimeter is"+k);
    }



    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            circle c1=new circle(4.00);
           c1. getarea();
           c1. getperimeter();


        }
    }

