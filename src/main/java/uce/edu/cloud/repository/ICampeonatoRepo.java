package uce.edu.cloud.repository;

import uce.edu.cloud.model.Campeonato;

public interface ICampeonatoRepo {
    Campeonato consultarPorId(Integer id);
    void insertarCampeonato(Campeonato campeonato);
    void actualizarCampeonato(Campeonato campeonato);
    void eliminarCampeonato(Integer id);
}