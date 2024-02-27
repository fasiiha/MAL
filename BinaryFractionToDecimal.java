public class BinaryFractionToDecimal {

    public static double binaryToDecimal(String binary) {
        int dotPosition = binary.indexOf(".");
        if (dotPosition == -1) {
            throw new IllegalArgumentException("Input string must be a valid binary fraction");
        }

        String fractionalPart = binary.substring(dotPosition + 1);
        double decimal = 0.0;

        for (int i = fractionalPart.length() - 1; i >= 0; i--) {
            char digit = fractionalPart.charAt(i);
            if (digit != '0' && digit != '1') {
                throw new IllegalArgumentException("Invalid binary digit: " + digit);
            }
            decimal += (digit - '0') * Math.pow(2, -(i + 1)); // Calculate 2 raised to the negative power
        }

        return decimal;
    }

    public static void main(String[] args) {
        String binaryFraction = "0.1011";

        try {
            double decimal = binaryToDecimal(binaryFraction);
            System.out.println("Decimal equivalent: " + decimal);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
