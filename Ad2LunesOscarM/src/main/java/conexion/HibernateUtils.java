package conexion;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static HibernateUtils singleton;
	private Session sesion;
	private SessionFactory factory;

	private HibernateUtils() {

	}


	public static HibernateUtils setUp() {
		if (singleton == null) {
			HibernateUtils hu = new HibernateUtils();
			Configuration configuration = new Configuration().configure();
			hu.factory = configuration.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
			hu.sesion = hu.factory.openSession();
			singleton = hu;
			return hu;
		} else {

			return singleton;
		}
	}

	public Session getSession() {
		return sesion;
	}


}