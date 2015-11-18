package br.com.maxmedia.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the status database table.
 * 
 */
@Entity
@NamedQuery(name="StatusEntity.findAll", query="SELECT s FROM StatusEntity s")
public class StatusEntity implements Serializable {

	private static final long serialVersionUID = -7093079776084367977L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_status")
	private Long idStatus;

	@Column(name="ds_status")
	private String dsStatus;

	public StatusEntity() {
	}

	public Long getIdStatus() {
		return this.idStatus;
	}

	public void setIdStatus(Long idStatus) {
		this.idStatus = idStatus;
	}

	public String getDsStatus() {
		return this.dsStatus;
	}

	public void setDsStatus(String dsStatus) {
		this.dsStatus = dsStatus;
	}

}