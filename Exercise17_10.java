/*
Author:	王俊朗
Class:	软件工程1803
ID:	20181003043
*/

import java.io.*;

public class Exercise17_10
{
    public static void main(String[] args) throws IOException
    {
        RandomAccessFile sourceFile = new RandomAccessFile(args[0], "rw");  //以从控制台接受的文件名新建源文件
        int num = Integer.parseInt(args[1]);    //记录要分割的数目

        sourceFile.setLength(0);

        for (int i = 0; i < 1000; i++)  //假设给源文件写入很多数字
        {
            sourceFile.writeInt(i);
        }


        long part = sourceFile.length() / num;  //将文件中要分割的位置记录下来
        RandomAccessFile[] targets = new RandomAccessFile[num]; //用数组来保存分割而成的碎片文件

        for (int i = 0; i < num; i++)
        {
            while (sourceFile.getFilePointer() < (part * (i + 1)))  //若指针未到达分割的位置，则继续写入数据进当前碎片文件中
            {
                sourceFile.seek(part * i);
                String name = "sourceFile." + (i + 1);
                targets[i] = new RandomAccessFile(name, "rw");
                targets[i].writeInt(sourceFile.readInt());
            }
        }

        sourceFile.close();
    }
}
