package Hilos.Threads.Example2;

public class ExecuteExample implements Runnable {

    @Override
    public void run()
    {
        try{
            System.out.println(" hola soy un hilo! ");
            Thread.sleep(4000);
            System.out.println(" Adios soy un hilo");
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
