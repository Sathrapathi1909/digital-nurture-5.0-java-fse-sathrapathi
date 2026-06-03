public class VirtualThreadsExample {

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {

            int num = i;

            
            new Thread(() -> System.out.println("Thread " + num)).start();
        }

        Thread.sleep(2000);

        long endTime = System.currentTimeMillis();

        System.out.println("Time Taken: "
                + (endTime - startTime) + " ms");
    }
}
