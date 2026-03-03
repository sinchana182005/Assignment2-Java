class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}
public class CustomExceptionDemo {
    static void check(int age) throws MyException {
        if (age < 18)
            throw new MyException("Not Eligible");
        else
            System.out.println("Eligible");
    }

    public static void main(String[] args) {
        try {
            check(16);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
