package Aula2025_02_17;

import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name;
        double rendaAnual, gastoSaude;
        int n, empregados;
        String type;

        //criando um objeto para adicionar todas as pessoas no sistema Leão come-come
        Leao l = new Leao();

        System.out.print("Enter the number of tax payers: ");
        n = scan.nextInt();
        scan.nextLine();

        for(int i = 1; i <= n; i++){
            System.out.println("Tax payer "+"#"+i+" data:");

            System.out.print("Individual or company (i/c)? ");
            type = scan.nextLine();
            //scan.nextLine();

            if(type.equals("i"))
            {
                System.out.print("Name:");
                name = scan.nextLine();

                System.out.print("Anual income: ");
                rendaAnual = scan.nextDouble();

                System.out.print("Health expenditures: ");
                gastoSaude = scan.nextDouble();
                scan.nextLine();

                PessoaFisica pessoa = new PessoaFisica(name, rendaAnual, gastoSaude);


                l.addPessoa(pessoa);

            }
            else if( type.equals("c"))
            {
                System.out.print("Name:");
                name = scan.nextLine();

                System.out.print("Anual income: ");
                rendaAnual = scan.nextDouble();

                System.out.print("Number of employes: ");
                empregados = scan.nextInt();
                scan.nextLine();

                PessoaJuridica pessoa = new PessoaJuridica(name, rendaAnual, empregados);


                l.addPessoa(pessoa);

            }


        }


        l.getContents();
        System.out.println();
        System.out.println("TOTAL TAXES: $" + String.format(Locale.US, "%.2f", l.getTax()));
        scan.close();
    }

}
