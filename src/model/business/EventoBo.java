package model.business;

import java.util.ArrayList;

import model.data.EventoService;
import model.data.business.Evento;
import model.data.business.Pessoa;

public class EventoBo {

    private EventoService eventoService;

    public EventoBo() {
        eventoService = new EventoService();
    }

    public void excluirEvento(Evento evento) {
        eventoService.delete(evento);
    }
    
    public void incluirEvento(Evento evento) {
        if(isValidEvento(evento)) {
            eventoService.save(evento);
        }
    }
    
    public ArrayList<Evento> pesquisarEventoPorPessoa(Pessoa pessoa) {
        return eventoService.pesquisarEventosDePessoa(pessoa);
    }

    private boolean isValidEvento(Evento evento) {
        // TODO Auto-generated method stub
        return false;
    }
}
