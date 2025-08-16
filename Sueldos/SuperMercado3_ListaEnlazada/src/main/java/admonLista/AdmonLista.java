
package admonLista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.SuperMercado3;

public class AdmonLista {
 
    
private Nodo cabeza = null;  //Primer nodo de la lista
    private int longitud = 0; //Tamaño de la lista

    public AdmonLista() {
    }
    
    private class Nodo{
        public SuperMercado3 Sp;
        public Nodo siguiente = null;
        
        public Nodo(SuperMercado3 Sp){
            this.Sp = Sp;
        }

        public Nodo() {
        }
        
    }
    
    public void InsertarPrincipio(SuperMercado3 Sp){
        try {
            Nodo nodo = new Nodo(Sp);
            nodo.siguiente = cabeza;
            cabeza = nodo;
            longitud++;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "<html><p style =\"color: red\">Error+ e </p></htnl>",
                        "Aención", JOptionPane.INFORMATION_MESSAGE);
        }

    }
    
    public void InsertarFinal(SuperMercado3 Sp){
        Nodo nodo = new Nodo(Sp);
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
    
    public void InsertarDespues(int n, SuperMercado3 Sp){
        Nodo nodo = new Nodo(Sp);
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
    
    public SuperMercado3 Obtener(int n){
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
                 return puntero.Sp;
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
    
    public ArrayList ObtenerTodos(){
        
        ArrayList<SuperMercado3> VecLib = new ArrayList<>();
        if(cabeza == null){
            JOptionPane.showMessageDialog(null, "Lista vacia... ", "Notificación", JOptionPane.WARNING_MESSAGE);
            
        }else{
            Nodo puntero = cabeza;
            VecLib.add(puntero.Sp);
            while (puntero.siguiente != null){
                puntero = puntero.siguiente;
                VecLib.add(puntero.Sp);
                
            } 
        }
        return VecLib;
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
    
    public boolean EliminarDespues(int n){ //Eliminar un libro después de la posición N
        if(cabeza != null){
            if(n==0){
                Nodo primer = cabeza;
                cabeza = cabeza.siguiente;
                primer.siguiente = null;
                longitud--;
                return true;
            }else if(n < longitud){
                Nodo puntero = cabeza;
                int contador = 0;
                while(contador < n ){
                    puntero = puntero.siguiente;
                    contador++;
                }
                Nodo temp = puntero.siguiente;
                puntero.siguiente = temp.siguiente;
                temp.siguiente = null;
                longitud--;
                return true;
            }else
                return false;
        }else
            return false;
    }
}
