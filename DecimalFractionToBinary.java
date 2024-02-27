public class DecimalFractionToBinary {

    public static String decimalToBinary(double fraction) {
        if (fraction == 0.0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        int digitCount = 0;

        while (fraction > 0.0 && digitCount < 32) { // Limit to 32 decimal places to avoid infinite loops
            fraction *= 2;
            int digit = (int) Math.floor(fraction);
            binary.append(digit);
            fraction -= digit;
            digitCount++;
        }

        if (fraction > 0.0) {
            return "Non-terminating binary equivalent";
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        double decimalFraction = 0.78125;

        String binary = decimalToBinary(decimalFraction);
        System.out.println("Binary equivalent: " + binary);
    }
}
