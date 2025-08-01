package com.tiendaProyectoWebG5.tiendaWeb;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiendaProyectoWebG5.tiendaWeb.ProductoRepository;
import com.tiendaProyectoWebG5.tiendaWeb.producto;

@Service
public class productoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<producto> listarProductos() {
        return productoRepository.findAll();
    }

    public producto guardar(producto producto) {
        return productoRepository.save(producto);
    }

    public Optional<producto> obtenerPorId(Long id) {
        return productoRepository.findById(id);
    }

    public void eliminar(Long id) {
        productoRepository.deleteById(id);
    }
}
