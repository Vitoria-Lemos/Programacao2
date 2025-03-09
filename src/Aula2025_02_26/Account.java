package Aula2025_02_26;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;


    public Account() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }


    public void deposit(double amount)
    {
        this.balance+= amount;

    }

    public void withdraw(double amount) throws SaldoInsuficiente, SaqueMaiorQueLimite
    {
            if(amount > getBalance() && amount < getWithdrawLimit())
            {
                throw new SaldoInsuficiente(amount,getBalance());
            }
            if(getWithdrawLimit() < amount)
            {
                throw new SaqueMaiorQueLimite(getWithdrawLimit(),amount);
            }

            this.balance -= amount;
            System.out.printf(toString());


    }

    public String toString() {
        return  "New balance: " + this.getBalance() ;
    }
}






