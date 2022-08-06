package assignment_2;

import java.util.Scanner;

public class pro_5_methodoverloading {
    int s,j;
    public void add(int x,int y){
        s=x+y;
        System.out.println("sum of two number is :"+s);

    }
    public void add(int x,int y,int z){
        s=x+y+z;
        System.out.println("sum of three number is :"+s);

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        pro_5_methodoverloading m1=new pro_5_methodoverloading();
        m1.add(4,5);
        m1.add(37,4,2);

    }
}
