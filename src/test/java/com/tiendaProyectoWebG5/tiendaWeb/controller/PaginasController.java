/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendaProyectoWebG5.tiendaWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginasController {

    @GetMapping("/")
    public String index() {
        return "index"; 
    }

    @GetMapping("/carrito")
    public String carrito() {
        return "carrito";
    }

    @GetMapping("/consolas")
    public String consolas() {
        return "consolas";
    }

    @GetMapping("/lanzamientos")
    public String lanzamientos() {
        return "lanzamientos";
    }

    @GetMapping("/resenas")
    public String resenas() {
        return "resenas";
    }

    @GetMapping("/sobre-nosotros")
    public String sobreNosotros() {
        return "sobre-nosotros";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
