package br.com.maxmedia.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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
	private EntityManager em ;
	
	@Before
	public void before() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CadJpaTestPU");
		em = emf.createEntityManager();
		
		dao = new TipoTelefoneDao();
		dao.setEm(em);
	}
	
	@After
	public void after() {
		em.close();
	}
	
	@Test
	public void testCount() {
		long expected = 2;
		long result = dao.count();
		assertEquals(expected, result);
	}

	@Test
	public void testCreate() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateT() {
		fail("Not yet implemented");
	}

	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAll() {
		List<TipoTelefoneEntity> lst = dao.findAll();
		long result = lst.size();
		long expected = 2;
		assertEquals(expected, result);
	}

	@Test
	public void testFind() {
		fail("Not yet implemented");
	}

}
