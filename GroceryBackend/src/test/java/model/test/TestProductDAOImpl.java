package model.test;

import org.hibernate.Session;
import org.junit.Test;

import model.config.Hibernateconfig;
import model.dao.IProductDAO;
import model.entity.Product;

public class TestProductDAOImpl implements IProductDAO {
	private Session sess;
	public TestProductDAOImpl()
	{
		sess = Hibernateconfig.getSessionFactory().openSession();
	}
	@Test
	public boolean insertProduct(Product p) {
		boolean b = true;
		try
		{
			sess.beginTransaction();
			sess.save(p);
			sess.getTransaction().commit();
			
		}catch(Exception ex)
		{
			b = false;
			sess.getTransaction().rollback();
			ex.printStackTrace();
		}
		
		return b;
	}

}
