package model;

import model.data.PessoaService;
import model.data.business.Grupo;
import model.data.business.Pessoa;

public class MainTeste {

	/**
	 * Testes para testar jpa 
	 */
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		Grupo grupo = new Grupo();
		grupo.setGrupoId(1l);
		
		p.setCpf("07557641965");
		p.setEmail("gfuji1211@gmail.com");
		p.setSenha("hua");
		p.setNome("Gui");
		p.setGrupo(grupo);
		
		PessoaService pessoaService = new PessoaService();
		pessoaService.savePessoa(p);

	}
}
