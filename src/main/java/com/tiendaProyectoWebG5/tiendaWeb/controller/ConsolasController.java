/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendaProyectoWebG5.tiendaWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/consolas")
public class ConsolasController {

    @GetMapping
    public String verConsolas() {
        
        return "consolas"; // 
    }

    @GetMapping("/{consola}")
    public String detalleConsola(@PathVariable String consola, Model model) {
        if ("nintendo-switch".equals(consola)) {
            model.addAttribute("nombre", "Nintendo Switch");
            model.addAttribute("juegos", List.of("The Legend of Zelda: Breath of the Wild", "Mario Kart 8 Deluxe", "Animal Crossing: New Horizons"));
            model.addAttribute("accesorios", List.of("Control Pro", "Dock HDMI", "Cargador portátil"));
            model.addAttribute("info", "La Nintendo Switch es una consola híbrida desarrollada por Nintendo, que combina juegos en casa y portátil.");
            model.addAttribute("enlaceOficial", "https://www.nintendo.com/switch/");
        } else if ("playstation-5".equals(consola)) {
            model.addAttribute("nombre", "PlayStation 5");
            model.addAttribute("juegos", List.of("Spider-Man: Miles Morales", "Demon's Souls", "Ratchet & Clank: Rift Apart"));
            model.addAttribute("accesorios", List.of("Control DualSense", "Cámara HD", "Audífonos Pulse 3D"));
            model.addAttribute("info", "PlayStation 5 es la consola de nueva generación de Sony, con gráficos avanzados y rápido SSD.");
            model.addAttribute("enlaceOficial", "https://www.playstation.com/ps5/");
        } else if ("xbox-series-x".equals(consola)) {
            model.addAttribute("nombre", "Xbox Series X");
            model.addAttribute("juegos", List.of("Halo Infinite", "Forza Horizon 5", "Gears 5"));
            model.addAttribute("accesorios", List.of("Control inalámbrico Xbox", "Auriculares Xbox", "Soporte de carga"));
            model.addAttribute("info", "Xbox Series X es la consola más potente de Microsoft, enfocada en rendimiento y retrocompatibilidad.");
            model.addAttribute("enlaceOficial", "https://www.xbox.com/consoles/xbox-series-x");
        } else if ("steam-deck".equals(consola)) {
            model.addAttribute("nombre", "Steam Deck");
            model.addAttribute("juegos", List.of("Cyberpunk 2077", "Elden Ring", "Hades"));
            model.addAttribute("accesorios", List.of("Estuche protector", "Dock para TV", "Cargador USB-C"));
            model.addAttribute("info", "Steam Deck es una PC portátil para juegos desarrollada por Valve, permite jugar títulos de Steam en movimiento.");
            model.addAttribute("enlaceOficial", "https://www.steamdeck.com/");
        } else {
          
            return "redirect:/consolas";
        }
        return "detalle-consola";
    }
}