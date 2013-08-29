package model.data.business;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//@Entity
//@Table(name = "tbl_evento_data")
public class EventoData implements Serializable {

	private static final long serialVersionUID = 1L;

//	@Id
//	@GeneratedValue
//	@Column(name = "id_evento_data")
//	private Long eventoDataId;
//
//	@ManyToOne
//	@JoinColumn(name = "id_evento")
//	private Evento evento;
//
//	public Long getEventoDataId() {
//		return eventoDataId;
//	}
//
//	public void setEventoDataId(Long eventoDataId) {
//		this.eventoDataId = eventoDataId;
//	}
//
//	public Evento getEvento() {
//		return evento;
//	}
//
//	public void setEvento(Evento evento) {
//		this.evento = evento;
//	}

}
