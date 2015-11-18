package br.com.maxmedia.entidade;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the documento database table.
 * 
 */
@Entity
@NamedQuery(name="DocumentoEntity.findAll", query="SELECT d FROM DocumentoEntity d")
public class DocumentoEntity implements Serializable {

	private static final long serialVersionUID = 2860444831162426273L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_documento")
	private Long idDocumento;

	private String infadicional;

	private String numero;
	
	//bi-directional many-to-one association to Pessoa
	@ManyToOne
	@JoinColumn(name="id_pessoa")
	private PessoaEntity pessoa;

	//bi-directional many-to-one association to TipoDocumento
	@ManyToOne
	@JoinColumn(name="id_tipodocumento")
	private TipoDocumentoEntity tipoDocumento;

	public DocumentoEntity() {
	}

	public Long getIdDocumento() {
		return this.idDocumento;
	}

	public void setIdDocumento(Long idDocumento) {
		this.idDocumento = idDocumento;
	}

	public String getInfadicional() {
		return this.infadicional;
	}

	public void setInfadicional(String infadicional) {
		this.infadicional = infadicional;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public TipoDocumentoEntity getTipoDocumento() {
		return this.tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumentoEntity tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

}