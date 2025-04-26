
package modelo;

public class parqueadero {
    private String ideCli;
    private String apeCli;
    private String nomCli;
    private int tipVeh; 
    private float horaEntrada;
    private float minutoEntrada;
    private float minutoSalida;
    private float horaSalida;
    private float ValRecibido;
    private float HorasUso;
    private float cambio;
    private float valhoras;
    private float costo;
    
    public parqueadero(String ideCli, String apeCli, String nomCli, int tipVeh,  float horaEntrada, float minutoEntrada, float minutoSalida,  float horaSalida, float ValRecibido, float cambio, float valhoras, float HorasUso,  float costo)
     {
        this.ideCli = ideCli;
        this.apeCli = apeCli;
        this.nomCli = nomCli;
        this.tipVeh = tipVeh;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.minutoEntrada = minutoEntrada;
        this.minutoSalida = minutoSalida;
        this.ValRecibido = ValRecibido;
        this.cambio = cambio;
        this.valhoras = valhoras;
        this.HorasUso = HorasUso;
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

    public float getMinutoEntrada() {
        return minutoEntrada;
    }

    public void setMinutoEntrada(float minutoEntrada) {
        this.minutoEntrada = minutoEntrada;
    }

    public float getMinutoSalida() {
        return minutoSalida;
    }

    public void setMinutoSalida(float minutoSalida) {
        this.minutoSalida = minutoSalida;
    }

    public float getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(float horaSalida) {
        this.horaSalida = horaSalida;
    }

    public float getValRecibido() {
        return ValRecibido;
    }

    public void setValRecibido(float ValRecibido) {
        this.ValRecibido = ValRecibido;
    }

    public float getHorasUso() {
        return HorasUso;
    }

    public void setHorasUso(float HorasUso) {
        this.HorasUso = HorasUso;
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
    public static float determinarhoradeentradaysalida(float horaEntrada, float horaSalida) {
        return horaSalida - horaEntrada;
    }
    
    public static float determinarhoradeentradaysalida(float horaEntrada, float minutoEntrada, float horaSalida, float minutoSalida) {
        float horaEntradaTotal = horaEntrada + (minutoEntrada / 60.0f);
        float horaSalidaTotal = horaSalida + (minutoSalida / 60.0f);
        
        float horasTotales = horaSalidaTotal - horaEntradaTotal;
        
        if (horasTotales <= 0) {
            throw new IllegalArgumentException("La hora de salida debe ser posterior a la hora de entrada");
        }
        
        return horasTotales;
    }

    public float determinarValorPorHora(String tipoVeh, float horEntrada, float horSalida) {
        float porhor = 0;
        String tipo = tipoVeh.trim().toLowerCase();
        
        if (tipo.startsWith("bicicleta")) {
            porhor = 1000;
        } else if (tipo.startsWith("motocicleta")) {
            porhor = 2000;
        } else if (tipo.startsWith("automovil") || tipo.equals("automóvil")) {  
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
