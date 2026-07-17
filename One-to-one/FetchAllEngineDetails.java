package RelationMapping;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchEngineDetails {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select s from Engine s");

		List<Engine> li = q.getResultList();

		for (Engine e : li) {
			System.out.println(e);
		}

	}

}
