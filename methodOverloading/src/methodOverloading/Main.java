package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int toplam = dortIslem.topla(2, 3);
		System.out.println(toplam);

		System.out.println(dortIslem.topla(2, 3, 5));

	}

}
