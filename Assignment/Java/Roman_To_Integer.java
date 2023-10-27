// Enter a Roman Number as input and convert it to an integer. (ex IX = 9)

public class Roman_To_Integer {


    public static void main(String[] args) {
        String romanNumeral = "IX"; // Replace with your Roman numeral

        int result = romanToInteger(romanNumeral);
        System.out.println("Integer value is: " + result);
    }

    public static int romanToInteger(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = 0;

            if (currentChar == 'I') {
                currentValue = 1;
            } else if (currentChar == 'V') {
                currentValue = 5;
            } else if (currentChar == 'X') {
                currentValue = 10;
            } else if (currentChar == 'L') {
                currentValue = 50;
            } else if (currentChar == 'C') {
                currentValue = 100;
            } else if (currentChar == 'D') {
                currentValue = 500;
            } else if (currentChar == 'M') {
                currentValue = 1000;
            }

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        return result;
    }
}