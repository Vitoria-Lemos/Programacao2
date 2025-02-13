package Aula2025_02_13;

public class Refrigerator extends Product{
    private int size;

    public Refrigerator(String brand, double price) {
        super(brand, price);
    }


    public int getSize() {
        return size;
    }
}
