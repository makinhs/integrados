package model.data.business;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long eventoId;
    private String nome;
    private String descricao;
    private Integer numeroParticipantes;
    private BigDecimal preco;
    private String localRua;
    private String localBairro;
    private Integer localNumero;
    private String localCidade;
    private String localUf;
    private List<EventoData> listaHorarios;

    public Long getEventoId() {
        return eventoId;
    }

    public void setEventoId(Long eventoId) {
        this.eventoId = eventoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(Integer numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getLocalRua() {
        return localRua;
    }

    public void setLocalRua(String localRua) {
        this.localRua = localRua;
    }

    public String getLocalBairro() {
        return localBairro;
    }

    public void setLocalBairro(String localBairro) {
        this.localBairro = localBairro;
    }

    public Integer getLocalNumero() {
        return localNumero;
    }

    public void setLocalNumero(Integer localNumero) {
        this.localNumero = localNumero;
    }

    public String getLocalCidade() {
        return localCidade;
    }

    public void setLocalCidade(String localCidade) {
        this.localCidade = localCidade;
    }

    public String getLocalUf() {
        return localUf;
    }

    public void setLocalUf(String localUf) {
        this.localUf = localUf;
    }

    public List<EventoData> getListaHorarios() {
        return listaHorarios;
    }

    public void setListaHorarios(List<EventoData> listaHorarios) {
        this.listaHorarios = listaHorarios;
    }
}
