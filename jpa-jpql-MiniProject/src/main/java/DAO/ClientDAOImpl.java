package DAO;



import javax.persistence.EntityManager;
import javax.persistence.Query;

import Utils.HibernateUtil;
//import connection.MyConnection;
import models.Client;


public class ClientDAOImpl implements ClientDAO {
	
	  EntityManager em = HibernateUtil.getEntmanager();

	  public int insertClient(Client c) {
		  int status=0;

    	  try {
    		  em.getTransaction().begin();
    		  em.persist(c);
    		  em.getTransaction().rollback();
    		  
    		  
		  }catch(Exception e) {
		   e.printStackTrace();
		  }
		return status;
	  }
      
	  public Client getClient( String password, String email) { 
		  Client c=new Client();
		  try {
		//	  con=MyConnection.getConn();
      
			  Query query=em.createQuery("select cl from client cl where cl.email= :email and cl.motdepass= :mdp ");
			  query.setParameter("email", email);
			  query.setParameter("mdp", password);
              c=(Client) query.getSingleResult();
		  }catch(Exception e) {
		   e.printStackTrace();
		   
		  }
		  
		  
		  return c;
	  }
		  
		  
	  }

