package Exercicio2.exercicio01.exercicio01;

public class Refrigerator extends Product{
    private int size;

    public Refrigerator(String brand, double price) {
        super(brand, price);
    }


    public int getSize() {
        return size;
    }
}
