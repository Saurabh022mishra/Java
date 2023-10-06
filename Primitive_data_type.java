//Write a program to display all primitive data types by taking user input on command Line and display their minimum
 // maximum and default value..
public class Primitive_data_type {
    public static void main(String[] args) {
        System.out.println("Enter a value for each primitive data type:");

        // Parse and display information for integer types
        byte byteValue = Byte.parseByte(args[0]);
        System.out.println("Primitive Type: byte");
        System.out.println("Size (in bits): " + Byte.SIZE);
        System.out.println("Minimum Value: " + Byte.MIN_VALUE);
        System.out.println("Maximum Value: " + Byte.MAX_VALUE);
        System.out.println("Default Value: " + (byte) 0);
        System.out.println("Entered Value: " + byteValue);
        System.out.println();

        short shortValue = Short.parseShort(args[1]);
        System.out.println("Primitive Type: short");
        System.out.println("Size (in bits): " + Short.SIZE);
        System.out.println("Minimum Value: " + Short.MIN_VALUE);
        System.out.println("Maximum Value: " + Short.MAX_VALUE);
        System.out.println("Default Value: " + (short) 0);
        System.out.println("Entered Value: " + shortValue);
        System.out.println();

        int intValue = Integer.parseInt(args[2]);
        System.out.println("Primitive Type: int");
        System.out.println("Size (in bits): " + Integer.SIZE);
        System.out.println("Minimum Value: " + Integer.MIN_VALUE);
        System.out.println("Maximum Value: " + Integer.MAX_VALUE);
        System.out.println("Default Value: " + 0);
        System.out.println("Entered Value: " + intValue);
        System.out.println();

        long longValue = Long.parseLong(args[3]);
        System.out.println("Primitive Type: long");
        System.out.println("Size (in bits): " + Long.SIZE);
        System.out.println("Minimum Value: " + Long.MIN_VALUE);
        System.out.println("Maximum Value: " + Long.MAX_VALUE);
        System.out.println("Default Value: " + 0L);
        System.out.println("Entered Value: " + longValue);
        System.out.println();

        // Parse and display information for floating-point types
        float floatValue = Float.parseFloat(args[4]);
        System.out.println("Primitive Type: float");
        System.out.println("Size (in bits): " + Float.SIZE);
        System.out.println("Minimum Value: " + Float.MIN_VALUE);
        System.out.println("Maximum Value: " + Float.MAX_VALUE);
        System.out.println("Default Value: " + 0.0f);
        System.out.println("Entered Value: " + floatValue);
        System.out.println();

        double doubleValue = Double.parseDouble(args[5]);
        System.out.println("Primitive Type: double");
        System.out.println("Size (in bits): " + Double.SIZE);
        System.out.println("Minimum Value: " + Double.MIN_VALUE);
        System.out.println("Maximum Value: " + Double.MAX_VALUE);
        System.out.println("Default Value: " + 0.0);
        System.out.println("Entered Value: " + doubleValue);
        System.out.println();

        // Parse and display information for character type
        char charValue = args[6].charAt(0);
        System.out.println("Primitive Type: char");
        System.out.println("Size (in bits): " + Character.SIZE);
        System.out.println("Minimum Value: " + (int) Character.MIN_VALUE);
        System.out.println("Maximum Value: " + (int) Character.MAX_VALUE);
        System.out.println("Default Value: " + '\u0000');
        System.out.println("Entered Value: " + charValue);
        System.out.println();
    }
}
