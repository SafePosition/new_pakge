package project.App8_10;

import org.w3c.dom.UserDataHandler;

public class App8_10 {
    public static void main(String[] arges)
    {
        /*
        Shape ret=new Rectangle("长方形",6.5,10.3);
        System.out.print(";面积="+ret.getArea());
        System.out.println(";周长="+ret.getLength());//链接时使用+号，不是,!!!!!!!
        */
        Shape circle=new circle("圆",10.2);
        System.out.print(";面积="+circle.getArea());
        System.out.println(";周长="+circle.getLength());


    }

}
abstract class Shape
{
    protected String name;
    public Shape(String xm)
    {
        name = xm;
        System.out.print("名称"+name);
    }
    abstract public double getArea();//声明求面积的抽象方法
    abstract public double getLength();//声明求周长的抽象方法
    //抽象了不一定
    // 要实现
}


class circle extends Shape
{
    private final double pi=3.14;
    private double radius;
    public circle(String shapeName,double r)
    {
        super(shapeName);
        radius=r;
    }
    public double getArea()
    {
        return pi*radius*radius;
    }
    public double getLength()
    {
        return 2*pi*radius;
    }
}
/*
class Rectangle extends Shape
{
    private double width;
    private double height;
    public Rectangle(String shapeName,double width,double height)
    {
        super(shapeName);
        this.height=height;
        this.width=width;
    }
    public double getArea()
    {
        return width*width;
    }
    public double getLength()
    {
        return 2*(width+height);
    }
}
System.out.println(";周长="+ret.getLength());链接时使用+号，不是
*/