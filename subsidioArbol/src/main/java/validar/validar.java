
package validar;


public class validar {
    
  
    //validar numeros enteros positivos
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
}
