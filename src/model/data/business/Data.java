package model.data.business;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_data")
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id_data")
	private Long dataId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "datahora_inicio")
	private Calendar dataHoraInicio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "datahora_termino")
	private Calendar dataHoraTermino;

	public Long getDataId() {
		return dataId;
	}

	public void setDataId(Long dataId) {
		this.dataId = dataId;
	}

	public Calendar getDataHoraInicio() {
		return dataHoraInicio;
	}

	public void setDataHoraInicio(Calendar dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}

	public Calendar getDataHoraTermino() {
		return dataHoraTermino;
	}

	public void setDataHoraTermino(Calendar dataHoraTermino) {
		this.dataHoraTermino = dataHoraTermino;
	}

}
