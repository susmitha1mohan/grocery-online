package com.sush.GroceryBackend.test;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import model.dao.CategoryDAO;
import model.entity.Category;

public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private Category category;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("com.sush.GroceryBackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}

	@Test
	public void testAddCategory() {

		category = new Category();
		category.setName("fruits");
		category.setDescription("des for fruits!");
		category.setImageURL("fef_1.png");
		assertEquals("Successfully added the category inside the table", true, categoryDAO.add(category));

	}
}
