package Aula2025_02_17;

import java.util.ArrayList;

public class PessoaJuridica  extends  Pessoa{
    private int numFuncionarios;

    public PessoaJuridica(String nome, double rendaAnual, int numFuncionarios) {
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public double getTax(double rendaAnual) {

        double taxa = 0;
        if(numFuncionarios > 10)
        {
            taxa = rendaAnual * 0.14;
        }
        else
        {
            taxa = rendaAnual * 0.16;
        }



        return taxa;

    }
}
