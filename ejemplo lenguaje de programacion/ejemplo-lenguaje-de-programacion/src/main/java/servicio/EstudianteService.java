
package servicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import modelo.Estudiantes;
import reposi.EstudianteRepository;
import org.springframework.stereotype.Service;  

@Service 
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;
    
    // Obtener todos los estudiantes
    public List<Estudiantes> getAllEstudiantes() {
        return estudianteRepository.findAll();
    }
    
    // Buscar estudiante por ID
    public Estudiantes getEstudianteById(Long id) {
        return estudianteRepository.findById(id);
    }
    
    // Guardar estudiante con validaciones
    public Estudiantes saveEstudiante(Estudiantes estudiante) throws IllegalArgumentException {
        // Validar que el nombre no esté vacío
        if (estudiante.getNombre() == null || estudiante.getNombre().trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del estudiante no puede estar vacío");
        }
        
        // Validar que el correo no esté vacío
        if (estudiante.getCorreo() == null || estudiante.getCorreo().trim().isEmpty()) {
            throw new IllegalArgumentException("El correo del estudiante no puede estar vacío");
        }
        
        // Validar formato básico del correo
        if (!isValidEmail(estudiante.getCorreo())) {
            throw new IllegalArgumentException("El formato del correo electrónico no es válido");
        }
        
        // Validar que el correo no esté duplicado
        if (isEmailDuplicated(estudiante)) {
            throw new IllegalArgumentException("Ya existe un estudiante con este correo electrónico");
        }
        
        return estudianteRepository.save(estudiante);
    }
    
    // Eliminar estudiante por ID
    public boolean deleteEstudiante(Long id) {
        Estudiantes estudiante = estudianteRepository.findById(id);
        if (estudiante != null) {
            estudianteRepository.deleteById(id);
            return true;
        }
        return false;
    }
    
    // Obtener total de estudiantes
    public int getTotalEstudiantes() {
        return estudianteRepository.findAll().size();
    }
    
    // Validación básica de email
    private boolean isValidEmail(String email) {
        return email != null && 
               email.contains("@") && 
               email.contains(".") && 
               email.indexOf("@") < email.lastIndexOf(".");
    }
    
    // Verificar si el correo está duplicado
    private boolean isEmailDuplicated(Estudiantes estudiante) {
        List<Estudiantes> todosEstudiantes = estudianteRepository.findAll();
        for (Estudiantes e : todosEstudiantes) {
            if (e.getCorreo().equalsIgnoreCase(estudiante.getCorreo())) {
                // Si es una actualización, verificar que no sea el mismo estudiante
                if (estudiante.getId() == null || !e.getId().equals(estudiante.getId())) {
                    return true;
                }
            }
        }
        return false;
    }
}


