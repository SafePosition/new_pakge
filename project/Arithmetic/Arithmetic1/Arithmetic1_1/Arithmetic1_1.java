package project.Arithmetic.Arithmetic1.Arithmetic1_1;
/*import java.util.Scanner;
public class Arithmetic1_1 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int num2;
        int num1;


    }
}
*/
import java.util.Scanner;
public class Arithmetic1_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int num1,num2;
        if(scanner.hasNextInt()){
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            if(num2!=0)
                System.out.println(num1+" / "+num2+" = "+((float)num1/num2));
            else
            {
                System.out.println("输入错误!");
            }
        }else
        {
            System.out.println("输入错误！");
        }
    }
}