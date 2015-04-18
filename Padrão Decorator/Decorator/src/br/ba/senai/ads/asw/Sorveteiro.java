package br.ba.senai.ads.asw;

public class Sorveteiro {

    public static void main(String[] args) {

        Fabrica fabrica = new FabricaSorvete();
        Sorvete sorvete;
        System.out.println("Pizza --- Valor\n");

        //sorvete casquinha
        sorvete = fabrica.criarSorvete("casquinha");
        System.out.println(sorvete.getNome() + " --- " + sorvete.valor());
        //sorvete casquinha com mel
        sorvete = new MelDecorator(sorvete);
        System.out.println(sorvete.getNome()+ " --- " + sorvete.valor());
        
        //sorvete sundae
        sorvete = fabrica.criarSorvete("sundae");
        System.out.println(sorvete.getNome() + " --- " + sorvete.valor());
        //sorvete sundae com mel
        sorvete = new MelDecorator(sorvete);
        System.out.println(sorvete.getNome()+ " --- " + sorvete.valor());
        //sorvete sundae com mel e MM
        sorvete = new MMDecorator(sorvete);
        System.out.println(sorvete.getNome()+ " --- " + sorvete.valor());
        
        //sorvete tradicional
        sorvete = fabrica.criarSorvete("tradicional");
        System.out.println(sorvete.getNome() + " --- " + sorvete.valor());
        //sorvete tradicional com mel
        sorvete = new MelDecorator(sorvete);
        System.out.println(sorvete.getNome()+ " --- " + sorvete.valor());
        //sorvete tradicional com mel e MM
        sorvete = new MMDecorator(sorvete);
        System.out.println(sorvete.getNome()+ " --- " + sorvete.valor());
        //sorvete tradicional com mel, mm e granulado
        sorvete = new GranuladoDecorator(sorvete);
        System.out.println(sorvete.getNome()+ " --- " + sorvete.valor());
        
    }

}
