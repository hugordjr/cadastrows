package br.com.maxmedia.dao;

import br.com.maxmedia.entidade.CidadeEntity;

public class CidadeDao extends AbstractDao<CidadeEntity> {

	private CidadeEntity entity;
	
	@Override
	public CidadeEntity getEntity() {
		return this.entity;
	}

	@Override
	public void setEntity(CidadeEntity entity) {
		this.entity = entity;
	}

	@Override
	public Long getID() {
		return this.entity.getId();
	}

	@Override
	public void setID(Long id) {
		this.entity.setId(id);
	}

}
