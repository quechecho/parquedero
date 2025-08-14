package admonArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import modelo.estudiantes;

public class AdministradorArray {
    private ArrayList<estudiantes> vecEst;

    public ArrayList<estudiantes> getvecEst() {
         return vecEst;

    }
          
    public void crearVector(){
        vecEst = new ArrayList<>();
    }

    public void adicionar(estudiantes modEst){
        vecEst.add(modEst);
    }

    public int buscarideEst(String ideEst){
         boolean sw = false;
        int i = 0;
        while (!sw && i < vecEst.size()) {
            if (vecEst.get(i).getIdeEst().equals(ideEst)) {
                sw = true;
            } else {
                i += 1;
            }
        }
        
        if(sw)
            return i;
        else
            return -1;
    }
    
    public ArrayList<estudiantes> buscarapeEst(String apeEst) {
    ArrayList<estudiantes> resultado;
    resultado = new ArrayList();
    
    for(estudiantes m: vecEst ){
        if(m.getApeEst().equals(apeEst))
            resultado.add(m);
    }
    return resultado;
}

public ArrayList<estudiantes> buscarnomEst(String nomEst) {
    ArrayList<estudiantes> resultado;
    resultado = new ArrayList();
    
    for(estudiantes m: vecEst ){
        if(m.getNomEst().equals(nomEst))
            resultado.add(m);
    }
    return resultado;
}

public ArrayList<estudiantes> buscarproSem(String proSem) {
    ArrayList<estudiantes> resultado;
    resultado = new ArrayList();
    
    try {
        float promedio = Float.parseFloat(proSem);
        for(estudiantes m: vecEst ){
            if(m.getProSem() == promedio)
                resultado.add(m);
        }
    } catch (NumberFormatException e) {
    }
    return resultado;
}

public ArrayList<estudiantes> buscarvalmatSem(String valmatSem) {
    ArrayList<estudiantes> resultado;
    resultado = new ArrayList();
    
    try {
        float valorMatricula = Float.parseFloat(valmatSem);
        for(estudiantes m: vecEst ){
            if(m.getValMatSem() == valorMatricula)
                resultado.add(m);
        }
    } catch (NumberFormatException e) {
    }
    return resultado;
}
    
    public void ordenarIdentificacion(){
        Collections.sort(vecEst, Comparator.comparing(d -> d.getIdeEst()));
    }

    public void ordenarApellido() {
        Collections.sort(vecEst, Comparator.comparing(d -> d.getApeEst()));
    }
    
    public void ordenarNombre() {
        Collections.sort(vecEst, Comparator.comparing(d -> d.getNomEst()));
    }

    public void ordenarvalormateriasemestre(){
        Collections.sort(vecEst, Comparator.comparing(d -> d.getValMatSem()));

    }

    public void ordenarpromediosemestre(){
        Collections.sort(vecEst, Comparator.comparing(d -> d.getProSem()));

    }
     public void eliminar(int ind){
        vecEst.remove(ind);
    }   

}