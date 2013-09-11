package model.data.business;

import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tbl_pessoa_evento")
@AssociationOverrides({ @AssociationOverride(name = "pk.pessoa", joinColumns = @JoinColumn(name = "id_pessoa")),
        @AssociationOverride(name = "pk.evento", joinColumns = @JoinColumn(name = "id_evento")) })
public class PessoaEvento implements Serializable {

    private static final long serialVersionUID = 1L;

    // @Id
    // @GeneratedValue
    // @Column(name="id_pessoa_evento")
    // private Long pessoaEventoId;

    @EmbeddedId
    private PessoaEventoId pk = new PessoaEventoId();

    @Transient
    private Pessoa pessoa;

    @Transient
    private Evento evento;

    @ManyToOne
    @JoinColumn(name = "id_permissao")
    private Permissao tipoPermissao;

    @Column(name = "situacao_pagamento", length = 40, nullable = false)
    private String situacaoPagamento;

    @Column(name = "is_responsavel")
    private Boolean isResponsavel;

    public PessoaEventoId getPk() {
        return pk;
    }

    public void setPk(PessoaEventoId pk) {
        this.pk = pk;
    }

    public Pessoa getPessoa() {
        return this.getPk().getPessoa();
    }

    public void setPessoa(Pessoa pessoa) {
        this.getPk().setPessoa(pessoa);
    }

    public Evento getEvento() {
        return this.getPk().getEvento();
    }

    public void setEvento(Evento evento) {
        this.getPk().setEvento(evento);
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

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        PessoaEvento that = (PessoaEvento) o;

        if (getPk() != null ? !getPk().equals(that.getPk()) : that.getPk() != null)
            return false;

        return true;
    }

    public int hashCode() {
        return (getPk() != null ? getPk().hashCode() : 0);
    }

}
