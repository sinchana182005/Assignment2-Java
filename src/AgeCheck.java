public class AgeCheck {
        public static void main(String[] args) {

            int age = 15;

            try {
                if (age < 18) {
                    throw new ArithmeticException("Age is less than 18");
                } else {
                    System.out.println("Eligible");
                }
            } catch (ArithmeticException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }

            System.out.println("Program continues...");
        }
    }


