package Zadachi_2_05;
import java.util.Scanner;
public class prog12 {

	 public static void main(String[] args)
	 {       
	     int i,n=0,s=0;
	 	double avg;
	 	{
	         System.out.println("Введите 5 цифр: ");       
	 	}
	 		for (i=0;i<5;i++)
	 		{
	 		    Scanner in = new Scanner(System.in);
	 		    n = in.nextInt();
	 		    
	   		s +=n;
	 	}
	 	avg=s/5;
	 	System.out.println("Сумма " + i +" цифр: " +s+"\nСреднее значение: " +avg);
	  
	 }
	 }