package myContacts.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexaoBD {
	private static EntityManagerFactory entityManagerFactory;
	public static EntityManagerFactory getEntityManagerFactory() {
		if(entityManagerFactory == null) {
			entityManagerFactory = Persistence.createEntityManagerFactory("myContactsUP");
		}
		return entityManagerFactory;
	} 
}
