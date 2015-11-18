package br.com.maxmedia.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * 
 * @author hugodias
 */
public abstract class AbstractDao<T> implements IDao<T> {

	private Class<T> type;

	public static final String PUNAME = "CadJpaPU";

	@PersistenceContext(name = PUNAME)
	private EntityManager em;

	public AbstractDao() {
		this.init();
	}

	public AbstractDao(EntityManager em) {
		this.init();
		this.setEm(em);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private final void init() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class) pt.getActualTypeArguments()[0];
	}

	@Override
	public EntityManager getEm() {
		return this.em;
	}

	@Override
	public void setEm(EntityManager em) {
		this.em = em;

	}

	@Override
	public long count() {
		final StringBuffer queryString = new StringBuffer(
				"SELECT count(o) from ");
		queryString.append(type.getSimpleName()).append(" o ");
		final Query query = this.getEm().createQuery(queryString.toString());
		long cc = (Long) query.getSingleResult();
		return cc;
	}

	@Override
	public T create() {
		return this.create(this.getEntity());
	}

	@Override
	public T create(final T t) {
		this.getEm().persist(t);
		return t;
	}

	@Override
	public void save() {
		this.getEm().persist(this.getEntity());
	}

	public void update() {
		this.getEm().merge(this.getEntity());
	}

	@Override
	public void delete(final Long id) {
		this.getEm().remove(this.getEm().getReference(type, id));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		final Query query = this.getEm().createNamedQuery(
				String.format("%s.findAll", type.getSimpleName()));
		List<T> lst = query.getResultList();
		return lst;
	}

	@Override
	public T find(final Long id) {
		T t = (T) this.getEm().find(type, id);
		return t;
	}

	@Override
	public void build() {
		System.out.println("Build Não implementado");
	}

}
