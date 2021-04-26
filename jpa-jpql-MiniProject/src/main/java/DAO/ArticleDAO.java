package DAO;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Utils.HibernateUtil;
//import connection.MyConnection;
import models.Article;

public class ArticleDAO {

	  EntityManager em = HibernateUtil.getEntmanager();
	    public Article get(int code) throws SQLException {
	        Article article = null;
			Query query=em.createQuery("SELECT ar FROM Article ar WHERE ar.code= :CodeArticle ");
	        query.setParameter("CodeArticle", code);
	        article=(Article) query.getSingleResult();
	        return article;
	    }

	
}
