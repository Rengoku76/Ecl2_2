package Zadachi_2_05;
import java.util.Scanner;
public class prog11 {
	public static void main(String[] args)
	{
	   int i, n, sum=0;
	   {
	   Scanner in = new Scanner(System.in);  
	        System.out.print("������� �����: ");  
	         n = in.nextInt();
	}
	  System.out.println("������ n ����������� �����: "+n);
	  
	 for(i=1;i<=n;i++)
	   {
	     System.out.println(i);
	     sum+=i;
	   }
	System.out.println("����� ������������ ����� �� " +n+ " ��������� : " +sum);
	}
	}