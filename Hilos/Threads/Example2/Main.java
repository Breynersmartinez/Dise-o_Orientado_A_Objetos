package Hilos.Threads.Example2;

import java.time.LocalDateTime;

public class Main {
    public static void main(String [] args)
    {
        // Ejecucion de hilo con tiempo de finalizacion
        System.out.println(" Hola souy un hilo principal! " + LocalDateTime.now());
        ThreadsExample threadsExample = new ThreadsExample();
        threadsExample.start();
        //Ejecutable de ejemplo

        ExecuteExample executeExample = new ExecuteExample();
        Thread thread = new Thread(executeExample);
        thread.start();
        System.out.println(" A dios soy un hilo principal " + LocalDateTime.now());


        // Ejecucion de hilo con tiempo de finalizacion indeterminado
        System.out.println(" Hola soy un hilo principal! " + LocalDateTime.now());
        ThreadsExampleRandom threadsExampleRandom = new ThreadsExampleRandom();
        threadsExampleRandom.start();
        //Ejecutable con tiempo de finalizacion indeterminado
        ExecutableExampleRandom executableExampleRandom = new ExecutableExampleRandom();
        Thread thread1 = new Thread(executableExampleRandom);
        thread1.start();
        System.out.println(" A dios soy un hilo principal " + LocalDateTime.now());
    }
}
