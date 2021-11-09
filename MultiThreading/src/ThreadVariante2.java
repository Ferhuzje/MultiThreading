public class ThreadVariante2 extends Thread {


    @Override
    public void run() {
        System.out.println("Tread-Test");
        for(int i = 0; i <50; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);

            try {
                Thread.sleep(100); //warte 100 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    
}
