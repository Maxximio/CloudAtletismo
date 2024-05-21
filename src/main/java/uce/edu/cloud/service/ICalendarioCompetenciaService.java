package uce.edu.cloud.service;

import uce.edu.cloud.model.CalendarioCompetencia;

public interface ICalendarioCompetenciaService {
    CalendarioCompetencia consultarPorId(Integer id);
    void insertarCalendarioCompetenciaService(CalendarioCompetencia calendarioCompetencia);
    void actualizarCalendarioCompetenciaService(CalendarioCompetencia calendarioCompetencia);
    void eliminarCalendarioCompetenciaService(Integer id);
}
