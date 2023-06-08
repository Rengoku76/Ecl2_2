package Zadachi_2_05;
import java.util.Scanner;
public class prog6 {

	 public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Входное число с плавающей точкой: ");
	        double x = in.nextDouble();
	        System.out.print("Введите число с плавающей точкой другого числа: ");
	        double y = in.nextDouble();
	        x = Math.round(x * 1000);
	        x = x / 1000;
	        y = Math.round(y * 1000);
	        y = y / 1000;
	        if (x == y)
	        {
	            System.out.println("Ожидаемый результат: ");
	        }
	        else
	        {
	            System.out.println("Они разные");
	        }
	    }
	}
