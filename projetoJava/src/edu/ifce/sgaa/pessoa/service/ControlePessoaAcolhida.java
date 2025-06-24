package edu.ifce.sgaa.pessoa.service;

import edu.ifce.sgaa.infra.repository.RepositorioGenerico;
import edu.ifce.sgaa.pessoa.model.DocumentoIdentificacao;
import edu.ifce.sgaa.pessoa.model.PessoaAcolhida;
import edu.ifce.sgaa.pessoa.model.Documento;
import edu.ifce.sgaa.pessoa.model.HistoricoAcolhimento;

import java.util.List;
import java.util.ArrayList;

public class ControlePessoaAcolhida {

    RepositorioGenerico<PessoaAcolhida> repositorioPessoa = new RepositorioGenerico<>();

    public void cadastrarPessoa(PessoaAcolhida pessoaAcolhida) {
        repositorioPessoa.salvar(pessoaAcolhida.getId(), pessoaAcolhida);
        System.out.println("Cadastrado com sucesso!");
    }

    public PessoaAcolhida buscarPorId(String id) {
        System.out.println("Buscando pessoa com ID: " + id);
        PessoaAcolhida pessoa = repositorioPessoa.buscarPorId(id);

        if (pessoa != null) {
            System.out.println("Pessoa encontrada: " + pessoa.getNome());
        } else {
            System.out.println("Pessoa não encontrada.");

        }
        return pessoa;
    }

    public void adicionarDocumento(String pessoaId, DocumentoIdentificacao doc) {
        PessoaAcolhida pessoa = repositorioPessoa.buscarPorId(pessoaId);

            pessoa.getDocumentoIdentificacao().add(doc);
            System.out.println("Documento adicionado com sucesso.");
    }

    public void adicionarHistorico(String pessoaId, HistoricoAcolhimento historico) {
        PessoaAcolhida pessoa = repositorioPessoa.buscarPorId(pessoaId);
            pessoa.getHistoricoAcolhimento().add(historico);
            System.out.println("Histórico adicionado com sucesso.");

    }

    public List<Documento> buscarDocumentosPorPessoa(String pessoaId) {
        PessoaAcolhida pessoa = repositorioPessoa.buscarPorId(pessoaId);

        if (pessoa != null) {
            System.out.println("Documentos da pessoa " + pessoa.getNome() + ":");
            for (Documento doc : pessoa.getDocumento()) {
                System.out.println("- " + doc.getTipo() + ": " + doc.getNumero());
            }
            return pessoa.getDocumento();
        } else {
            System.out.println("Pessoa não encontrada.");
            return new ArrayList<>();
        }
    }

    public List<HistoricoAcolhimento> buscarHistoricoPorPessoa(String pessoaId) {
        PessoaAcolhida pessoa = repositorioPessoa.buscarPorId(pessoaId);

        if (pessoa != null) {
            System.out.println("Histórico de acolhimento de " + pessoa.getNome() + ":");
            for (HistoricoAcolhimento h : pessoa.getHistoricoAcolhimento()) {
                System.out.println("- Entrada: " + h.getDataEntrada());
                System.out.println("  Saída: " + (h.getDataSaida() != null ? h.getDataSaida() : "Ainda acolhida"));
                System.out.println("  Observação: " + h.getObservacao());
            }
            return pessoa.getHistoricoAcolhimento();
        } else {
            System.out.println("Pessoa não encontrada.");
            return new ArrayList<>();
        }
    }

}
