package br.com.maxmedia.entidade;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.ReadOnly;

/**
 * The persistent class for the tipo_telefone database table.
 * 
 */
@ReadOnly
@Entity
@Table(name = "tipo_telefone")
@NamedQuery(name = "TipoTelefoneEntity.findAll", query = "SELECT t FROM TipoTelefoneEntity t")
public class TipoTelefoneEntity implements Serializable {

	private static final long serialVersionUID = -1924885970258888296L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_tipotelefone")
	private Long idTipotelefone;

	@Column(name = "ds_tipotelefone")
	private String dsTipotelefone;

	// bi-directional many-to-one association to Telefone
	@OneToMany(mappedBy = "tipoTelefone")
	private List<TelefoneEntity> telefones;

	public TipoTelefoneEntity() {
	}

	public Long getIdTipotelefone() {
		return this.idTipotelefone;
	}

	public void setIdTipotelefone(Long idTipotelefone) {
		this.idTipotelefone = idTipotelefone;
	}

	public String getDsTipotelefone() {
		return this.dsTipotelefone;
	}

	public void setDsTipotelefone(String dsTipotelefone) {
		this.dsTipotelefone = dsTipotelefone;
	}

	public List<TelefoneEntity> getTelefones() {
		return this.telefones;
	}

	public void setTelefones(List<TelefoneEntity> telefones) {
		this.telefones = telefones;
	}

	public TelefoneEntity addTelefone(TelefoneEntity telefone) {
		getTelefones().add(telefone);
		telefone.setTipoTelefone(this);

		return telefone;
	}

	public TelefoneEntity removeTelefone(TelefoneEntity telefone) {
		getTelefones().remove(telefone);
		telefone.setTipoTelefone(null);

		return telefone;
	}

}