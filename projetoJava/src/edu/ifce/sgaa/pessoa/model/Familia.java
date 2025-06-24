package edu.ifce.sgaa.pessoa.model;

public class Familia {
    private String nomeResponsavel;
    private String situacaoFamilia;
    private String contato;


    public Familia(String nomeResponsavel, String situacaoFamilia, String contato){
        this.nomeResponsavel = nomeResponsavel;
        this.situacaoFamilia = situacaoFamilia;
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Responsável: " + nomeResponsavel +
                ", Situação: " + situacaoFamilia +
                ", Contato: " + contato;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }
    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }
    public String getSituacaoFamilia() {
        return situacaoFamilia;
    }
    public void setSituacaoFamilia(String situacaoFamilia) {
        this.situacaoFamilia = situacaoFamilia;
    }
    public String getContato() {
        return contato;
    }
    public void setContato(String contato) {
        this.contato = contato;
    }

}

