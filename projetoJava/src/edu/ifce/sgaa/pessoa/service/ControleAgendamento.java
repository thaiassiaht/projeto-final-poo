package edu.ifce.sgaa.pessoa.service;

import edu.ifce.sgaa.infra.repository.RepositorioGenerico;
import edu.ifce.sgaa.pessoa.model.Agendamento;
import edu.ifce.sgaa.pessoa.model.PessoaAcolhida;
import java.util.ArrayList;

public class ControleAgendamento {

    RepositorioGenerico<Agendamento> repositorioAgendamento = new RepositorioGenerico<>();
    public void agendarAtendimento(Agendamento agendamento){
        System.out.println("Agendando atendimento");
        repositorioAgendamento.salvar(agendamento.getIdAgendamento(), agendamento);
        System.out.println("Agendamento salvo com sucesso.");


    }
}
