import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

class MultithreadingConcurrency extends Thread {
    // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/package-summary.html
    public String                        name;
    public Map<String, String> map;

    public MultithreadingConcurrency(String name, Map<String, String> map) {
        this.name = name;
        this.map = map;
    }

    public void run() {
        try {
            if (name == null) {
                // Displaying the thread that is running
                System.out.println("Thread " + Thread.currentThread().getId() + " is running; " + this.name + " not saved");
            } else {
                System.out.println(
                        "Thread " + Thread.currentThread().getId() + " is running; " + this.name + " saved");
                map.put(String.valueOf(Thread.currentThread().getId()), name);
            }
        } catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

// Main Class
public class MultithreadConcurrentMap {
    public static void main(String[] args) {
        int n = 8; // Number of threads
        Map<String, String> map = new HashMap();
        String[] names = new String[] { "One", "Two", "Threee", "Four", "Five", null, null, "Eight" };
        for (int i = 0; i < n; i++) {
            MultithreadingConcurrency object = new MultithreadingConcurrency(names[i], map);
            object.start();
        }
        System.out.println("\n\n------------------------------------------\n\n Printing valid names");
        for (String id : map.keySet()) {
            System.out.println("Id: " + id + ", Valid Name: " + map.get(id));
        }
    }
}