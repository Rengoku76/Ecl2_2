package Zadachi_2_05;
import java.util.Scanner;
public class prog8 {

	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("������� �������: ");
        String input = in.next().toLowerCase();
        boolean glasn = input.equals("�") || input.equals("�") || input.equals("�")
                || input.equals("�") || input.equals("�") || input.equals("�");
        if (input.length() > 1)
        {
            System.out.println("������. ������>1");
        }
        
        else if (glasn)
        {
            System.out.println("������� ������ �������� �������");
        }
        else
        {
            System.out.println("������� ������ �������� ���������");
        }
    }
}