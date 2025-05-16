package com.CordyTech.cl.Puerto.service;

import com.CordyTech.cl.Puerto.model.Puerto;
import com.CordyTech.cl.Puerto.repository.PuertoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PuertoService {

    @Autowired
    private PuertoRepository puertoRepository;

    public List<Puerto> listarPuertos() {
        return puertoRepository.findAll();
    }

    public Puerto guardarPuerto(Puerto puerto) {
        return puertoRepository.save(puerto);
    }

    public Optional<Puerto> obtenerPuertoPorId(int id) {
        return puertoRepository.findById(id);
    }

    public void eliminarPuerto(int id) {
        puertoRepository.deleteById(id);
    }
}
