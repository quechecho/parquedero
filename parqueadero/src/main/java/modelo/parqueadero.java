
package modelo;

public class parqueadero {
    private String ideCli;
    private String apeCli;
    private String nomCli;
    private int tipVeh; 
    private float horaEntrada;
    private float horaSalida;
    private float pagoRecibido;
    private float cambio;
    private float valhoras;
    private float costo;
    
    public parqueadero(String ideCli, String apeCli, String nomCli, int tipVeh,  float horaEntrada,  float horaSalida, float pagoRecibido, float cambio, float valhoras,  float costo)
     {
        this.ideCli = ideCli;
        this.apeCli = apeCli;
        this.nomCli = nomCli;
        this.tipVeh = tipVeh;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.pagoRecibido = pagoRecibido;
        this.cambio = cambio;
        this.valhoras = valhoras;
        this.costo = costo;
    
     }
    public parqueadero() {
       
    }

    public String getIdeCli() {
        return ideCli;
    }

    public void setIdeCli(String ideCli) {
        this.ideCli = ideCli;
    }

    public String getApeCli() {
        return apeCli;
    }

    public void setApeCli(String apeCli) {
        this.apeCli = apeCli;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public int getTipVeh() {
        return tipVeh;
    }

    public void setTipVeh(int tipVeh) {
        this.tipVeh = tipVeh;
    }

    public float getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(float horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public float getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(float horaSalida) {
        this.horaSalida = horaSalida;
    }

    public float getPagoRecibido() {
        return pagoRecibido;
    }

    public void setPagoRecibido(float pagoRecibido) {
        this.pagoRecibido = pagoRecibido;
    }

    public float getCambio() {
        return cambio;
    }

    public void setCambio(float cambio) {
        this.cambio = cambio;
    }

    public float getValhoras() {
        return valhoras;
    }

    public void setValhoras(float valhoras) {
        this.valhoras = valhoras;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setValRecibido(float parseFloat) {
    this.valhoras = parseFloat;
    }

   public void setHorasUso(float horasUso) {
    // Add a horasUso field and implement this method
}
    
    public static float determinarhoradeentradaysalida(float horEntr, float horSali) {
        
    if (horEntr < 6.00f || horEntr >= 22.00f) {
        throw new IllegalArgumentException("La hora de entrada debe estar entre 6:00 y 22:00");
    }
    
    if (horSali <= 6.00f || horSali > 22.00f) {
        throw new IllegalArgumentException("La hora de salida debe estar entre 6:00 y 22:00");
    }
    
    if (horSali <= horEntr) {
        throw new IllegalArgumentException("La hora de salida debe ser posterior a la hora de entrada");
    }
    
    int horasEntrada = (int)horEntr;
    int horasSalida = (int)horSali;
    
    
    int minutosEntrada = (int)Math.round((horEntr - horasEntrada) * 100);
    int minutosSalida = (int)Math.round((horSali - horasSalida) * 100);
    
    float horaEntradaDecimal = horasEntrada + (minutosEntrada / 60.0f);
    float horaSalidaDecimal = horasSalida + (minutosSalida / 60.0f);
    
    float horasTotales = horaSalidaDecimal - horaEntradaDecimal;
    
    return horasTotales;
    
    }
    public float determinarValorPorHora(String tipoVeh, float horEntrada, float horSalida) {
        float porhor = 0;
        String tipo = tipoVeh.trim().toLowerCase();
        
        if (tipo.startsWith("bicicleta")) {
            porhor = 1000;
        } else if (tipo.startsWith("motocicleta")) {
            porhor = 2000;
        } else if (tipo.startsWith("automov") || tipo.equals("automóvil")) {  
            porhor = 3000;
        } else if (tipo.startsWith("camioneta")) {
            porhor = 4000;
        } else if (tipo.startsWith("buseta")) {
            porhor = 5000;
        } else if (tipo.equals("bus")) {
            porhor = 6000;
        } else if (tipo.startsWith("camion") || tipo.equals("camión")) {
            porhor = 7000;
        } else {
            System.out.println("Tipo de vehículo no válido: " + tipoVeh);
        }
        return porhor;
    }
}