package com.CordyTech.cl.Puerto.controller;

import com.CordyTech.cl.Puerto.model.Puerto;
import com.CordyTech.cl.Puerto.service.PuertoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/puertos")
public class PuertoController {

    @Autowired
    private PuertoService puertoService;

    @GetMapping
    public List<Puerto> listar() {
        return puertoService.listarPuertos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Puerto> obtenerPorId(@PathVariable int id) {
        return puertoService.obtenerPuertoPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Puerto guardar(@RequestBody Puerto puerto) {
        return puertoService.guardarPuerto(puerto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable int id) {
        puertoService.eliminarPuerto(id);
        return ResponseEntity.noContent().build();
    }
}