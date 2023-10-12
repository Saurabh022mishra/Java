public class Binary_To_Decimal {
    public static void main(String[] args) {
        String binaryString = "101010"; 
        // Convert binary to decimal
        int decimalNumber = binaryToDecimal(binaryString);
        
        System.out.println("Binary: " + binaryString);
        System.out.println("Decimal: " + decimalNumber);
    }

    public static int binaryToDecimal(String binaryString) {
        int decimalNumber = 0;
        int power = 0;

        // Iterate through the binary string from right to left
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char digitChar = binaryString.charAt(i);
            
            // Check if the character is '0' or '1'
            if (digitChar == '0') {
                // If it's '0', add 0 to the decimal number
                decimalNumber += 0;
            } else if (digitChar == '1') {
                // If it's '1', add 2^power to the decimal number
                decimalNumber += Math.pow(2, power);
            } else {
                // Handle invalid characters if needed
                System.err.println("Invalid binary character: " + digitChar);
                return -1; // Return an error value
            }

            power++;
        }

        return decimalNumber;
    }
}
