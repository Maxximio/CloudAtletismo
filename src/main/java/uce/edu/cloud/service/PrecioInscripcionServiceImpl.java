package uce.edu.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.cloud.model.PrecioInscripcion;
import uce.edu.cloud.repository.IPrecioInscripcionRepo;

@Service
public class PrecioInscripcionServiceImpl implements IPrecioInscripcionService {

    @Autowired
    private IPrecioInscripcionRepo precioInscripcionRepo;

    @Override
    public PrecioInscripcion consultarPorId(Integer id) {
        return this.precioInscripcionRepo.consultarPorId(id);
    }

    @Override
    public void insertarPrecioInscripcionService(PrecioInscripcion precioInscripcion) {
        this.precioInscripcionRepo.insertarPrecioInscripcion(precioInscripcion);
    }

    @Override
    public void actualizarPrecioInscripcionService(PrecioInscripcion precioInscripcion) {
        this.precioInscripcionRepo.actualizarPrecioInscripcion(precioInscripcion);
    }

    @Override
    public void eliminarPrecioInscripcionService(Integer id) {
        this.precioInscripcionRepo.eliminarPrecioInscripcion(id);
    }
}
