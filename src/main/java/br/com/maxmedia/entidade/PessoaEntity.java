package br.com.maxmedia.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the pessoa database table.
 * 
 */
@Entity
@NamedQuery(name = "PessoaEntity.findAll", query = "SELECT p FROM PessoaEntity p")
public class PessoaEntity implements Serializable {

	private static final long serialVersionUID = 3443732009172680455L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_pessoa")
	private Long idPessoa;

	@Column(name = "ds_nomecompleto")
	private String dsNomecompleto;

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_datanascimento")
	private Date dtDatanascimento;

	// bi-directional many-to-one association to Documento
	@OneToMany(mappedBy = "pessoa")
	private List<DocumentoEntity> documentos;

	// bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name = "id_status")
	private StatusEntity status;

	// bi-directional many-to-one association to Telefone
	@OneToMany(mappedBy = "pessoa")
	private List<TelefoneEntity> telefones;

	public PessoaEntity() {
	}

	public Long getIdPessoa() {
		return this.idPessoa;
	}

	public void setIdPessoa(Long idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getDsNomecompleto() {
		return this.dsNomecompleto;
	}

	public void setDsNomecompleto(String dsNomecompleto) {
		this.dsNomecompleto = dsNomecompleto;
	}

	public Date getDtDatanascimento() {
		return this.dtDatanascimento;
	}

	public void setDtDatanascimento(Date dtDatanascimento) {
		this.dtDatanascimento = dtDatanascimento;
	}

	public List<DocumentoEntity> getDocumentos() {
		return this.documentos;
	}

	public void setDocumentos(List<DocumentoEntity> documentos) {
		this.documentos = documentos;
	}

	public StatusEntity getStatus() {
		return this.status;
	}

	public void setStatus(StatusEntity status) {
		this.status = status;
	}

	public List<TelefoneEntity> getTelefones() {
		return this.telefones;
	}

	public void setTelefones(List<TelefoneEntity> telefones) {
		this.telefones = telefones;
	}

	public TelefoneEntity addTelefone(TelefoneEntity telefone) {
		getTelefones().add(telefone);
		telefone.setPessoa(this);

		return telefone;
	}

	public TelefoneEntity removeTelefone(TelefoneEntity telefone) {
		getTelefones().remove(telefone);
		telefone.setPessoa(null);

		return telefone;
	}

}