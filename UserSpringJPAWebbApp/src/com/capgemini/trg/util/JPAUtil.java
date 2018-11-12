package com.capgemini.trg.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {	
	
	public static EntityManager getEntityManager() {		
		return Persistence.
				createEntityManagerFactory("LoginWebApplication").
				createEntityManager();
	
	}
	
}
