package RelationMapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateEngine {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Engine e = em.find(Engine.class, "87554697SJGHUJHJ");

		if (e != null) {
			e.setCc("1500");
			et.begin();
			em.merge(e);
			et.commit();

			System.out.println("Data Updated");

		} else {
			System.out.println("Data not Found");
		}

	}

}
