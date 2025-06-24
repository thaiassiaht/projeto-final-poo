package edu.ifce.sgaa.infra.repository;

public interface Filtro<T> {
    boolean testar(T entidade);
}