package project.App8_2;

public class App8_2 {
    public static void main(String[] args)
    {
        student s1 = new student();
        student s2 = new student("张",22,"信息科");
        s1.show();
        s2.show();
    }
}
class person {
    private String name;
    private int age;
    public person(String name, int age)
    {
        this.age=age;
        this.name=name;
        System.out.println("yes phave");
    }
    public person()
    {
        this("无",0);

    }
    public void show()
    {
        System.out.println("姓名"+name+"年龄"+age);
    }
}
class student extends person
{
    private String department;
    public student(){System.out.println("diaoyongxueshengfangfaStudent");}
    public student(String name, int age,String dep)
    {
        super(name,age);
        department = dep;
        System.out.println("I"+department+"student");
        System.out.println("调用了学生有参");
    }
}
