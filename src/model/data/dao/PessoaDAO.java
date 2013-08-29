package model.data.dao;

import java.util.List;
import model.data.business.Grupo;
import model.data.business.Pessoa;

public interface PessoaDAO extends BaseDAO<Pessoa> {

	public Pessoa findByCpf(String cpf);

	public List<Pessoa> findByNome(String nome);

	public List<Pessoa> findByGrupo(Grupo grupo);

	public void deleteByCpf(String cpf);

	public void deleteByGrupo(Grupo grupo);
}
