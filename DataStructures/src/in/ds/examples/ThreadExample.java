package in.ds.examples;

class ThreadExample2 extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}

    public class ThreadExample {
        public static void main(String[] args) {
            int n = 5;
            for (int i = 0; i < 5; i++) {
                ThreadExample2 t = new ThreadExample2();
                t.start();
            }
        }
    }