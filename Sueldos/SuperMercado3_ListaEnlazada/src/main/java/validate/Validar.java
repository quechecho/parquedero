
package validate;

/*
participantes =
Jesus Dacid Sanchez Pacheco
Victor Manuel Salgado Gonzales
*/

public class Validar {
     //Validar número entero positivo 
    public boolean validarNumeroEnteroPositivo(String num) {
        return num.matches("^[0-9]+$");
    }

    //Validar número real positivo
    public boolean validarNumeroRealPositivo(String num) {
        return num.matches("^[0-9]+([\\.][0-9]+)?$");
    }

    //Validar hasta 3 nombres
    public boolean validarNombre(String cad) {
        //return !cad.isEmpty();
        return cad.matches("^([A-Za-záéíóúÁÉÍÓÚ]+[ ]?){1,3}$");
    }

    //Validar hasta 2 apellidos
    public boolean validarApellido(String cad) {
        //return !cad.isEmpty();
        return cad.matches("^([A-Za-záéíóúÁÉÍÓÚ]+[ ]?){1,2}$");
    }

    //Validar cadena
    public boolean validarCadena(String cad) {
        return cad.matches("^([A-Za-záéíóúÁÉÍÓÚ]+)$");
    }
    
    public boolean validarIsbn(String cad) {
        return cad.matches("^([0-9\\-]+)$");
    }
}
