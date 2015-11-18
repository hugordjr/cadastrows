package br.com.maxmedia.dao;

import java.util.List;

import javax.persistence.EntityManager;

public interface IDao<T> {

	long count();

	T create(T t);

	T create();

	void save();

	void update();

	void delete(Long id);

	T find(Long id);

	List<T> findAll();

	EntityManager getEm();

	void setEm(EntityManager em);

	T getEntity();

	void setEntity(T t);

	void build();

	Long getID();

	void setID(Long id);

}