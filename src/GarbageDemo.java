public class GarbageDemo {

        protected void finalize() {
            System.out.println("Object garbage collected");
        }

        public static void main(String[] args) {
            GarbageDemo obj = new GarbageDemo();
            obj = null;
            System.gc();
        }
    }
