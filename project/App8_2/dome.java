package project.App8_2;

public class dome {
    public static void main(String[] args) {
        New_person one=new New_person("张",22);//创建一个名为one的New_person对象
        New_person two=new New_person();//创建一个名为two的New_person对象
        one.show();//调用New_person这个类的show方法
        two.show();//调用New_person这个类的show方法
    }
}
class New_person {
    private String name;//标记1
    private int age;//标记2
    public New_person(String name/*标记3*/, int age/*标记4*/)//构造实例方法
    {
        this.name=name;
        //标记1=标记3
        this.age=age;
        //标记2=标记4
        System.out.println("yes phave");
    }
    public New_person()
    {
        this("无",0);
    }
    public void show()
    {
        System.out.println("姓名"+name+"年龄"+age);
    }
}
