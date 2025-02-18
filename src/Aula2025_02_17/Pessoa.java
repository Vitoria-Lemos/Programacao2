package Aula2025_02_17;

public abstract class Pessoa {
    private  String name;
    private double anulIncome;

    public Pessoa(String name, double anulIncome) {
        this.name = name;
        this.anulIncome = anulIncome;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnulIncome() {
        return anulIncome;
    }

    public void setAnulIncome(double anulIncome) {
        this.anulIncome = anulIncome;
    }
}
