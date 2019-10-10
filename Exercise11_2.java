/*
Author: 王俊朗
Class: 软件工程1803
ID: 20181003043
 */

import java.util.*;
public class Exercise11_2
{
public static void main(String[] args)
{

        }
}

class MyDate
{
private int year;
private int month;
private int day;

    MyDate()
    {
        this.year = Date.year;
        this.month = Date.month;
        this.day = Date.day;
    }

}

class Person
{
private String name;
private String address;
private int phoneNumber;
private String email;

        Person()
        {

        }


}

class Student extends Person
{
private String grade;
}

class Employee extends Person
{
private String office;
private MyDate employmentDate;
private int salary;
}

class Faculty extends Employee
{
private int level;
private Date working;
}

class Staff extends Employee
{
private String title;
}
