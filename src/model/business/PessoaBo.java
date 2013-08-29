package model.business;

import model.data.business.Pessoa;
import model.data.PessoaService;

public class PessoaBo {

    private PessoaService pessoaService;

    public PessoaBo() {
        pessoaService = new PessoaService();
    }

    public boolean isValidPessoa(Pessoa pessoa) {
        return true;
    }

    public void realizarCadastroCliente(Pessoa pessoa) {
        if (isValidPessoa(pessoa)) {
        }
    }
}
