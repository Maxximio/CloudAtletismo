package uce.edu.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.cloud.model.AsociacionDeportiva;
import uce.edu.cloud.repository.IAsociacionDeportivaRepo;

@Service
public class AsociacionDeportivaServiceImpl implements IAsociacionDeportivaService {

    @Autowired
    private IAsociacionDeportivaRepo asociacionDeportivaRepo;

    @Override
    public AsociacionDeportiva consultarPorId(Integer id) {
        return this.asociacionDeportivaRepo.consultarPorId(id);
    }

    @Override
    public void insertarAsociacionDeportivaService(AsociacionDeportiva asociacionDeportiva) {
        this.asociacionDeportivaRepo.insertarAsociacionDeportiva(asociacionDeportiva);
    }

    @Override
    public void actualizarAsociacionDeportivaService(AsociacionDeportiva asociacionDeportiva) {
        this.asociacionDeportivaRepo.actualizarAsociacionDeportiva(asociacionDeportiva);
    }

    @Override
    public void eliminarAsociacionDeportivaService(Integer id) {
        this.asociacionDeportivaRepo.eliminarAsociacionDeportiva(id);
    }
}