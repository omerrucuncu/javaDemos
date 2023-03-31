package oopWithNLayeredAppDemo.dataAccess.concrets.category;

import oopWithNLayeredAppDemo.dataAccess.abstracts.ICategorDao;
import oopWithNLayeredAppDemo.entities.Category;

public class HibernateCategoryDao implements ICategorDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanına eklendi : " + category.getName());

	}

}
