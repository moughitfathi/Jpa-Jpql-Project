package Utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

	public static EntityManager getEntmanager() {
		EntityManagerFactory emf=null;
		EntityManager em=null;
		try {
			emf=Persistence.createEntityManagerFactory("alltable");
			em=emf.createEntityManager();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return em;
	}
}
