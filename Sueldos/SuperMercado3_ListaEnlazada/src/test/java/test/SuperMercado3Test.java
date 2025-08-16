package test;

/*
participantes =
Jesus Dacid Sanchez Pacheco
Victor Manuel Salgado Gonzales
*/

import model.SuperMercado3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SuperMercado3Test {
    
    SuperMercado3 Sup = new SuperMercado3();
    
    public SuperMercado3Test() {
    }

    @Test
    public void testCalcularPorcentaje(){
    float resultado = Sup.calcularPorcentaje(3000, 50000);
    Assertions.assertEquals(6, resultado, 0.0);
    
    }
    
    @Test
    public void testContar(){
        float resultado =Sup.contar(10);
        Assertions.assertEquals (11, resultado, 0.0);
    }
    
    @Test
    public void testTotalDescontado(){
        float resultado = Sup.totalDescontado(0, 20000);
        Assertions.assertEquals (20000, resultado, 0.0);
    }
    
    @Test
    public void testAcumular(){
        float resultado = Sup.acumular(200, 500);
        Assertions.assertEquals(700, resultado, 0.0);
        
        
    }
    
}
