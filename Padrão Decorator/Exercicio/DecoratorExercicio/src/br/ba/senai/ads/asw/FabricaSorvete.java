package br.ba.senai.ads.asw;

public class FabricaSorvete implements Fabrica {

    @Override
    public Sorvete criarSorvete(String tipoSorvete) {
        switch (tipoSorvete) {
            case "sundae":
                return new Sundae();
            case "casquinha":
                return new Casquinha();
            case "tradicional":
                return new Tradicional();
        }
        return null;
    }
}
