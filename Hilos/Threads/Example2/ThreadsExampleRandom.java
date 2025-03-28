package Hilos.Threads.Example2;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadsExampleRandom extends Thread{


    // El metodo hace que el programa termine en un tiempo inespesifico

    @Override
    public void run()
    {
        try
        {
            int randomNum = ThreadLocalRandom.current().nextInt(2000, 5000);
            System.out.println(" hola soy un hilo ");
            Thread.sleep(randomNum);
            System.out.println(" A dios soy un hilo ");
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
