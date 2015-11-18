package br.com.maxmedia.dao;

import br.com.maxmedia.entidade.EstadoEntity;

public class EstadoDao extends AbstractDao<EstadoEntity> {

	private EstadoEntity entity;
	
	@Override
	public EstadoEntity getEntity() {
		return this.entity;
	}

	@Override
	public void setEntity(EstadoEntity entity) {
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
