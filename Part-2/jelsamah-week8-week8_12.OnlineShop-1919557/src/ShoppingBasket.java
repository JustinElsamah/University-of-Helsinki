
import java.util.*;

public class ShoppingBasket {

    private List<Purchase> purchases;

    public ShoppingBasket() {
        purchases = new ArrayList<Purchase>();
    }

    public void add(String product, int price) {
        for(Purchase purchase : purchases){
           if(product.equals(purchase.getProduct())){
                purchase.increaseAmount();
                return;
           }
        }
        Purchase purchase = new Purchase(product, 1, price);
        purchases.add(purchase);
    
    }

    public int price() {
        int totalPrice = 0;
        for (Purchase purchase : purchases) {
            totalPrice += purchase.price();
        }
        return totalPrice;
    }
    
    public void print(){
        for (Purchase purchase : purchases) {
            System.out.println(purchase);
        }
    }
    
    
}
