import java.util.ArrayList;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveData {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("yoke");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			Movie m1 = new Movie();
			m1.setMname("good bad ugly");
			m1.setYop(2025);
			m1.setLanguage("tamil");
			m1.setMrating(4.9);

			Movie m2 = new Movie();
			m2.setMname("Anbe Diana");
			m2.setYop(2026);
			m2.setLanguage("tamil");
			m2.setMrating(4.2);

			Movie m3 = new Movie();
			m3.setMname("Idhayam Murali");
			m3.setYop(2026);
			m3.setLanguage("tamil");
			m3.setMrating(4.7);

			ArrayList<Movie> movies = new ArrayList<Movie>();
			movies.add(m1);
			movies.add(m2);
			movies.add(m3);

			Theater t = new Theater();
			t.setTname("Rohini Silvers");
			t.setTloc("Koyambedu");
			t.setTrating(4.5);
			t.setNoOfScreens(4);
			t.setSeatCapacity(500);
			t.setMovies(movies);

			et.begin();
			em.persist(t);
			em.persist(m1);
			em.persist(m2);
			em.persist(m3);
			et.commit();

			System.out.println("Data Saved");
		} catch (Exception e) {
			et.rollback();
		}

	}
}
