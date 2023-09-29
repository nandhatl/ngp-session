import java.io.IOException;

class MultithreadingDemo extends Thread {
    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

// Main Class
public class Multithread {
    public static void main(String[] args) throws NullPointerException {
        try {
            int n = 8; // Number of threads
            for (int i = 0; i < n; i++) {
                MultithreadingDemo object = new MultithreadingDemo();
                object.start();
            }
        } catch (NullPointerException npe) {
            throw npe; // ("I have no shock to write");

        } finally {

        }

    }
}
// Last Modifyed by Suriya