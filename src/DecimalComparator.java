import java.text.DecimalFormat;

public class DecimalComparator {

    public static void main (String[] args) {
        boolean equals = areEqualByThreeDecimalPlaces(1.23456,1.234,3);
        System.out.println("this is the value " + equals);

    }

    public static boolean areEqualByThreeDecimalPlaces (double number1, double number2, int decimals ) {
        double numOfDecimals = Math.pow(10, decimals);
        int integerNum1 = (int) (number1 * numOfDecimals);
        int integerNum2 = (int) (number2 * numOfDecimals);

        System.out.println("First Number, " + integerNum1);
        System.out.println("Second Number, " + integerNum2);

        return (integerNum1 == integerNum2);

    }

}
