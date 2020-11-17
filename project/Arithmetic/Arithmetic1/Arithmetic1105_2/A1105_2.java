package project.Arithmetic.Arithmetic1.Arithmetic1105_2;
import java.util.*;
public class A1105_2 {
    public static void main(String[] args) {
        int num;
        Scanner read = new Scanner(System.in);
        System.out.println("请输入需要比较的个数");
        num=read.nextInt();
        int[] n = new int[num];
        for (int i = 0; i < num; i++) {
            int a=i+1;
            System.out.println("请输入第"+a+"个数");
            n[i]=read.nextInt();
        }
        int max=0,min=999999999;
        for (int i = 0; i < num; i++) {
            if (n[i]>max) {
                max=n[i];
            }
            if (n[i]<min) {
                min=n[i];
            }
        }
       System.out.println("最大"+max+",最小"+min);
    }
}
