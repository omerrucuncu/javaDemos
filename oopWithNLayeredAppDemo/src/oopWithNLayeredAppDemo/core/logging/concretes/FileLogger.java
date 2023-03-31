package oopWithNLayeredAppDemo.core.logging.concretes;

import oopWithNLayeredAppDemo.core.logging.abstracts.ILogger;

public class FileLogger implements ILogger {

	@Override
	public void add(String mesaj) {
		System.out.println("Dosyaya loglandı : " + mesaj);
		
	}

}
