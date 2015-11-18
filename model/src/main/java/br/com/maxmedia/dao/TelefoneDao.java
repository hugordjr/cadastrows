package br.com.maxmedia.dao;

import br.com.maxmedia.entidade.TelefoneEntity;

public class TelefoneDao extends AbstractDao<TelefoneEntity> {

	private TelefoneEntity entity;

	@Override
	public TelefoneEntity getEntity() {
		return this.entity;
	}

	@Override
	public void setEntity(TelefoneEntity entity) {
		this.entity = entity;
	}

	@Override
	public Long getID() {
		return this.entity.getIdTelefone();
	}

	@Override
	public void setID(Long id) {
		this.entity.setIdTelefone(id);
	}

}
