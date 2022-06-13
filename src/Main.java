import javax.management.OperationsException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws OperationsException {

        System.out.println("Введите операцию:");
        Scanner scanner = new Scanner(System.in);
        String[] parsingString = scanner.nextLine().split(" ");

        if (parsingString.length != 3) {
            throw new IndexOutOfBoundsException("Калькулятор принимает только два числа!");
        }

        String numberOne = parsingString[0];
        String operation = parsingString[1];
        String numberTwo = parsingString[2];

        if (Check.checkArabic(numberOne) && Check.checkArabic(numberTwo)) {
            int result = Check.checkOperation(Integer.parseInt(numberOne), operation, Integer.parseInt(numberTwo));
            System.out.println(result);
        }
        if (Check.checkRoman(numberOne) && Check.checkRoman(numberTwo)) {
            int result = Check.checkOperation
                    (RomanNumbers.converterRoman(numberOne), operation, RomanNumbers.converterRoman(numberTwo));
            System.out.println(RomanNumbers.transform(result));
        }
        if (Check.checkArabic(numberOne) && Check.checkRoman(numberTwo) ||
                Check.checkRoman(numberOne) && Check.checkArabic(numberTwo)) {
            throw new ArithmeticException("Нельзя вводить римские и арабские числа одновременно!");
        }
    }
}
