package model.data.business;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class PessoaGrupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name="id_pessoa_grupo")
    private Long pessoaGrupoId;
    
    private Pessoa pessoa;
    private Grupo grupo;

    public Long getPessoaGrupoId() {
        return pessoaGrupoId;
    }

    public void setPessoaGrupoId(Long pessoaGrupoId) {
        this.pessoaGrupoId = pessoaGrupoId;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}
