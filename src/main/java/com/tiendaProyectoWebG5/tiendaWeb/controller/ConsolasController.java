package com.tiendaProyectoWebG5.tiendaWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/consolas")
public class ConsolasController {

    // Mostrar la lista de consolas (consolas.html)
    @GetMapping
    public String verConsolas() {
        return "consolas";  // Cambiado de "index" a "consolas"
    }

    // Mostrar detalle de consola individual
    @GetMapping("/{consola}")
    public String detalleConsola(@PathVariable String consola, Model model) {
        switch (consola) {
            case "nintendo-switch":
                model.addAttribute("nombre", "Nintendo Switch 2");
                model.addAttribute("juegos", List.of("The Legend of Zelda: Breath of the Wild", "Mario Kart 8 Deluxe", "Animal Crossing: New Horizons"));
                model.addAttribute("accesorios", List.of("Control Pro", "Dock HDMI", "Cargador portátil"));
                model.addAttribute("info", "La Nintendo Switch es una consola híbrida desarrollada por Nintendo, que combina juegos en casa y portátil.");
                model.addAttribute("enlaceOficial", "https://www.nintendo.com/switch/");
                break;
            case "playstation-5":
                model.addAttribute("nombre", "PlayStation 5");
                model.addAttribute("juegos", List.of("Spider-Man: Miles Morales", "Demon's Souls", "Ratchet & Clank: Rift Apart"));
                model.addAttribute("accesorios", List.of("Control DualSense", "Cámara HD", "Audífonos Pulse 3D"));
                model.addAttribute("info", "PlayStation 5 es la consola de nueva generación de Sony, con gráficos avanzados y rápido SSD.");
                model.addAttribute("enlaceOficial", "https://www.playstation.com/ps5/");
                break;
            case "xbox-series-x":
                model.addAttribute("nombre", "Xbox Series X");
                model.addAttribute("juegos", List.of("Halo Infinite", "Forza Horizon 5", "Gears 5"));
                model.addAttribute("accesorios", List.of("Control inalámbrico Xbox", "Auriculares Xbox", "Soporte de carga"));
                model.addAttribute("info", "Xbox Series X es la consola más potente de Microsoft, enfocada en rendimiento y retrocompatibilidad.");
                model.addAttribute("enlaceOficial", "https://www.xbox.com/consoles/xbox-series-x");
                break;
            default:
                return "redirect:/consolas";
        }
        return "detalle-consola";  
    }
}
