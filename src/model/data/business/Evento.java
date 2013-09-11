package model.data.business;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_evento")
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id_evento")
    private Long eventoId;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "tbl_evento_data", joinColumns = @JoinColumn(name = "id_evento"), inverseJoinColumns = @JoinColumn(name = "id_data"))
    private List<Data> listaHorarios;

    @Column(name = "nome", length = 50)
    private String nome;

    @Column(name = "descricao", length = 255)
    private String descricao;

    @Column(name = "num_participantes")
    private Integer numeroParticipantes;

    @Column(name = "preco")
    private BigDecimal preco;

    @Column(name = "local_rua")
    private String localRua;

    @Column(name = "local_bairro")
    private String localBairro;

    @Column(name = "local_numero")
    private Integer localNumero;

    @Column(name = "local_cidade")
    private String localCidade;

    @Column(name = "local_uf", length = 2)
    private String localUf;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.evento", cascade = CascadeType.ALL)
    private List<PessoaEvento> listaPessoaEvento = new ArrayList<PessoaEvento>();

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

    public List<Data> getListaHorarios() {
        return listaHorarios;
    }

    public void setListaHorarios(List<Data> listaHorarios) {
        this.listaHorarios = listaHorarios;
    }

    public List<PessoaEvento> getListaPessoaEvento() {
        return listaPessoaEvento;
    }

    public void setListaPessoaEvento(List<PessoaEvento> listaPessoaEvento) {
        this.listaPessoaEvento = listaPessoaEvento;
    }

}
