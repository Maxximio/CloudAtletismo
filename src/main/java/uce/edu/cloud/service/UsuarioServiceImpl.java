package uce.edu.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.cloud.model.Usuario;
import uce.edu.cloud.repository.IUsuarioRepo;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioRepo usuarioRepo;

    @Override
    public Usuario consultarPorId(Integer id) {
        return this.usuarioRepo.consultarPorId(id);
    }

    @Override
    public void insertarUsuarioService(Usuario usuario) {
        this.usuarioRepo.insertarUsuario(usuario);
    }

    @Override
    public void actualizarUsuarioService(Usuario usuario) {
        this.usuarioRepo.actualizarUsuario(usuario);
    }

    @Override
    public void eliminarUsuarioService(Integer id) {
        this.usuarioRepo.eliminarUsuario(id);
    }
}