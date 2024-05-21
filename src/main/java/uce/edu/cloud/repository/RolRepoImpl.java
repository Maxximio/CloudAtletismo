package uce.edu.cloud.repository;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.cloud.model.Rol;

@Repository
@Transactional
public class RolRepoImpl implements IRolRepo {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Rol consultarPorId(Integer id) {
        TypedQuery<Rol> myQuery = this.em.createQuery("SELECT r FROM Rol r WHERE r.id = :id", Rol.class);
        myQuery.setParameter("id", id);
        return myQuery.getSingleResult();
    }

    @Override
    public void insertarRol(Rol rol) {
        this.em.persist(rol);
    }

    @Override
    public void actualizarRol(Rol rol) {
        this.em.merge(rol);
    }

    @Override
    public void eliminarRol(Integer id) {
        Rol rolBorrado = this.consultarPorId(id);
        this.em.remove(rolBorrado);
    }
}