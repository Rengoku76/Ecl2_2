package Zadachi_2_05;
import java.util.Scanner;
public class prog13 {

	public static void main(String[] args)
	{
	    int i,n;
	    System.out.print("Введите количество терминов: ");
	    Scanner in = new Scanner(System.in);
			    n = in.nextInt();
	     for(i=1;i<=n;i++)
	     {
	     System.out.println("Число: " +i+" и куб  " +i+": "+(i*i*i));     
	    }
	 }
	}