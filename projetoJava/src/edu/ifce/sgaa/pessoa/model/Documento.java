package edu.ifce.sgaa.pessoa.model;

public abstract class Documento {
    private String numero;


    public Documento(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

}
