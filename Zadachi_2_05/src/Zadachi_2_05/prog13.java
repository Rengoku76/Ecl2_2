package Zadachi_2_05;
import java.util.Scanner;
public class prog13 {

	public static void main(String[] args)
	{
	    int i,n;
	    System.out.print("������� ���������� ��������: ");
	    Scanner in = new Scanner(System.in);
			    n = in.nextInt();
	     for(i=1;i<=n;i++)
	     {
	     System.out.println("�����: " +i+" � ���  " +i+": "+(i*i*i));     
	    }
	 }
	}