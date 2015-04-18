package br.ba.senai.ads.asw;

public class MMDecorator extends SorveteDecorator {

    public MMDecorator(Sorvete s) {
        super(s);
    }

    @Override
    public String getNome() {
        return sorvete.getNome() + ", MM ";
    }

    @Override
    public double valor() {
        return .75 + super.valor();
    }
    
    @Override
    public double getValor() {
        return 0.75;
    }

}
