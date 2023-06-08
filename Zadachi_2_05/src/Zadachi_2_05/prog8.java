package Zadachi_2_05;
import java.util.Scanner;
public class prog8 {

	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите алфавит: ");
        String input = in.next().toLowerCase();
        boolean glasn = input.equals("а") || input.equals("е") || input.equals("и")
                || input.equals("о") || input.equals("у") || input.equals("ы");
        if (input.length() > 1)
        {
            System.out.println("Ошибка. Строка>1");
        }
        
        else if (glasn)
        {
            System.out.println("Входное письмо является гласным");
        }
        else
        {
            System.out.println("Входное письмо является согласным");
        }
    }
}