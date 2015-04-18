package br.ba.senai.ads.asw;

public abstract class SorveteDecorator extends Sorvete {

    Sorvete sorvete;

    public SorveteDecorator(Sorvete umSorvete) {
        sorvete = umSorvete;
    }

    @Override
    public String getNome() {
        return sorvete.getNome();
    }

    @Override
    public double valor() {
        return sorvete.valor();
    }
    
    public abstract double getValor();
}
