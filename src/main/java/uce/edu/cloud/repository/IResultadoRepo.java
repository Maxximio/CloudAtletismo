package uce.edu.cloud.repository;

import uce.edu.cloud.model.Resultado;

public interface IResultadoRepo {
    Resultado consultarPorId(Integer id);
    void insertarResultado(Resultado resultado);
    void actualizarResultado(Resultado resultado);
    void eliminarResultado(Integer id);
}