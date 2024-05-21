package uce.edu.cloud.repository;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.cloud.model.PrecioInscripcion;

@Repository
@Transactional
public class PrecioInscripcionRepoImpl implements IPrecioInscripcionRepo {

    @PersistenceContext
    private EntityManager em;

    @Override
    public PrecioInscripcion consultarPorId(Integer id) {
        TypedQuery<PrecioInscripcion> myQuery = this.em.createQuery("SELECT p FROM PrecioInscripcion p WHERE p.id = :id", PrecioInscripcion.class);
        myQuery.setParameter("id", id);
        return myQuery.getSingleResult();
    }

    @Override
    public void insertarPrecioInscripcion(PrecioInscripcion precioInscripcion) {
        this.em.persist(precioInscripcion);
    }

    @Override
    public void actualizarPrecioInscripcion(PrecioInscripcion precioInscripcion) {
        this.em.merge(precioInscripcion);
    }

    @Override
    public void eliminarPrecioInscripcion(Integer id) {
        PrecioInscripcion precioInscripcionBorrado = this.consultarPorId(id);
        this.em.remove(precioInscripcionBorrado);
    }
}