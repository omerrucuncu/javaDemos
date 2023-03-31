package oopWithNLayeredAppDemo.core.logging.concretes;

import oopWithNLayeredAppDemo.core.logging.abstracts.ILogger;

public class DatabaseLogger implements ILogger {

	@Override
	public void add(String mesaj) {
		System.out.println("Veritabanına loglandı : " + mesaj);

	}

}
