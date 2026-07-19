import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateTheater {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("yoke");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Theater t = em.find(Theater.class, 1);

		if (t != null) {
			t.setSeatCapacity(700);
			et.begin();
			em.merge(t);
			et.commit();

			System.out.println("Data Updated");

		} else {
			System.out.println("Data not Found");
		}
	}

}
