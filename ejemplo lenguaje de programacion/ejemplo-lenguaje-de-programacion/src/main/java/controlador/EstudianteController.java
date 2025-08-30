package controlador;

import modelo.Estudiantes;
import servicio.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    // Página principal - mostrar lista de estudiantes
    @GetMapping("/")
    public String listarEstudiantes(Model model) {
        model.addAttribute("estudiantes", estudianteService.getAllEstudiantes());
        model.addAttribute("totalEstudiantes", estudianteService.getTotalEstudiantes());
        return "estudiantes"; // Necesitas crear este archivo o cambiar a un archivo existente
    }

    // Mostrar formulario para nuevo estudiante
    @GetMapping("/nuevo")
    public String mostrarFormularioDeAlta(Model model) {
        model.addAttribute("estudiante", new Estudiantes());
        model.addAttribute("accion", "Agregar");
        return "formulario"; // ✅ Este archivo ya existe
    }

    // Mostrar formulario de edición
    @GetMapping("/editar/{id}")
    public String mostrarFormularioDeEdicion(@PathVariable Long id, Model model, RedirectAttributes redirectAttributes) {
        Estudiantes estudiante = estudianteService.getEstudianteById(id);
        if (estudiante != null) {
            model.addAttribute("estudiante", estudiante);
            model.addAttribute("accion", "Editar");
            return "formulario"; // ✅ Este archivo ya existe
        } else {
            redirectAttributes.addFlashAttribute("error", "Estudiante no encontrado");
            return "redirect:/";
        }
    }

    // Ver detalles del estudiante
    @GetMapping("/ver/{id}")
    public String verEstudiante(@PathVariable Long id, Model model, RedirectAttributes redirectAttributes) {
        Estudiantes estudiante = estudianteService.getEstudianteById(id);
        if (estudiante != null) {
            model.addAttribute("estudiante", estudiante);
            return "estudiante"; // ✅ Este archivo ya existe
        } else {
            redirectAttributes.addFlashAttribute("error", "Estudiante no encontrado");
            return "redirect:/";
        }
    }

    // Guardar estudiante (nuevo o actualizar)
    @PostMapping("/guardar")
    public String guardarEstudiante(@ModelAttribute("estudiante") Estudiantes estudiante, RedirectAttributes redirectAttributes) {
        try {
            estudianteService.saveEstudiante(estudiante);
            String mensaje = estudiante.getId() == null ? "Estudiante agregado exitosamente" : "Estudiante actualizado exitosamente";
            redirectAttributes.addFlashAttribute("success", mensaje);
        } catch (IllegalArgumentException e) {
            redirectAttributes.addFlashAttribute("error", e.getMessage());
            redirectAttributes.addFlashAttribute("estudiante", estudiante);
            return estudiante.getId() == null ? "redirect:/nuevo" : "redirect:/editar/" + estudiante.getId();
        }
        return "redirect:/";
    }

    // Eliminar estudiante (POST)
    @PostMapping("/eliminar/{id}")
    public String eliminarEstudiante(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        if (estudianteService.deleteEstudiante(id)) {
            redirectAttributes.addFlashAttribute("success", "Estudiante eliminado exitosamente");
        } else {
            redirectAttributes.addFlashAttribute("error", "No se pudo eliminar el estudiante");
        }
        return "redirect:/";
    }

    // Eliminar estudiante (GET) - para compatibilidad
    @GetMapping("/eliminar/{id}")
    public String eliminarEstudianteGet(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        return eliminarEstudiante(id, redirectAttributes);
    }

    // NUEVO: Página simple para mostrar lista básica usando estudiante.html
    @GetMapping("/lista")
    public String mostrarListaSimple(Model model) {
        // Usar el primer estudiante para mostrar la plantilla existente
        var estudiantes = estudianteService.getAllEstudiantes();
        if (!estudiantes.isEmpty()) {
            model.addAttribute("estudiante", estudiantes.get(0));
            model.addAttribute("estudiantes", estudiantes);
            model.addAttribute("totalEstudiantes", estudianteService.getTotalEstudiantes());
        } else {
            // Si no hay estudiantes, crear uno temporal para la vista
            Estudiantes temp = new Estudiantes();
            temp.setId(0L);
            temp.setNombre("No hay estudiantes");
            temp.setCorreo("sistema@ejemplo.com");
            model.addAttribute("estudiante", temp);
        }
        return "estudiante";
    }
}