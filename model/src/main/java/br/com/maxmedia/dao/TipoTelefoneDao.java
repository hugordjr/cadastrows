package br.com.maxmedia.dao;

import br.com.maxmedia.entidade.TipoTelefoneEntity;

public class TipoTelefoneDao extends AbstractDao<TipoTelefoneEntity> {

	private TipoTelefoneEntity entity;

	@Override
	public TipoTelefoneEntity getEntity() {
		return this.entity;
	}

	@Override
	public void setEntity(TipoTelefoneEntity entity) {
		this.entity = entity;
	}

	@Override
	public Long getID() {
		return this.getEntity().getIdTipotelefone();
	}

	@Override
	public void setID(Long id) {
		this.getEntity().setIdTipotelefone(id);
	}

}
