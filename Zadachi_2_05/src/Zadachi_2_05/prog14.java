package Zadachi_2_05;
import java.util.Scanner;
public class prog14 {

	public static void main(String[] args)
	{
	   int j,n;
	   System.out.print("������� ����� (������� ��� �������): ������� ����� ������: ");
	    Scanner in = new Scanner(System.in);
			    n = in.nextInt();
	   for(j=0;j<=n;j++)
	  
	     System.out.println(n+" X "+j+" = " +n*j);
	   }
	}