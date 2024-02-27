public class DecimaltoBase2and16 {

    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.append(remainder);
            decimal /= 2;
        }

        return binary.reverse().toString();
    }

    public static String decimalToHexadecimal(int decimal) {
        StringBuilder hexadecimal = new StringBuilder();
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (decimal > 0) {
            int remainder = decimal % 16;
            hexadecimal.append(hexDigits[remainder]);
            decimal /= 16;
        }

        return hexadecimal.reverse().toString();
    }

    public static void main(String[] args) {
        int decimal = 27;

        String binary = decimalToBinary(decimal);
        String hexadecimal = decimalToHexadecimal(decimal);

        System.out.println("Binary from decimal: " + binary);
        System.out.println("Hexadecimal from decimal: " + hexadecimal);
    }
}
