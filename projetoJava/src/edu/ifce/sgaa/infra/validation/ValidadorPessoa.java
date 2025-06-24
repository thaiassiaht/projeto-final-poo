package edu.ifce.sgaa.infra.validation;

import edu.ifce.sgaa.pessoa.model.PessoaAcolhida;

import java.time.LocalDate;
import java.time.Period;

public class ValidadorPessoa implements Validador<PessoaAcolhida> {
    @Override
    public boolean validar(PessoaAcolhida pessoa) {
        if (pessoa.getNome() == null || pessoa.getNome().trim().isEmpty()) {
            return false;
        }

        if (pessoa.getDataNascimento() == null ||
                pessoa.getDataNascimento().isAfter(LocalDate.now())) {
            return false;
        }

        return Period.between(pessoa.getDataNascimento(), LocalDate.now()).getYears() >= 18;
    }

    @Override
    public String getMensagemErro() {
        return "Pessoa inválida: verifique nome, data de nascimento e idade mínima (18 anos)";
    }
}