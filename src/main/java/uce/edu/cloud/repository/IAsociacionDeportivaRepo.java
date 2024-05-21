package uce.edu.cloud.repository;

import uce.edu.cloud.model.AsociacionDeportiva;

public interface IAsociacionDeportivaRepo {
    AsociacionDeportiva consultarPorId(Integer id);
    void insertarAsociacionDeportiva(AsociacionDeportiva asociacionDeportiva);
    void actualizarAsociacionDeportiva(AsociacionDeportiva asociacionDeportiva);
    void eliminarAsociacionDeportiva(Integer id);
}