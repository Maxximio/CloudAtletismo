package uce.edu.cloud.repository;

import uce.edu.cloud.model.Rol;

public interface IRolRepo {
    Rol consultarPorId(Integer id);
    void insertarRol(Rol rol);
    void actualizarRol(Rol rol);
    void eliminarRol(Integer id);
}