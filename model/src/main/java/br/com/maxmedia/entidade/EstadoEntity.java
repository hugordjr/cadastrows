package br.com.maxmedia.entidade;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.ReadOnly;

/**
 * The persistent class for the estados database table.
 * 
 */
@ReadOnly
@Entity
@Table(name = "estados")
@NamedQuery(name = "EstadoEntity.findAll", query = "SELECT e FROM EstadoEntity e")
public class EstadoEntity implements Serializable {

	private static final long serialVersionUID = -1125787115478612730L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nome;

	private String sigla;

	// bi-directional many-to-one association to Cidade
	@OneToMany(mappedBy = "estado")
	private List<CidadeEntity> cidades;

	public EstadoEntity() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public List<CidadeEntity> getCidades() {
		return this.cidades;
	}

	public void setCidades(List<CidadeEntity> cidades) {
		this.cidades = cidades;
	}

	public CidadeEntity addCidade(CidadeEntity cidade) {
		getCidades().add(cidade);
		cidade.setEstado(this);

		return cidade;
	}

	public CidadeEntity removeCidade(CidadeEntity cidade) {
		getCidades().remove(cidade);
		cidade.setEstado(null);

		return cidade;
	}

}