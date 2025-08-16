
package model;

/*
participantes =
Jesus Dacid Sanchez Pacheco
Victor Manuel Salgado Gonzales
*/

public class SuperMercado3 {
    
   private String nomCli;
   private String apeCli;
   private String ideCli;
   private float  valCom;
    //constructores
 
   
   
   public SuperMercado3(){        
         
   }
   
 
   
    public SuperMercado3(String nomCli, String apeCli, String ideCli, float valCom) {
        this.nomCli = nomCli;
        this.apeCli = apeCli;
        this.ideCli = ideCli;
        this.valCom = valCom;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public String getApeCli() {
        return apeCli;
    }

    public void setApeCli(String apeCli) {
        this.apeCli = apeCli;
    }

    public String getIdeCli() {
        return ideCli;
    }

    public void setIdeCli(String ideCli) {
        this.ideCli = ideCli;
    }

    public float getValCom() {
        return valCom;
    }

    public void setValCom(float valCom) {
        this.valCom = valCom;
    }
    
    //Metodos Adicionales
    
   
    
    
    
    
    
    public int numeroSorteo(){
    int numeroSorteo = (int)(Math.random()*11);
    return numeroSorteo;
    }
    public float determinarPorcentaje (int numeroSorteo){
        
       float porDes = numeroSorteo * 10;
       return porDes;
    }
    
    public float valorDescuento (float porDes){
        float valDes = (valCom * porDes)/100;
        return valDes;
        
    }
    
    public float valorPagar(float valDes){
        float valPag = valCom - valDes;
        return valPag;
    }
    
    public int contar(int val){
        val++;
    return val;
    }
    public float acumular(float val1, float val2){
    return val1+val2;
    }
    public int calcularPorcentaje(int valPar, int valTot){
        return(valPar * 100)/valTot;
    }
    public float totalizar(float valTotCom, float valCom){
        valTotCom = valTotCom + valCom;
        return valTotCom;
    }
     public float totalDescontado(float totDes, float valDes){
         totDes = totDes + valDes;
         return totDes;
     }
    
}
