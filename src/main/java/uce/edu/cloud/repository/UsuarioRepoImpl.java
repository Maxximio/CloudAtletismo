package uce.edu.cloud.repository;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.cloud.model.Usuario;

@Repository
@Transactional
public class UsuarioRepoImpl implements IUsuarioRepo {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Usuario consultarPorId(Integer id) {
        TypedQuery<Usuario> myQuery = this.em.createQuery("SELECT u FROM Usuario u WHERE u.id = :id", Usuario.class);
        myQuery.setParameter("id", id);
        return myQuery.getSingleResult();
    }

    @Override
    public void insertarUsuario(Usuario usuario) {
        this.em.persist(usuario);
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        this.em.merge(usuario);
    }

    @Override
    public void eliminarUsuario(Integer id) {
        Usuario usuarioBorrado = this.consultarPorId(id);
        this.em.remove(usuarioBorrado);
    }
}