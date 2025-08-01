package com.tiendaProyectoWebG5.tiendaWeb.controller;

import com.tiendaProyectoWebG5.tiendaWeb.producto;
import com.tiendaProyectoWebG5.tiendaWeb.productoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/productos")
public class productoRestController {

    @Autowired
    private productoService productoService;

    @GetMapping
    public List<producto> listar() {
        return productoService.listarProductos();
    }

    @PostMapping
    public producto guardar(@RequestBody producto producto) {
        return productoService.guardar(producto);
    }

    @GetMapping("/{id}")
    public Optional<producto> obtenerPorId(@PathVariable Long id) {
        return productoService.obtenerPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        productoService.eliminar(id);
    }
}
