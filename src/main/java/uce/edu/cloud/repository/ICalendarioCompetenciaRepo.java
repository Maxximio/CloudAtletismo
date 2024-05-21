package uce.edu.cloud.repository;

import uce.edu.cloud.model.CalendarioCompetencia;

public interface ICalendarioCompetenciaRepo {
    CalendarioCompetencia consultarPorId(Integer id);
    void insertarCalendarioCompetencia(CalendarioCompetencia calendarioCompetencia);
    void actualizarCalendarioCompetencia(CalendarioCompetencia calendarioCompetencia);
    void eliminarCalendarioCompetencia(Integer id);
}