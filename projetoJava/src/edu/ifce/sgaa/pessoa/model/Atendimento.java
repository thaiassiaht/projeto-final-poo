package edu.ifce.sgaa.pessoa.model;

import edu.ifce.sgaa.infra.util.GeradorID;
import edu.ifce.sgaa.pessoa.enums.GravidadeAtendimento;
import edu.ifce.sgaa.pessoa.enums.TipoAtendimento;
import edu.ifce.sgaa.pessoa.model.PessoaAcolhida;
import java.time.LocalDate;

public class Atendimento {
    private String IDAtendimento;
    private String IDpessoa;
    private String IDprofissional;
    private TipoAtendimento tipoAtendimento;
    private GravidadeAtendimento gravidadeAtendimento;
    private LocalDate data;


    public Atendimento(String IDpessoa, String IDprofissional, TipoAtendimento tipoAtendimento, LocalDate data, String IDAtendimento){
        this.IDpessoa = IDpessoa; //gera ID aqui?
        this.IDAtendimento = GeradorID.novoIDCurto();
        this.IDprofissional = GeradorID.novoIDCurto();
        this.tipoAtendimento = tipoAtendimento;
        this.data = data;
    }
    public String getIDpessoa(){
        return IDpessoa;
    }
    public void setIDpessoa(String IDpessoa){
        this.IDpessoa = IDpessoa;
    }
    public String getIDprofissional(){
        return IDprofissional;
    }
    public void setIDprofissional(String IDprofissional){
        this.IDprofissional = IDprofissional;
    }
    public TipoAtendimento getTipoAtendimento(){
        return tipoAtendimento;
    }
    public void setTipo(TipoAtendimento tipoAtendimento){
        this.tipoAtendimento = tipoAtendimento;
    }

    public String getIDAtendimento() {
        return IDAtendimento;
    }
    public void setIDAtendimento(String IDAtendimento) {
        this.IDAtendimento = IDAtendimento;
    }
}
