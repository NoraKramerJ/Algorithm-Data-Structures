import java.util.concurrent.*;

public class ConcurrentDeadlockExample {
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void methodA() {
        synchronized (lock1) {
            System.out.println("Acquired lock1 in methodA");
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock2) {
                System.out.println("Acquired lock2 in methodA");
                // Do some work that requires both lock1 and lock2
            }
        }
    }

    public void methodB() {
        synchronized (lock2) {
            System.out.println("Acquired lock2 in methodB");
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock1) {
                System.out.println("Acquired lock1 in methodB");
                // Do some work that requires both lock1 and lock2
            }
        }
    }

    public static void main(String[] args) {
        ConcurrentDeadlockExample example = new ConcurrentDeadlockExample();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Submit two tasks to the executor service that call methodA() and methodB() in opposite order
        Future<?> future1 = executorService.submit(() -> {
            example.methodA();
            example.methodB();
        });

        Future<?> future2 = executorService.submit(() -> {
            example.methodB();
            example.methodA();
        });

        // Wait for the tasks to finish
        try {
            future1.get();
            future2.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the executor service
        executorService.shutdown();
    }
}