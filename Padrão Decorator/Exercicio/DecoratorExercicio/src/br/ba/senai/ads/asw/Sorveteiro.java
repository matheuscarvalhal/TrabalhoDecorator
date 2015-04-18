package br.ba.senai.ads.asw;

public class Sorveteiro {

    public static void main(String[] args) {
        Sorvete so = new Sundae();
        Sorvete so2 = new Tradicional();
        Sorvete so3 = new Casquinha();

        System.out.println("Sorvete --- Valor\n");

        //sorvete Sundae normal
        System.out.println(so.getNome() + " --- " + so.valor());

        //acrescenta Mel p/ sorvete sundae
        //so = new MelDecorator(so);
        System.out.println(so.getNome() + " --- " + so.valor());

        //acrescenta M&M p/ sorvete Sundae
        //so = new MMDecorator(so);
        System.out.println(so.getNome() + " --- " + so.valor());

        //sorvete tradicional normal
        System.out.println(so2.getNome() + " --- " + so2.valor());

        //acrescenta Granulado p/ sorvete tradicional
        //so2 = new GranuladoDecorator(so2);
        System.out.println(so2.getNome() + " --- " + so2.valor());

        //acrescenta M&M p/ sorvete tradicional
        //so2 = new MMDecorator(so2);
        System.out.println(so2.getNome() + " --- " + so2.valor());

        //sorvete Casquinha normal
        System.out.println(so3.getNome() + " --- " + so3.valor());

        //acrescenta Granulado p/ sorvete tradicional
        //so3 = new GranuladoDecorator(so3);
        System.out.println(so3.getNome() + " --- " + so3.valor());

        //acrescenta M&M p/ sorvete tradicional
        //so3 = new MMDecorator(so3);
        System.out.println(so3.getNome() + " --- " + so3.valor());

        //acrescenta Mel p/ sorvete tradicional
        //so3 = new MelDecorator(so3);
        System.out.println(so3.getNome() + " --- " + so3.valor());
    }

}
