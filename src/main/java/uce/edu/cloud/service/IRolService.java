package uce.edu.cloud.service;

import uce.edu.cloud.model.Rol;

public interface IRolService {
    Rol consultarPorId(Integer id);
    void insertarRolService(Rol rol);
    void actualizarRolService(Rol rol);
    void eliminarRolService(Integer id);
}