package model;

import java.util.Random;

import model.data.PessoaService;
import model.data.business.Grupo;
import model.data.business.Pessoa;

public class MainTeste {

	/**
	 * Testes para testar jpa
	 */
	public static void main(String[] args) {
		PessoaService pessoaService = new PessoaService();
		Random r = new Random();

		Pessoa p = new Pessoa();
		Grupo grupo = new Grupo();
		grupo.setGrupoId((long) r.nextInt(4));
		p.setCpf((r.nextInt(8999) + 1000) + "0000000");
		p.setEmail("gfuji1211@gmail.com");
		p.setSenha("hua");
		p.setNome("Gui");
		p.setGrupo(grupo);
		pessoaService.savePessoa(p);

		// ArrayList<Pessoa> list = pessoaService.findAll();
		pessoaService.deleteByCpf("07557641965");
	}
}
