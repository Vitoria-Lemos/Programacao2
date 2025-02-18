package Aula2025_02_17;

public class PessoaJuridica extends Pessoa{
    private int numberEmployes;

    public PessoaJuridica(String name, double anulIncome, int numberEmployes) {
        super(name, anulIncome);
        this.numberEmployes = numberEmployes;
    }

    public int getNumberEmployes() {
        return numberEmployes;
    }

    public void setNumberEmployes(int numberEmployes) {
        this.numberEmployes = numberEmployes;
    }
}
