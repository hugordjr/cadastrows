package br.com.maxmedia.dao;

import br.com.maxmedia.entidade.StatusEntity;

public class StatusDao extends AbstractDao<StatusEntity> {

	private StatusEntity entity;

	@Override
	public StatusEntity getEntity() {
		return this.entity;
	}

	@Override
	public void setEntity(StatusEntity entity) {
		this.entity = entity;
	}

	@Override
	public Long getID() {
		return this.entity.getIdStatus();
	}

	@Override
	public void setID(Long id) {
		this.entity.setIdStatus(id);
	}

}
