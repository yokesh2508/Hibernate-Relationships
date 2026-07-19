import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchAllMovies {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("yoke");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select s from Movie s");

		List<Movie> li = q.getResultList();
		for (Movie m : li) {
			System.out.println(m);
		}
	}

}
