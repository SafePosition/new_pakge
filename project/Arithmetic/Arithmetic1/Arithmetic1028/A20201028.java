package project.Arithmetic.Arithmetic1.Arithmetic1028;
import java.util.Scanner;

public class A20201028 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num1;
        if(scanner.hasNextInt()){
            num1 = scanner.nextInt();
            if (num1>1&&num1<100)
            {
                if(num1%3==0) {
                    System.out.println("可以被3整除");
                    if (num1%7 == 0) {
                        System.out.println("可以被3整除,也可以被7整除");
                    }
                    else{
                        System.out.println("可以被3整除，不能被7整除");
                    }
                }
                else
                {
                    System.out.println("不可被3整除");
                }
            }
            else
                {
                System.out.println("输入错误！请输入1-100的整数");
            }
        }else
        {
            System.out.println("输入错误！");
        }
    }
}
//dsc