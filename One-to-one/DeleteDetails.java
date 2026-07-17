package RelationMapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteDetails {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Car c = em.find(Car.class, 0);
		Engine e = c.getEngine();

		if (e != null) {
			et.begin();
			em.remove(c);
			em.remove(e);
			et.commit();

			System.out.println("Data Deleted");
		} else {
			System.out.println("Data not Found");

		}
	}

}
