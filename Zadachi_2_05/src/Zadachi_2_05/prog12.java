package Zadachi_2_05;
import java.util.Scanner;
public class prog12 {

	 public static void main(String[] args)
	 {       
	     int i,n=0,s=0;
	 	double avg;
	 	{
	         System.out.println("������� 5 ����: ");       
	 	}
	 		for (i=0;i<5;i++)
	 		{
	 		    Scanner in = new Scanner(System.in);
	 		    n = in.nextInt();
	 		    
	   		s +=n;
	 	}
	 	avg=s/5;
	 	System.out.println("����� " + i +" ����: " +s+"\n������� ��������: " +avg);
	  
	 }
	 }