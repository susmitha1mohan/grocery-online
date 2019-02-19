package model.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import model.dao.CategoryDAO;
import model.entity.Category;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	private  Category category;
		
	@BeforeClass
	public static void init() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.sush.GroceryBackend");
		context.refresh();
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		
	}
	@Test
	public void testAddCategory() {
		
		category = new Category();
		category.setName("GOURMET");
	     category.setDescription("give some lines here from impl");
	     category.setImageURL("source location of that image");
	     
	     assertEquals("Successfully added a category inside the table",true,categoryDAO.add(category));
		
	}

}
