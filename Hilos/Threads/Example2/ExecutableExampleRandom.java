package Hilos.Threads.Example2;

import java.util.concurrent.ThreadLocalRandom;

public class ExecutableExampleRandom implements Runnable{

    public void run()
    {
        try
        {
            int randomNum = ThreadLocalRandom.current().nextInt(2000, 5000);
            System.out.println(" hola soy un Ejecutable ");
            Thread.sleep(randomNum);
            System.out.println(" A dios soy un Ejecutable ");
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
