package edu.ifce.sgaa.infra.repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.stream.Collectors;

public class RepositorioGenerico<T> implements RepositorioLeitura<T>, RepositorioEscrita<T> {
    private final Map<String, T> storage = new ConcurrentHashMap<>();

    @Override
    public T buscarPorId(String id) {
        return storage.get(id);
    }

    @Override
    public Map<String, T> listarTodos() {
        return Collections.unmodifiableMap(storage);
    }

    @Override
    public Map<String, T> filtrar(Filtro<T> filtro) {
        return storage.entrySet().stream()
                .filter(entry -> filtro.testar(entry.getValue()))
                .collect(Collectors.toConcurrentMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
    }

    @Override
    public void salvar(String id, T entidade) {
        if (id == null || entidade == null) {
            throw new IllegalArgumentException("ID e entidade não podem ser nulos");
        }
        storage.put(id, entidade);
    }

    @Override
    public void remover(String id) {
        storage.remove(id);
    }
}