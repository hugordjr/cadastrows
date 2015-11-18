package br.com.maxmedia.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.maxmedia.entidade.TipoTelefoneEntity;

public class TipoTelefoneDaoTest {

	private TipoTelefoneDao dao;
	private EntityManager em;

	@Before
	public void before() {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("CadJpaTestPU");
		em = emf.createEntityManager();

		dao = new TipoTelefoneDao();
		dao.setEm(em);
	}

	@After
	public void after() {
		try {
			em.close();
		} catch (Exception ex) {
			System.out.println("Não fechou sozinho");
		}
	}

	@Test
	public void testCount() {
		long expected = 2;
		long result = dao.count();
		assertEquals(expected, result);
	}

	@Test
	public void testFindAll() {
		List<TipoTelefoneEntity> lst = dao.findAll();
		long result = lst.size();
		long expected = 2;
		assertEquals(expected, result);
	}

}
