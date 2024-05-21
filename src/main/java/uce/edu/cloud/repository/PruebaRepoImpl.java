package uce.edu.cloud.repository;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.cloud.model.Prueba;

@Repository
@Transactional
public class PruebaRepoImpl implements IPruebaRepo {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Prueba consultarPorId(Integer id) {
        TypedQuery<Prueba> myQuery = this.em.createQuery("SELECT p FROM Prueba p WHERE p.id = :id", Prueba.class);
        myQuery.setParameter("id", id);
        return myQuery.getSingleResult();
    }

    @Override
    public void insertarPrueba(Prueba prueba) {
        this.em.persist(prueba);
    }

    @Override
    public void actualizarPrueba(Prueba prueba) {
        this.em.merge(prueba);
    }

    @Override
    public void eliminarPrueba(Integer id) {
        Prueba pruebaBorrada = this.consultarPorId(id);
        this.em.remove(pruebaBorrada);
    }
}