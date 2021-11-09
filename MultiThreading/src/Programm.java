public class Programm {
    public static void main(String[] args)  {
        System.out.println("Main-Start");

        //ThreadVariante1 t1 = new ThreadVariante1();
        //t1.run();

        Thread t1 = new Thread(new ThreadVariante1());
        t1.setName("T1");
        t1.start();

        Thread t2 = new Thread(new ThreadVariante1());
        t2.setName("t2");
        t2.start();

        System.out.println("Main-Ende");

    }
}
