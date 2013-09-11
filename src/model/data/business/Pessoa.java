package model.data.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_pessoa")
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id_pessoa")
	private Long pessoaId;

	@Column(name = "cpf", length = 11, nullable = false, unique = true)
	private String cpf;

	@Column(name = "nome", length = 60, nullable = false)
	private String nome;

	@Column(name = "endereco_rua")
	private String enderecoRua;

	@Column(name = "endereco_numero")
	private Integer enderecoNumero;

	@Column(name = "endereco_complemento")
	private String enderecoComplemento;

	@Column(name = "endereco_bairro")
	private String enderecoBairro;

	@Column(name = "endereco_cidade")
	private String enderecoCidade;

	@Column(name = "endereco_uf", length = 2)
	private String enderecoUf;

	@Column(name = "endereco_cep", length = 8)
	private String enderecoCep;

	@Column(name = "telefone", length = 11)
	private String telefone;

	@Column(name = "email", length = 50, unique = true, nullable = false)
	private String email;

	@Column(name = "senha", length = 16, nullable = false)
	private String senha;

	@ManyToOne
	@JoinColumn(name="id_grupo")
	private Grupo grupo;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.pessoa", cascade = CascadeType.ALL)
	private List<PessoaEvento> listaPessoaEvento = new ArrayList<PessoaEvento>();

	public Long getPessoaId() {
		return pessoaId;
	}

	public void setPessoaId(Long pessoaId) {
		this.pessoaId = pessoaId;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderecoRua() {
		return enderecoRua;
	}

	public void setEnderecoRua(String enderecoRua) {
		this.enderecoRua = enderecoRua;
	}

	public Integer getEnderecoNumero() {
		return enderecoNumero;
	}

	public void setEnderecoNumero(Integer enderecoNumero) {
		this.enderecoNumero = enderecoNumero;
	}

	public String getEnderecoComplemento() {
		return enderecoComplemento;
	}

	public void setEnderecoComplemento(String enderecoComplemento) {
		this.enderecoComplemento = enderecoComplemento;
	}

	public String getEnderecoBairro() {
		return enderecoBairro;
	}

	public void setEnderecoBairro(String enderecoBairro) {
		this.enderecoBairro = enderecoBairro;
	}

	public String getEnderecoCidade() {
		return enderecoCidade;
	}

	public void setEnderecoCidade(String enderecoCidade) {
		this.enderecoCidade = enderecoCidade;
	}

	public String getEnderecoUf() {
		return enderecoUf;
	}

	public void setEnderecoUf(String enderecoUf) {
		this.enderecoUf = enderecoUf;
	}

	public String getEnderecoCep() {
		return enderecoCep;
	}

	public void setEnderecoCep(String enderecoCep) {
		this.enderecoCep = enderecoCep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

    public List<PessoaEvento> getListaPessoaEvento() {
        return listaPessoaEvento;
    }

    public void setListaPessoaEvento(List<PessoaEvento> listaPessoaEvento) {
        this.listaPessoaEvento = listaPessoaEvento;
    }
	
//	@OneToOne
//	@JoinColumn(name = "id_pessoa_grupo")
//	private PessoaGrupo pessoaGrupo;

//	public PessoaGrupo getPessoaGrupo() {
//		return pessoaGrupo;
//	}
//
//	public void setPessoaGrupo(PessoaGrupo pessoaGrupo) {
//		this.pessoaGrupo = pessoaGrupo;
//	}


}
