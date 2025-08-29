package Reposi;

import Modelo.Estudiantes;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class EstudianteRepository {

    private final List<Estudiantes> estudiantes = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    @PostConstruct
    public void init() {
        // Datos iniciales precargados
        Estudiantes[] initialData = {
                new Estudiantes(counter.incrementAndGet(), "Ana García", "ana.garcia@example.com"),
                new Estudiantes(counter.incrementAndGet(), "Luis Morales", "luis.morales@example.com"),
                new Estudiantes(counter.incrementAndGet(), "Carlos Pérez", "carlos.perez@example.com")
        };
        for (Estudiantes estudiante : initialData) {
            estudiantes.add(estudiante);
        }
    }

    public List<Estudiantes> findAll() {
        return new ArrayList<>(estudiantes);
    }

    public Estudiantes findById(Long id) {
        return estudiantes.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Estudiantes save(Estudiantes estudiante) {
        if (estudiante.getId() == null) {
            // Nuevo estudiante
            estudiante.setId(counter.incrementAndGet());
            estudiantes.add(estudiante);
        } else {
            // Actualizar estudiante existente
            int index = -1;
            for (int i = 0; i < estudiantes.size(); i++) {
                if (estudiantes.get(i).getId().equals(estudiante.getId())) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                estudiantes.set(index, estudiante);
            }
        }
        return estudiante;
    }

    public void deleteById(Long id) {
        estudiantes.removeIf(e -> e.getId().equals(id));
    }
}
