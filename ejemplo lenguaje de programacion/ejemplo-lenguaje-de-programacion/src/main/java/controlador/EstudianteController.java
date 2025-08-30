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

    @GetMapping("/")
    public String listarEstudiantes(Model model) {
        model.addAttribute("estudiantes", estudianteService.getAllEstudiantes());
        model.addAttribute("totalEstudiantes", estudianteService.getTotalEstudiantes());
        return "estudiantes";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioDeAlta(Model model) {
        model.addAttribute("estudiante", new Estudiantes());
        model.addAttribute("accion", "Agregar");
        return "formulario";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioDeEdicion(@PathVariable Long id, Model model, RedirectAttributes redirectAttributes) {
        Estudiantes estudiante = estudianteService.getEstudianteById(id);
        if (estudiante != null) {
            model.addAttribute("estudiante", estudiante);
            model.addAttribute("accion", "Editar");
            return "formulario";
        } else {
            redirectAttributes.addFlashAttribute("error", "Estudiante no encontrado");
            return "redirect:/";
        }
    }

    @GetMapping("/ver/{id}")
    public String verEstudiante(@PathVariable Long id, Model model, RedirectAttributes redirectAttributes) {
        Estudiantes estudiante = estudianteService.getEstudianteById(id);
        if (estudiante != null) {
            model.addAttribute("estudiante", estudiante);
            return "detalle";
        } else {
            redirectAttributes.addFlashAttribute("error", "Estudiante no encontrado");
            return "redirect:/";
        }
    }

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

    @PostMapping("/eliminar/{id}")
    public String eliminarEstudiante(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        if (estudianteService.deleteEstudiante(id)) {
            redirectAttributes.addFlashAttribute("success", "Estudiante eliminado exitosamente");
        } else {
            redirectAttributes.addFlashAttribute("error", "No se pudo eliminar el estudiante");
        }
        return "redirect:/";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarEstudianteGet(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        return eliminarEstudiante(id, redirectAttributes);
    }
}