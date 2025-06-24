package edu.ifce.sgaa.pessoa.model;

import edu.ifce.sgaa.infra.util.GeradorID;

import java.time.LocalDate;

public class Agendamento {
    private String IdAgendamento;
    private String IDAtendimento;
    private LocalDate dataAgendamento;

    public Agendamento(String id, String IDatendimento, LocalDate dataAgendamento){
        this.IdAgendamento = GeradorID.novoIDCurto();
        this.IDAtendimento = IDatendimento;
        this.dataAgendamento = dataAgendamento;
    }
    public String getIdAgendamento() {
        return IdAgendamento;
    }
    public void setIdAgendamento(String idAgendamento) {
        IdAgendamento = idAgendamento;
    }
    public String getIDAtendimento() {
        return IDAtendimento;
    }
    public void setIDAtendimento(String IDAtendimento) {
        this.IDAtendimento = IDAtendimento;
    }
    public LocalDate getDataAgendamento() {
        return dataAgendamento;
    }
    public void setDataAgendamento(LocalDate dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }
}
