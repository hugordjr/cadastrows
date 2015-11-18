package br.com.maxmedia.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

/**
 * The persistent class for the telefone database table.
 * 
 */
@Entity
@NamedQuery(name = "TelefoneEntity.findAll", query = "SELECT t FROM TelefoneEntity t")
public class TelefoneEntity implements Serializable {
	
	private static final long serialVersionUID = -5302632616801255834L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_telefone")
	private Long idTelefone;

	private String ddd;

	private String ddi;

	private String numero;

	// bi-directional many-to-one association to Pessoa
	@ManyToOne
	@JoinColumn(name = "id_pessoa")
	private PessoaEntity pessoa;

	// bi-directional many-to-one association to TipoTelefone
	@ManyToOne
	@JoinColumn(name = "id_tipotelefone")
	private TipoTelefoneEntity tipoTelefone;

	public TelefoneEntity() {
	}

	public Long getIdTelefone() {
		return this.idTelefone;
	}

	public void setIdTelefone(Long idTelefone) {
		this.idTelefone = idTelefone;
	}

	public String getDdd() {
		return this.ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getDdi() {
		return this.ddi;
	}

	public void setDdi(String ddi) {
		this.ddi = ddi;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public PessoaEntity getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(PessoaEntity pessoa) {
		this.pessoa = pessoa;
	}

	public TipoTelefoneEntity getTipoTelefone() {
		return this.tipoTelefone;
	}

	public void setTipoTelefone(TipoTelefoneEntity tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

}