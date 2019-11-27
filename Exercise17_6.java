/*
Author:	王俊朗
Class:	软件工程1803
ID:	20181003043
*/

import java.io.*;
import java.util.*;

class Exercise17_6
{
	public static void main(String[] args) throws ClassNotFoundException, IOException
	{
		Loan a = new Loan(1.0, 1, 1000);
		Loan b = new Loan(2.0, 2, 2000);
		Loan c = new Loan(3.0, 3, 3000);
		Loan d = new Loan(4.0, 4, 4000);
		Loan e = new Loan(5.0, 5, 5000);
		Loan[] loans = {a, b, c, d, e};
		
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_06.dat"));
		
		for (int i = 0; i < 5; i++)
		{
			output.writeObject(loans[i]);
		}
		
		output.close();
		
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_06.dat"));
		
		try
		{
			while (true)
			{
				System.out.print(input.readDouble() + " ");
				System.out.print(input.readInt() + " ");
				System.out.print(input.readDouble() + " ");
				System.out.println(input.readObject());
			}
		}
		catch (EOFException ex)
		{
			System.out.println("All data were read!");
		}
		
		input.close();
	}
}

public class Loan implements Serializable
{
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;
	
	public Loan()
	{
		this(2.5, 1, 1000);
	}
	
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount)
	{
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		this.loanDate = new Date();
	}
}	