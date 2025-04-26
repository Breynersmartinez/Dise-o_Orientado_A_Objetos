import java.util.*;

public class Order {
    Item item;

    private int id;
    private String name;
    private List<Item> items = new ArrayList<>();
    private String state;
    private int total;

    public Order(int id, String name, List<Item> items, String state, int total)
    {
        this.id = id;
        this.name = name;
        this.items = items;
        this.state = state;
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getState() {
        return state;
    }



    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Lista de items
    public void addItem(List<Item>items)
    {
        items.add(item);
        System.out.println(item);
    }

    // actualizar el estado del de un pedido
    public void UpdateState(String state) {
        this.state = state;
    }

    // sumar el precio de los platos y retrnar el total
    public Double sumItems(List<Item>items)
    {

      return items.stream()
              .mapToDouble(Item::getPrice)
              .sum();


    }

}
