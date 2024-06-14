package ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> cartList;

    public ShoppingCart() {
        this.cartList = new ArrayList<>();
    }

    public void addItemToCart(String name, double price, int quantity) {
        cartList.add(new CartItem(name, price, quantity));
    }

    public void removeItem(String name) {
        List<CartItem> itemToRemove = new ArrayList<>();

        for (CartItem item : cartList){
            if(item.getName().equalsIgnoreCase(name)){
                itemToRemove.add(item);
            }
        }
        cartList.removeAll(itemToRemove);
    }

}
