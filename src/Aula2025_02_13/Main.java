package Aula2025_02_13;

public class Main {
    public static void main(String[] args) {


        TV tv1 = new TV("Samsung",2500,42);
        TV tv2 = new TV("AOC",1800,32);

        Refrigerator refri1 = new Refrigerator("Consul",3000,2000);
        Refrigerator refri2 = new Refrigerator("Eletrolux", 2800,1000);


        Stove st1 = new Stove("Consul",650,4);
        Stove st2 = new Stove("Eletrolux",500,4);


        ShoppingCart cart1 = new ShoppingCart(1);
        cart1.addProduct(tv1);
        cart1.addProduct(tv2);
        cart1.addProduct(refri1);
        cart1.addProduct(refri2);
        cart1.addProduct(st1);
        cart1.addProduct(st2);

        cart1.getContents();

        System.out.println("Remoção do primeiro item da lista");
        System.out.println();
        cart1.removeProduct(tv1);
        cart1.getContents();

        Stove st3 = new Stove("Joaninha",560,4);


        System.out.println("Total de itens: " + cart1.getItemCount());


        ShoppingCart cart2 = new ShoppingCart(2);
        cart2.addProduct(st3);

        System.out.println();
        System.out.println("Carrinho 2");
        cart2.getContents();







    }
}
