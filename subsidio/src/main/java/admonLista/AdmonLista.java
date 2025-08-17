package admonLista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.estudiantes;

public class AdmonLista {
 
    private Nodo cabeza = null;  //Primer nodo de la lista
    private int longitud = 0; //Tamaño de la lista

    public AdmonLista() {
    }
    
    private class Nodo{
        public estudiantes est;
        public Nodo siguiente = null;
        
        public Nodo(estudiantes est){
            this.est = est;
        }

        public Nodo() {
        }
        
    }
    
    public void InsertarPrincipio(estudiantes est){
        try {
            Nodo nodo = new Nodo(est);
            nodo.siguiente = cabeza;
            cabeza = nodo;
            longitud++;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "<html><p style =\"color: red\">Error: " + e + " </p></html>",
                        "Atención", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void InsertarFinal(estudiantes est){
        Nodo nodo = new Nodo(est);
        if(cabeza != null){
            Nodo puntero = cabeza;
            while (puntero.siguiente != null){
                puntero = puntero.siguiente;
            }
            puntero.siguiente = nodo;
        }else {
           cabeza = nodo; 
        }
        longitud++;
    }
    
    public void InsertarDespues(int n, estudiantes est){
        Nodo nodo = new Nodo(est);
        if(cabeza == null){
            cabeza = nodo;
        }else{
            Nodo puntero = cabeza;
            int contador = 0;
             while (contador < n && puntero.siguiente != null){
                puntero = puntero.siguiente;
                contador++;
             }
             nodo.siguiente = puntero.siguiente;
             puntero.siguiente = nodo;
        }
        longitud++;
    }
    
    public estudiantes Obtener(int n){
        if(cabeza == null){
            return null;
        }else{
            Nodo puntero = cabeza;
            int contador = 0;
             while (contador < n && puntero.siguiente != null){
                puntero = puntero.siguiente;
                contador++;
             }
             if(contador != n){
                 return null;
             }else{
                 return puntero.est;
             }
        }
    }
    
    public int Contar(){
        if(cabeza == null)
            return -99;
        else
            return longitud;
    }
    
    public boolean ListaVacia(){
        return cabeza == null;
    }
    
    public ArrayList<estudiantes> ObtenerTodos(){
        
        ArrayList<estudiantes> VecEst = new ArrayList<>();
        if(cabeza == null){
            JOptionPane.showMessageDialog(null, "Lista vacia... ", "Notificación", JOptionPane.WARNING_MESSAGE);
            
        }else{
            Nodo puntero = cabeza;
            VecEst.add(puntero.est);
            while (puntero.siguiente != null){
                puntero = puntero.siguiente;
                VecEst.add(puntero.est);
                
            } 
        }
        return VecEst;
    }
    
    public boolean EliminarPrincipio(){
        if(cabeza != null){
            Nodo primero = cabeza;
            cabeza = cabeza.siguiente;
            primero.siguiente = null;
            longitud--;
            return true;
        }else
            return false;
    }
    
    public boolean EliminarFinal(){
        if(cabeza != null){
            if(cabeza.siguiente == null){
                cabeza = null;
                longitud--;
                return true;
            }else{
                Nodo puntero = cabeza;
                while(puntero.siguiente.siguiente != null){
                    puntero = puntero.siguiente;
                }   
                puntero.siguiente = null;
                longitud--;
                return true;
            }
        }else
          return false;  
    } 
    
    public boolean EliminarDespues(int n){ 
        if(cabeza != null){
            if(n == 0){
                Nodo primer = cabeza;
                cabeza = cabeza.siguiente;
                primer.siguiente = null;
                longitud--;
                return true;
            }else if(n < longitud){
                Nodo puntero = cabeza;
                int contador = 0;
                while(contador < n - 1 && puntero.siguiente != null){
                    puntero = puntero.siguiente;
                    contador++;
                }
                if(puntero.siguiente != null){
                    Nodo temp = puntero.siguiente;
                    puntero.siguiente = temp.siguiente;
                    temp.siguiente = null;
                    longitud--;
                    return true;
                }
                return false;
            }else
                return false;
        }else
            return false;
    }
}
