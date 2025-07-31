package Test;



import modelo.estudiantes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SubsidioTest {
    
    estudiantes est = new estudiantes();
    
    public SubsidioTest() {
    }
    
    @Test
   public void testdeterminarPorcentajeSubsidio(){
        float resultado = est.determinarPorcentajeSubsidio((float) 5.0);
        Assertions.assertEquals(100, resultado, 0.0);
        
        resultado = est.determinarPorcentajeSubsidio((float) 4.9);
        Assertions.assertEquals(80, resultado, 0.0);
        
        resultado = est.determinarPorcentajeSubsidio((float)4.4);
        Assertions.assertEquals(60, resultado, 0.0);
        
        resultado = est.determinarPorcentajeSubsidio((float)3.7);
        Assertions.assertEquals(40, resultado, 0.0);
        
        resultado = est.determinarPorcentajeSubsidio((float)3.4);
        Assertions.assertEquals(20, resultado, 0.0);
        
        resultado = est.determinarPorcentajeSubsidio((float)2.9);
        Assertions.assertEquals(00, resultado, 0.0);    
    }
   
     @Test
     public void testvalorSubsidio(){
        float resultado = est.valorSubsidio(2000000, 100);
        Assertions.assertEquals(2000000, resultado, 0.0);
        
        resultado = est.valorSubsidio(2000000, 80);
        Assertions.assertEquals(1600000, resultado, 0.0);
        
        resultado = est.valorSubsidio(2000000, 60);
        Assertions.assertEquals(1200000, resultado, 0.0);
        
        resultado = est.valorSubsidio(2000000, 40);
        Assertions.assertEquals(800000, resultado, 0.0);
        
        resultado = est.valorSubsidio(2000000, 20);
        Assertions.assertEquals(400000, resultado, 0.0);         
    }
     
     @Test
     public void testvalorPagarEstudiantes(){
         float resultado = est.valorPagarEstudiantes(2000000, 2000000);
         Assertions.assertEquals(00, resultado, 0.0);
         
         resultado = est.valorPagarEstudiantes(2000000, 1600000);
         Assertions.assertEquals(400000, resultado, 0.0);
         
         resultado = est.valorPagarEstudiantes(2000000, 1200000);
         Assertions.assertEquals(800000, resultado, 0.0);
         
         resultado = est.valorPagarEstudiantes(2000000, 800000);
         Assertions.assertEquals(1200000, resultado, 0.0);
         
         resultado = est.valorPagarEstudiantes(2000000, 400000);
         Assertions.assertEquals(1600000, resultado, 0.0);
         
         resultado = est.valorPagarEstudiantes(2000000, 00);
         Assertions.assertEquals(2000000, resultado, 0.0);
    }
     
     @Test
     public void testcontar(){
        int resultado = est.contar(10);
         Assertions.assertEquals(11, resultado, 0.0);
    }
     
     @Test
     public void testnumeroEstudiantesSubsidiados(){
         int resultado = est.numeroEstudiantesSubsidiados(4, 6, 5, 8, 7);
          Assertions.assertEquals(30, resultado, 0.0);    
    }
     
     @Test
     public void testnumeroEstudiantesAfiliados(){
         int resultado = est.numeroEstudiantesAfiliados(3, 7, 5, 5, 8, 3);
         Assertions.assertEquals(31, resultado, 0.0);    
    }
     
     @Test
     public void testsumar2Valores(){
         int resultado = est.sumar2Valores(9, 11);
         Assertions.assertEquals(20, resultado, 0.0); 
    }
     
     @Test
     public void testcalcularPorcentajeSubsidiados(){
         float resultado = est.calcularPorcentajeSubsidiados(20000, 2000000);
         Assertions.assertEquals(1.0, resultado, 0.1); 
    }
     
     
  }

