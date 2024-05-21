package uce.edu.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.cloud.model.CalendarioCompetencia;
import uce.edu.cloud.repository.ICalendarioCompetenciaRepo;

@Service
public class CalendarioCompetenciaServiceImpl implements ICalendarioCompetenciaService {

    @Autowired
    private ICalendarioCompetenciaRepo calendarioCompetenciaRepo;

    @Override
    public CalendarioCompetencia consultarPorId(Integer id) {
        return this.calendarioCompetenciaRepo.consultarPorId(id);
    }

    @Override
    public void insertarCalendarioCompetenciaService(CalendarioCompetencia calendarioCompetencia) {
        this.calendarioCompetenciaRepo.insertarCalendarioCompetencia(calendarioCompetencia);
    }

    @Override
    public void actualizarCalendarioCompetenciaService(CalendarioCompetencia calendarioCompetencia) {
        this.calendarioCompetenciaRepo.actualizarCalendarioCompetencia(calendarioCompetencia);
    }

    @Override
    public void eliminarCalendarioCompetenciaService(Integer id) {
        this.calendarioCompetenciaRepo.eliminarCalendarioCompetencia(id);
    }
}