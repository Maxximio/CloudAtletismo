package uce.edu.cloud.repository;

import uce.edu.cloud.model.PrecioInscripcion;

public interface IPrecioInscripcionRepo {
    PrecioInscripcion consultarPorId(Integer id);
    void insertarPrecioInscripcion(PrecioInscripcion precioInscripcion);
    void actualizarPrecioInscripcion(PrecioInscripcion precioInscripcion);
    void eliminarPrecioInscripcion(Integer id);
}
