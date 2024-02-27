public class DecimalToFloatBinary {

    public static String decimalToFloatBinary(double decimalNumber) {
        float floatNumber = (float) decimalNumber;
        int intBits = Float.floatToIntBits(floatNumber);
        return Integer.toBinaryString(intBits);
    }

    public static void main(String[] args) {
        double decimalNumber = 123.456;
        String binaryString = decimalToFloatBinary(decimalNumber);
        System.out.println("Binary representation: " + binaryString);
    }
}
