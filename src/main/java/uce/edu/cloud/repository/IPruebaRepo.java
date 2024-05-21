package uce.edu.cloud.repository;

import uce.edu.cloud.model.Prueba;

public interface IPruebaRepo {
    Prueba consultarPorId(Integer id);
    void insertarPrueba(Prueba prueba);
    void actualizarPrueba(Prueba prueba);
    void eliminarPrueba(Integer id);
}