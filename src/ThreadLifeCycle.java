public class ThreadLifeCycle extends Thread {

        public void run() {
            System.out.println("Thread is running");
        }

        public static void main(String[] args) throws InterruptedException {
            ThreadLifeCycle t = new ThreadLifeCycle();

            System.out.println("State after creation: " + t.getState());

            t.start();
            System.out.println("State after start: " + t.getState());

            t.join();
            System.out.println("State after completion: " + t.getState());
        }
    }
