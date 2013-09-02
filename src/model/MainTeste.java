package model;

import java.util.ArrayList;

import model.data.PessoaService;
import model.data.business.Grupo;
import model.data.business.Pessoa;

public class MainTeste {

    /**
     * Testes para testar jpa
     */
    public static void main(String[] args) {
        PessoaService pessoaService = new PessoaService();
        Grupo g = new Grupo();
        g.setGrupoId(3l);
//        for (int i = 0; i < 20; i++) {
//            Random r = new Random(System.currentTimeMillis());
//            Pessoa p = new Pessoa();
//            Grupo grupo = new Grupo();
//            grupo.setGrupoId((long) r.nextInt(4));
//            p.setCpf((r.nextInt(8999) + 1000) + "0000000");
//            p.setEmail("gfuji1211@gmail.com" + r.nextInt(100));
//            p.setSenha("hua");
//            p.setNome("Gui " + r.nextInt(100));
//            p.setGrupo(grupo);
//            pessoaService.savePessoa(p);
//        }

        ArrayList<Pessoa> list = pessoaService.findByNome("G");
    }
}
