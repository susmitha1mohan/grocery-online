package model.dao;

import java.util.List;

import model.entity.Category;

public interface CategoryDAO {
	
	Category get(int id);
	List<Category>list();
	boolean add(Category category);
	
	
	
	
	

	
}