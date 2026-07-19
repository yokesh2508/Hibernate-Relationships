import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchbyTid {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("yoke");
		EntityManager em = emf.createEntityManager();

		Theater t = em.find(Theater.class, 1);

		if (t != null) {
			System.out.println(t);
		} else {
			System.out.println("Data not Found");
		}
	}

}
