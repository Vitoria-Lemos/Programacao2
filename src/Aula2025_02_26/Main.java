package Aula2025_02_26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter account data");

        Account account = new Account();

        System.out.print("Number: ");
        account.setNumber(scan.nextInt());

        System.out.print("Holder: ");
        account.setHolder(scan.nextLine());

        scan.nextLine();

        System.out.print("Initial balance: ");
        account.setBalance(scan.nextDouble());

        System.out.print("Withdraw limit: ");
        account.setWithdrawLimit(scan.nextDouble());

        System.out.print("Enter amount for withdraw: ");

        try{
            account.withdraw(scan.nextDouble());
        }
        catch(SaqueMaiorQueLimite |SaldoInsuficiente  e) {
            System.out.printf(e.getMessage());
        }


        scan.close();
    }
}
