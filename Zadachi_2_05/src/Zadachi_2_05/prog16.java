package Zadachi_2_05;
import java.util.Scanner;
public class prog16 {

	public static void main(String[] args)
	{
	   int i,j,n;
	   System.out.print("¬ведите количество строк: ");
	 Scanner in = new Scanner(System.in);
			    n = in.nextInt();
	   for(i=1;i<=n;i++)
	   {
		for(j=1;j<=i;j++)
		  System.out.print(j);
	    System.out.println("");
	    }
	}
	}