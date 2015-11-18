package br.com.maxmedia.dao;

import br.com.maxmedia.entidade.DocumentoEntity;

public class DocumentoDao extends AbstractDao<DocumentoEntity> {

	private DocumentoEntity entity;
	
	@Override
	public DocumentoEntity getEntity() {
		return this.entity;
	}

	@Override
	public void setEntity(DocumentoEntity entity) {
		this.entity = entity;
	}

	@Override
	public Long getID() {
		return this.entity.getIdDocumento();
	}

	@Override
	public void setID(Long id) {
		this.entity.setIdDocumento(id);
	}

}
