package edu.ifce.sgaa.pessoa.model;

public class DocumentoSaude extends Documento {  /// fazer no pessoa acolhida
    private String identificao;



    public DocumentoSaude(String numero, String identificao){
        super(numero);
        this.identificao = identificao;
    }
    public String getIdentificao() {

        return identificao;
    }
    public void setIdentificao(String identificao) {

        this.identificao = identificao;
    }
}


