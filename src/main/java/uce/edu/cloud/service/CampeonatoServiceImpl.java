package uce.edu.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.cloud.model.Campeonato;
import uce.edu.cloud.repository.ICampeonatoRepo;

@Service
public class CampeonatoServiceImpl implements ICampeonatoService {

    @Autowired
    private ICampeonatoRepo campeonatoRepo;

    @Override
    public Campeonato consultarPorId(Integer id) {
        return this.campeonatoRepo.consultarPorId(id);
    }

    @Override
    public void insertarCampeonatoService(Campeonato campeonato) {
        this.campeonatoRepo.insertarCampeonato(campeonato);
    }

    @Override
    public void actualizarCampeonatoService(Campeonato campeonato) {
        this.campeonatoRepo.actualizarCampeonato(campeonato);
    }

    @Override
    public void eliminarCampeonatoService(Integer id) {
        this.campeonatoRepo.eliminarCampeonato(id);
    }
}
