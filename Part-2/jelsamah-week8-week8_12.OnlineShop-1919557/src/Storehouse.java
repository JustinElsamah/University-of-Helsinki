import java.util.*;

public class Storehouse {

    private final Map<String, Integer> priceMap;
    private final Map<String, Integer> stockMap;

    public Storehouse() {
        this.priceMap = new HashMap<String, Integer>();
        this.stockMap = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.priceMap.put(product, price);
        this.stockMap.put(product, stock);
    }

    public int price(String product) {
        if (priceMap.containsKey(product)) {
            return priceMap.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (stockMap.containsKey(product)) {
            return stockMap.get(product);
        }
        return 0;
    }

    public boolean take(String product) {

        if (priceMap.containsKey(product)) {
            if (stockMap.get(product) <= 0) {
                return false;
            }
            int oldStock = stockMap.get(product);
            stockMap.replace(product, oldStock, --oldStock);
            return true;

        }
        return false;
    }
    
    public Set<String> products(){
        System.out.println("Products:");
        Set<String> products = priceMap.keySet();
        for(String product: products){
            System.out.println(product);
        }
        
        return products;
        
    } 
}


