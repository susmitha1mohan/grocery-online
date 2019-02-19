package model.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.dao.CategoryDAO;
import model.entity.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory sessionfactory;
	
	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		
		Category category = new Category();

    //first category       
	  
	 category.setId(1);
     category.setName("FRUITS&VEGGIES");
     category.setDescription("give some lines here from impl");
     category.setImageURL("source location of that image");
     
     categories.add(category);

   //second category 

     category.setId(2);
     category.setName("GRAINS");
     category.setDescription("give some lines here from impl");
     category.setImageURL("source location of that image");
     
     categories.add(category);
		
     //third category
     
     category.setId(3);
     category.setName("GOURMET");
     category.setDescription("give some lines here from impl");
    category.setImageURL("source location of that image");
     
     categories.add(category);
     
                }
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
	for(Category category : categories) {
		
		if(category.getId()==id) return category;
	}
	return null;
	}

	@Override
	public boolean add(Category category) {
		// TODO Auto-generated method stub
		try {
			sessionfactory.getCurrentSession().persist(category);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
		
	}

}
