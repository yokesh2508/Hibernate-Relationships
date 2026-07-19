import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchbyMid {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("yoke");
		EntityManager em = emf.createEntityManager();

		Movie m = em.find(Movie.class, 1);

		if (m != null) {
			System.out.println(m);
		} else {
			System.out.println("Data not Found");
		}
	}

}
