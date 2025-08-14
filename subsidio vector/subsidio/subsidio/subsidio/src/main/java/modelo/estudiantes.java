
package modelo;


public class estudiantes {
    

    //Atributos de la clase (Datos de entrada)
    private String ideEst;
    private String nomEst;
    private String apeEst;
    private float valMatSem;
    private float proSem;
    
    // Constructores
    public estudiantes() {
    }

    public estudiantes(String ideEst, String nomEst, String apeEst, float valMatSem, float proSem) {
        this.ideEst = ideEst;
        this.nomEst = nomEst;
        this.apeEst = apeEst;
        this.valMatSem = valMatSem;
        this.proSem = proSem;
    }

    
    // metodos getters y setters

    public String getIdeEst() {
        return ideEst;
    }

    public void setIdeEst(String ideEst) {
        this.ideEst = ideEst;
    }

    public String getNomEst() {
        return nomEst;
    }

    public void setNomEst(String nomEst) {
        this.nomEst = nomEst;
    }

    public String getApeEst() {
        return apeEst;
    }

    public void setApeEst(String apeEst) {
        this.apeEst = apeEst;
    }

    public float getValMatSem() {
        return valMatSem;
    }

    public void setValMatSem(float valMatSem) {
        this.valMatSem = valMatSem;
    }

    public float getProSem() {
        return proSem;
    }

    public void setProSem(float proSem) {
        this.proSem = proSem;
    }

       
      //Metodos adiccionales
    
    public float determinarPorcentajeSubsidio(float proSem) {
    float porSubMat = 0;

    if (proSem == 5.0) {
        porSubMat = 100;
    } else if (proSem >= 4.5 && proSem < 5.0) {
        porSubMat = 80;
    } else if (proSem >= 4.0 && proSem < 4.5) {
        porSubMat = 60;
    } else if (proSem >= 3.5 && proSem < 4.0) {
        porSubMat = 40;
    } else if (proSem >= 3.0 && proSem < 3.5) {
        porSubMat = 20;
    } else if (proSem < 3.0) {
        porSubMat = 0;
    }

    return porSubMat;
    }
      public float valorSubsidio( float valMatSem,float porSubMat){
       return (valMatSem * porSubMat)/100;
    }
    public float valorPagarEstudiantes(float valMatSem, float valSub){
        return valMatSem - valSub;
    }
    public int contar( int numEstSub){
        return numEstSub+1; 
   }
    public int numeroEstudiantesSubsidiados( int numEstSub100, int numEstSub80, int numEstSub60, int numEstSub40,int numEstSub20) {
        return numEstSub100+numEstSub80+numEstSub60+numEstSub40+numEstSub20;
    }
    public int numeroEstudiantesAfiliados( int numEstSub100, int numEstSub80, int numEstSub60, int numEstSub40,int numEstSub20, int numEstSub00){
        return numEstSub100+numEstSub80+numEstSub60+numEstSub40+numEstSub20+numEstSub00;
    }
    
    public float sumar5Valores(float dinTotSub100, float dinTotSub80, float dinTotSub60, float dinTotSub40, float dinTotSub20) {
        return dinTotSub100+dinTotSub80+dinTotSub60+dinTotSub40+dinTotSub20;
    }
      public float sumar5Valores( int numEstSub100, int numEstSub80, int numEstSub60, int numEstSub40,int numEstSub20, int numEstSub00) {
        return numEstSub100+numEstSub80+numEstSub60+numEstSub40+numEstSub20+numEstSub00;
    }

    public int sumar2Valores(int numTotEstSub, int numEstSub00) {
        return numTotEstSub+numEstSub00;
    }
    
    public float calcularPorcentajeSubsidiados( int numEstSub, int numTotEstAfi){
      if (numTotEstAfi == 0) {
            return 0; // Evita la división por cero y devuelve 0%
        }
        return (numEstSub * 100) / numTotEstAfi;
    }
        
    }

