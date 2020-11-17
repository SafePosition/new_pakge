package project.Arithmetic.Arithmetic1.Arithmetic1105_1;
import java.util.*;

public class A1105_1 {


    public static void main(String[] args) {
        String str, ch;
        Scanner read = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        str = read.nextLine();
        System.out.println("请输入要删除的字符");
        ch = read.nextLine();
        str=str.replace(ch,"");
        System.out.println("修改后的的字符串"+str);
    }
}
