package com.tiendaProyectoWebG5.tiendaWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistroController {

    @GetMapping("/registro")
    public String mostrarFormularioRegistro() {
        return "registro"; // carga registro.html
    }

    @PostMapping("/registro")
    public String procesarRegistro(/* Aquí puedes recibir parámetros o un DTO */) {
        // Aquí va la lógica para guardar o validar el usuario

        // Por ahora solo redirigimos a login tras registro exitoso
        return "redirect:/login";
    }
}
