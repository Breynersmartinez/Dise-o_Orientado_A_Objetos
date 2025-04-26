import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private int id;
    private String name;
    private List<Order> orders = new ArrayList<>();

    Order order;

    public Waiter(int id, String name, List<Order> orders)
    {
        this.id = id;
        this.name = name;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String assign(Order order)
    {
        return " Pedido asignado " + order.toString();
    }

    public void ListOrders(List<Order>orders)
    {
        orders.add(order);
        System.out.println("Pedidos"+order);
    }



}
