package com.alensaavedra.powercheck.energycheck.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.alensaavedra.powercheck.energycheck.Model.Notificacion;
import com.alensaavedra.powercheck.energycheck.Service.CNELService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CNELController {

    @Autowired
    private CNELService cnelService;

    @GetMapping("/")
    public String showForm() {
        return "index";
    }
    

    @PostMapping("/consulta")
    public String consultarCortes(@RequestParam String documentType, 
                               @RequestParam String documentNumber, 
                               Model model) {
    try {
        // Obtener los datos de la API de CNEL
        List<Notificacion> notificaciones = cnelService.consultarCortes(documentType, documentNumber);

        // Si no se encuentran cortes, mostrar un mensaje de error
        if (notificaciones.isEmpty()) {
            model.addAttribute("error", "No hay cortes de luz para el documento proporcionado.");
        } else {
            model.addAttribute("notificaciones", notificaciones);
        }

        return "result"; // Nombre de la vista result.html
    } catch (Exception e) {
        model.addAttribute("error", "Hubo un error al procesar la consulta. Intenta nuevamente más tarde.");
        return "result"; // Nombre de la vista result.html
    }
}
}


