package Aula2025_02_26;

public class SaqueMaiorQueLimite extends Exception{

    private double withdrawLimit;
    private double amount;

    public SaqueMaiorQueLimite(double withdrawLimit, double amount) {
        this.withdrawLimit = withdrawLimit;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Withdraw error: The amount exceeds withdraw limit";
    }
}
