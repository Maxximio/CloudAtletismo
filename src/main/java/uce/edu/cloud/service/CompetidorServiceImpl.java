package uce.edu.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.cloud.model.Competidor;
import uce.edu.cloud.repository.ICompetidorRepo;

@Service
public class CompetidorServiceImpl implements ICompetidorService {

    @Autowired
    private ICompetidorRepo competidorRepo;

    @Override
    public Competidor consultarPorId(Integer id) {
        return this.competidorRepo.consultarPorId(id);
    }

    @Override
    public void insertarCompetidorService(Competidor competidor) {
        this.competidorRepo.insertarCompetidor(competidor);
    }

    @Override
    public void actualizarCompetidorService(Competidor competidor) {
        this.competidorRepo.actualizarCompetidor(competidor);
    }

    @Override
    public void eliminarCompetidorService(Integer id) {
        this.competidorRepo.eliminarCompetidor(id);
    }
}
