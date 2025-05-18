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
    
    public boolean validarHoraEntrada(String horaStr) {
        if (!validarNumeroRealPositivo(horaStr)) {
            return false;
        }
        
        float hora = Float.parseFloat(horaStr);
        return (hora >= 6.00f && hora < 22.00f);
    }

    public boolean validarHoraSalida(String horaStr) {
        if (!validarNumeroRealPositivo(horaStr)) {
            return false;
        }
        
        float hora = Float.parseFloat(horaStr);
        return (hora > 6.00f && hora <= 22.00f);
    }
    
    public boolean validarMinutos(String minutosStr) {
    if (!validarNumeroEnteroPositivo(minutosStr)) {
        return false;
    }
    
    int minutos = Integer.parseInt(minutosStr);
    return (minutos >= 0 && minutos < 60);
    }

}
