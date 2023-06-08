package Zd26_05;
import java.util.ArrayList;
import java.util.List;

public class prog2 {
    public static List<Integer> findMillionSmallestNumbers(List<Integer> numbers) {
        List<Integer> smallestNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (smallestNumbers.size() < 1000000) {
                smallestNumbers.add(number);
            } else {
                int maxIndex = getMaxIndex(smallestNumbers);
                int maxNumber = smallestNumbers.get(maxIndex);

                if (number < maxNumber) {
                    smallestNumbers.set(maxIndex, number);
                }
            }
        }

        return smallestNumbers;
    }

    private static int getMaxIndex(List<Integer> numbers) {
        int maxIndex = 0;

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > numbers.get(maxIndex)) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static void main(String[] args) {

        List<Integer> numbers = generateBillionNumbers(); 
        List<Integer> millionSmallestNumbers = findMillionSmallestNumbers(numbers);

        System.out.println("Миллион наименьших чисел:");
        for (int number : millionSmallestNumbers) {
            System.out.println(number);
        }
    }


    private static List<Integer> generateBillionNumbers() {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 100000; i++) {
            numbers.add(i);
        }

        return numbers;
    }
}
