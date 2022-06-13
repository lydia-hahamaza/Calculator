import javax.management.OperationsException;

public class Check {

    public static int checkOperation(int numberOne, String operation, int numberTwo) throws OperationsException {
        int result;
        switch (operation) {
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "*":
                result = numberOne * numberTwo;
                break;
            case "/":
                result = numberOne / numberTwo;
                break;
            default:
                throw new OperationsException("Операция не корректна.");
        }
        return result;
    }

    public static boolean checkArabic(String numberInput) throws IndexOutOfBoundsException {
        String[] arabic = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        try {
            int numberInt = Integer.parseInt(numberInput);
            if (numberInt < 0 || numberInt > 10) {
                throw new IndexOutOfBoundsException("Размер числа должен быть от 1 до 10.");
            }
        } catch (NumberFormatException e) {
            return false;
        }
        for (String comparisonArabic : arabic) {
            if (numberInput.equals(comparisonArabic)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkRoman(String numberInput) throws OperationsException {
        String[] roman = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (String comparisonRoman : roman) {
            if (numberInput.equals(comparisonRoman)) {
                return true;
            }
        }
        return false;
    }

}