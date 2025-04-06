
package modelo;

public class parqueadero {
    private String ideCli;
    private String apeCli;
    private String nomCli;
    private int tipVeh; 
    private float horaEntrada;
    private float horaSalida;
    private float valRecibido;
    private float valhoras;
    private float costo;
    
    public parqueadero(String ideCli, String apeCli, String nomCli, int tipVeh,  float horaEntrada,  float horaSalida, float valRecibido, float valhoras,  float costo)
     {
        this.ideCli = ideCli;
        this.apeCli = apeCli;
        this.nomCli = nomCli;
        this.tipVeh = tipVeh;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.valRecibido = valRecibido;
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

    public float getValRecibido() {
        return valRecibido;
    }

    public void setValRecibido(float valRecibido) {
        this.valRecibido = valRecibido;
    }

    public float getHorasUso() {
        return valhoras;
    }

    public void setHorasUso(float horasUso) {
        this.valhoras = horasUso;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    public static float determinarhoradeentradaysalida(float horEntr, float horSali) {
        float horasTotales;
    
        horasTotales = horSali - horEntr;
    
        return horasTotales;
    }
    public float determinarValorPorHora(String tipoVeh, float horEntrada, float horSalida) {
        float porhor= 0;
        if (tipoVeh.equalsIgnoreCase("bicicleta")) {
            porhor = 1000;
        } else if (tipoVeh.equalsIgnoreCase("motocicleta")) {
            porhor = 2000;
        } else if (tipoVeh.equalsIgnoreCase("automóvil")) {
            porhor = 3000;
        } else if (tipoVeh.equalsIgnoreCase("camioneta")) {
            porhor = 4000;
        } else if (tipoVeh.equalsIgnoreCase("buseta")) {
            porhor = 5000;
        } else if (tipoVeh.equalsIgnoreCase("bus")) {
            porhor = 6000;
        } else if (tipoVeh.equalsIgnoreCase("camión")) {
            porhor = 7000;
        } else {
            System.out.println("Tipo de vehículo no válido.");
        }
        return porhor;
    
}
}
