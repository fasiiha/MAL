public class Base2and16Converter {

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int base = 2;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = binary.charAt(i) - '0';
            decimal += digit * Math.pow(base, power);
            power++;
        }

        return decimal;
    }

    public static int hexadecimalToDecimal(String hexadecimal) {
        int decimal = 0;
        int base = 16;
        int power = 0;

        for (int i = hexadecimal.length() - 1; i >= 0; i--) {
            char digit = hexadecimal.charAt(i);
            int value;

            if (digit >= '0' && digit <= '9') {
                value = digit - '0';
            } else {
                value = 10 + (digit - 'A');
            }

            decimal += value * Math.pow(base, power);
            power++;
        }

        return decimal;
    }

    public static void main(String[] args) {
        String binary = "1101";
        String hexadecimal = "1A";

        int decimalFromBinary = binaryToDecimal(binary);
        int decimalFromHexadecimal = hexadecimalToDecimal(hexadecimal);

        System.out.println("Decimal from binary: " + decimalFromBinary);
        System.out.println("Decimal from hexadecimal: " + decimalFromHexadecimal);
    }
}
