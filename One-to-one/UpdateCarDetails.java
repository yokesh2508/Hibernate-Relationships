package RelationMapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateCar {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Car c = em.find(Car.class, 0);

		if (c != null) {
			c.setModel("M4");
			// c.setCid(1);
			et.begin();
			em.merge(c);
			et.commit();

			System.out.println("Data Updated");
		} else {
			System.out.println("Data not Found");
		}
	}
}
