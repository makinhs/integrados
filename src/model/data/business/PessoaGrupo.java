package model.data.business;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_pessoa_grupo")
public class PessoaGrupo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "id_pessoa_grupo")
	private Long pessoaGrupoId;

	private Grupo grupo;

	public Long getPessoaGrupoId() {
		return pessoaGrupoId;
	}

	public void setPessoaGrupoId(Long pessoaGrupoId) {
		this.pessoaGrupoId = pessoaGrupoId;
	}


	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
}
