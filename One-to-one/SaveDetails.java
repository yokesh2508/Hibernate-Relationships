package RelationMapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveData {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Engine e = new Engine();
		e.setEno("87554697SJGHUJHJ");
		e.setType("Petrol");
		e.setCc("1000cc");

		Car c = new Car();
		c.setBrand("BMW");
		c.setModel("M3");
		c.setCarno("TN23BF2508");
		c.setColor("Metallic Blue");
		c.setPrice(2000000);
		c.setEngine(e);

		et.begin();
		em.persist(e);
		em.persist(c);
		et.commit();
	}
}
