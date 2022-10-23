import Person.Customer;
import entities.Product;
import hesapMakinası.Calculator;
import manager.ProductManager;

public class Main {
    public static void main(String[] args) {
        CustomerManager c = new CustomerManager();
        c.add();
        c.delete();
        c.update();
        // çalışma mantığı
        CustomerManager c2 = new CustomerManager();
        c = c2;
        c.update();
        System.out.println("gbc sildi c yi");
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);
        //değer tiplidir int double vs
        System.out.println("değer tipli bir " +
                "şey tanımlarsan bunun " +
                "heap tarafında bir şey olmuyor" +
                "her şey stack \n tarafında oluyor");
        System.out.println("heap \t \t stack \n*\t*\t\t*\t*\n*\t*\t\t*\t*\n*****\t\t*****");
        System.out.println("\n----------\nreferans tipler: diziler referans tiptir");
        int[] sayilar1 = new int[]{1,2,3,4,5};
        int[] sayilar2 = new int[]{6,7,8,9,0};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);
        System.out.println("tahmin 10");

        Calculator cal = new Calculator();
        System.out.println(cal.bol(13,0));
        Product p1 = new Product();
        p1.setName("pc");
        p1.setId(1);
        p1.setDescription("iste");
        p1.setPrice(14);
        ProductManager pm = new ProductManager();
        pm.add(p1);
        Product p2 = new Product(1,"tel","iphone 5s",1400);
        pm.add(p2);
        System.out.println("overloading: "+cal.topla(1,2,3,4,5,6));
        Customer c1 = new Customer();
        c1.name = "deneme";
        Product[] ps;
        ps = new Product[]{p1, p2};
        c1.products = ps;
    }
}