package edu.ifce.sgaa.pessoa.service;
import edu.ifce.sgaa.infra.repository.RepositorioGenerico;
import edu.ifce.sgaa.pessoa.model.Atendimento;
import edu.ifce.sgaa.pessoa.model.Agendamento;
import edu.ifce.sgaa.pessoa.model.PessoaAcolhida;

public class ControleAtendimento {

        RepositorioGenerico<Atendimento> repositorioAtendimento = new RepositorioGenerico<>();
        public void cadastrarAtendimento(Atendimento atendimento){
            System.out.println("\nCadastrando atendimento");
            repositorioAtendimento.salvar(atendimento.getIDAtendimento(), atendimento);
            System.out.println("Atendimento cadastrado com sucesso.");
        }





}
