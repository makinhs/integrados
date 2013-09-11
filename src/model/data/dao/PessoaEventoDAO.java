package model.data.dao;

import model.data.business.Permissao;
import model.data.business.PessoaEvento;

import java.util.List;
import model.data.business.Evento;
import model.data.dao.BaseDAO;
import model.data.business.Pessoa;

public interface PessoaEventoDAO extends BaseDAO<PessoaEvento> {

    public List<Pessoa> listPessoaFromEvento(Evento evento);

    public List<Evento> listEventoOfPessoa(Pessoa pessoa);

    public List<Permissao> findByPermissao(Permissao permissao);
}
