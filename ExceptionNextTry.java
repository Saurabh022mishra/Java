public class ExceptionNextTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            //int b = 42 / a;
            System.out.println("a = " + a);

            try { // nested try block
                if (a == 1) {
                    a = a / (a - a); // This will cause a divide by zero exception
                }

                /* If two command line args are used, then generate an
                   ArrayIndexOutOfBoundsException.
                */
                if (a == 2) {
                    int c[] = {1};
                    c[42] = 99; // This will generate an ArrayIndexOutOfBoundsException.
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds: " + e);
            } catch (ArithmeticException e) {
                System.out.println("Divide by zero: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Outer divide by zero: " + e);
        }
    }
}

