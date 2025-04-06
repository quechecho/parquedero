
package validar;

public class validar {
   
    
    public boolean validarNumeroEnteroPositivo(String num) {
        return num.matches("^[0-9]+$");
    }

   
    public boolean validarNumeroRealPositivo(String num) {
        return num.matches("^[0-9]+([\\.][0-9]+)?$");
    }

   
    public boolean validarNombre(String cad) {
        return cad.matches("^([A-Za-záéíóúÁÉÍÓÚ]+[ ]?){1,3}$");
    }

    
    public boolean validarApellido(String cad) {
        return cad.matches("^([A-Za-záéíóúÁÉÍÓÚ]+[ ]?){1,2}$");
    }

}
