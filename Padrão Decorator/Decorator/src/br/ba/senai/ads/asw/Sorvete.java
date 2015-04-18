package br.ba.senai.ads.asw;

public abstract class Sorvete {

    private String nome = "Sorvete";
    public double valor;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double valor();
}
