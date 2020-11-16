package project.super_getname;

public class super_getname {
    public static void main (String[] args)
    {
        person per = new person("王五",11);
        per.display();
        student stu =new student("刘四",11,"计算机");
        stu.display();
    }
}



class person
{
    static int count = 0;
    protected String name;
    protected int age;
    public person(String n1,int a1)
    {
        name = n1;
        age = a1;
        this.count++;
    }
    public String toString()
    {
        return this.name+","+this.age;
    }
    public void display()
    {
        System.out.print("本类名"+this.getClass().getName()+";");
        System.out.println("父类名"+this.getClass().getSuperclass().getName()+";");
        System.out.print("person.count"+this.count+" ");
        System.out.print("student"+student.count+" ");
        Object obj=this;//引用当前类
        if (obj instanceof student)//对当前引用的类进行判断
            System.out.println(obj.toString()+"是student类对象");
        else if (obj instanceof person)
            System.out.println(obj.toString()+"是person类对象");

    }
}

class student extends person
{
    static int count=0;
    protected String dep;
    protected student (String n1,int a1,String d1)
    {
        super(n1,a1);
        dep=d1;
        this.count++;
    }
    public String toString()
    {
        return super.toString()+","+dep;
    }
    public void display()
    {
        super.display();
        System.out.print("super count="+super.count);
        System.out.println("; this.count="+this.count);
    }
}
/*本类名project.super_getname.person;父类名java.lang.Object;
person.count1 student0 王五,11是person类对象
本类名project.super_getname.student;父类名project.super_getname.person;
person.count2 student1 刘四,11,计算机是student类对象
super count=2; this.count=1
*/