package Zadachi_2_05;
import java.util.Scanner;
public class prog15 {

	public static void main(String[] args)
	{
	   int i,n,sum=0;
	   System.out.print("������� ���������� ��������: ");
	{
	   Scanner in = new Scanner(System.in);
			    n = in.nextInt();
	  System.out.println ("�������� �����:");
	   for(i=1;i<=n;i++)
	   {
	     System.out.println (2*i-1);
	     sum+=2*i-1;
	   }
	   System.out.println ("����� ��������� ������������ ����� �� 5 ���������: " +sum);
	}
	}
	}

