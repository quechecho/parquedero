package Controlador;

import Modelo.Estudiantes;
import Reposi.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EstudianteController {

    private final EstudianteRepository estudianteRepository;

    @Autowired
    public EstudianteController(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @GetMapping("/")
    public String listarEstudiantes(Model model) {
        model.addAttribute("estudiantes", estudianteRepository.findAll());
        return "estudiantes";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioDeAlta(Model model) {
        model.addAttribute("estudiante", new Estudiantes());
        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardarEstudiante(@ModelAttribute("estudiante") Estudiantes estudiante) {
        estudianteRepository.save(estudiante);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioDeEdicion(@PathVariable Long id, Model model) {
        Estudiantes estudiante = estudianteRepository.findById(id);
        if (estudiante != null) {
            model.addAttribute("estudiante", estudiante);
            return "formulario";
        }
        return "redirect:/";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarEstudiante(@PathVariable Long id) {
        estudianteRepository.deleteById(id);
        return "redirect:/";
    }
}
