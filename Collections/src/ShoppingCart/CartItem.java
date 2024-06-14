package ShoppingCart;

public class CartItem {
    // nome, preço, quantidade
    private String name;
    private double price;
    private int quantity;

    public CartItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Price: " + price + " Quantity: " + quantity;
    }

    public String getName() {
        return name;
    }
}
