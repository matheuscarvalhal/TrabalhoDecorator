
package br.ba.senai.ads.asw;

public class MelDecorator extends SorveteDecorator {

    public MelDecorator(Sorvete s) {
        super(s);
    }

    @Override
    public String getNome() {
        return sorvete.getNome() + ", Mel ";
    }

    @Override
    public double valor() {
        return 0.25 + super.valor();
    }
    
    @Override
    public double getValor() {
        return 0.25;
    }

}

