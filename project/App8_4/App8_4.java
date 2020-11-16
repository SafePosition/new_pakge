package project.App8_4;

public class App8_4 {
    public static void main(String[] args)
    {
        student stu = new student("王涛",23,"电子");
        stu.show();

    }
}
class person
{
    protected String name;
    protected int age;
    public person(String name,int age)
    {
        this.age=age;
        this.name=name;
    }
    protected void show(){
        System.out.println("姓名"+name+"年龄"+age);
    }

}
class student extends person
{
    private String department;
    public student (String name,int age,String dep)
    {
        super(name,age);
        department=dep;
    }
    protected void show()
    {
        System.out.println("系别"+department);
    }
}
//覆盖父类方法