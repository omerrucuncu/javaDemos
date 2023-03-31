package oopWithNLayeredAppDemo.business.concretes;

import oopWithNLayeredAppDemo.business.abstracts.ICategoryManager;
import oopWithNLayeredAppDemo.core.logging.abstracts.ILogger;
import oopWithNLayeredAppDemo.dataAccess.abstracts.ICategorDao;
import oopWithNLayeredAppDemo.entities.Category;

public class CategoryManager implements ICategoryManager {

	private ICategorDao categoryDao;
	private ILogger[] loggers;
	private Category[] category;

	public CategoryManager(ICategorDao categoryDao, ILogger[] loggers, Category[] category) {

		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.category = category;
	}

	@Override
	public void add(Category category) throws Exception {

		for (Category category_ : this.category) {
			if (category_.getName().equals(category.getName())) {
				throw new Exception("Kategori mevcut");
			}
		}

		categoryDao.add(category);

		for (ILogger logger : loggers) {
			logger.add(category.getName());
		}

	}

}
