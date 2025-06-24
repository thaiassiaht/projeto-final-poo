package edu.ifce.sgaa.pessoa.model;
import edu.ifce.sgaa.pessoa.model.Documento;

public class DocumentoIdentificacao extends Documento {
    private String identificacao;


    public DocumentoIdentificacao(String numero, String identificacao){
        super(numero);
        this.identificacao = identificacao;
    }
    public String getIdentificacao() {
        return identificacao;
    }
    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
}

