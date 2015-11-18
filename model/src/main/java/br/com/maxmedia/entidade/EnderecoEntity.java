package br.com.maxmedia.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * The persistent class for the endereco database table.
 * 
 */
@Entity
@NamedQuery(name = "EnderecoEntity.findAll", query = "SELECT e FROM EnderecoEntity e")
public class EnderecoEntity implements Serializable {

	private static final long serialVersionUID = -6402584823052991538L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_endereco")
	private Long idEndereco;

	private String bairro;

	private String cep;

	private String complemento;

	@Column(name = "id_cidade")
	private Long idCidade;

	@Column(name = "id_pessoa")
	private Long idPessoa;

	@Column(name = "id_tipoendereco")
	private Long idTipoendereco;

	private String logradouro;

	private String numero;

	public EnderecoEntity() {
	}

	public Long getIdEndereco() {
		return this.idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Long getIdCidade() {
		return this.idCidade;
	}

	public void setIdCidade(Long idCidade) {
		this.idCidade = idCidade;
	}

	public Long getIdPessoa() {
		return this.idPessoa;
	}

	public void setIdPessoa(Long idPessoa) {
		this.idPessoa = idPessoa;
	}

	public Long getIdTipoendereco() {
		return this.idTipoendereco;
	}

	public void setIdTipoendereco(Long idTipoendereco) {
		this.idTipoendereco = idTipoendereco;
	}

	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}