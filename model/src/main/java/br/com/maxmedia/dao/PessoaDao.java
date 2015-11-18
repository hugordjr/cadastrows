package br.com.maxmedia.dao;

import br.com.maxmedia.entidade.PessoaEntity;

public class PessoaDao extends AbstractDao<PessoaEntity> {

	private PessoaEntity entity;

	@Override
	public PessoaEntity getEntity() {
		return this.entity;
	}

	@Override
	public void setEntity(PessoaEntity entity) {
		this.entity = entity;
	}

	@Override
	public Long getID() {
		return this.entity.getIdPessoa();
	}

	@Override
	public void setID(Long id) {
		this.entity.setIdPessoa(id);
	}

}
