import java.util.Date;

public class Bill {
    private Order order;
    private Date date;
    private Double discount;
    private Double totalWitDiscount;

    public Bill(Order order, Date date, Double discount, Double totalWitDiscount)
    {
        this.order = order;
        this.date = date;
        this.discount = discount;
        this.totalWitDiscount = totalWitDiscount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getTotalWitDiscount() {
        return totalWitDiscount;
    }

    public void setTotalWitDiscount(Double totalWitDiscount) {
        this.totalWitDiscount = totalWitDiscount;
    }

    public Double appliDiscount(Double porcentage, Double totalWitDiscount, Item item, double price)
    {

        porcentage = 0.19;
        totalWitDiscount = price - porcentage;
        return  totalWitDiscount;
    }



    public String printFacture() {
       Bill bill = new Bill( order,  date,  discount,  totalWitDiscount);
        return "Bill{" +
                "order=" + order +
                ", date=" + date +
                ", discount=" + discount +
                ", totalWitDiscount=" + totalWitDiscount  +
                '}';
    }
}

