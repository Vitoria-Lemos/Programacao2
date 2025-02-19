package Aula2025_02_17;

import java.util.ArrayList;
import java.util.Locale;

public class Leao {
    //private static PrintStream out;
    private ArrayList<Pessoa> listaPessoas;
    private double totalTax;


    public Leao() {
        this.listaPessoas = new ArrayList<>();
    }

    public void addPessoa(Pessoa pessoa)
    {
        this.listaPessoas.add(pessoa);
    }

    public void getContents()
    {
        System.out.println("\nTAXES PAID:");
        for(Pessoa pessoa : listaPessoas)
        {

            System.out.println(pessoa.getNome()+": $ "+ String.format(Locale.US,"%.2f", pessoa.getTax(pessoa.getRendaAnual())));

        }
    }

    public void addTax(double t) {
        this.totalTax += t;
    }

    public double getTotalTax() {
        return this.totalTax;
    }
}
