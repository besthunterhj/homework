/*
Author: 王俊朗
Class: 软件工程1803班
ID：20181003043
*/

import java.util.*;
import java.text.NumberFormat;
import java.text.ParseException;

public class Exercise10_7 {
    public static void main(String[] args)
    {
        Account[] accounts = new Account[10];   //定义10名用户
        Scanner input = new Scanner(System.in);

        //初始化所有用户
        for (int i = 0; i < 10; i++)
        {
            accounts[i] = new Account(i, 100);
        }

        while (true)
        {
            System.out.println("Enter an id:");
            int id = input.nextInt();
            System.out.print("\n");
            boolean permit = false;

            for (int i = 0; i < 10; i++)
            {
                if (id == accounts[i].getId())
                {
                    permit = true;
                    break;
                }
            }

            if (permit)
            {
                while (true)
                {
                    menu();
                    int choice = input.nextInt();
                    if (choice == 1)
                    {
                        System.out.println("The balance is " + accounts[id].getBalance());
                        System.out.print("\n");
                    }
                    else if (choice == 2)
                    {
                        System.out.println("Enter an amount to withdraw:");
                        double amount = input.nextDouble();
                        accounts[id].withDraw(amount);
                        System.out.print("\n");
                    }
                    else if (choice == 3)
                    {
                        System.out.println("Enter an amount to deposit:");
                        double amount = input.nextDouble();
                        accounts[id].deposit(amount);
                        System.out.print("\n");
                    }
                    else
                    {
                        System.out.print("\n");
                        break;
                    }
                }
            }

            else
            {
                System.out.println("Please enter the true id!");
            }
        }
    }

    static void menu()
    {
        System.out.println("Main menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
        System.out.println("Enter a choice:");
    }
}



class Account
{
    private int id = 0;
    private double balance = 0;
    static private double annualInterestRate = 0; //所有的账户有相同的利率
    private Date dateCreated;

    //构造函数
    Account()
    {

    }

    Account(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
    }

    //数据域访问器
    int getId()
    {
        return id;
    }

    double getBalance()
    {
        return balance;
    }

    double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    //数据域修改器
    void setId(int id)
    {
        this.id = id;
    }

    void setBalance(double balance)
    {
        this.balance = balance;
    }

    void setAnnualInterestRate(double annualInterestRate)
    {
        Account.annualInterestRate = annualInterestRate;
    }

    //dateCreated访问器
    Date getDateCreated()
    {
        return dateCreated;
    }

    //返回月利率
    String getMonthlyInterestRate()
    {
        NumberFormat percent = NumberFormat.getPercentInstance();
        percent.setMaximumFractionDigits(1);
        return percent.format(annualInterestRate / 12);
    }

    //提取现金
    void withDraw(double cash)
    {
        this.balance = this.balance - cash;
    }

    //存储现金
    void deposit(double cash)
    {
        this.balance = this.balance + cash;
    }
}
