package reposi;

import modelo.Estudiantes;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class EstudianteRepository {

    // Arreglo inicial con datos precargados (cumpliendo el requisito del arreglo)
    private Estudiantes[] estudiantesArray;
    
    // Lista dinámica para operaciones (cumpliendo el requisito de lista dinámica)
    private final List<Estudiantes> estudiantes = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    @PostConstruct
    public void init() {
        // Inicializar arreglo con datos precargados
        estudiantesArray = new Estudiantes[] {
            new Estudiantes(counter.incrementAndGet(), "Ana García", "ana.garcia@example.com"),
            new Estudiantes(counter.incrementAndGet(), "Luis Morales", "luis.morales@example.com"),
            new Estudiantes(counter.incrementAndGet(), "Carlos Pérez", "carlos.perez@example.com"),
            new Estudiantes(counter.incrementAndGet(), "María Rodríguez", "maria.rodriguez@example.com"),
            new Estudiantes(counter.incrementAndGet(), "Pedro Sánchez", "pedro.sanchez@example.com")
        };
        
        // Convertir arreglo a lista dinámica para las operaciones
        estudiantes.addAll(Arrays.asList(estudiantesArray));
        
        System.out.println("✅ Repositorio inicializado con " + estudiantes.size() + " estudiantes desde arreglo");
    }

    // Obtener todos los estudiantes (desde la lista dinámica)
    public List<Estudiantes> findAll() {
        return new ArrayList<>(estudiantes); // Retorna copia para evitar modificaciones externas
    }

    // Buscar estudiante por ID
    public Estudiantes findById(Long id) {
        return estudiantes.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Guardar estudiante (nuevo o actualizar)
    public Estudiantes save(Estudiantes estudiante) {
        if (estudiante.getId() == null) {
            // Nuevo estudiante - asignar ID y agregar a la lista
            estudiante.setId(counter.incrementAndGet());
            estudiantes.add(estudiante);
            System.out.println("➕ Nuevo estudiante agregado: " + estudiante.getNombre());
        } else {
            // Actualizar estudiante existente en la lista
            int index = -1;
            for (int i = 0; i < estudiantes.size(); i++) {
                if (estudiantes.get(i).getId().equals(estudiante.getId())) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                estudiantes.set(index, estudiante);
                System.out.println("✏️ Estudiante actualizado: " + estudiante.getNombre());
            }
        }
        return estudiante;
    }

    // Eliminar estudiante por ID
    public boolean deleteById(Long id) {
        boolean removed = estudiantes.removeIf(e -> e.getId().equals(id));
        if (removed) {
            System.out.println("🗑️ Estudiante con ID " + id + " eliminado");
        }
        return removed;
    }
    
    // Verificar si existe un estudiante con un correo específico
    public boolean existsByCorreo(String correo) {
        return estudiantes.stream()
                .anyMatch(estudiante -> estudiante.getCorreo().equalsIgnoreCase(correo));
    }
    
    // Verificar si existe un estudiante con un correo específico excluyendo un ID
    public boolean existsByCorreoAndIdNot(String correo, Long id) {
        return estudiantes.stream()
                .anyMatch(estudiante -> estudiante.getCorreo().equalsIgnoreCase(correo) 
                         && !estudiante.getId().equals(id));
    }
    
    // Obtener el arreglo original (para demostrar el uso de arreglos)
    public Estudiantes[] getEstudiantesArray() {
        return Arrays.copyOf(estudiantesArray, estudiantesArray.length);
    }
    
    // Estadísticas
    public int count() {
        return estudiantes.size();
    }
    
    // Buscar estudiantes por nombre (funcionalidad adicional)
    public List<Estudiantes> findByNombreContaining(String nombre) {
        List<Estudiantes> resultado = new ArrayList<>();
        for (Estudiantes estudiante : estudiantes) {
            if (estudiante.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                resultado.add(estudiante);
            }
        }
        return resultado;
    }
}