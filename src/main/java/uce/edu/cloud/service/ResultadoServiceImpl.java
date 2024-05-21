package uce.edu.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.cloud.model.Resultado;
import uce.edu.cloud.repository.IResultadoRepo;

@Service
public class ResultadoServiceImpl implements IResultadoService {

    @Autowired
    private IResultadoRepo resultadoRepo;

    @Override
    public Resultado consultarPorId(Integer id) {
        return this.resultadoRepo.consultarPorId(id);
    }

    @Override
    public void insertarResultadoService(Resultado resultado) {
        this.resultadoRepo.insertarResultado(resultado);
    }

    @Override
    public void actualizarResultadoService(Resultado resultado) {
        this.resultadoRepo.actualizarResultado(resultado);
    }

    @Override
    public void eliminarResultadoService(Integer id) {
        this.resultadoRepo.eliminarResultado(id);
    }
}