package uce.edu.cloud.service;

import uce.edu.cloud.model.PrecioInscripcion;

public interface IPrecioInscripcionService {
    PrecioInscripcion consultarPorId(Integer id);
    void insertarPrecioInscripcionService(PrecioInscripcion precioInscripcion);
    void actualizarPrecioInscripcionService(PrecioInscripcion precioInscripcion);
    void eliminarPrecioInscripcionService(Integer id);
}