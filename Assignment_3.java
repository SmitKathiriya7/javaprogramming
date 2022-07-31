package Assignment;

import java.util.Scanner;
//CREATED BY SMIT KATHIRIYA
//21CE053
public class Assignment_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,j,k;
        System.out.println("enter 1st number");
        a=sc.nextInt();
        System.out.println("enter 2nd number");
        b=sc.nextInt();
        j=a%10;
        k=b%10;
        if(j==k)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
