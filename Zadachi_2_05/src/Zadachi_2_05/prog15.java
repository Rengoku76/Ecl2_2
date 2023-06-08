package Zadachi_2_05;
import java.util.Scanner;
public class prog15 {

	public static void main(String[] args)
	{
	   int i,n,sum=0;
	   System.out.print("Введите количество терминов: ");
	{
	   Scanner in = new Scanner(System.in);
			    n = in.nextInt();
	  System.out.println ("Нечетные числа:");
	   for(i=1;i<=n;i++)
	   {
	     System.out.println (2*i-1);
	     sum+=2*i-1;
	   }
	   System.out.println ("Сумма нечетного натурального числа до 5 слагаемых: " +sum);
	}
	}
	}

