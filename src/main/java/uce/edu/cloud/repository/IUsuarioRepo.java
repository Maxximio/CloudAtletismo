package uce.edu.cloud.repository;

import uce.edu.cloud.model.Usuario;

public interface IUsuarioRepo {
    Usuario consultarPorId(Integer id);
    void insertarUsuario(Usuario usuario);
    void actualizarUsuario(Usuario usuario);
    void eliminarUsuario(Integer id);
}