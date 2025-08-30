package admonArbol;

import modelo.estudiantes;

public class Nodo {
    public String clave;
    public estudiantes estudiante;
    public Nodo izquierda;
    public Nodo derecha;

    public Nodo() {
    }
    
    public Nodo(String clave, estudiantes estudiante) {
        this.clave = clave;
        this.estudiante = estudiante;
        this.izquierda = null;
        this.derecha = null;
    }
}