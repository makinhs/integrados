package model.business;

import model.data.PessoaService;
import model.data.business.Pessoa;

public class PessoaBo {

    private PessoaService pessoaService;

    public PessoaBo() {
        pessoaService = new PessoaService();
    }

   

    public void realizarCadastroCliente(Pessoa pessoa) {
        if (isValidPessoa(pessoa)) {
        }
    }
    
    private boolean isValidPessoa(Pessoa pessoa) {
        return true;
    }
    
    
}
