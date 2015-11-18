package br.com.maxmedia.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the tipo_documento database table.
 * 
 */
@Entity
@Table(name = "tipo_documento")
@NamedQuery(name = "TipoDocumentoEntity.findAll", query = "SELECT t FROM TipoDocumentoEntity t")
public class TipoDocumentoEntity implements Serializable {

	private static final long serialVersionUID = -9014543135252973428L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_tipodocumento")
	private Long idTipodocumento;

	@Column(name = "ds_tipodocumento")
	private String dsTipodocumento;

	public TipoDocumentoEntity() {
	}

	public Long getIdTipodocumento() {
		return this.idTipodocumento;
	}

	public void setIdTipodocumento(Long idTipodocumento) {
		this.idTipodocumento = idTipodocumento;
	}

	public String getDsTipodocumento() {
		return this.dsTipodocumento;
	}

	public void setDsTipodocumento(String dsTipodocumento) {
		this.dsTipodocumento = dsTipodocumento;
	}

}