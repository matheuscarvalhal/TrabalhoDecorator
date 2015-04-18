package br.ba.senai.ads.asw;

public class GranuladoDecorator extends SorveteDecorator {

    public GranuladoDecorator(Sorvete s) {
        super(s);
    }

    @Override
    public String getNome() {
        return sorvete.getNome() + ", granolado ";
    }

    @Override
    public double valor() {
        return 0.5 + super.valor();
    }

    @Override
    public double getValor() {
        return 0.5;
    }

}
