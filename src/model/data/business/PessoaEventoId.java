package model.data.business;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class PessoaEventoId implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManyToOne
    private Pessoa pessoa;

    @ManyToOne
    private Evento evento;

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
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
 
        PessoaEventoId that = (PessoaEventoId) o;
 
        if (pessoa != null ? !pessoa.equals(that.pessoa) : that.pessoa != null) return false;
        if (evento != null ? !evento.equals(that.evento) : that.evento != null)
            return false;
 
        return true;
    }
 
    public int hashCode() {
        int result;
        result = (pessoa != null ? pessoa.hashCode() : 0);
        result = 31 * result + (evento != null ? evento.hashCode() : 0);
        return result;
    }
}
