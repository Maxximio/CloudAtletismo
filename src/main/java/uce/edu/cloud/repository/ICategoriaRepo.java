package uce.edu.cloud.repository;

import uce.edu.cloud.model.Categoria;

public interface ICategoriaRepo {
    Categoria consultarPorId(Integer id);
    void insertarCategoria(Categoria categoria);
    void actualizarCategoria(Categoria categoria);
    void eliminarCategoria(Integer id);
}