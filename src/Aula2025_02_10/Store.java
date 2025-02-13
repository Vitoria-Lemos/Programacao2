package Aula2025_02_10;

public class Store {
    public static void main(String[] args) {

        Product p1 = new Product("Geladeira",2996);

        Product p2 = new Product("Fogão",600);

        Product p3 = new Product("Celular",1200);


        ShoppingCart cart1 = new ShoppingCart(1);
        cart1.addProduct(p1);
        cart1.addProduct(p2);
        cart1.addProduct(p3);
        System.out.println(cart1.getItemCount());
        cart1.getContents();


        Product p4 = new Product("Liquidificador",200);
        Product p5 = new Product("Batedeira",150);
        Product p6 = new Product("Maquita",100);

        ShoppingCart cart2 = new ShoppingCart(2);
        cart2.addProduct(p4);
        cart2.addProduct(p5);
        cart2.addProduct(p6);











    }
}
