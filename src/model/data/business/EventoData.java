package model.data.business;

import java.io.Serializable;
import java.util.Date;

public class EventoData implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long eventoDataId;
    private Evento evento;
    private Date dataHoraInicio;
    private Date dataHoraTermino;

    public Long getEventoDataId() {
        return eventoDataId;
    }

    public void setEventoDataId(Long eventoDataId) {
        this.eventoDataId = eventoDataId;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Date getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(Date dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public Date getDataHoraTermino() {
        return dataHoraTermino;
    }

    public void setDataHoraTermino(Date dataHoraTermino) {
        this.dataHoraTermino = dataHoraTermino;
    }
}
