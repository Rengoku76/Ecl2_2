package Zadachi_2_05;
import java.util.Scanner;
public class prog7 {

	public static void main(String[] strings) {
        Scanner input = new Scanner(System.in);
        int number_Of_DaysInMonth = 0; 
        String MonthOfName ="";
        System.out.print("������� ����� ������: ");
        int month = input.nextInt();
        System.out.print("������� ���: ");
        int year = input.nextInt();
        switch (month) {
            case 1:
                MonthOfName ="������";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName ="�������";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName ="����";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName ="������";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName ="���";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName ="����";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName ="����";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName ="������";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName ="��������";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName ="�������";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName ="������";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName ="�������";
                number_Of_DaysInMonth = 31;
        }
        System.out.print("� " + MonthOfName + " " + year + " "+ number_Of_DaysInMonth + " ����\n");
    }
}