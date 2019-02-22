package model.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.dao.CategoryDAO;
import model.entity.Category;
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		//adding first category
		category.setId(1);
		category.setName("fruits");
		category.setDescription("des for fruits!");
		category.setImageURL("cat_1.png");
		categories.add(category);
		
		//adding second category
		        category = new Category();
				category.setId(2);
				category.setName("grains");
				category.setDescription("des for grains!");
				category.setImageURL("cat_1.png");
				categories.add(category);
				
		//adding third category
			    category = new Category();
				category.setId(3);
				category.setName("vegetables");
				category.setDescription("des for veggeies!");
				category.setImageURL("cat_1.png");
				categories.add(category);
	}

	@Override 
	public List<Category>list(){
		//TODO Auto-generated method stub
		return categories;
	}
	@Override
	public Category get(int id) {
		//for loop
		for(Category category : categories) {
	if(category.getId()==id) 	return category;
				}
	return null;
}
	@Override
	@Transactional
	public boolean add(Category category) {
		
		try {
			//add the category to the DB
			sessionFactory.getCurrentSession().persist(category);
			
			return true;
		}
		catch(Exception ex ) {
			ex.printStackTrace();
			return false;
		}
		// TODO Auto-generated method stub
	
	}
}