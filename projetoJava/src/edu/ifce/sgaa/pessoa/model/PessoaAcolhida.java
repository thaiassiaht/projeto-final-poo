package edu.ifce.sgaa.pessoa.model;

import edu.ifce.sgaa.pessoa.enums.Genero;
import edu.ifce.sgaa.infra.util.GeradorID;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class PessoaAcolhida {
    private String id;
    private String nome;
    private LocalDate dataNascimento;
    private Genero genero;
    private String condicoesSaude;
    private List<DocumentoIdentificacao> documentoIdentificacao;
    private List<HistoricoAcolhimento> historicoAcolhimento;
    private Familia familia;


    public PessoaAcolhida(String nome, LocalDate dataNascimento, Genero genero, List<DocumentoIdentificacao> documentoIdentificacao, List<HistoricoAcolhimento> historicoAcolhimento, Familia familia) {
        this.id = GeradorID.novoIDCurto();
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.documentoIdentificacao = documentoIdentificacao;
        this.historicoAcolhimento = historicoAcolhimento;
        this.familia = familia;
    }
    public PessoaAcolhida(String nome, LocalDate dataNascimento, Genero genero) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.condicoesSaude = null;
        this.id = GeradorID.novoIDCurto();
        this.familia = null;
        this.documentoIdentificacao = new ArrayList<>();
        this.historicoAcolhimento = new ArrayList<>();
    }


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public String getCondicoesSaude() {
        return condicoesSaude;
    }
    public void setCondicoesSaude(String condicoesSaude) {
        this.condicoesSaude = condicoesSaude;
    }

    public List<DocumentoIdentificacao> getDocumentoIdentificacao() {
        return documentoIdentificacao;
    }
    public void setDocumentoIdentificacao(List<DocumentoIdentificacao> documentoIdentificacao) {
        this.documentoIdentificacao = documentoIdentificacao;
    }
    public List<HistoricoAcolhimento> getHistoricoAcolhimento(){
        return historicoAcolhimento;
    }
    public void setHistoricoAcolhimento(){
        this.historicoAcolhimento = new ArrayList<>();
    }
    public Familia getFamilia() {
        return familia;
    }
    public void setFamilia(Familia familia) {
        this.familia = familia;
    }


}
