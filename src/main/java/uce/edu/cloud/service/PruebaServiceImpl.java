package uce.edu.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.cloud.model.Prueba;
import uce.edu.cloud.repository.IPruebaRepo;

@Service
public class PruebaServiceImpl implements IPruebaService {

    @Autowired
    private IPruebaRepo pruebaRepo;

    @Override
    public Prueba consultarPorId(Integer id) {
        return this.pruebaRepo.consultarPorId(id);
    }

    @Override
    public void insertarPruebaService(Prueba prueba) {
        this.pruebaRepo.insertarPrueba(prueba);
    }

    @Override
    public void actualizarPruebaService(Prueba prueba) {
        this.pruebaRepo.actualizarPrueba(prueba);
    }

    @Override
    public void eliminarPruebaService(Integer id) {
        this.pruebaRepo.eliminarPrueba(id);
    }
}
