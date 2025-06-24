package edu.ifce.sgaa.infra.validation;

public interface Validador<T> {
    boolean validar(T objeto);
    String getMensagemErro();
}