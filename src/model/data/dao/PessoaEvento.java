package model.data.dao;

import model.data.business.Permissao;
import java.io.Serializable;

import model.data.business.Evento;
import model.data.business.Pessoa;

public class PessoaEvento implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long pessoaEventoId;
    private Pessoa pessoa;
    private Evento evento;
    private Permissao tipoPermissao;
    private String situacaoPagamento;
    private Boolean isResponsavel;

    public Long getPessoaEventoId() {
        return pessoaEventoId;
    }

    public void setPessoaEventoId(Long pessoaEventoId) {
        this.pessoaEventoId = pessoaEventoId;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Permissao getTipoPermissao() {
        return tipoPermissao;
    }

    public void setTipoPermissao(Permissao tipoPermissao) {
        this.tipoPermissao = tipoPermissao;
    }

    public String getSituacaoPagamento() {
        return situacaoPagamento;
    }

    public void setSituacaoPagamento(String situacaoPagamento) {
        this.situacaoPagamento = situacaoPagamento;
    }

    public Boolean getIsResponsavel() {
        return isResponsavel;
    }

    public void setIsResponsavel(Boolean isResponsavel) {
        this.isResponsavel = isResponsavel;
    }
}
