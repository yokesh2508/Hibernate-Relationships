package RelationMapping;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchCarDetails {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select s from Car s");

		List<Car> li = q.getResultList();

		for (Car c : li) {
			System.out.println(c);
		}
	}
}
