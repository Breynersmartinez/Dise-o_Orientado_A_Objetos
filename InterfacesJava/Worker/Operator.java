public class  Operator implements Worker
{
    private final int hourlyValue = 9000;
    private Double hours;
    public Operator ( Double hours)
    {
        this.hours = hours;
    }

    public Double getHours(){
        return hours;
    }

    public Double pay( )
    {
        return hours * hourlyValue;
    }
}