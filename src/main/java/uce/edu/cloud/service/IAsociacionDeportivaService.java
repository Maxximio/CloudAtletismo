package uce.edu.cloud.service;

import uce.edu.cloud.model.AsociacionDeportiva;

public interface IAsociacionDeportivaService {
    AsociacionDeportiva consultarPorId(Integer id);
    void insertarAsociacionDeportivaService(AsociacionDeportiva asociacionDeportiva);
    void actualizarAsociacionDeportivaService(AsociacionDeportiva asociacionDeportiva);
    void eliminarAsociacionDeportivaService(Integer id);
}