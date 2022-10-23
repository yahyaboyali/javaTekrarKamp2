package manager;

import entities.Product;

public class ProductManager {
    public void add(Product p) {
        System.out.println(p.getName() +" eklendi");
    }
}
