import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchAllTheater {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("yoke");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select s from Theater s");

		List<Theater> li = q.getResultList();
		for (Theater t : li) {
			System.out.println(t);
		}

	}

}
