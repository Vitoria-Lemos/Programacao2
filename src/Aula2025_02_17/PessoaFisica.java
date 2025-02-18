package Aula2025_02_17;

public class PessoaFisica extends Pessoa  {
    private double gastosSaude;

    public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }


    @Override
    public double getTax(double rendaAnual) {
        double taxa = 0;
        if(rendaAnual < 20000)
        {
            if(this.gastosSaude > 0)
            {
                taxa = (rendaAnual * 0.15) - (gastosSaude * 0.5);
            }
            else
            {
                taxa = rendaAnual * 0.15;
            }

        }

        if(rendaAnual > 20000)
        {
            if(this.gastosSaude > 0)
            {
                taxa = (rendaAnual * 0.25) - (gastosSaude * 0.5);
            }
            else
            {
                taxa = rendaAnual * 0.25;
            }

        }


        return taxa;
    }
}
