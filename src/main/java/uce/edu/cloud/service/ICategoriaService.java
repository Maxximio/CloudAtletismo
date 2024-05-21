package uce.edu.cloud.service;

import uce.edu.cloud.model.Categoria;

public interface ICategoriaService {
    Categoria consultarPorId(Integer id);
    void insertarCategoriaService(Categoria categoria);
    void actualizarCategoriaService(Categoria categoria);
    void eliminarCategoriaService(Integer id);
}