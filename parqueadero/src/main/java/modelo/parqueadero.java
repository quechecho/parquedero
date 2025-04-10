
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
    if (horEntr < 6.00f || horEntr >= 22.00f) {
            throw new IllegalArgumentException("La hora de entrada debe estar entre 6:00 y 22:00");
        }
        
        if (horSali <= 6.00f || horSali > 22.00f) {
            throw new IllegalArgumentException("La hora de salida debe estar entre 6:00 y 22:00");
        }
        
        if (horSali <= horEntr) {
            throw new IllegalArgumentException("La hora de salida debe ser posterior a la hora de entrada");
        }
        
        // Separar las horas y minutos
        int horasEntrada = (int)horEntr;
        int minEntrada = Math.round((horEntr - horasEntrada) * 60);
        
        int horasSalida = (int)horSali;
        int minSalida = Math.round((horSali - horasSalida) * 60);
        
        // Convertir todo a minutos
        int totalMinEntrada = horasEntrada * 60 + minEntrada;
        int totalMinSalida = horasSalida * 60 + minSalida;
        
        // Calcular la diferencia en minutos
        int diferenciaMin = totalMinSalida - totalMinEntrada;
        
        // Convertir la diferencia de nuevo a formato decimal (horas.minutos)
        float horasTotales = diferenciaMin / 60.0f;
        
        
        return horasTotales;    
    
    }
    public float determinarValorPorHora(String tipoVeh, float horEntrada, float horSalida) {
        float porhor = 0;
        // Normalize the input by trimming spaces and handling plural forms
        String tipo = tipoVeh.trim().toLowerCase();
        
        if (tipo.startsWith("bicicleta")) {
            porhor = 1000;
        } else if (tipo.startsWith("motocicleta")) {
            porhor = 2000;
        } else if (tipo.startsWith("automov") || tipo.equals("automóvil")) {  // Will match both "automovil" and "automoviles"
            porhor = 3000;
        } else if (tipo.startsWith("camioneta")) {
            porhor = 4000;
        } else if (tipo.startsWith("buseta")) {
            porhor = 5000;
        } else if (tipo.equals("bus")) {
            porhor = 6000;
        } else if (tipo.startsWith("cami") || tipo.equals("camión")) {  // Will match both "camion" and "camiones"
            porhor = 7000;
        } else {
            System.out.println("Tipo de vehículo no válido: " + tipoVeh);
        }
        return porhor;
    }
}
