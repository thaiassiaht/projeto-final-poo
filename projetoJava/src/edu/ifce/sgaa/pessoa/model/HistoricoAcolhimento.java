package edu.ifce.sgaa.pessoa.model;

import java.time.LocalDate;

public class HistoricoAcolhimento {
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private String observacao;

     public HistoricoAcolhimento(LocalDate dataEntrada, LocalDate dataSaida, String observacao){
         this.dataEntrada = dataEntrada;
         this.dataSaida = dataSaida;
         this.observacao = observacao;
     }
     public LocalDate getDataEntrada(){
        return this.dataEntrada;
     }
     public void setDataEntrada(LocalDate dataEntrada){
         this.dataEntrada = dataEntrada;
     }
     public LocalDate getDataSaida() {
         return this.dataSaida;
     }
     public void setDataSaida(LocalDate dataSaida){
         this.dataSaida = dataSaida;
     }
     public String getObservacao(){
        return this.observacao;
     }
     public void setObservacao(String observacao){
         this.observacao = observacao;
     }

}
