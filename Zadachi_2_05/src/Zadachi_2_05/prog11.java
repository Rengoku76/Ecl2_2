package Zadachi_2_05;
import java.util.Scanner;
public class prog11 {
	public static void main(String[] args)
	{
	   int i, n, sum=0;
	   {
	   Scanner in = new Scanner(System.in);  
	        System.out.print("Введите номер: ");  
	         n = in.nextInt();
	}
	  System.out.println("Первые n натуральных чисел: "+n);
	  
	 for(i=1;i<=n;i++)
	   {
	     System.out.println(i);
	     sum+=i;
	   }
	System.out.println("Сумма натурального числа до " +n+ " слагаемых : " +sum);
	}
	}