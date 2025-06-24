package edu.ifce.sgaa.infra.validation;

import edu.ifce.sgaa.infra.validation.enums.TipoCampo;
import java.util.regex.Pattern;

public class ValidadorCampos implements Validador<String> {
    private final TipoCampo tipo;

    public ValidadorCampos(TipoCampo tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean validar(String valor) {
        if (valor == null || valor.trim().isEmpty()) return false;

        return switch (tipo) {
            case CPF -> validarCPF(valor);
            case EMAIL -> validarEmail(valor);
            case TELEFONE -> validarTelefone(valor);
        };
    }

    private boolean validarCPF(String cpf) {
        String cpfLimpo = cpf.replaceAll("[^0-9]", "");
        return cpfLimpo.length() == 11 && !cpfLimpo.matches("(\\d)\\1{10}");
    }

    private boolean validarEmail(String email) {
        return Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")
                .matcher(email).matches();
    }

    private boolean validarTelefone(String telefone) {
        String telLimpo = telefone.replaceAll("[^0-9]", "");
        return telLimpo.length() >= 10 && telLimpo.length() <= 11;
    }

    @Override
    public String getMensagemErro() {
        return switch (tipo) {
            case CPF -> "CPF inválido (deve ter 11 dígitos)";
            case EMAIL -> "Email inválido (formato: usuario@dominio)";
            case TELEFONE -> "Telefone inválido (10 ou 11 dígitos)";
        };
    }
}