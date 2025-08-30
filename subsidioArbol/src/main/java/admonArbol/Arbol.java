package admonArbol;

import javax.swing.table.DefaultTableModel;
import modelo.estudiantes;
import view.VistaArbol;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Arbol {
    private Nodo raiz;

    //Asignar cabecera y valores a la tabla tblPersona de la vista
    String cabecera[] = {"ID", "Nombre", "Apellido", "Promedio", "Val. Matrícula"};
    String datos[][] = {};
    public DefaultTableModel modelo = new DefaultTableModel(datos, cabecera);
    //Asignación del modelo a la tabla
    public Arbol(VistaArbol vis) {
        vis.getTblestudiante().setModel(modelo);
    }

    // Insertar elemento en el árbol
    public boolean insertar(String clave, estudiantes estudiante) {
        ResultadoInsercion resultado = insertarRecursivo(raiz, clave, estudiante);
        raiz = resultado.nodo;
        return resultado.exito;
    }

    private ResultadoInsercion insertarRecursivo(Nodo actual, String clave, estudiantes estudiante) {
        if (actual == null) {
            return new ResultadoInsercion(new Nodo(clave, estudiante), true);
        }

        int comparacion = clave.compareToIgnoreCase(actual.clave);
        if (comparacion < 0) {
            ResultadoInsercion resultado = insertarRecursivo(actual.izquierda, clave, estudiante);
            actual.izquierda = resultado.nodo;
            return new ResultadoInsercion(actual, resultado.exito);
        } else if (comparacion > 0) {
            ResultadoInsercion resultado = insertarRecursivo(actual.derecha, clave, estudiante);
            actual.derecha = resultado.nodo;
            return new ResultadoInsercion(actual, resultado.exito);
        } else {
            System.out.println("No se puede insertar, la clave " + clave + " ya existe.");
            return new ResultadoInsercion(actual, false);
        }
    }

    // Recorrido InOrden (Izquierda - Raíz - Derecha)
    public void inOrden() {
        limpiarTabla();
        inOrdenRecursivo(raiz);
    }

    private void inOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            inOrdenRecursivo(nodo.izquierda);
            agregarTabla(nodo);
            inOrdenRecursivo(nodo.derecha);
        }
    }

    // Recorrido PreOrden (Raíz - Izquierda - Derecha)
    public void preOrden() {
        limpiarTabla();
        preOrdenRecursivo(raiz);
    }

    private void preOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            agregarTabla(nodo);
            preOrdenRecursivo(nodo.izquierda);
            preOrdenRecursivo(nodo.derecha);
        }
    }

    // Recorrido PostOrden (Izquierda - Derecha - Raíz)
    public void postOrden() {
        limpiarTabla();
        postOrdenRecursivo(raiz);
    }

    private void postOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            postOrdenRecursivo(nodo.izquierda);
            postOrdenRecursivo(nodo.derecha);
            agregarTabla(nodo);
        }
    }

    // Recorrido por niveles
    public void porNiveles() {
        limpiarTabla();
        if (raiz == null) return;
        
        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);
        
        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();
            agregarTabla(actual);
            
            if (actual.izquierda != null) {
                cola.add(actual.izquierda);
            }
            if (actual.derecha != null) {
                cola.add(actual.derecha);
            }
        }
    }

    // Buscar un nodo
    public estudiantes buscar(String clave) {
        return buscarRecursivo(raiz, clave);
    }

    private estudiantes buscarRecursivo(Nodo actual, String clave) {
        if (actual == null) {
            return null;
        }
        
        int comparacion = clave.compareToIgnoreCase(actual.clave);
        if (comparacion == 0) {
            return actual.estudiante;
        }
        return comparacion < 0 
                ? buscarRecursivo(actual.izquierda, clave)
                : buscarRecursivo(actual.derecha, clave);
    }

    // Eliminar un nodo
    public estudiantes eliminar(String clave) {
        ResultadoEliminacion resultado = eliminarRecursivo(raiz, clave);
        raiz = resultado.nodo;
        return resultado.estudianteEliminado;
    }

    private ResultadoEliminacion eliminarRecursivo(Nodo actual, String clave) {
        if (actual == null) {
            return new ResultadoEliminacion(null, null);
        }

        int comparacion = clave.compareToIgnoreCase(actual.clave);
        if (comparacion < 0) {
            ResultadoEliminacion resultado = eliminarRecursivo(actual.izquierda, clave);
            actual.izquierda = resultado.nodo;
            return new ResultadoEliminacion(actual, resultado.estudianteEliminado);
        } else if (comparacion > 0) {
            ResultadoEliminacion resultado = eliminarRecursivo(actual.derecha, clave);
            actual.derecha = resultado.nodo;
            return new ResultadoEliminacion(actual, resultado.estudianteEliminado);
        } else {
            // Nodo encontrado
            estudiantes estudianteEliminado = actual.estudiante;

            if (actual.izquierda == null && actual.derecha == null) {
                return new ResultadoEliminacion(null, estudianteEliminado);
            } else if (actual.izquierda == null) {
                return new ResultadoEliminacion(actual.derecha, estudianteEliminado);
            } else if (actual.derecha == null) {
                return new ResultadoEliminacion(actual.izquierda, estudianteEliminado);
            } else {
                Nodo sucesor = encontrarMinimo(actual.derecha);
                actual.clave = sucesor.clave;
                actual.estudiante = sucesor.estudiante;
                ResultadoEliminacion resultado = eliminarRecursivo(actual.derecha, sucesor.clave);
                actual.derecha = resultado.nodo;
                return new ResultadoEliminacion(actual, estudianteEliminado);
            }
        }
    }

    private Nodo encontrarMinimo(Nodo nodo) {
        while (nodo.izquierda != null) {
            nodo = nodo.izquierda;
        }
        return nodo;
    }

    // Contar nodos del árbol
    public int contarNodos() {
        return contarNodosRecursivo(raiz);
    }

    private int contarNodosRecursivo(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + contarNodosRecursivo(nodo.izquierda) + contarNodosRecursivo(nodo.derecha);
    }

    // Determinar la altura del árbol
    public int altura() {
        return alturaRecursiva(raiz);
    }

    private int alturaRecursiva(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        int izquierda = alturaRecursiva(nodo.izquierda);
        int derecha = alturaRecursiva(nodo.derecha);
        return Math.max(izquierda, derecha) + 1;
    }

    // Calcular número de hojas
    public int contarHojas() {
        return contarHojasRecursivo(raiz);
    }

    private int contarHojasRecursivo(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        if (nodo.izquierda == null && nodo.derecha == null) {
            return 1; // Es una hoja
        }
        return contarHojasRecursivo(nodo.izquierda) + contarHojasRecursivo(nodo.derecha);
    }

    // Calcular número de nodos internos
    public int contarNodosInternos() {
        return contarNodosInternosRecursivo(raiz);
    }

    private int contarNodosInternosRecursivo(Nodo nodo) {
        if (nodo == null || (nodo.izquierda == null && nodo.derecha == null)) {
            return 0; // Es null o es hoja
        }
        return 1 + contarNodosInternosRecursivo(nodo.izquierda) + contarNodosInternosRecursivo(nodo.derecha);
    }

    // Determinar si el árbol está balanceado
    public boolean esBalanceado() {
        return esBalanceadoRecursivo(raiz) != -1;
    }

    private int esBalanceadoRecursivo(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        
        int izquierda = esBalanceadoRecursivo(nodo.izquierda);
        if (izquierda == -1) return -1;
        
        int derecha = esBalanceadoRecursivo(nodo.derecha);
        if (derecha == -1) return -1;
        
        if (Math.abs(izquierda - derecha) > 1) {
            return -1;
        }
        
        return Math.max(izquierda, derecha) + 1;
    }

    // Métodos auxiliares
    public void agregarTabla(Nodo n) {
        Object contenido[] = {
            n.estudiante.getIdeEst(), 
            n.estudiante.getNomEst(), 
            n.estudiante.getApeEst(), 
            n.estudiante.getProSem(),
            String.format("$%.2f", n.estudiante.getValMatSem())
        };
        modelo.addRow(contenido);
    }

    public void limpiarTabla() {
        modelo.setRowCount(0);
    }

    public boolean esVacio() {
        return raiz == null;
    }

    // Obtener todos los estudiantes (para cálculos de subsidio)
    public ArrayList<estudiantes> obtenerTodos() {
        ArrayList<estudiantes> lista = new ArrayList<>();
        obtenerTodosRecursivo(raiz, lista);
        return lista;
    }

    private void obtenerTodosRecursivo(Nodo nodo, ArrayList<estudiantes> lista) {
        if (nodo != null) {
            obtenerTodosRecursivo(nodo.izquierda, lista);
            lista.add(nodo.estudiante);
            obtenerTodosRecursivo(nodo.derecha, lista);
        }
    }

    // Clases internas para validar operaciones
    private class ResultadoInsercion {
        Nodo nodo;
        boolean exito;

        ResultadoInsercion(Nodo nodo, boolean exito) {
            this.nodo = nodo;
            this.exito = exito;
        }
    }

    private class ResultadoEliminacion {
        Nodo nodo;
        estudiantes estudianteEliminado;

        ResultadoEliminacion(Nodo nodo, estudiantes estudianteEliminado) {
            this.nodo = nodo;
            this.estudianteEliminado = estudianteEliminado;
        }
    }
}