import java.util.*;
public class Exercise7_21 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of balls to drop:");
        int ballNum = input.nextInt();
        System.out.println("Enter the number of slots in the bean machine:");
        int slotNum = input.nextInt();
        System.out.println(" ");
        int[] slots = new int[slotNum];
        int[] balls = new int[ballNum];
        for (int i = 0; i < ballNum; i++)
        {
            int p;
            balls[i] = showPath(7);
            p = balls[i];
            slots[p]++;
        }
        System.out.println(" ");
//        int maxRow = 0;
//        for (int j = 0; j < slotNum; j++)
//        {
//            if (maxRow < slots[j])
//                maxRow = slots[j];
//        }
//        int[][] outputArray = new int[slotNum][maxRow];
//        for (int a = 0; a < slotNum; a++)
//        {
//            if (slots[a] == 0)
//            {
//                for (int b = 0; b < maxRow; b++)
//                {
//                    outputArray[a][b] = 0;
//                }
//            }
//            else
//            {
//                for (int rows = maxRow; rows >= 0; rows--, slots[a]--)
//                {
//                    if (slots[a] >= 0)
//                        outputArray[a][rows] = 1;
//                    else
//                        outputArray[a][rows] = 0;
//                }
//            }
//        }
        ShowMachine(ballNum, slotNum, slots);
    }

    public static int showPath(int n)
    {
        int[] path = new int[n];
        int rightNum = 0;
        for (int i = 0; i < n; i++)
        {
            path[i] = (int)((Math.random() * 10) % 2);
            if (path[i] == 0)
            {
                System.out.print("R");
                rightNum++;
            }
            else
            {
                System.out.print("L");
            }
        }
        System.out.println(" ");
        return rightNum;
    }

//    public static void showBall(int[][] outputArray, int slotNum)
//    {
//
//        for(int i = slotNum - 1; i >= 0; --i)
//        {
//            for(int j = 0; j < slotNum; ++j)
//            {
//                if(outputArray[i][j] == 0)
//                    System.out.print(" ");
//                else
//                    System.out.print(0);
//            }
//            System.out.println();
//        }
//
//    }





    public static void ShowMachine(int ballNum, int slotNum, int[] slots)
    {
        StringBuilder str;
        int flag;
        for (int i = ballNum; i > 0; i--) {     //模拟二维数组，当count[j]超过i，证明此行此列存在值
            flag = 0;
            str = new StringBuilder();
            for (int j = 0; j < slotNum; j++) {
                if (slots[j] >= i) {
                    str.append("O");
                    flag = 1;
                }
                else
                    str.append(" ");
            }
            if (flag == 1)                         //使用str以及flag为了去除多余的空行
                System.out.println(str);
        }
    }

}
