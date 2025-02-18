package Aula2025_02_17;

public class PessoaFisica extends Pessoa{
    private double healthExpenditures;

    public PessoaFisica(String name, double anulIncome, double healthExpenditures) {
        super(name, anulIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
}
