package project.Arithmetic.Arithmetic1.Arithmetic1105_3;
import java.util.*;

public class A1105_3 {
    public static void main(String[] args) {
        String str;
        Scanner read = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        str=read.nextLine();
        System.out.println("请输入截取的开始位置：");
        int a=read.nextInt();
        System.out.println("请输入截取的长度：");
        int b=read.nextInt();
        String temp=str.substring(a,a+b);//截取位置从下标a开始长度为l，截取a到a+l
        System.out.println("截取的字符串为："+temp);


    }
}
