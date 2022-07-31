package Assignment;

import java.util.Scanner;

//CREATED BY SMIT KATHIRIYA
//21CE053

public class Assignment_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of array");
       int n= sc.nextInt();
        int []array = new int[n];
        boolean as=false;//if array not contain 1,2,3 it return defalut false
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
             for(int i=0;i<n;i++)
        {
            if(array[i]==1){
                i++;
                if(array[i]==2){
                    i++;
                    if(array[i]==3);{
                        as=true;
                    }
                }
            }
        }
             System.out.println(as);


    }
}
