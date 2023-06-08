package Zadachi_2_05;
import java.util.Scanner;
public class prog9 {
public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    System.out.print("¬ведите год: ");
    int year = in.nextInt();
    boolean x = (year % 4) == 0;
    boolean y = (year % 100) != 0;
    boolean z = ((year % 100 == 0) && (year % 400 == 0));
    if (x && (y || z))
    {
        System.out.println(year + " високосный");
    }
    else
    {
        System.out.println(year + " не високосный");
    }
}
}