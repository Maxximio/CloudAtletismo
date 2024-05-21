package uce.edu.cloud.service;

import uce.edu.cloud.model.Campeonato;

public interface ICampeonatoService {
    Campeonato consultarPorId(Integer id);
    void insertarCampeonatoService(Campeonato campeonato);
    void actualizarCampeonatoService(Campeonato campeonato);
    void eliminarCampeonatoService(Integer id);
}