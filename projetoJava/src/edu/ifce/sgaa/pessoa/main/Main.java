package edu.ifce.sgaa.pessoa.main;

import edu.ifce.sgaa.pessoa.enums.Genero;
import edu.ifce.sgaa.pessoa.enums.TipoAtendimento;
import edu.ifce.sgaa.pessoa.model.*;
import edu.ifce.sgaa.pessoa.model.Familia;
import edu.ifce.sgaa.pessoa.service.ControleAgendamento;
import edu.ifce.sgaa.pessoa.service.ControlePessoaAcolhida;
import edu.ifce.sgaa.pessoa.model.PessoaAcolhida;
import edu.ifce.sgaa.pessoa.model.HistoricoAcolhimento;
import edu.ifce.sgaa.pessoa.service.ControleAtendimento;
import edu.ifce.sgaa.pessoa.model.Atendimento;
import edu.ifce.sgaa.pessoa.model.Agendamento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando documentos
        DocumentoIdentificacao rg = new DocumentoIdentificacao("123456789", "RG");
        DocumentoIdentificacao cpf = new DocumentoIdentificacao("987654321", "cpf");

        List<DocumentoIdentificacao> documentosIdentificacao = new ArrayList<>();
        documentosIdentificacao.add(rg);
        documentosIdentificacao.add(cpf);

        // Criando histórico de acolhimento
        HistoricoAcolhimento hist1 = new HistoricoAcolhimento(
                LocalDate.of(2023, 1, 10),
                LocalDate.of(2023, 6, 15),
                "Primeiro acolhimento, sem intercorrências"
        );

        HistoricoAcolhimento hist2 = new HistoricoAcolhimento(
                LocalDate.of(2024, 2, 5),
                null,
                "Acolhido atualmente em abrigo"
        );

        List<HistoricoAcolhimento> historico = new ArrayList<>();
        historico.add(hist1);
        historico.add(hist2);

        // Simulando uma família

        Familia familia = new Familia(
                "Ana Paula Oliveira",
                "Pais presentes, com acompanhamento do CRAS",
                "(88) 99999-0000"
        );

        // Criando pessoa acolhida
        PessoaAcolhida pessoa = new PessoaAcolhida(
                "Maria Oliveira",
                LocalDate.of(2011, 3, 18),
                Genero.FEMININO,
                documentosIdentificacao,
                historico,
                familia
        );

        Atendimento atendimento = new Atendimento(
                pessoa.getId(),
                "12323",
                TipoAtendimento.MEDICO,
                LocalDate.of(2011, 3, 18),
                "25522"
        );

        Agendamento agendamento = new Agendamento(
                atendimento.getIDAtendimento(),
                "254126",
                LocalDate.of(2011, 3, 18)
                );

        // testando por ID


        ControlePessoaAcolhida controleP = new ControlePessoaAcolhida();
        controleP.cadastrarPessoa(pessoa);
        controleP.buscarPorId(pessoa.getId());

        //historico e doc
        controleP.buscarDocumentosPorPessoa(pessoa.getId());
        controleP.buscarHistoricoPorPessoa(pessoa.getId());


        // cadastro e atendimento
        ControleAtendimento controle = new ControleAtendimento();
        controle.cadastrarAtendimento(atendimento);


        ControleAgendamento controleA = new ControleAgendamento();
        controleA.agendarAtendimento(agendamento);





        System.out.println("\nFamília: " + pessoa.getFamilia());
    }


   
}


