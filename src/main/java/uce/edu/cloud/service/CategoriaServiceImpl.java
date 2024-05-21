package uce.edu.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.cloud.model.Categoria;
import uce.edu.cloud.repository.ICategoriaRepo;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

    @Autowired
    private ICategoriaRepo categoriaRepo;

    @Override
    public Categoria consultarPorId(Integer id) {
        return this.categoriaRepo.consultarPorId(id);
    }

    @Override
    public void insertarCategoriaService(Categoria categoria) {
        this.categoriaRepo.insertarCategoria(categoria);
    }

    @Override
    public void actualizarCategoriaService(Categoria categoria) {
        this.categoriaRepo.actualizarCategoria(categoria);
    }

    @Override
    public void eliminarCategoriaService(Integer id) {
        this.categoriaRepo.eliminarCategoria(id);
    }
}