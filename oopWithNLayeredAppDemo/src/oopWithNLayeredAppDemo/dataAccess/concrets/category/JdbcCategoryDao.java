package oopWithNLayeredAppDemo.dataAccess.concrets.category;

import oopWithNLayeredAppDemo.dataAccess.abstracts.ICategorDao;
import oopWithNLayeredAppDemo.entities.Category;

public class JdbcCategoryDao implements ICategorDao {

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veritabanına eklendi : " + category.getName());
		
	}

}
