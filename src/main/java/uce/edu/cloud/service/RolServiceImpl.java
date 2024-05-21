package uce.edu.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.cloud.model.Rol;
import uce.edu.cloud.repository.IRolRepo;

@Service
public class RolServiceImpl implements IRolService {

    @Autowired
    private IRolRepo rolRepo;

    @Override
    public Rol consultarPorId(Integer id) {
        return this.rolRepo.consultarPorId(id);
    }

    @Override
    public void insertarRolService(Rol rol) {
        this.rolRepo.insertarRol(rol);
    }

    @Override
    public void actualizarRolService(Rol rol) {
        this.rolRepo.actualizarRol(rol);
    }

    @Override
    public void eliminarRolService(Integer id) {
        this.rolRepo.eliminarRol(id);
    }
}
