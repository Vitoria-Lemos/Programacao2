package Aula2025_02_26;

public class SaldoInsuficiente extends Exception{
    private double amount;
    private double withdraw;

    public SaldoInsuficiente(double amount, double withdraw) {
        super("Withdraw Error: Not enough balance");
        this.amount = amount;
        this.withdraw = withdraw;
    }

    @Override
    public String toString() {
        return "Withdraw error: Not enough balance";
    }
}
