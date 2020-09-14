import static org.junit.Assert.*;

import org.junit.Test;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;

public class ContextTest extends AbstractPersistenceTest implements WithGlobalEntityManager {

	@Test
	public void contextUp() {
		assertNotNull(entityManager());

	}

	@Test
	public void contextUpWithTransaction() throws Exception {
		withTransaction(() -> {});
	}

	@Test
	public void test(){
		Jugadores mad = new Jugadores();
		mad.setNombre("Nico");
		mad.setApellido("Bonaparte");
		mad.setDomicilio("Francia");
		mad.setNacimiento(1998);

		//Jugadores dani3 = entityManager().find(Jugadores.class, dani.getId());

		Paletas lapa = entityManager().find(Paletas.class,2);


		System.out.println(lapa.grosor);
		mad.setPaleta(lapa);

		entityManager().persist(mad);

		assertNotNull(mad.getId());
	}

}
