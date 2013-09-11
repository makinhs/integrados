package model.business;

import java.util.ArrayList;

import model.Utils;
import model.data.PessoaService;
import model.data.business.Evento;
import model.data.business.Pessoa;

public class PessoaBo {

    private PessoaService pessoaService;

    public PessoaBo() {
        pessoaService = new PessoaService();
    }

    public void realizarCadastroCliente(Pessoa pessoa) {
        if (isValidPessoa(pessoa)) {
            pessoaService.savePessoa(pessoa);
        }
    }
    
    public void excluirCliente(Pessoa pessoa) {
        pessoaService.delete(pessoa);
    }
    
    public ArrayList<Pessoa> pesquisarPessoasPorEvento(Evento evento) {
        return pessoaService.findByEvento(evento);
    }

    private boolean isValidPessoa(Pessoa pessoa) {
        return isValidEndereco(pessoa) && Utils.isValidCpf(pessoa.getCpf()) && Utils.isValidMail(pessoa.getEmail())
                && Utils.containOnlyLetters(pessoa.getNome());
    }

    private boolean isValidEndereco(Pessoa pessoa) {
        return Utils.containOnlyLetters(pessoa.getEnderecoCidade()) && Utils.containOnlyLetters(pessoa.getEnderecoBairro())
                && Utils.containOnlyLetters(pessoa.getEnderecoRua()) && Utils.containOnlyLetters(pessoa.getEnderecoUf());
    }

}
