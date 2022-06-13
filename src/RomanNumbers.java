public enum RomanNumbers {
    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10);

    private int number;

    RomanNumbers(int number) {
        this.number = number;
    }
    public static int converterRoman(String numberInput) {
        for (RomanNumbers romanNumbers : RomanNumbers.values()) {
            if (romanNumbers.name().equals(numberInput)) {
                return RomanNumbers.valueOf(numberInput).number;
            }
        }
        return 0;
    }

    public static String transform(int number) {
        if (number <= 0) {
            throw new ArithmeticException("Результат не может быть равен 0 или отрицательным!");
        }
        StringBuilder res = new StringBuilder();
        int[] romanInt = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanChar = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < romanInt.length; i++) {
            while (number >= romanInt[i]) {
                number = number - romanInt[i];
                res.append(romanChar[i]);
            }
        }
        return res.toString();
    }
}
