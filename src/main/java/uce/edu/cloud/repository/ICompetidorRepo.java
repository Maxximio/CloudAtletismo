package uce.edu.cloud.repository;

import uce.edu.cloud.model.Competidor;

public interface ICompetidorRepo {
    Competidor consultarPorId(Integer id);
    void insertarCompetidor(Competidor competidor);
    void actualizarCompetidor(Competidor competidor);
    void eliminarCompetidor(Integer id);
}