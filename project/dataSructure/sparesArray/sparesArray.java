package project.dataSructure.sparesArray;

public class sparesArray {
    public static void main(String[] args)
    {
        //创建一个原始11*11的数组
        //0无棋子  1黑子 2蓝子
        int shessArr1[][]=new int[11][11];
        shessArr1[1][2]=1;
        shessArr1[2][3]=2;
        //输出二维数组
        for (int[] row: shessArr1)
        {
            for (int data :row)
            {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }


        // 将二维数组转换稀疏数组
        //1.先遍历二维数组得到非0数据个数
        int sum=0;
        for (int i=0;i<11;i++)
        {
            for (int j=0;j<11;j++)
            {
                if (shessArr1[i][j]!=0)
                {
                    sum++;
                }
            }
        }

        //2.创建对应稀疏数组
        //System.out.println("sum="+sum);
        int sparseArr[][]=new int[sum+1][3];
        //给稀疏数组赋值
        sparseArr[0][0]=11;
        sparseArr[0][1]=11;
        sparseArr[0][2]=sum;

        //遍历二维数组，将非0的值存放到sparseArr中
        int count =0;
        for (int i=0;i<11;i++)
        {
            for (int j=0;j<11;j++)
            {
                if (shessArr1[i][j]!=0)
                {
                    count++;
                    sparseArr[count][0]=i;
                    sparseArr[count][1]=j;
                    sparseArr[count][2]=shessArr1[i][j];
                }
            }
        }
        //输出稀疏数组的形式
        System.out.println();
        for (int i = 0; i <sparseArr.length ; i++)
        {
            System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
        }



    }
}
