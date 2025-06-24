package edu.ifce.sgaa.infra.repository;

import java.util.Map;

public interface RepositorioLeitura<T> {
    T buscarPorId(String id);
    Map<String, T> listarTodos();
    Map<String, T> filtrar(Filtro<T> filtro);
}