public class Adviser implements Worker
{
private Double sales;

public Adviser( Double sales)
{
    this.sales = sales;
}

public Double getSales()
{
    return sales;
}


public Double pay()
{
    return sales * 1.30;
}

}