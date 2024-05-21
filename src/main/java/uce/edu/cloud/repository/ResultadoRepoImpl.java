package uce.edu.cloud.repository;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.cloud.model.Resultado;

@Repository
@Transactional
public class ResultadoRepoImpl implements IResultadoRepo {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Resultado consultarPorId(Integer id) {
        TypedQuery<Resultado> myQuery = this.em.createQuery("SELECT r FROM Resultado r WHERE r.id = :id", Resultado.class);
        myQuery.setParameter("id", id);
        return myQuery.getSingleResult();
    }

    @Override
    public void insertarResultado(Resultado resultado) {
        this.em.persist(resultado);
    }

    @Override
    public void actualizarResultado(Resultado resultado) {
        this.em.merge(resultado);
    }

    @Override
    public void eliminarResultado(Integer id) {
        Resultado resultadoBorrado = this.consultarPorId(id);
        this.em.remove(resultadoBorrado);
    }
}