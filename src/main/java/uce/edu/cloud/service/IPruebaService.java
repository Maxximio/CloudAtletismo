package uce.edu.cloud.service;

import uce.edu.cloud.model.Prueba;

public interface IPruebaService {
    Prueba consultarPorId(Integer id);
    void insertarPruebaService(Prueba prueba);
    void actualizarPruebaService(Prueba prueba);
    void eliminarPruebaService(Integer id);
}