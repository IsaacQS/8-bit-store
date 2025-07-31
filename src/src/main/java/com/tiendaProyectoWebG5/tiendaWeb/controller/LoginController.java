package com.tiendaProyectoWebG5.tiendaWeb.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String mostrarLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String procesarLogin(@RequestParam String username, @RequestParam String password, HttpSession session) {
        if ("admin".equals(username) && "1234".equals(password)) {
            session.setAttribute("usuario", username);
            return "redirect:/"; // Página principal
        } else {
            return "redirect:/login?error=true";
        }
    }

}
