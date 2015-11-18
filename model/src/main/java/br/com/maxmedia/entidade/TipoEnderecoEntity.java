package br.com.maxmedia.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.ReadOnly;

/**
 * The persistent class for the tipo_endereco database table.
 * 
 */
@ReadOnly
@Entity
@Table(name = "tipo_endereco")
@NamedQuery(name = "TipoEnderecoEntity.findAll", query = "SELECT t FROM TipoEnderecoEntity t")
public class TipoEnderecoEntity implements Serializable {

	private static final long serialVersionUID = 406422414221246354L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_tipoendereco")
	private Long idTipoendereco;

	@Column(name = "ds_tipoendereco")
	private String dsTipoendereco;

	public TipoEnderecoEntity() {
	}

	public Long getIdTipoendereco() {
		return this.idTipoendereco;
	}

	public void setIdTipoendereco(Long idTipoendereco) {
		this.idTipoendereco = idTipoendereco;
	}

	public String getDsTipoendereco() {
		return this.dsTipoendereco;
	}

	public void setDsTipoendereco(String dsTipoendereco) {
		this.dsTipoendereco = dsTipoendereco;
	}

}