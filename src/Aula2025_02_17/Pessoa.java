package Aula2025_02_17;

import java.util.ArrayList;

public abstract class Pessoa {
    private String nome;
    private double rendaAnual;

    public Pessoa(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }


    public abstract double getTax(double rendaAnual);





}
