
package test;

import modelo.parqueadero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class parqueaderoTest {
    
parqueadero parque = new parqueadero();
    
    public parqueaderoTest() {
    }
    
    @Test
    public void testDeterminarValorPorHora() {
        float resultado = parque.determinarValorPorHora("bicicleta", 0, 0);
        Assertions.assertEquals(1000, resultado, 0.0);
        
        resultado = parque.determinarValorPorHora("motocicleta", 0, 0);
        Assertions.assertEquals(2000, resultado, 0.0);
        
        resultado = parque.determinarValorPorHora("automóvil", 0, 0);
        Assertions.assertEquals(3000, resultado, 0.0);
        
        resultado = parque.determinarValorPorHora("camioneta", 0, 0);
        Assertions.assertEquals(4000, resultado, 0.0);
        
        resultado = parque.determinarValorPorHora("buseta", 0, 0);
        Assertions.assertEquals(5000, resultado, 0.0);
        
        resultado = parque.determinarValorPorHora("bus", 0, 0);
        Assertions.assertEquals(6000, resultado, 0.0);
        
        resultado = parque.determinarValorPorHora("camión", 0, 0);
        Assertions.assertEquals(7000, resultado, 0.0);
    }
    
    @Test
    public void testHoraEntrada() {
        parque.setHoraEntrada(8.5f);
        Assertions.assertEquals(8.5f, parque.getHoraEntrada(), 0.0);
    }
    
    @Test
    public void testMinutoEntrada() {
        parque.setMinutoEntrada(30);
        Assertions.assertEquals(30, parque.getMinutoEntrada(), 0.0);
    }
    
    @Test
    public void testHoraSalida() {
        parque.setHoraSalida(12.0f);
        Assertions.assertEquals(12.0f, parque.getHoraSalida(), 0.0);
    }
    
    @Test
    public void testMinutoSalida() {
        parque.setMinutoSalida(45);
        Assertions.assertEquals(45, parque.getMinutoSalida(), 0.0);
    }
    
    @Test
    public void testValRecibido() {
        parque.setValRecibido(15000);
        Assertions.assertEquals(15000, parque.getValRecibido(), 0.0);
    }
    
    @Test
    public void testCambio() {
        parque.setCambio(5000);
        Assertions.assertEquals(5000, parque.getCambio(), 0.0);
    }
    
    @Test
    public void testHorasUso() {
        parque.setHorasUso(3.5f);
        Assertions.assertEquals(3.5f, parque.getHorasUso(), 0.0);
    }
    
    @Test
    public void testAndGetCosto() {
        parque.setCosto(10500);
        Assertions.assertEquals(10500, parque.getCosto(), 0.0);
    }
    
    @Test
    public void testDeterminarHoraDeEntradaYSalida() {
        float resultado = parqueadero.determinarhoradeentradaysalida(8.0f, 12.0f);
        Assertions.assertEquals(4.0f, resultado, 0.0);
        
        resultado = parqueadero.determinarhoradeentradaysalida(6.0f, 10.5f);
        Assertions.assertEquals(4.5f, resultado, 0.0);
        
        resultado = parqueadero.determinarhoradeentradaysalida(9.25f, 11.75f);
        Assertions.assertEquals(2.5f, resultado, 0.0);
    }
}
