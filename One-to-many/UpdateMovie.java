import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateMovie {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("yoke");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Movie m = em.find(Movie.class, 2);

		if (m != null) {
			m.setMrating(4.0);
			et.begin();
			em.merge(m);
			et.commit();

			System.out.println("Data Updated");

		} else {
			System.out.println("Data not Found");
		}

	}

}
