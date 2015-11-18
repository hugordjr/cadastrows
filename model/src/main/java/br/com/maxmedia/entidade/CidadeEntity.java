package br.com.maxmedia.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the cidades database table.
 * 
 */
@Entity
@Table(name = "cidades")
@NamedQuery(name = "CidadeEntity.findAll", query = "SELECT c FROM CidadeEntity c")
public class CidadeEntity implements Serializable {

	private static final long serialVersionUID = 8436735811732025506L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private long area;

	@Column(name = "codigo_ibge")
	private int codigoIbge;

	@Column(name = "densidade_demo")
	private long densidadeDemo;

	private String gentilico;

	private String nome;

	@Column(name = "populacao_2010")
	private long populacao2010;

	// bi-directional many-to-one association to Estado
	@ManyToOne
	private EstadoEntity estado;

	public CidadeEntity() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getArea() {
		return this.area;
	}

	public void setArea(long area) {
		this.area = area;
	}

	public int getCodigoIbge() {
		return this.codigoIbge;
	}

	public void setCodigoIbge(int codigoIbge) {
		this.codigoIbge = codigoIbge;
	}

	public long getDensidadeDemo() {
		return this.densidadeDemo;
	}

	public void setDensidadeDemo(long densidadeDemo) {
		this.densidadeDemo = densidadeDemo;
	}

	public String getGentilico() {
		return this.gentilico;
	}

	public void setGentilico(String gentilico) {
		this.gentilico = gentilico;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getPopulacao2010() {
		return this.populacao2010;
	}

	public void setPopulacao2010(long populacao2010) {
		this.populacao2010 = populacao2010;
	}

	public EstadoEntity getEstado() {
		return this.estado;
	}

	public void setEstado(EstadoEntity estado) {
		this.estado = estado;
	}

}