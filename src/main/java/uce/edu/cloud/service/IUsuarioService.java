package uce.edu.cloud.service;

import uce.edu.cloud.model.Usuario;

public interface IUsuarioService {
    Usuario consultarPorId(Integer id);
    void insertarUsuarioService(Usuario usuario);
    void actualizarUsuarioService(Usuario usuario);
    void eliminarUsuarioService(Integer id);
}