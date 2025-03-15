public class RunProgramWorker
{
    public static void main (String [] args)
    {
        Worker[] worker = new Worker[2];

        worker[0] = new Adviser(10000.0);
        worker[1] = new Operator(10.0);


for(Worker w : worker)
{
    System.out.println(w.pay());
}


    }
}