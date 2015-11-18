package br.com.maxmedia.dao;

import br.com.maxmedia.entidade.TipoDocumentoEntity;

public class TipoDocumentoDao extends AbstractDao<TipoDocumentoEntity> {

	private TipoDocumentoEntity entity;

	@Override
	public TipoDocumentoEntity getEntity() {
		return this.entity;
	}

	@Override
	public void setEntity(TipoDocumentoEntity entity) {
		this.entity = entity;
	}

	@Override
	public Long getID() {
		return this.entity.getIdTipodocumento();
	}

	@Override
	public void setID(Long id) {
		this.entity.setIdTipodocumento(id);
	}

}
