package Zadachi_2_05;
import java.util.Scanner;
public class prog6 {

	 public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.print("������� ����� � ��������� ������: ");
	        double x = in.nextDouble();
	        System.out.print("������� ����� � ��������� ������ ������� �����: ");
	        double y = in.nextDouble();
	        x = Math.round(x * 1000);
	        x = x / 1000;
	        y = Math.round(y * 1000);
	        y = y / 1000;
	        if (x == y)
	        {
	            System.out.println("��������� ���������: ");
	        }
	        else
	        {
	            System.out.println("��� ������");
	        }
	    }
	}
