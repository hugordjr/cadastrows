package br.com.maxmedia.dao;

import br.com.maxmedia.entidade.EnderecoEntity;

public class EnderecoDao extends AbstractDao<EnderecoEntity> {

	private EnderecoEntity entity;

	@Override
	public EnderecoEntity getEntity() {
		return this.entity;
	}

	@Override
	public void setEntity(EnderecoEntity entity) {
		this.entity = entity;
	}

	@Override
	public Long getID() {
		return this.entity.getIdEndereco();
	}

	@Override
	public void setID(Long id) {
		this.entity.setIdEndereco(id);
	}

}
