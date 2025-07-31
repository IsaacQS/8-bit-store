
package com.tiendaProyectoWebG5.tiendaWeb.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class carritoController {

    @GetMapping("/carrito")
    public String mostrarCarrito(Model model) {
        List<producto> productos = Arrays.asList(
            new producto(1L, "Nintendo Switch", 299.99, "https://www.muycomputer.com/wp-content/uploads/2025/03/Nintendo-Switch-2-2-1-1000x600.jpg"),
            new producto(2L, "PlayStation 5", 499.99, "https://media.wired.com/photos/65e886e2d5fa593b511ea02a/1:1/w_2000,h_2000,c_limit/ps5.jpg"),
            new producto(3L, "Xbox Series X", 449.99, "https://cdn.mos.cms.futurecdn.net/v2/t:0,l:240,cw:1440,ch:1080,q:80,w:1440/73sXr4f93ux2KTVhFjWJFV.jpg")
        );

        model.addAttribute("productos", productos);
        return "carrito"; //
    }
}
