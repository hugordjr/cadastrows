package br.com.maxmedia.dao;

import br.com.maxmedia.entidade.TipoEnderecoEntity;

public class TipoEnderecoDao extends AbstractDao<TipoEnderecoEntity> {

	private TipoEnderecoEntity entity;

	@Override
	public TipoEnderecoEntity getEntity() {
		return this.entity;
	}

	@Override
	public void setEntity(TipoEnderecoEntity entity) {
		this.entity = entity;
	}

	@Override
	public Long getID() {
		return entity.getIdTipoendereco();
	}

	@Override
	public void setID(Long id) {
		this.entity.setIdTipoendereco(id);
	}

}
