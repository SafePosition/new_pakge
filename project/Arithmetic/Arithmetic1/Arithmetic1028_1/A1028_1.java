package project.Arithmetic.Arithmetic1.Arithmetic1028_1;

import java.util.Scanner;

public class A1028_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num1,sum,sum1;
        sum=1;
        sum1=0;
        if(scanner.hasNextInt()){
            num1 = scanner.nextInt();
            for (;  num1!=0; num1=num1/10) {
               sum1+=num1%10;
            }

            System.out.println("它的和是"+sum1);
        }else
        {
            System.out.println("输入错误！");
        }

    }
}
/*
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num1,sum,sum1;
        sum=1;
        sum1=0;
        if(scanner.hasNextInt()){
            num1 = scanner.nextInt();
            for (int i = 1; i <=num1 ; i++) {
                sum=sum*i;
                sum1=sum1+sum;
            }

            System.out.println("它的阶乘和是"+sum1);
        }else
        {
            System.out.println("输入错误！");
        }


 */