package kodlamaIOProject.Business;

import java.util.ArrayList;

import kodlamaIOProject.Core.logging.Logger;
import kodlamaIOProject.DataAccess.CategoryDao;
import kodlamaIOProject.DataAccess.HibernateCategoryDao;
import kodlamaIOProject.DataAccess.JdbcCategoryDao;
import kodlamaIOProject.Entities.Category;

public class CategoryManager {
	
	
	private CategoryDao categoryDao;
	private ArrayList<Category>categories=new ArrayList<>();
	
	
	public CategoryManager(JdbcCategoryDao jdbcCategoryDao, Logger[] loggers) {
		// TODO Auto-generated constructor stub
	}


	public void  add(Category category) throws Exception {
	
	for (Category categories:categories) {
		
		if(categories.getCategoryName().equals(categories.getCategoryName())) {
		
			throw new Exception("Kategori ismi tekrarlanamaz");
			
		}
		
	  }
	
	}
	
}

