/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.ba.senai.ads.asw.GranuladoDecorator;
import br.ba.senai.ads.asw.MMDecorator;
import br.ba.senai.ads.asw.MelDecorator;
import br.ba.senai.ads.asw.Sorvete;
import br.ba.senai.ads.asw.Sundae;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carvalhal
 */
public class Teste {
    
    public Teste(){
    }
    
    @Before
    public void setUp() {
        System.out.println("Iniciar Teste\n");
    }
    
    @After
    public void tearDown() {
        System.out.println("Terminar Teste\n");
    }
    
    @Test
    public void testMeuTesteMM(){
        System.out.println("Testando Soma com MM...");
        Sorvete sorvete = new Sundae();
        sorvete = new MMDecorator(sorvete);
        assertEquals(8.75, sorvete.valor(), 0);
    }
    
    @Test
    public void testMeuTesteGranulado(){
        System.out.println("Testando Soma com Granulado...");
        Sorvete sorvete = new Sundae();
        sorvete = new GranuladoDecorator(sorvete);
        assertEquals(8.5, sorvete.valor(), 0);
    }
    
    @Test
    public void testMeuTesteMel(){
        System.out.println("Testando Soma com Mel...");
        Sorvete sorvete = new Sundae();
        sorvete = new MelDecorator(sorvete);
        assertEquals(8.25, sorvete.valor(), 0);
    }
    
    @Test
    public void testMeuTesteMeleMM(){
        System.out.println("Testando Soma com Mel...");
        Sorvete sorvete = new Sundae();
        sorvete = new MelDecorator(sorvete);
        sorvete = new MMDecorator(sorvete);
        assertEquals(9.0, sorvete.valor(), 0);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
