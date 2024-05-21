package uce.edu.cloud.service;

import uce.edu.cloud.model.Competidor;

public interface ICompetidorService {
    Competidor consultarPorId(Integer id);
    void insertarCompetidorService(Competidor competidor);
    void actualizarCompetidorService(Competidor competidor);
    void eliminarCompetidorService(Integer id);
}