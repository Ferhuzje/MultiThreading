public class ThreadVariante1 implements Runnable {

    @Override
    public void run() {
       System.out.println("Thread-Test");
       for(int i = 0; i < 50; i++) {
           System.out.println(Thread.currentThread().getName() + " " + i);

           try {
               Thread.sleep(100); //wartet 100ms
               }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
       }

    }
    
}
