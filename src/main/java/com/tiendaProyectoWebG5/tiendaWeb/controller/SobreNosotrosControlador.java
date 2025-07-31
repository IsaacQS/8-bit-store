/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendaProyectoWebG5.tiendaWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SobreNosotrosControlador {

    @GetMapping("/sobre-nosotros")
    public String mostrarSobreNosotros() {
        return "sobre-nosotros"; // nombre del archivo HTML sin extensión
    }

}
