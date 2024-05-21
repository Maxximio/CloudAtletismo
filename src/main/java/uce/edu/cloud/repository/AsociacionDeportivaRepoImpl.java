package uce.edu.cloud.repository;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.cloud.model.AsociacionDeportiva;

@Repository
@Transactional
public class AsociacionDeportivaRepoImpl implements IAsociacionDeportivaRepo {

    @PersistenceContext
    private EntityManager em;

    @Override
    public AsociacionDeportiva consultarPorId(Integer id) {
        TypedQuery<AsociacionDeportiva> myQuery = this.em.createQuery("SELECT a FROM AsociacionDeportiva a WHERE a.id = :id", AsociacionDeportiva.class);
        myQuery.setParameter("id", id);
        return myQuery.getSingleResult();
    }

    @Override
    public void insertarAsociacionDeportiva(AsociacionDeportiva asociacionDeportiva) {
        this.em.persist(asociacionDeportiva);
    }

    @Override
    public void actualizarAsociacionDeportiva(AsociacionDeportiva asociacionDeportiva) {
        this.em.merge(asociacionDeportiva);
    }

    @Override
    public void eliminarAsociacionDeportiva(Integer id) {
        AsociacionDeportiva asociacionBorrada = this.consultarPorId(id);
        this.em.remove(asociacionBorrada);
    }
}