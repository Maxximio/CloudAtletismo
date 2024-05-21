package uce.edu.cloud.service;

import uce.edu.cloud.model.Resultado;

public interface IResultadoService {
    Resultado consultarPorId(Integer id);
    void insertarResultadoService(Resultado resultado);
    void actualizarResultadoService(Resultado resultado);
    void eliminarResultadoService(Integer id);
}
