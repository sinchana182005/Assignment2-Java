public class FinalClass {
    final int x = 10;

    final void display() {
        System.out.println("Final method");
    }
}
class FinalDemo {
        public static void main(String[] args) {
            FinalClass obj = new FinalClass();
            System.out.println("Final variable: " + obj.x);
            obj.display();
        }
    }

