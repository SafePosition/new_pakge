package project.dataSructure.queue;
import java.util.Scanner;
public class ArrayQueueDome {
    public static void main(String[] args) {
        // 测试一个队列

       //创建一个队列
        ArrayQueue arrayQueue  =  new ArrayQueue(3);
        char key=' ';
        Scanner scanner=new Scanner(System.in);
        boolean loop = true;
        while (loop)
        {
            System.out.println("s(show):显示队列");
            System.out.println("e(exit):退出程序");
            System.out.println("a(add):添加数据到队列");
            System.out.println("g(get):从队列取出数据");
            System.out.println("h(head):显示队列头数据");
            key = scanner.next().charAt(0);
            switch (key)
            {
                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.println("输入一个数");
                    int value = scanner.nextInt();
                    arrayQueue.addQueue(value);
                    break;
                case 'g'://取出数据
                    try {
                        int res = arrayQueue.getQueue();
                        System.out.printf("取出的数据是%d\n",res);
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h'://查看头数据
                    try {
                        int res = arrayQueue.headQueue();
                        System.out.printf("队列头的数据是%d\n",res);
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop=false;
                    break;
                default:
                    break;

            }
        }
        System.out.println("程序退出");
    }
}

//使用一个数值模拟队列，编写一个ArrayQueue类
class ArrayQueue
{
    private int maxSize;//表示数组最大容量
    private int front;//队列头
    private int rear;//队列尾
    private int[] arr;//该数据用于存放数据，模拟队列

    //创建队列的构造器
    public ArrayQueue(int arrMaxSize)
    {
        maxSize=arrMaxSize;
        arr=new int[maxSize];
        front=-1;//指向队列头的前一个位置
        rear=-1;//指向队列尾，指向队列尾的数据
    }

    //判断队列是否满
    public boolean isFull()
    {
        return rear ==maxSize-1;
    }

    //判断是否为空
    public boolean isEmpty()
    {
        return rear == front;
    }

    //添加数据到队列
    public void addQueue(int n)
    {
        //判断是否满
        if (isFull()){
            System.out.println("队列满，不能加入数据");
            return;
        }
        rear++;
        arr[rear]=n;
    }

    //获取队列的数据，出队列
    public int getQueue()
    {
        //判断是否为空
        if (isEmpty()){
            throw new RuntimeException("队列空，不能取数据");
        }
        front++;
        return  arr[front];
    }

    //显示队列的数据，出队列
    public void showQueue()
    {

        if(isEmpty()){
            System.out.println("队列空");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }

    //显示队列的头数据，不是取出数据
    public int headQueue()
    {
        if (isEmpty())
        {
            throw new RuntimeException("队列空");
        }
        return arr[front+1];
    }

}
