package edu.ifce.sgaa.infra.repository;

public interface RepositorioEscrita<T> {
    void salvar(String id, T entidade);
    void remover(String id);
}