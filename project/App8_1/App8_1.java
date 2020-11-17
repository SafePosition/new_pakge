package project.App8_1;

public class App8_1
{
    public static void main(String[] args)
    {
        Student stu = new Student();
        stu.setNameAge("nih 你n",21);
        stu.show();
        stu.setDepartment("jishuanjixi");
    }
}


class Person {
    private String name;
    private int age;
    public Person()
    {
        System.out.println("diaoyongperson");
    }
    public void setNameAge(String name,int age)
    {
        this.age=age;
        this.name=name;
    }
    public void show()
    {
        System.out.println("xinming"+name+"nianling"+age);
    }
}
class Student extends Person
{
    private String department;
    public Student()
    {
        System.out.println("diaoyongstudent");
    }

    public void setDepartment(String dep) {
        department = dep;
        System.out.println("wosi"+department+"dexiesheng");
    }

}
/*

*/