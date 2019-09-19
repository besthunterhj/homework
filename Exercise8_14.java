import java.util.*;
public class Exercise8_14 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size for the matrix:");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++)     //二维数组的列循环
        {
            for (int j = 0; j < size; j++)          //二维数组的行循环
            {
                matrix[j][i] = (int)(Math.random() * 2);
            }
        }

        for (int i = 0; i < matrix.length; i++)     //输出矩阵
        {
            for (int j = 0; j < size; j++)
            {
                System.out.print(matrix[j][i]);
                if (j == size - 1)                  //每输出完一行就换行
                    System.out.print("\n");
            }
        }
        searchRow(matrix, size, size);

    }

    public static void searchRow(int[][] array, int row, int column)
    {


        for (int i = 0; i < column; i++)
        {
            //设两个检测值，分别判断是否一行均为0或1
            int temp0 = 0;
            int temp1 = 0;
            //记录1或0
            for (int j = 0; j < row; j++)
            {
                if (array[j][i] == 0)
                {
                    temp0++;
                }

                if (array[j][i] == 1)
                {
                    temp1++;
                }

            }
            //如果一行中所有数字都为0或1，则输出
            if (temp0 == 4)
            {
                System.out.println("All 0s on row " + i);
            }
            if (temp1 == 4)
            {
                System.out.println("All 1s on row " + i);
            }
        }
    }
}
